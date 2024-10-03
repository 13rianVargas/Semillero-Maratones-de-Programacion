#A - Magnets
def magnets(n, mag):
    groups = 0
    currentMagnet =  mag[0]
    for i in range(1, n):
        nextMagnet =  mag[i]
        if currentMagnet != nextMagnet:
            groups += 1
            currentMagnet = nextMagnet
    return groups + 1
 
n = int(input())
mag = [input() for i in range(n)]
print(magnets(n, mag))