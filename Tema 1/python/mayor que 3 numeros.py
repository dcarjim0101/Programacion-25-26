n1 = int(input("introduce un numero: "))

n2 = int(input("introduce otro numero: "))

n3 = int(input("introduce otro numero: "))

if n1 > n2 and n1 > n3:
    print("el numero", n1, ("es el mayor de los tres"))
elif n2 > n1 and n2 > n3:
    print("el numero", n2, ("es el mayor de los tres"))
elif n3 > n1 and n3 > n2:
    print("el numero", n3, ("es el mayor de los tres"))
else:
    print("los numeros son iguales")