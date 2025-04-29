//¿Que son las excepciones ?
Diferentes errores que pueden surgir a lo largo del programa :

1.desbordamiento de memoria 
2.dividir por cero 
3.acceder a un vector fuera de sus limites 


la mayoria suceden en tiempo de ejecucion del programa 

El manejo de excepciones sirve para que tu programa no se frene al encontrar una excepcion basicamente

JERARQUIA DE EXCEPCIONES 
--------------------THROWABLE------------------------- SUPER CLASE 
Error                                       Exception
|                                           |                  |No se te obliga arreglarlo 
|                                       Verificada             No verificada
|                                       Entrada y salida       Division entre 0 
|                                       de datos aveces 
|
|
|
|
|
|
problemas relacionados con          
el hardware(no depende del programador)

1. Introducción
   Las excepciones en Java son eventos que interrumpen el flujo normal de un programa. Estas pueden ser clasificadas en dos categorías principales: verificadas y no verificadas.

2. Excepciones verificadas en Java
   Las excepciones verificadas son aquellas que el compilador obliga a manejar de alguna manera. Esto significa que el programador debe atrapar estas excepciones utilizando bloques try-catch o declarándolas en la firma del método con la cláusula throws.

3. Excepciones no verificadas en Java
   Por otro lado, las excepciones no verificadas son aquellas que el compilador no obliga a manejar. Estas excepciones suelen ser subclases de RuntimeException y Error, y generalmente están relacionadas con errores fatales o problemas que podrían haberse evitado con una mejor programación.

4. ¿Cuándo utilizar excepciones verificadas y no verificadas?
   Se recomienda utilizar excepciones verificadas cuando el programador pueda recuperarse de la excepción y continuar con la ejecución del programa de manera controlada. Por otro lado, las excepciones no verificadas son más adecuadas para situaciones en las que la recuperación es poco probable o imposible.