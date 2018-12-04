package baseConfig

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BaseSimulation extends Simulation {
// We can add BaseSimulation as per project need
  val httpConf = http
    .baseURL("")
    .header("", "")

}
