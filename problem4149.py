num = input()
intnum = int(num)

while (intnum > 1):
    i = 2
    for i in range(len(num)+1):
        print(i)
        if(intnum % i == 0):
            print(i)
            intnum /= i
            break;
