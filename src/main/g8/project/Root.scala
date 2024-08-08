import sbt._
import Keys._
import Settings._


object Root {
  lazy val root = (project in file("."))
    .aggregate(
      
    )
    // .aggregate(P0Common.common, module1, module2, aa)
    .settings(
      name := "$name;format="word,lower"$",
      commonSettings
    )
}
