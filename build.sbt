name := "scala-kafka-client-examples"

scalaVersion := "2.12.2"

resolvers += Resolver.bintrayRepo("cakesolutions", "maven")

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  "com.typesafe.akka" % "akka-actor_2.12" % "2.5.6",
  "org.apache.kafka" % "kafka-clients" % "0.11.0.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.25",
  "net.cakesolutions" %% "scala-kafka-client" % "0.11.0.0",
  "net.cakesolutions" %% "scala-kafka-client-akka" % "0.11.0.0",
  "net.cakesolutions" %% "scala-kafka-client-testkit" % "0.11.0.0" % "test"
)