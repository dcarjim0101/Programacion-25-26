# variables del producto
producto = "espresso doble"
precio_unitario = 3.50

# variables de la transaccion
cantidad = 3
tasa_iva = 0.16

# variables del cliente
cliente_nombre = "Ana Maria Lopez"
id_transaccion = "CAF-2025-472"

# otras variables
suma = 3 * 3.50
iva = suma * 16 / 100
total = iva + suma

print(f"-cliente: {cliente_nombre} | -id: {id_transaccion}")
print(f"-producto: {producto}")
print(f"-cantidad: {cantidad}")
print(f"-precio: {precio_unitario}")
print(f"-precio total sin iva: {suma}")
print(f"-iva: {iva}")
print(f"-total: {total}")