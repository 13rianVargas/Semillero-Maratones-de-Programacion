#A - Team
n = int(input())
sumt = 0
for i in range(n):
    a1, a2, a3 = map(int, input().split())
    sum = a1+a2+a3
    if sum >= 2:
        sumt= sumt + 1
print(sumt)