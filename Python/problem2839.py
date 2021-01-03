sugar = int(input())

box5kg = sugar // 5
sugar %= 5
box3kg = 0

while box5kg >= 0:
    if sugar % 3 == 0:
        box3kg = sugar // 3
        sugar %= 3
        break
    box5kg -= 1
    sugar += 5

print(box5kg + box3kg)
    
