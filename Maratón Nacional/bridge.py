def solve(people):
    people.sort()
    
    N = len(people)
    
    if N == 1:
        return people[0]
    
    total_time = 0
    
    left = 0
    right = N - 1
    
    while right > 2:
        # Case 1: Más rápido primero (los 2 más rápidos, el más rápido vuelve)
        option1 = 2 * people[1] + people[left] + people[right]
        # Case 2: El más lento primero (más rápido retorna)
        option2 = 2 * people[left] + people[right] + people[right - 1]
        
        # Tomamos el mínimo de ambos
        total_time += min(option1, option2)
        
        right -= 2
    
    if right == 2:
        total_time += people[2] + people[1] + people[0]
    elif right == 1:
        total_time += people[1]
    
    return total_time

def main():
    while True:
        N = int(input())
        
        if N == 0:
            break
        
        people = []
        for _ in range(N):
            people.append(int(input()))
        
        print(solve(people))

main()
