n1 = int(input("Introduce el primer número: "))
n2 = int(input("Introduce el segundo número: "))
n3 = int(input("Introduce el tercer número: "))

if n1 == n2 and n1 == n3 and n2 == n3:
    print("los numeros son iguales")
elif n1 == n2 or n1 == n3 or n2 == n3:
    print("dos son iguales y uno diferente")
elif n1 != n2 and n1 != n3 and n2 != n3:
    print ("todos son diferentes")
