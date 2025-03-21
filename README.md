# 🚀 MS-CUSTOMER Template
**Plantilla base para microservicios en Java con conexión a Oracle vía Wallet (SQL Developer).**

Este repositorio sirve como base para desarrollar **microservicios en Spring Boot**, aplicando buenas prácticas de arquitectura y asegurando una **conexión a Oracle Database** mediante Wallet.

---

## 📌 **Características principales**
✅ **Java 21 + Spring Boot 3**  
✅ **Conexión a Oracle con Wallet (SQL Developer)**  
✅ **Arquitectura modular con capas bien definidas**  
✅ **JPA con Hibernate 6+ y HikariCP como pool de conexiones**  
✅ **CRUD básico para la entidad "Customers"**  

---

## 🏗 **Estructura del Proyecto**
El microservicio sigue una estructura organizada en capas para mejorar la **mantenibilidad y escalabilidad**.

```plaintext
MS-CUSTOMER
│-- src
│   └── main
│       └── java/com/vet/ms_customer
│           ├── configuration        # Configuraciones generales y de seguridad
│           │   ├── app              # Configuración de aplicación
│           │   ├── security         # Seguridad (JWT, CORS, etc.)
│           ├── persistence          # Capa de persistencia (Base de datos)
│           │   ├── entity           # Entidades JPA
│           │   ├── repository       # Repositorios JPA
│           ├── presentation         # Capa de presentación (controladores)
│           │   ├── controller       # Endpoints REST
│           ├── service              # Lógica de negocio
│           │   ├── implementation   # Implementaciones de servicios
│           │   ├── interfaces       # Interfaces de servicios
│           ├── util                 # Utilidades y mappers
│           ├── MsCustomerApplication.java  # Clase principal de Spring Boot
│-- src
│   └── main
│       └── resources
│           ├── application.properties  # Configuración de la BBDD y Hibernate
│           └── wallet/                  # Archivos del Wallet de Oracle
│-- pom.xml               # Dependencias de Maven
│-- .gitignore            # Archivos a ignorar en Git
│-- README.md             # Documentación del proyecto

🔍 Explicación de cada carpeta
📂 Carpeta	             📌 Descripción
configuration	           --> Configuración general del microservicio. Incluye seguridad, JWT, CORS, etc.
persistence/entity       -->	Entidades JPA que representan las tablas de la base de datos.
persistence/repository   -->	Interfaces de repositorios para acceso a la BBDD con Spring Data JPA.
presentation/controller  -->	Controladores REST que exponen los endpoints del microservicio.
service/interfaces       -->	Interfaces que definen la lógica de negocio.
service/implementation   -->	Implementación de las interfaces de servicio.
util                     -->	Utilidades como mappers y clases helper.
resources/wallet         -->	Archivos necesarios para conectar a Oracle vía Wallet.
MsCustomerApplication.java -->	Clase principal de Spring Boot que arranca el microservicio.
