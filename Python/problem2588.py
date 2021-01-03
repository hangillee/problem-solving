num1 = int(input())
num2 = int(input())

num3 = num2%10
num4 = num2%100 - num3
num5 = num2 - num4 - num3
numlist = [num3, num4, num5]
num6 = 0

print(num1*num3)
print((num1*num4)//10)
print((num1*num5)//100)

for i in range(len(numlist)):
    num6 += num1 * numlist[i]

print(num6)
