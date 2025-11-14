val listaPrecios: List[Double] = List(2.50, 3.0, 1.50, 1.75, 1.80)

def precios(precios: List[Double], politica: Double => Double): List[Double] =
  precios.map(politica)
def preciosIVA(precio: Double): Double =
  precio * 1.12
def descuentoPromo(precio: Double): Double =
  precio * 0.80
def estrategiaComercial(precio: Double): Double =
  precio - 0.10
def sinAjuste(precio: Double): Double =
  precio

val preciosIva: List[Double] = precios(listaPrecios, descuentoPromo())
