import sbt._

object Dependencies {

  object Version {
    lazy val cats = "2.4.2"
  }

  lazy val catsCore = "org.typelevel" %% "cats-core" % Version.cats

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.6"
}
