# Sistema de renta de maquinaria de construccion

Proyecto educativo hecho en Java Swing con PostgreSQL para administrar clientes, operarios, maquinaria, usuarios, rentas e historial de operaciones.

## Requisitos

- JDK 18 o compatible.
- NetBeans con soporte para proyectos Ant, o Apache Ant instalado.
- PostgreSQL local.

## Base de datos

La aplicacion usa por defecto:

- Base de datos: `constructora`
- Usuario: `postgres`
- Password: `1234`
- URL: `jdbc:postgresql://localhost:5432/constructora`

Para crear la base de datos y cargar datos de prueba:

```powershell
$env:PGPASSWORD='1234'
$exists = psql -h localhost -U postgres -d postgres -tAc "SELECT 1 FROM pg_database WHERE datname='constructora'"
if (-not $exists) { psql -h localhost -U postgres -d postgres -c "CREATE DATABASE constructora" }
psql -h localhost -U postgres -d constructora -f database/init.sql
```

El script `database/init.sql` crea las tablas necesarias y agrega usuarios, clientes, operarios, maquinaria y una renta de ejemplo.

Usuarios de prueba:

- Administrador: `admin` / `admin123`
- Usuario: `usuario` / `usuario123`

## Ejecucion

Desde NetBeans:

1. Abrir la carpeta del proyecto.
2. Limpiar y construir.
3. Ejecutar el proyecto.

Desde terminal, si Java y Ant estan en el `PATH`:

```powershell
ant clean jar
java -jar dist/alv.jar
```

Tambien puedes cambiar la conexion sin editar codigo:

```powershell
$env:DB_URL='jdbc:postgresql://localhost:5432/constructora'
$env:DB_USER='postgres'
$env:DB_PASSWORD='1234'
java -jar dist/alv.jar
```

## Notas

Las librerias necesarias ya estan incluidas en `dist/lib`: PostgreSQL JDBC, JCalendar y AbsoluteLayout.
