# Sistema de Biblioteca
Este es un sistema de biblioteca simple desarrollado en Java con una base de datos MySQL. Permite gestionar registros de libros, usuarios, préstamos y devoluciones, además de calcular sanciones por retrasos en la devolución de libros.

## Características
- Registro de libros con información como título, autor, género, etc.
- Registro de usuarios con datos personales.
- Gestión de préstamos de libros a usuarios.
- Registro de devoluciones de libros.
- Cálculo automático de sanciones por retrasos en la devolución.
- Interfaz gráfica básica para una fácil interacción.

## Requisitos
- Java Development Kit (JDK) instalado.
- MySQL Server instalado y en funcionamiento.
- Conexión a internet para descargar dependencias (si no se tienen previamente).

## Configuración
- Crear una base de datos MySQL con el nombre biblioteca.
- Ejecutar el script SQL proporcionado en database.sql para crear las tablas necesarias.
- Editar el archivo src/main/java/config/DatabaseConfig.java con la configuración de conexión a la base de datos (nombre de usuario, contraseña, etc.).

## Uso
- Ejecutar el archivo Main.java para iniciar la aplicación.
- Utilizar la interfaz gráfica para navegar por las diferentes opciones disponibles, como registrar libros, usuarios, préstamos, devoluciones, etc.
- La aplicación calculará automáticamente las sanciones por retrasos en la devolución de libros y actualizará los registros en consecuencia.

## Contribución

Las contribuciones son bienvenidas. Si encuentras algún error o tienes ideas para mejorar el sistema, no dudes en abrir un problema o enviar un pull request.

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

¡Espero que este sistema de biblioteca sea útil y fácil de entender! Si tienes alguna pregunta o necesitas ayuda adicional, no dudes en contactar conmigo.




