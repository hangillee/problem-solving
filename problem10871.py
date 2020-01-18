index, x = map(int, input().split())
num = list(map(int, input().split()))

for i in range(index):
    if x > num[i]:
        print(num[i], end=" ")
