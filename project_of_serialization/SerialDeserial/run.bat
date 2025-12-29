@echo off
echo Compiling Java files...
javac *.java

echo.
echo Running Serializing...
java Serializing

echo.
echo Running Deserializing...
java DeSerializing

echo.
echo Done!
pause