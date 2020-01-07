
# the blew code solve the Array Left Rotation with complexity N, passing all test cases on Hacker Rank
# Linke of the problem below
# https://www.hackerrank.com/interview/interview-preparation-kit/arrays/challenges?filters%5Bstatus%5D%5B%5D=solved




def rotLeft(a, d):
    n = len(a)
    arr = []
    c = 0
    for i in range(n):
        if d+i >= n:
            arr.append(a[c])
            c += 1
        else:
            arr.append(a[d+i])
    return arr

nd = input().split()
n = int(nd[0])
d = int(nd[1])
a = list(map(int, input().rstrip().split()))

result = rotLeft(a, d)

print(' '.join(map(str, result)))
print()
