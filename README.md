# 🎬 API REST de Películas

API REST desarrollada en Spring Boot para la gestión de películas de un servicio de streaming, implementa operaciones básicas de consulta y creación de películas, DTOs para exponer solo los datos necesarios al cliente, y mappers para la conversión entre entidades y DTOs. 

Este proyecto se desarrolló para estudiantes de la Tecnicatura Universitaria en Programación de la **Universidad Tecnológica Nacional (UTN)**.

## 📚 Tecnologías Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database (en memoria)**
- **Maven**

🎯 Objetivos del Ejercicio

Implementar una API REST con Spring Boot
Aplicar el patrón DTO para la transferencia de datos
Utilizar mappers para la conversión entre capas
Demostrar el uso de Spring Data JPA
Crear una estructura de proyecto clara y organizada

🚀 Características Implementadas
✨ Funcionalidades

Consultar todas las películas disponibles
Consultar película por ID específico
Crear nuevas películas en el sistema
Transferencia de datos optimizada con DTOs
Mapeo automático entre entidades y DTOs


🛠️ Tecnologías Utilizadas
TecnologíaPropósitoSpring BootFramework principalSpring Data JPAPersistencia de datosSpring WebAPI RESTJPA/HibernateORM y mapeo objeto-relacionalJavaLenguaje de programación

🎓 Conceptos Aplicados
Este proyecto demuestra la aplicación práctica de:
🏛️ Arquitectura en Capas

Controller: Manejo de peticiones HTTP y endpoints REST
Service: Lógica de negocio y procesamiento de datos
Repository: Acceso a datos con Spring Data JPA
Entity: Modelo de dominio con anotaciones JPA

📦 Patrón DTO (Data Transfer Object)

Separación de responsabilidades: Los DTOs encapsulan solo los datos necesarios para cada operación
MovieCreateDTO: Contiene todos los campos para crear una película
MovieResponseDTO: Expone solo información básica al cliente

🔄 Mapper Pattern

Conversión limpia entre capas: Métodos estáticos para convertir entre Entity y DTO
Separación de lógica: El mapper mantiene la lógica de conversión centralizada
Reutilización: Los métodos del mapper se pueden usar en diferentes partes del código

🗃️ Spring Data JPA

Repository automático: Hereda métodos CRUD básicos de JpaRepository
Configuración por convención: Uso de anotaciones JPA estándar
Gestión automática de transacciones

🌐 API REST

Endpoints RESTful: Uso apropiado de métodos HTTP
Serialización JSON automática: Spring Boot maneja la conversión automáticamente
Inyección de dependencias: Uso de @Autowired para la inversión de control

👨‍💻 Autor
Rodolfo Nicolás Velasco Fessler
Estudiante de Tecnicatura Universitaria en Programación
Universidad Tecnológica Nacional (UTN)
