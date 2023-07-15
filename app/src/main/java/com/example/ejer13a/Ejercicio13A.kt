package com.example.ejer13a

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil


fun main(){
    var resultado = suma(5.5,6.4f)
    println(resultado)
    var redondeoV= redondeo(param1 = 7.6)
    println(redondeoV)

    var muestraResultado= muestraResultado(8.57)
    println(muestraResultado)

}
fun suma (param1:Double,param2:Float):Double = param1 +param2

fun redondeo(param1:Double)= ceil(param1)

fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    println(format.format(numero))
    return format.format(numero)

}
