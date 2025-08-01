# 🎬 API REST de Películas

API REST completa desarrollada en Spring Boot para la gestión integral de películas de un servicio de streaming. Implementa todas las operaciones CRUD (Create, Read, Update, Delete), utiliza DTOs para exponer solo los datos necesarios al cliente, y mappers para la conversión eficiente entre capas. 

Este proyecto se desarrolló para estudiantes de la Tecnicatura Universitaria en Programación de la **Universidad Tecnológica Nacional (UTN)**.

## 📚 Tecnologías Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database (en memoria)**
- **Maven**

## 🎯 Objetivos del Ejercicio

- Implementar una API REST completa con Spring Boot
- Aplicar el patrón DTO para la transferencia de datos
- Utilizar mappers para la conversión entre capas
- Demostrar el uso completo de Spring Data JPA
- Crear una estructura de proyecto clara y organizada
- Implementar todas las operaciones CRUD

## ✨ Funcionalidades

### 🔍 Operaciones de Consulta
- Consultar todas las películas disponibles
- Consultar película por ID específico

### 📝 Operaciones de Creación
- Crear nuevas películas en el sistema
- Validación de datos de entrada

### ✏️ Operaciones de Actualización
- Actualizar películas existentes por ID
- Reemplazo completo de información

### 🗑️ Operaciones de Eliminación
- Eliminar películas del sistema por ID
- Validación de existencia antes de eliminar

### 🔄 Características Técnicas
- Transferencia de datos optimizada con DTOs específicos
- Mapeo automático entre entidades y DTOs
- Manejo básico de errores y excepciones
- Arquitectura en capas bien definida

## 🌐 Endpoints Disponibles

| Método | Endpoint | Descripción | Status Code |
|--------|----------|-------------|-------------|
| `GET` | `/movies` | Obtener todas las películas | 200 OK |
| `GET` | `/movies/{id}` | Obtener película por ID | 200 OK / 500 Error |
| `POST` | `/movies` | Crear nueva película | 200 OK |
| `PUT` | `/movies/{id}` | Actualizar película | 200 OK / 500 Error |
| `DELETE` | `/movies/{id}` | Eliminar película | 200 OK / 500 Error |

## 🛠️ Arquitectura del Proyecto

### 🏛️ Estructura de Paquetes Sugerida

```
src/main/java/com/example/
├── Controller/          # Capa de presentación (REST endpoints)
├── Service/            # Capa de lógica de negocio
├── Repository/         # Capa de acceso a datos
├── Entity/            # Modelo de dominio
├── DTO/               # Objetos de transferencia de datos
├── Mapper/            # Conversión entre capas
└── Main.java          # Clase principal
```

## 🌐 API REST

### 📡 Características

- **Endpoints RESTful**: Uso apropiado de métodos HTTP
- **Serialización JSON**: Conversión automática con Spring Boot
- **Inyección de dependencias**: Uso de @Autowired
- **Manejo de errores**: RuntimeException para casos de error
- **ResponseEntity**: Control mejorado de respuestas HTTP

### 🔍 Operaciones CRUD Completas

| Operación | Método HTTP | Descripción |
|-----------|-------------|-------------|
| **Create** | POST | Crear nueva película con todos los datos |
| **Read** | GET | Consultar películas (todas o por ID) |
| **Update** | PUT | Actualizar película existente completamente |
| **Delete** | DELETE | Eliminar película por ID |

## 🧪 Testing

### 🛠️ Herramientas Recomendadas
- **Postman**: Para pruebas manuales de API

### ✅ Casos de Prueba

1. Crear múltiples películas
2. Consultar lista completa
3. Consultar por ID específico
4. Actualizar película existente
5. Eliminar película
6. Verificar manejo de errores (IDs inexistentes)

## 🎓 Conceptos Aplicados

### 🏗️ Patrones de Diseño

- **DTO Pattern**: Transferencia de datos optimizada
- **Mapper Pattern**: Conversión entre capas
- **Repository Pattern**: Abstracción de acceso a datos
- **Layered Architecture**: Separación clara de responsabilidades

### 🚀 Spring Framework

- **Spring Boot**: Configuración automática
- **Spring Web**: Controladores REST
- **Spring Data JPA**: Persistencia simplificada
- **Dependency Injection**: Inversión de control

### 📊 Base de Datos

- **JPA/Hibernate**: ORM y mapeo objeto-relacional
- **H2 Database**: Base de datos en memoria
- **CRUD Operations**: Operaciones básicas de base de datos

## 👨‍💻 Autor

**Rodolfo Nicolás Velasco Fessler**  
Estudiante de Tecnicatura Universitaria en Programación  
**Universidad Tecnológica Nacional (UTN)**

---

*Este proyecto demuestra la implementación práctica de una API REST completa con Spring Boot, aplicando buenas prácticas de desarrollo y patrones de diseño modernos.*