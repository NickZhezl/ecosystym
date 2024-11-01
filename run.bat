@echo off
javac -d out -sourcepath src src/main/java/ecosystemsim/controller/EcosystemSimulator.java
java -cp out main.java.ecosystemsim.controller.EcosystemSimulator
pause