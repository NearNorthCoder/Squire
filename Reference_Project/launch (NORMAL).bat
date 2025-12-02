  @echo off

  TITLE Run Squire
  if exist "jar\squire-updated.jar" (
      echo "Update found"
      del /F /Q "jar\squire-launcher.jar"
      echo "Replacing with update"
      ren "jar\squire-updated.jar" "squire-launcher.jar"
      del /F /Q "jar\squire-updated.jar"
  )

  .\jre\bin\java.exe -XX:+DisableAttachMechanism -Xmx4G -Xss2m -XX:CompileThreshold=1500 -Drunelite.launcher.nojvm=true -jar .\jar\squire-launcher.jar
  pause
