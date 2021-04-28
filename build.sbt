Global / scalaVersion := "2.13.4"
name := "submodtest"

lazy val submod = (project in file("submod"))
lazy val root = (project in file(".")).aggregate(submod)

