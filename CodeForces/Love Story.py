#A - Love Story
def codeforces(s):
    count = 0
    for i in range(10):
        if s[i]!= "codeforces"[i]:
            count += 1
    return count
 
n = int(input())
for _ in range(n):
    s = input()
    print(codeforces(s))