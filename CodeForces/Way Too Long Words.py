#A - Way Too Long Words
n = int(input())
for i in range(n):
    w = str(input())
    if len(w) <= 10:
        print(w)
    elif len(w) > 10:
        pw = w[0]
        uw = w[-1]
        mw = len(w)-2
        print(pw+str(mw)+uw)