set projectLocation==D:\Eclipse WorkSpace\OrangeHRM_Log4j_POM
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause