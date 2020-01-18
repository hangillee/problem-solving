word = list(input().upper())
alphabetlist = [0] * 26
maxvalue = 0

for i in word:
    alphabetlist[ord(i) - 65] += 1

if alphabetlist.count(max(alphabetlist)) >= 2 :
    print("?")
else :
    maxvalue = chr(alphabetlist.index(max(alphabetlist)) + 65)
    print(maxvalue)
