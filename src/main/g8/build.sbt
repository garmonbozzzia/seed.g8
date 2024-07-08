// give the user a nice default project!
ThisBuild / organization := "com.example"
// ThisBuild / scalaVersion := $scala_version$

lazy val root = (project in file(".")).
  settings(
    name := "My Template Project"
  )
