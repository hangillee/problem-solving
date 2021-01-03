testcase = 0
a, b = 0, 0

testcase = int(input())

for i in range(0, testcase):
    a, b = map(int, input().split())
    sum = a + b
    print(f"Case #{i+1}: {a} + {b} = {sum}")
