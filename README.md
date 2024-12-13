# Sistema de Gestión de Usuarios

Este es un sistema de gestión de usuarios desarrollado en Java, que incluye diferentes módulos para manejar la lógica de la aplicación, las conexiones a la base de datos y la interfaz gráfica. Utiliza MySQL como base de datos y está diseñado con una arquitectura modular para facilitar el mantenimiento y escalabilidad.

---

## Descripción General del Proyecto

El proyecto está estructurado en diferentes paquetes, cada uno con una funcionalidad específica:

### **Estructura del Proyecto**

La siguiente imagen muestra la estructura del proyecto:

![image](https://github.com/user-attachments/assets/4b06993c-ae3c-4cc6-a98b-cb7c82a70be5)


1. **Paquete `conexion`:**  
   Contiene clases responsables de conectar la aplicación con la base de datos MySQL.
   - **`Conexion.java`:** Implementa la lógica para establecer una conexión con la base de datos utilizando JDBC.

2. **Paquete `controlador`:**  
   Contiene la lógica de control para gestionar operaciones de las entidades principales.
   - **`Ctrl_Habitacion.java`:** Maneja las operaciones relacionadas con las habitaciones, como agregar, editar y eliminar.
   - **`Ctrl_Usuario.java`:** Controla las operaciones sobre los usuarios, como registrar y validar usuarios.

3. **Paquete `modelo`:**  
   Contiene las clases de modelo que representan las entidades en el sistema.
   - **`Cliente.java`:** Representa los datos del cliente, como su nombre, dirección y teléfono.
   - **`Factura.java`:** Modela la información de las facturas generadas en el sistema.
   - **`Habitacion.java`:** Representa las habitaciones del hotel.
   - **`Reservacion.java`:** Almacena información sobre las reservaciones realizadas.
   - **`Usuario.java`:** Modela la información de los usuarios del sistema.

4. **Paquete `pdf`:**  
   - **`GeneradorFacturaPDF.java`:** Clase encargada de generar facturas en formato PDF usando la biblioteca iText.

5. **Paquete `vista`:**  
   Contiene las interfaces gráficas de usuario (`JInternalFrame`) para interactuar con el sistema.
   - **`InterFactura.java`:** Ventana para la gestión y generación de facturas.
   - **`InterClientes.java`:** Maneja el registro y edición de clientes.
   - **`InterHabitaciones.java`:** Gestiona las habitaciones disponibles y su estado.
   - **`InterReservaciones.java`:** Ventana para realizar y gestionar las reservaciones.
   - **`InterServicios.java`:** Permite la administración de servicios adicionales.
   - **`InterUser.java`:** Gestión de usuarios (crear, editar, eliminar).
   - **`FrmMenu.java`:** Ventana principal que actúa como contenedor para las otras vistas.

6. **Otros Archivos Clave:**
   - **`README.md`:** Documento con información detallada del proyecto, cómo configurarlo y sus características.
   - **`build.xml` y `manifest.mf`:** Archivos necesarios para la compilación y configuración del proyecto.

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

## Instrucciones de Instalación

### 1. Clonar el repositorio

Usa el siguiente comando para clonar el repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/gestion-de-usuarios.git
