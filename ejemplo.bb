entero a = 2 * (2 + 3 * 8 /2)
decimal b = 2.0
texto andrés = 'andrés, es, raro'
texto cadena = 'hola'

objeto pila:
	privado:
		lista <entero> mi_pila
		entero tamaño
	público:
		constructor pila( lista <entero> entrada ):
			mi_pila = entrada;
		nada push(entero a):
			mi_pila.agrega(a)

nada mi_imprime(texto s, entero a):
	imprime(s, 2, andrés, a)

entero suma(entero a, entero b):
	entero c = a + b
	regresa a + b

entero principal():
	texto nombre = 'hola'
	entero ca = 2
	si  a > 10 :
		a = 10
	o si a == 20:
		a = 21
	sino:
		a = 0
	mientras a < 10 :
		a += 1
	lista <entero> mi_lista = [1, 2, 3 , 4]
	entero sum = suma(2, a)
	mi_imprime('mi_funcion', sum)
	(nombre, entero edad) = recibe('ingresa tu nombre y tu edad: ')
	imprime('tu nombre es: ', nombre, ' y tienes: ', edad, ' años')
	regresa ca + 2