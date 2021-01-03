intx = int(input())

#주어진 X가 0, 1, 2, 3일때 최소 연산수
dp = [0, 0, 1, 1]

for i in range(4, intx+1):
    #1로 빼서 최소 연산 구함 (앞 인덱스의 최소 연산 값 가져옴)
    dp.append(dp[i-1]+1)

    #1을 빼서 구한 최소 연산과 나눠서 구한 최소 연산을 비교해 작은 값을 저장
    if i % 3 == 0 :
        dp[i] = min(dp[i], dp[i//3]+1)
    if i % 2 == 0 :
        dp[i] = min(dp[i], dp[i//2]+1)

print(dp[intx])
