nota = int(input("introduce una nota: "))

if nota >= 0 and nota <= 4:
    print("insuficiente")
elif nota == 5:
    print("suficiente")
elif nota == 6:
    print("bien")
elif nota >= 7 and nota <= 8:
    print("notable")
elif nota >= 9 and nota <= 10:
    print("sobresaliente")
else:
    print("su nota es incorrecta")