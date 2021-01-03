index = int(input())

for i in range(0, index):
    totalscore, average, overstudent, overaverage = 0, 0, 0, 0
    scorelist = list(map(int, input().split()))
    
    for j in range(1, len(scorelist)):
        totalscore += scorelist[j]
    average = totalscore / (len(scorelist) - 1)
    
    for k in range(1, len(scorelist)):
        if scorelist[k] > average:
            overstudent += 1
    overaverage = overstudent / scorelist[0] * 100
    print("%0.3f%%" % overaverage)
