name := "template"
scalaVersion := "2.13.13"

val sparkVersion = "3.5.1"

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.2.18"
)

libraryDependencies ++= sparkDependencies ++ testDependencies
