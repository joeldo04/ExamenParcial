/*
Transforme el siguiente método Java desarrollado de forma imperativa a una versión funcional utilizando Scala.
double myMethod(List<Double> datos) {

    List<Double> logs = new ArrayList<>();

    for (int i = 0; i < datos.size(); i++) {
        logs.add(Math.log(datos.get(i)));
    }

    double sumaLogs = 0.0;
    for (int i = 0; i < logs.size(); i++) {
        sumaLogs += logs.get(i);
    }
    double promedioLog = sumaLogs / logs.size();

    double sumaCuadrados = 0.0;
    for (int i = 0; i < logs.size(); i++) {
        double diferencia = logs.get(i) - promedioLog;
        sumaCuadrados += diferencia * diferencia;
    }

    return Math.sqrt(sumaCuadrados / logs.size());
} En base al siguiente problema ayudame a resolver este ejercicio desarrollado de forma imperativa en java a una versión funcional usando Scala
 */
def myMethodFuncional(datos: List[Double]): Double = {

  val logs = datos.map(math.log)
  val n = logs.size
  val promedioLog = logs.sum / n

  val sumaCuadrados = logs.map(log =>
    math.pow(log - promedioLog, 2)
  ).sum

  math.sqrt(sumaCuadrados / n)
}



