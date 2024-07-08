enablePlugins(ScriptedPlugin)

name := "My Template Project"
Test / test := {
  val _ = (Test / g8Test).toTask("").value
}

scriptedLaunchOpts ++= List(
  "-Xms1024m", 
  "-Xmx1024m", 
  "-XX:ReservedCodeCacheSize=128m", 
  "-Xss2m", 
  "-Dfile.encoding=UTF-8"
),
