@echo off
set d=%~dp0
java -Xmx400m -cp "%d%app.jar;%d%libs/app.jar" kz.nixwins.App %*