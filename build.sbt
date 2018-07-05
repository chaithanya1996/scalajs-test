enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.6" // or any other Scala version >= 2.10.2

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"

skip in packageJSDependencies := false
libraryDependencies += "org.webjars" % "jquery" % "3.3.1-1"