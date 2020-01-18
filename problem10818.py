listindex = int(input())
numlist = list(map(int, input().split()))

maxNum = numlist[0]
minNum = numlist[0]

for num in numlist:
    if num > maxNum:
        maxNum = num
    if num < minNum:
        minNum = num
        
print(minNum, maxNum)
