def busqueda_binaria(array, objetivo):
    izquierda = 0
    derecha = len(array) - 1
    
    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        
        # Si el elemento del medio es el objetivo
        if array[medio] == objetivo:
            return medio
        
        # Si el objetivo es menor, ignoramos la mitad derecha
        elif array[medio] > objetivo:
            derecha = medio - 1
        
        # Si el objetivo es mayor, ignoramos la mitad izquierda
        else:
            izquierda = medio + 1
    
    # Si llegamos aquí, el elemento no está presente
    return -1

# Crear array con números de 0 a 90 en incrementos de 10
numeros = list(range(0, 91, 10))
print("Array:", numeros)

# Pedir al usuario el número a buscar
numero_buscar = int(input("Introduce el número que quieres buscar (0-90): "))

# Realizar la búsqueda
resultado = busqueda_binaria(numeros, numero_buscar)

# Mostrar el resultado
if resultado != -1:
    print(f"El número {numero_buscar} se encuentra en la posición {resultado}")
else:
    print(f"El número {numero_buscar} no se encuentra en el array")