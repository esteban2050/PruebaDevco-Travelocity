#PROYECTO DE AUTOMATIZACION DE TRAVELOCITY.COM --------------------

Este proyecto va a contener la automatizacion de pruebas de la pagina de travelocity.com, para la gestion de reservas de viajes.

Para este proyecto se incluye la libreria de lombok ya que mediante anotaciones, reducimos el codigo a la hora de tener que implementar constructores con diferentes parametros, lo cual nos ayuda para mejorar la legibilidad del mismo.

Adicional a ello se debe tener en cuenta que para la parte de los escenarios automatizados donde es necesario loggearse en la pagina, se deben modificar los runner desde la ventana "Run/Debug Configurations" donde se agregan las variables a utilizar. Esto lo realice por motivos de seguridad, ya que el correo y la contraseña son datos que no deben estar quemados dentro del codigo, por ello se deben agregar los siguientes datos en esta ventana:

-En el campo Tasks:
clean test --tests com.travelocity.runners.OnThePage aggregate

-En el campo VM options(Use estas dos variables):
 -Duser=ju.eslogi123@hotmail.com
 -Dpassword=Juan5075551

Se debe tener en cuenta que adicional a ello, debido a la validacion de los captcha, se adiciono unas esperas implicitas desde el archivo serenity.properties con el objetivo de que el codigo espere un tiempod determinado y no estalle la ejecucion, dando asi el tiempo suficiente para validar el captcha manual para dos escenarios en los cuales fue necesario loggearse para ello.

#Descarga del proyecto---------------------------

Para la descarga del repositorio se debe de seguir los siguientes pasos: 
En la consola de git ejecutar el siguiente comando: 
- git clone (Ruta del proyecto de github)
- Luego de descargar el repositorio abrir el código como proyecto Gradle en la herramienta Intellij

# PRE-REQUISITOS -------------------------------

Estos son los programas y/o características que se deben tener instaladas localmente, para el proceso de ejecución de pruebas automatizadas bajo el patrón screenplay.
*Java 1.8
*JDK 1.8
*IntelliJ
*Plugin Cucumber dentro de IntelliJ
*Git
