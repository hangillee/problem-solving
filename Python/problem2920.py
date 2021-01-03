musicalScale = [1, 2, 3, 4, 5, 6, 7, 8]
reversedList = list(reversed(musicalScale))
userInput = list(map(int, input().split()))

if userInput == musicalScale:
    print("ascending")
elif reversedList == userInput:
    print("descending")
else :
    print("mixed")
