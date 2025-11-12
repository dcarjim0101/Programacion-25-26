def esPrimo(a)
    if a == 2: return True
    else:
        i = 2
        while i < a:
            if (a%i == 0):
                return False
            if i == a - 1:
                return True

a = [1,2,3,4,5,6,7,8,9,10]
b = []
i = 0
while i < len(a):
    if esPrimo(a[i]):
        b.append(a.pop(i))
    i = i + 1
print(a)
print(b)