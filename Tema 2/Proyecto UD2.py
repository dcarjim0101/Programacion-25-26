import re

# Aqui tenemos creada la matriz multidimensional con las 3 columnas y 5 filas de datos

inventario = [
    [1, "Citroen c15", 12],
    [2, "Seat 3", 15],
    [3, "Bmw E36", 3],
    [4, "Ferrari 456", 4],
    [5, "Ford 12", 10]
]

#Funcion de buscar por id en la que pedimos al usuario que introduzca un numero
# y muestre si existe o no el id en caso de que no exista lo mostrara en rojo

# Función para buscar un producto por su ID
def buscar_por_id():
    id_busqueda = int(input("Ingrese el ID del producto: "))

    # Recorre la lista 'inventario' buscando coincidencias
    for producto in inventario:
        if producto[0] == id_busqueda:
            print(f"Nombre: {producto[1]}")
            print(f"Stock: {producto[2]}")
            return   

    # Si no encuentra el ID, muestra un mensaje en rojo
    print("\033[31mno se encuentra el id\033[0m")



def mostrar_inventario():
    for p in inventario:
        print(p)  


# Función para comparar stock y mostrar el producto con mayor y menor cantidad
def comparar_stock():
    producto_max = inventario[0]  
    producto_min = inventario[0]

    for producto in inventario:
        # Compara stock para encontrar el producto con más unidades
        if producto[2] > producto_max[2]:
            producto_max = producto
        # Compara stock para encontrar el producto con menos unidades
        if producto[2] < producto_min[2]:
            producto_min = producto

    print(f"Producto con mayor stock: {producto_max[1]} ({producto_max[2]} unidades)")
    print(f"Producto con menor stock: {producto_min[1]} ({producto_min[2]} unidades)")


# Función para validar el nombre de un producto
def validar_nombre_producto():
    nombre = input("Ingrese el nombre del producto: ")

    # Valida longitud del nombre
    if len(nombre) < 5 or len(nombre) > 20:
        print("\033[31mError: La longitud debe ser entre 5 y 20 caracteres.\033[0m")
        return

    # Valida que la primera letra sea mayúscula
    if nombre[0].isupper() == False:
        print("\033[31mError: No empieza con una letra mayúscula.\033[0m")
        return

    # Valida que contenga al menos un dígito
    if re.search(r'\d', nombre) == None:
        print("\033[31mError: No contiene ningún dígito.\033[0m")
        return

    # Si pasa todas las validaciones, imprime que el nombre es válido en verde
    print(f"\033[32m Nombre válido: {nombre}\033[0m") #el color verde es 32m y el rojo 33m


def menu():
    while True:
        print("")
        print("")
        print("1. Mostrar inventario")
        print("2. Buscar producto por id")
        print("3. Comparar stock")
        print("4. Introducir productos")
        print("5. Salir")
        print("")
        print("")

        op = input("Seleccione una opción: ")

        if op == "1":
            mostrar_inventario()
        elif op == "2":
            buscar_por_id()
        elif op == "3":
            comparar_stock()
        elif op == "4":
            validar_nombre_producto()
        elif op == "5":
            print("Saliendo")
            break
        else:
            print("Opción inválida")



menu()

