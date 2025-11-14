/*
Ajuste de precios con políticas variables
En una tienda digital se trabaja con listas de precios que necesitan ser ajustadas antes de ser
mostradas al usuario. De acuerdo con el país, la temporada o las promociones vigentes, el ajuste
puede consistir en agregar un impuesto, aplicar un descuento o modificar el precio según cierta
estrategia comercial. Se requiere elaborar una solución donde exista una única función capaz de
recibir la lista de precios y, además, la función que representa la regla de ajuste que se quiera
aplicar en ese momento. Esta función deberá retornar una nueva lista de precios ya modificados de
acuerdo con la política específica que se haya suministrado. Ayudame a resolver el siguiente ejercicio
usando programación funcional en Scala
 */

def ajustarPreciosRecursivo(precios: List[Double], politica: Double => Double): List[Double] = {
  precios match {
    case Nil => Nil
    case head :: tail => politica(head) :: ajustarPreciosRecursivo(tail, politica)
  }
}

val listaPrecios: List[Double] = List(10.50, 30.0, 15.25, 100.0)
def agregarIVA(precio: Double): Double = precio * 1.12

val preciosConIVA_Rec = ajustarPreciosRecursivo(listaPrecios, agregarIVA)
println(s"Recursivo: $preciosConIVA_Rec")