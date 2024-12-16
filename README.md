# Sistema de Gestión de Usuarios

Este es un sistema de gestión de usuarios desarrollado en Java, que incluye diferentes módulos para manejar la lógica de la aplicación, las conexiones a la base de datos y la interfaz gráfica. Utiliza MySQL como base de datos y está diseñado con una arquitectura modular para facilitar el mantenimiento y escalabilidad.

---

## Descripción General del Proyecto

El proyecto está estructurado en diferentes paquetes, cada uno con una funcionalidad específica:

### **Estructura del Proyecto**

La siguiente imagen muestra la estructura del proyecto:

![image](https://github.com/user-attachments/assets/092c1314-6f00-4187-9a6c-296da46afc6f)


1. **Paquete ****************`conexion`****************:**\
   Contiene clases responsables de conectar la aplicación con la base de datos MySQL.

   - `Conexion.java`: Implementa la lógica para establecer una conexión con la base de datos utilizando JDBC.

2. **Paquete ****************`controlador`****************:**\
   Contiene la lógica de control para gestionar operaciones de las entidades principales.

   - `Ctrl_Habitacion.java`: Maneja las operaciones relacionadas con las habitaciones, como agregar, editar y eliminar.
   - `Ctrl_Usuario.java`: Controla las operaciones sobre los usuarios, como registrar y validar usuarios.

3. **Paquete ****************`modelo`****************:**\
   Contiene las clases de modelo que representan las entidades en el sistema.

   - `Cliente.java`: Representa los datos del cliente, como su nombre, dirección y teléfono.
   - `Factura.java`: Modela la información de las facturas generadas en el sistema.
   - `Habitacion.java`: Representa las habitaciones del hotel.
   - `Reservacion.java`: Almacena información sobre las reservaciones realizadas.
   - `Usuario.java`: Modela la información de los usuarios del sistema.

4. **Paquete ****************`pdf`****************:**

   - `GeneradorFacturaPDF.java`: Clase encargada de generar facturas en formato PDF usando la biblioteca iText.

5. **Paquete ****************`vista`****************:**\
   Contiene las interfaces gráficas de usuario (`JInternalFrame`) para interactuar con el sistema.

   - `InterFactura.java`: Ventana para la gestión y generación de facturas.
   - `InterClientes.java`: Maneja el registro y edición de clientes.
   - `InterHabitaciones.java`: Gestiona las habitaciones disponibles y su estado.
   - `InterReservaciones.java`: Ventana para realizar y gestionar las reservaciones.
   - `InterServicios.java`: Permite la administración de servicios adicionales.
   - `InterUser.java`: Gestión de usuarios (crear, editar, eliminar).
   - `FrmMenu.java`: Ventana principal que actúa como contenedor para las otras vistas.

6. **Otros Archivos Clave:**

   - `build.xml` y `manifest.mf`: Archivos necesarios para la compilación y configuración del proyecto.

---

## Tecnologías Usadas

- **Java** (con Swing para la interfaz gráfica).
- **MySQL** (para la gestión de la base de datos).
- **JDBC** (para la conexión entre Java y MySQL).
- **iText** (para generar facturas en formato PDF).

---

## Requisitos

- **JDK 8 o superior.**
- **MySQL instalado y corriendo.**
- **Base de datos MySQL configurada para el proyecto** (consulta el script SQL más abajo para crear las tablas necesarias).

---

## Descripción de la Interfaz Gráfica

### Pantalla de Inicio de Sesión

![image](https://github.com/user-attachments/assets/c662b4aa-804b-4c81-a58d-1375e818875c)


- **Propósito:** Permitir a los usuarios autenticarse en el sistema.
- **Campos:**
  - **Usuario:** Campo de texto para ingresar el nombre de usuario.
  - **Contraseña:** Campo de texto protegido para ingresar la contraseña.
- **Botón "Iniciar Sesión":** Valida las credenciales ingresadas contra la base de datos y si son correctas, permite el acceso al sistema.

### Menú Principal

- **Menu principal Administrador:**

- **Propósito:** Actuar como un panel de control para acceder a las diferentes funcionalidades del sistema.
 ![image](https://github.com/user-attachments/assets/ae29c143-1285-43d8-b204-af6899809ce7)

- **Menu principal Recepcionista:**

- **Propósito:** Actuar como un panel de control para acceder a las diferentes funcionalidades del sistema, en el roll de recepcionista, lo cual nos muestra un panel modificado con unas funciones recortadas que solo el panel administrador posee.
![image](https://github.com/user-attachments/assets/624470ee-d694-4c71-b680-d34025b5ca13)

- **Opciones Disponibles:**
  - **Usuarios:** Gestiona los usuarios del sistema (crear, editar), al crear un usuario valida que los campos sean correctos, al seleccionar una fila de la tabla usuarios, se rellena en automatico los campos y solo edita lo que se modifica.
    ![image](https://github.com/user-attachments/assets/7e031eae-d54f-4543-b2e9-8237131dae39)

  - **Habitaciones:** Administra la información de las habitaciones, asi como tambien crea y edita una habitacion para editar solo basta con seleccionar.
    ![image](https://github.com/user-attachments/assets/c14c17c8-d3d2-4694-bc9b-af4d9daee388)

  - **Reservaciones:** Permite realizar y gestionar reservaciones de habitaciones.
       -Crear una reserva seleccionando un cliente de la tabla clientes.
       -Asigna las habitaciones a esa reserva, para ver la habitaciones selecciona la fecha inicio y fin y dale buscar.
       -Al selecionar una habitacion y una reserva le das en asignar y se acompleta la reservacion.
    ![image](https://github.com/user-attachments/assets/0bf71232-28e0-4dea-8850-e4f96714f3be)

  - **Clientes:** Maneja el registro y actualización de clientes, crea y edita los clientes, para editar un cliente solo selecciona una fila la tabla.
    ![image](https://github.com/user-attachments/assets/96f17703-adfe-4008-bdcf-20846a0c8671)

  - **Servicios:** Gestiona servicios adicionales ofrecidos por el hotel, para crear un servicio se selecciona la reserva que solicita un servicio.
    ![image](https://github.com/user-attachments/assets/b39c5dc6-aec3-4ef7-9d69-51b472d6b2b7)

  - **Factura:** Genera facturas para las reservaciones y servicios, primero se factura y cobra seleccionando una resrva, para enviar al correo se selecciona una factura generada y se envia en automatico al          correo del cliente.
    ![image](https://github.com/user-attachments/assets/17cfc575-267d-4e0c-a186-fa38e557869b)

  - **Cerrar Sesión:** Finaliza la sesión del usuario actual y regresa a la pantalla de inicio de sesión.
   ![image](https://github.com/user-attachments/assets/356b2b14-d305-44a1-aef4-3b046003a884)



---

## Instrucciones de Instalación

### 1. Clonar el repositorio

Usa el siguiente comando para clonar el repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/gestion-de-usuarios.git
```

### 2. Configurar la Base de Datos

1. Crea una base de datos en MySQL llamada `bd_sistema_hotel`:

```sql
CREATE DATABASE bd_sistema_hotel;
USE bd_sistema_hotel;


CREATE TABLE TipoUsuario (
    idTipoUsuario INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(30) NOT NULL UNIQUE
);

-- Tabla de estados de usuario
CREATE TABLE Estado (
    idEstado INT AUTO_INCREMENT PRIMARY KEY,
    estado VARCHAR(30) NOT NULL UNIQUE -- Ejemplo: 'Activo', 'Inactivo'
);

-- Tabla de usuarios
CREATE TABLE Usuario (
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellidoPaterno VARCHAR(30) NOT NULL,
    apellidoMaterno VARCHAR(30) NOT NULL,
    usuario VARCHAR(15) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL, 
    telefono VARCHAR(15) NOT NULL,
    idEstado INT NOT NULL,
    idTipoUsuario INT NOT NULL,
    FOREIGN KEY (idEstado) REFERENCES Estado(idEstado),
    FOREIGN KEY (idTipoUsuario) REFERENCES TipoUsuario(idTipoUsuario)
);

-- Tabla de estados de reserva
CREATE TABLE EstadoReserva (
    idEstadoReserva INT AUTO_INCREMENT PRIMARY KEY,
    estado VARCHAR(30) NOT NULL UNIQUE -- Ejemplo: 'Confirmada', 'Cancelada', 'Pendiente'
);

-- Tabla de clientes
CREATE TABLE Cliente (
    idCliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellidoPaterno VARCHAR(30) NOT NULL,
    apellidoMaterno VARCHAR(30),
    telefono VARCHAR(10),
    correo VARCHAR(50) NOT NULL UNIQUE, -- Agregado el correo
    direccion TEXT
);

-- Tabla de tipos de habitación
CREATE TABLE TipoHabitacion (
    idTipoHabitacion INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL UNIQUE -- Ejemplo: 'Suite', 'Doble', 'Triple'
);

-- Tabla de estados de habitación
CREATE TABLE EstadoHabitacion (
    idEstadoHabitacion INT AUTO_INCREMENT PRIMARY KEY,
    estado VARCHAR(30) NOT NULL UNIQUE -- Ejemplo: 'Disponible', 'Ocupada', 'Mantenimiento'
);

-- Tabla de habitaciones
CREATE TABLE Habitacion (
    idHabitacion INT AUTO_INCREMENT PRIMARY KEY,
    idTipoHabitacion INT NOT NULL,
    idEstadoHabitacion INT NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    descripcion TEXT,
    FOREIGN KEY (idTipoHabitacion) REFERENCES TipoHabitacion(idTipoHabitacion),
    FOREIGN KEY (idEstadoHabitacion) REFERENCES EstadoHabitacion(idEstadoHabitacion)
);

-- Tabla de reservas
CREATE TABLE Reserva (
    idReserva INT AUTO_INCREMENT PRIMARY KEY,
    idCliente INT NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    fecha_reserva TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    idEstadoReserva INT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
    FOREIGN KEY (idEstadoReserva) REFERENCES EstadoReserva(idEstadoReserva)
);

-- Relación entre reservas y habitaciones
CREATE TABLE HabitacionReserva (
    idHabitacionReserva INT AUTO_INCREMENT PRIMARY KEY,
    idReserva INT NOT NULL,
    idHabitacion INT NOT NULL,
    FOREIGN KEY (idReserva) REFERENCES Reserva(idReserva),
    FOREIGN KEY (idHabitacion) REFERENCES Habitacion(idHabitacion)
);

-- Tabla de facturas 
CREATE TABLE Factura (
    idFactura INT AUTO_INCREMENT PRIMARY KEY,
    idReserva INT NOT NULL,
    fecha_emision TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_habitacion DECIMAL(10, 2) DEFAULT 0,
    total_servicios DECIMAL(10, 2) DEFAULT 0,
    descuento DECIMAL(5, 2) DEFAULT 0,
    total DECIMAL(10, 2) DEFAULT 0,
    FOREIGN KEY (idReserva) REFERENCES Reserva(idReserva)
);

CREATE TABLE Servicio (
    idServicio INT AUTO_INCREMENT PRIMARY KEY,
    idReserva INT NOT NULL,
    descripcion TEXT NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (idReserva) REFERENCES Reserva(idReserva)
);
```

---

## Video Explicativo


https://github.com/user-attachments/assets/de216a48-c472-4301-a394-78f29d6fcdd3
