/**
 * Proyecto Final - Programación Funcional
 * @author: Alexis Solis, Santiago Carrillo, Edwar Forero
 * Profesor: Carlos A Delgado
 */
package proyecto
import datos._

import org.scalameter.measure
import org.scalameter.withWarmer
import org.scalameter.Warmer

object App {
  def main(args: Array[String]): Unit = {
    val bench = new BenchMarking()
    val vuelos = vuelosC1
    val aeropuerto = aeropuertos
    val salida = "PHX"
    val llegada = "DTW"
    val horaSal = 2
    val minSal = 32
    val numRepe = 50
    bench.itinerarioBench(vuelos, aeropuerto, numRepe)(salida, llegada)
    bench.itinerariosTiempoBench(vuelos, aeropuerto, numRepe)(salida, llegada)
    bench.itinerariosEscalasBench(vuelos, aeropuerto, numRepe)(salida, llegada)
    bench.itinerariosAireBench(vuelos, aeropuerto, numRepe)(salida, llegada)
    bench.itinerariosSalidaBench(vuelos, aeropuerto, numRepe)(salida, llegada, horaSal, minSal)
  }
}


