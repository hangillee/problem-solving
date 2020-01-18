testcase = int(input())
index = 0

for i in range(0, testcase):
    loopcount, string = input().split()
    loopcount = int(loopcount)
    for j in range(len(string)):
        for k in range(0, loopcount):
            print(string[j], end="")
    print()
