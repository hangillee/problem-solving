def convert(strlist):
    strlist.reverse()
    num = ''.join(strlist)
    return int(num)

a, b = map(list, input().split())

a_reverse = convert(a)
b_reverse = convert(b)

if a_reverse > b_reverse :
    print(a_reverse)
else :
    print(b_reverse)
