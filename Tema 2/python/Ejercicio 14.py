inventario_inicial = ["manzanas", "platanos", "naranjas", "peras"]
print(inventario_inicial)

otros = ["uvas", "kiwi"]
inventario_inicial.extend(otros)
print(otros)

print("hay una caja de melones")
melones = ["melones"]
print(melones)
print("se tiene que añadir")
inventario_inicial.extend(melones)
print(inventario_inicial)

platanos_frescos = ["platanos frescos"]
inventario_inicial.insert(1, platanos_frescos)
print(inventario_inicial)

producto_vendido = inventario_inicial.pop(-1)
print(inventario_inicial)