// give the user a nice default project!
ThisBuild / organization := "com.example"
// ThisBuild / scalaVersion := $scala_version$

libraryDependencies += "dev.zio" %% "zio" % "2.1.5"

lazy val root = (project in file(".")).
  settings(
    name := "$name$"
  )
