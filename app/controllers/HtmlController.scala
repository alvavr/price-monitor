package controllers

import play.api.mvc.{Action, Controller}

import scala.io.Source

/**
  * Created by Enaccion20 on 31-03-2016.
  */
class HtmlController extends Controller{
  def html = Action {
    val html = Source.fromURL("http://www.enaccion-c.cl/nuestra-empresa")
    val s = html.mkString
    Ok(s)
  }
}
