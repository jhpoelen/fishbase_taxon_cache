import sbt.Keys._

lazy val commonSettings = Seq(
  organization := "com.github.jhpoelen",
  version := "0.2.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "fishbase_taxon_cache",
    resolvers += Resolver.sonatypeRepo("public"),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.5" % "test"
    ),
    test in assembly := {}
  )

