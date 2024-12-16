/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    // println("Hello, world!!!")
    
    // val nombre = "Dustin" //variable inmutable 
    // var edad = 20 // variable cambiante
    
    // var numero = 10
    // numero = numero + 1 
    // println(numero)
    
    // val numero1 = 50
    // if (numero1 > 20) {
    //     println("xd")
    // } else {
    //     print("xdn't")
    // }
    
    
    // val numeros = listOf(1,2,3,4,5,6,7,8,9,10)
    // // bucle
    // for(numero in numeros){
    //     println("Numeros: $numero")
    // }
    
    // //bucle while
    // var contador = 1
    // while(contador <= 10){
    //     println("Contador: $contador")
    //     contador = contador + 1
    // }

    // // bucle do-while
    // var x = 0
    // do {
    //     println("Valor: $x")
    //     x = x + 1
    // } while (x <= 10)

    // val horas = 10
    // val mensaje = when{
    //     horas < 12 -> "Buenos dias"
    //     horas < 18 -> "Buenas tardes"
    //     else -> "Buenas noches"
    // }
    // println(mensaje)
    
    // println("Suma funcion: ${suma(5, 10)}")

    // // Ingreso de datos
    // val nombre2 = readLine()
    // // conversion
    // val edad2 = readLine()?.toIntOrNull()

    // ejercicio en practica 
    println ( "Seleccione una opcion: " )
    println ( "1. Calcular area de un cuadrado" )
    println ( "2. Calcular area de un circulo" )
    println ( "3. Calcular area de un triangulo" )
    println ( "4. Salir" )
    val opcion = readLine()!!.toInt()
    when ( opcion ) {
        1 -> {
            println ( "Ingrese el lado del cuadrado: " )
            val lado = readLine()!!.toDouble()
            print(areaCuadrado(lado)) 
        }
        2 -> {
            println ( "Ingrese el radio del circulo: " )
            val radio = readLine()!!.toDouble()
            print(areaCirculo(radio))

        }
        3 -> {
            println ( "Ingrese la base y la altura del triangulo: " )
            print ("Base: ") 
            val base = readLine()!!.toDouble()
            print ("Altura: ")
            val altura = readLine()!!.toDouble()

            print(areaTriangulo(base,altura))
        }
        4 -> println ( "Adios" )
    }
    
}

fun suma ( a: Double, b: Double): Double {
    return a + b
}
fun areaCuadrado ( lado: Double): Double {
    return lado * lado
}
fun areaCirculo ( radio: Double): Double {
    return 3.14 * (radio * radio)
}
fun areaTriangulo( base: Double, altura: Double): Double {
    return (base * altura) / 2
}