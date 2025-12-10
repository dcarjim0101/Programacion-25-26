inventario = [[101,15.50,45],[102, 5.00, 120],[103,30.99,15],[104,8.75,70],[105,22.00,30]]

# 1
id_buscar = input("introduce un id que quieras saber: ")

for producto in inventario:
    if producto["ID_Producto"] == id_buscar:
        print(f"precio: {producto['Precio_USD']}, stock: {producto['Stock_Unidades']}")
    else:
        print("id no encontrado")
        
# 2

producto_caro = (inventario.^[precio])