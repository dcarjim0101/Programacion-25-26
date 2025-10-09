opcion = int(input("elige una opcion, 1 para la suma, 2 para la resta, 3 para la multiplicacion y 4 para la division: "))
n1 = int(input("introduce un numero: "))
n2 = int(input("introduce otro numero: "))

match opcion:
        case 1:
                print (n1 + n2)
        case 2:
                print (n1 - n2)
        case 3:
                print (n1 * n2)
        case 4:
                if n1 == 0 or n2 == 0:
                        print ("no se puede dividir entre 0")
                else:
                        print (n1 / n2)
        case _:
                print("la opcion es incorrecta")
