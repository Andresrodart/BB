/*  Definimos la función
		Recibimos una lista de enteros y el entero que queremos buscar en la lista
		Regresamos el indice donde se encuentra el objetivo o -1 en caso de no encontrarlo
*/
entero busquedaBinaria(lista<entero> arreglo, entero objetivo):
	entero puntoMenor
	entero puntoMedio
	entero puntoFinal
	mientras puntoMenor < puntoMayor :
		puntoMedio = (puntoMayor + puntoMenor) / 2
		si arreglo[puntoMedio] == objetivo: 
			regresa puntoMedio
		o si arreglo[puntoMedio] > objetivo:
			puntoFinal = puntoMedio - 1
		sino:
			puntoMenor = puntoMedio + 1
	