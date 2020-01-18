hour = 0
minute = 0

def alarmclock(hour, minute) :
    minute -= 45
        
    if minute < 0:
        if hour != 0:
            hour -= 1
        else :
            hour = 23
        minute += 60
        print(hour, minute)
    else :
        print(hour, minute)

hour, minute = map(int, input().split())
alarmclock(hour, minute)
