numlist = [int(input()) for num in range(0, 10)]
remainlist = []

for num in numlist:
    remain = num % 42
    if remain in remainlist:
        pass
    else:
        remainlist.append(remain)

print(len(remainlist))
