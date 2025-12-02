@echo off
set JAVA_HOME=C:\Program Files\Java\jdk-25
call mvn clean package -DskipTests
