word = input()
wordlist = [chr(x) for x in range(ord("a"), ord("z")+1)]
numlist = [-1] * 26

for i in range(len(word)):
    for j in wordlist:
        if word[i] == j:
            numlist[wordlist.index(j)] = word.index(word[i])
            break
for k in numlist:
    print(k, end=" ")
