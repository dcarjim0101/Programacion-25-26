M = [[10,20,30],[40,50,60],[70,80,90]]
T = [[],[],[]]

i = 0
j = 0
for i in range len(M(3)):
    for j in range len(M(3)):
        if i == j:
            T[i][j] = M[i][j]
        else:
            T[i][j] = M[j][i]
    
print("matriz original: ", M)
for fila in M:
    print(fila)

print("matriz transpuesta: ", T)
for fila in T:
    print(fila)