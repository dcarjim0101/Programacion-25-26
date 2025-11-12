from collections import Counter

lista_a = [10, 20, 30]
lista_b = [10, 20, 30]
lista_c = [30, 20, 10]  # Mismos elementos, orden diferente
lista_d = [10, 20]      # Longitud diferente
lista_e = [10, 99, 30]  # Mismos largo, valores diferentes


def comparar_listas(lista1, lista2):
    """Compara dos listas y devuelve uno de los siguientes resultados (texto en español):
    - 'son iguales' : mismas longitudes y mismo orden/valores
    - 'tienen diferente longitud' : las longitudes no coinciden
    - 'mismos valores pero diferente orden' : mismas multiconjuntos pero distinto orden
    - 'tienen diferentes valores' : mismas longitudes pero valores distintos (no mismo multiconjunto)
    """

    # Caso exactamente iguales (mismo orden)
    if lista1 == lista2:
        return 'son iguales'

    # Longitud diferente
    if len(lista1) != len(lista2):
        return 'tienen diferente longitud'

    # Mismos valores sin importar el orden (comparar multiconjuntos)
    if Counter(lista1) == Counter(lista2):
        return 'mismos valores pero diferente orden'

    # Mismo tamaño pero valores diferentes
    return 'tienen diferentes valores'


if __name__ == '__main__':
    pares = [
        ('A', 'B', lista_a, lista_b),
        ('A', 'C', lista_a, lista_c),
        ('A', 'D', lista_a, lista_d),
        ('A', 'E', lista_a, lista_e),
    ]

    for nombre1, nombre2, l1, l2 in pares:
        resultado = comparar_listas(l1, l2)
        print(f"{nombre1} vs {nombre2}: {resultado}")
