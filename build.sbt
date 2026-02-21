val common = Def.settings(
  scalaVersion := "2.13.18"
)

lazy val a = project
  .settings(
    common,
  )

lazy val b = project
  .in(file("."))
  .settings(
    common,
    libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % Test,
  )
  .dependsOn(a)
  .aggregate(a)
