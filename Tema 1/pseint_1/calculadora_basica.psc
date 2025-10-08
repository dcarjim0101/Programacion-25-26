Algoritmo calculadora_basica
	definir n1, n2, suma, resta, multiplicacion, division, eleccion como entero
	
	escribir "elige el tipo de operacion, 1 para la suma, 2 para la resta, 3 para la multiplicacion y 4 para la division"
	leer eleccion
	
	Segun eleccion Hacer
		1:
			escribir "ha elegido suma"
			escribir "introduce un numero"
			leer n1
			
			escribir "introduce otro numero"
			leer n2
			suma = n1 + n2
			escribir suma
		2:
			escribir "ha elegido resta"
			escribir "introduce un numero"
			leer n1
			
			escribir "introduce otro numero"
			leer n2
			resta = n1 - n2
			escribir resta
		3:
			escribir "ha elegido multiplicacion"
			escribir "introduce un numero"
			leer n1
			
			escribir "introduce otro numero"
			leer n2
			multiplicacion = n1 * n2
			escribir multiplicacion
		4:
			escribir "ha elegido division"
			escribir "introduce un numero"
			leer n1
			
			escribir "introduce otro numero"
			leer n2
			division = n1 / n2
			escribir division
		De Otro Modo:
			escribir "la eleccion no esta en las opciones"
	Fin Segun
FinAlgoritmo
