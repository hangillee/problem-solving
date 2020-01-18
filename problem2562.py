numlist = []

for i in range(0, 9):
    num = int(input())
    numlist.append(num)

maxNum = numlist[0]
minNum = numlist[0]
numIndex = 0

for index, num in enumerate(numlist, start=1):
    if num > maxNum:
        maxNum = num
        numIndex = index
    elif num < maxNum :
        numIndex = numlist.index(maxNum) + 1
        
print(maxNum)
print(numIndex)
