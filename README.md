# BB
Compilador para el lenguaje BB

## ¿Qué es BB?
BB (Burros Blancos) es un lenguaje de programación que al ser compilado genera el mismo algorítmo en lenguaje C++.
El lenguaje esta basado en la sintáxis de Python3 que, a consideración personal, es un formato bastante legible.

## ¿Cómo usarlo?
Para usar BB debes tener Java 11 o mayor. Y g++ si deseas compilarlo como un ejecutable. De este repositorio descarga BB.jar. Puedes descargar la librería de ANTLR4 desde su página (https://www.antlr.org/)
Puede ver con más claridad su usi e instalación en el siguiente video: https://youtu.be/GJt1QPx0IIo
## Sintaxis
Como en C++, debemos declarar la función principal. Pero, como Python, el bloque de código se establece con ':' después de la declaración de la función y cada sentencia que sigue con un tabulador.
BB es un lenguaje tipado (cada variable que se declara debe se pertenecer a un único tipo de dato). Actualmente los tipos que se soporta son: `entero`, `decimal`, `texto` y `nada`. Los cuales se usan antes de una variable para indicar su tipo o antes de la declaración de un función para indicar el valor de retorno que se espera.
La declaración de función lleva el orden `<<tipo>>` `def` `<<identificador>>` `(<<0 o muchos parámetros separados por coma>>)` `:` `<<bloque>>`
BB cuenta con funciones de base. Como la sentencia `si(<<exp>>):<<bloque>>` `o si(<<exp>>):<<bloque>>` `sino`. Que permite realizar acciones de elección. También cuenta con la opción `imprime(<<parámetros>>)` la cual imprime en la consola los valores pasados como parámetros, separados por coma.

### Ejemplo
Crea el documento
#### ejemplo.bb
```
	entero a = 2 * (2 + 3 * 8 /2)
	decimal b = 2.0
	texto andrés = 'andrés'
	texto cadena = 'hola'

	nada def mi_imprime(texto s):
		imprime(s, 2, 'hola')

	entero def principal():
		texto pedro = 'hola'
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
		mi_imprime('mi_funcion')
		regresa ca + 2
```
En el directorio donde se encuentran BB.jar y antlr-4.8-complete.jar (deben estar en el mismo directorio) y ejecuta el comando:
```bash
	java -jar BB.jar <<dirección al archivo>>\ejemplo.bb  -output
```
La bandera -output genera automáticamente el ejecutable con el nombre a
## Hecho con
El analizador léxico y el análisis sintáctico se realizaron con ANTLR4.