nota = int(input("introduce una nota: "))

match nota:
    case 0 | 1 | 2 | 3 | 4:
        print("insuficiente")
    case 5:
        print("suficiente")
    case 6:
        print("bien")
    case 7 | 8:
        print("notable")
    case 9 | 10:
        print("sobresaliente")
    case _:
        print("su nota es incorrecta")
