import java.util.*;

public class MurciasSkyline {

    static Scanner sc = new Scanner(System.in);
    static int edificios;
    static int sumaParcialUP;
    static int sumaMaximaUP;
    static int sumaParcialDOWN;
    static int sumaMaximaDOWN;
    static int cont = 1;

    public static void main(String[] args) {

        int casos = sc.nextInt();
        
        testCases(casos);

        sc.close();
    }

    public static void testCases (int casos) {

        if (casos != 0) {

            //variaables
            int edificiosCreciendo = 1;
            int edificiosDecreciendo = 1;
            String skyline;
            
            //edificios, altura y anchura
            edificios = sc.nextInt();
            int high[] = new int[edificios];
            int width[] = new int[edificios];
            
            //escribe array altura
            for (int i = 0; i < edificios; i++) {
                high[i] = sc.nextInt();
            }
            
            //escribe array anchura
            for (int i = 0; i < edificios; i++) {
                width[i] = sc.nextInt();  
            }


            //doble for para recorrer matriz
            for (int i = 0; i < edificios; i++) {

                sumaParcialUP = width[i];
                sumaParcialDOWN =  width[i];


                for (int j = 1; j < edificios; j++) {

                    
                    if (high[i] < high[j]) {//increasing
                        if (high[j] >  high[j--]) {
                            sumaParcialUP += width[j--];
                            if (high[j] <  high[j++]) {
                                sumaParcialUP += width[j++];
                            }
                        }
                        
                        if (sumaMaximaUP < sumaParcialUP) {
                            sumaMaximaUP = sumaParcialUP;
                        }


                    }
                    // else if (high[i] > high[j]) {//decreasing


                        

                        
                    // }//close ifs increasing & decreasing


                    

                    // if (sumaMaximaDOWN < sumaParcialDOWN) {
                    //     sumaMaximaDOWN = sumaParcialDOWN;
                    // }

                }//close for2

                // edificiosCreciendo = 1;
                // edificiosDecreciendo = 1;

            }//close for1

            if (edificiosCreciendo>=edificiosDecreciendo){
                skyline = "Increasing (" + sumaMaximaUP + "). Decreasing (" + sumaMaximaDOWN +").";
            }else{
                skyline = "Decreasing (" + sumaMaximaDOWN + "). Increasing (" + sumaMaximaUP +").";
            }

            System.out.println("Case " + cont + ". " + skyline);

        }//close if cases

        //variables de reset
        sumaParcialUP = 0;
        sumaParcialDOWN = 0;
        casos -= 1;
        cont++;

        testCases(casos);//recursividad

    }//close testCases
}//close class