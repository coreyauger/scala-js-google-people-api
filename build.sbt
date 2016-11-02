//import SonatypeKeys._

import sbt.Keys._

//sonatypeSettings

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
	  credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
	  resolvers += "NextWave Repo" at "http://maxdevmaster.cloudapp.net:4343/artifactory/nxtwv-maven/",
	  publishTo := Some("NextWave Repo" at "http://maxdevmaster.cloudapp.net:4343/artifactory/nxtwv-maven/"),
	  //  publishMavenStyle := true,
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.9.0"
        )
  )

name := "Type safe and scala friendly wrapper around google people api"

normalizedName := "scala-js-google-people-api"

version := "0.0.2-SNAPSHOT"

organization := "io.surfkit"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.5")
/*
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)

jsDependencies in Test += RuntimeDOM

homepage := Some(url("http://www.surfkit.io/"))

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

scmInfo := Some(ScmInfo(
    url("https://github.com/coreyauger/scala-js-google-people-api"),
    "scm:git:git@github.com/coreyauger/scala-js-google-people-api.git",
    Some("scm:git:git@github.com:coreyauger/scala-js-google-people-api.git")))


publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>coreyauger</id>
      <name>Corey Auger</name>
      <url>https://github.com/coreyauger/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }
*/

