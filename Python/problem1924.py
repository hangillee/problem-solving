datelist = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
daylist = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
day = 0

month, date = map(int, input().split())

for i in range(0, month-1):
    date += datelist[i]

day = daylist[date % 7]
print(day)
