n = int(input("introduce un numero: "))
factorial = 1
for i in range(1, n):
        factorial = n * i
        print(f"El factorial de {n} es {factorial}")
