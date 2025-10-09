n = int(input("introduce un numero: "))

i = 1

while True:
    if i < n:
        print(i, end=",")
    else:
        break
    i += 1
print(i)