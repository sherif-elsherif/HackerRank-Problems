import math

# You can check the problem description on HackerRank using the following link
# https://www.hackerrank.com/challenges/sherlock-and-squares/problem?h_r=next-challenge&h_v=zen

def squares(a, b):
    start = math.floor(math.sqrt(a))
    end = math.ceil(math.sqrt(b))
    counter = 0
    while start <= end:
        if (start ** 2) >= a and (start ** 2) <= b:
            counter += 1
        start += 1
    return counter


result = squares(17, 100000000)

print(result)
