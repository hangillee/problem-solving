dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
string = input()
seconds = 0

for i in range(len(string)):
    for j in dial:
        if string[i] in j:
            seconds += dial.index(j)+3

print(seconds)
