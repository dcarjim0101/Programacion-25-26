import math
def raiz_cuadrada(raiz):
    raiz = n1 * n1
    return raiz

opcion = int(input("elige una opcion, 1 para la suma, 2 para la resta, 3 para la multiplicacion, 4 para la division, 5 para la raiz cuadrada o 6 para la potencia: "))
n1 = int(input("introduce un numero: "))

match opcion:
        case 1:
                n2 = int(input("introduce otro numero: "))
                print (n1 + n2)
        case 2:
                n2 = int(input("introduce otro numero: "))
                print (n1 - n2)
        case 3:
                n2 = int(input("introduce otro numero: "))
                print (n1 * n2)
        case 4:
                if n1 == 0 or n2 == 0:
                        print ("no se puede dividir entre 0")
                else:
                        n2 = int(input("introduce otro numero: "))
                        print (n1 / n2)
        case 5:
                print (raiz_cuadrada(opcion))
        case 6:
                n2 = int(input("introduce otro numero: "))
                x = pow(n1, n2)
                print(x)
        case _:
                print("la opcion es incorrecta")
