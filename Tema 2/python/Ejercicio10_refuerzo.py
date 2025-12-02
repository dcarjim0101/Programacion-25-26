def iguales(lista1, lista2, lista3):
    #comprobar si las longitudes son iguales
    if len(lista1) != len(lista2) or len(lista2) != len(lista3):
        return False

    # Recorrer listas y comparar letra a letra, ignorando mayúsculas
    for i in range(len(lista1)):
        if lista1[i].lower() != lista2[i].lower() or lista2[i].lower() != lista3[i].lower():
            return False

    # Si todas las letras coinciden
    return True



lista1 = ['H', 'O', 'L', 'A']
lista2 = ['h', 'O', 'l', 'a']
lista3 = ['h', 'O', 'l', 'a']

print(iguales(lista1, lista2, lista3))