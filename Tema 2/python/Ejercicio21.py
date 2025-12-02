m = [[1,2,3],[4,5,6],[7,8,9]]
m2 = [[0,0,0],[0,0,0],[0,0,0]]
print(m)
print("punto 1: ", m[1][2])
print("punto 2: ",m[1][1])

for i in range (len(m)):
    print(m[1][i])

for fila in m:
    for elemento in fila:
        print(elemento, end=" ")
    print()

for fila in range(len(m)):
    for columna in range(len(m[fila])):
        if m[fila][columna] % 2 == 0:
            m2[fila][columna] = m[fila][columna]
            m[fila][columna] = 0
print("matriz 1: ", m)
print("matriz 2: ", m2)