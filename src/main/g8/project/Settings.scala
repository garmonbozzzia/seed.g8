import sbt._
import Keys._
import Dependencies._

object Settings {
  val commonSettings = Seq(
    scalaVersion := "$scala_version$",
    libraryDependencies ++= Seq(
      dev.zio.zio
    )
    // Здесь можно указать другие общие настройки
  )
}
