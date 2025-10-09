def menu():
	print("1. suma")
	print("2. resta")
	print("3. multiplicacion")
	print("4. division")

def pedir_numeros():
	num1 = float(input("introduce el primer numero: "))
	num2 = float(input("introduce el segundo numero: "))
	return num1, num2

def main():
	menu()
	opcion = input("selecciona una opcion (1, 2, 3 o 4): ")

	if opcion in ["1", "2", "3", "4"]:
		num1, num2 = pedir_numeros()
		if opcion == "1":
			print(f"ha elegido suma, el resultado es: {num1} + {num2} = {num1 + num2}")
		elif opcion == "2":
			print(f"ha elegido resta, el resultado es: {num1} - {num2} = {num1 - num2}")
		elif opcion == "3":
			print(f"ha elegido multiplicacion, el resultado es: {num1} * {num2} = {num1 * num2}")
		elif opcion == "4":
			if num2 != 0:
				print(f"ha elegido division, el resultado es: {num1} / {num2} = {num1 / num2}")
			else:
				print("no se puede dividir entre cero")
	else:
		print("la eleccion no es correcta")

if __name__ == "__main__":
	main()
