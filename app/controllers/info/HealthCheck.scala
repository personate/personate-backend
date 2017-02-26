package controllers.info

import javax.inject._

import play.api.mvc.{Action, Controller}


@Singleton
class HealthCheck @Inject() extends Controller {

  def simpleCheck = Action {
    Ok("healthy")
  }

}
