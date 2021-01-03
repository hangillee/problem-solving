testcase = 0
a, b = 0, 0

def sum (a, b):
    print(a + b)

testcase = int(input())

for i in range(0, testcase):
    a, b = map(int, input().split())
    sum(a, b)
