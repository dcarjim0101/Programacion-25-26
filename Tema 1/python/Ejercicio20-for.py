n = int(input("introduce un numero: "))

i = 0

for i in range(n):
    if i < n:
            print(i, end=",")
    else:
        break
    i += 1
print(i)