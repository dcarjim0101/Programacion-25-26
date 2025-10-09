def par_impar(n):
    if n % 2 == 0:
        return ("par")
    else:
        return ("impar")
n = int(input("introduce un numero: "))

print("el ", n, "es", par_impar(n))
