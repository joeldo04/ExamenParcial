/*
Transforme la siguiente función sin nombre a una función con nombre usando SCALA

val generadorIncrementadorAnonimo: Int => (Int => Int) =
  (incremento: Int) =>
    (x: Int) =>
      x + incremento
 */

def generadorIncrementador(incremento: Int): Int => Int = {
  (x: Int) => x + incremento
}
