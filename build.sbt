name := """referrals"""
organization := "com.soc"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

resolvers += "public-jboss" at "http://repository.jboss.org/nexus/content/groups/public-jbos"

libraryDependencies ++= Seq(
  "org.drools" % "drools-core" % "7.3.0.Final",
  "org.drools" % "drools-compiler" % "7.3.0.Final"
)

libraryDependencies += guice

libraryDependencies += "com.google.code.gson" % "gson" % "2.2.4"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.4"