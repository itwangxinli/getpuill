name := "quill"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.30",
  "io.getquill" %% "quill-jdbc" % "2.2.0",
  "org.slf4j" % "slf4j-log4j12" % "1.7.7",
  "org.slf4j" % "jcl-over-slf4j" % "1.7.7",
  "org.slf4j" % "slf4j-api" % "1.7.7",
)
        