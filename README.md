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

### 🏛️ Estructura de Capas

```
src/main/java/com/example/
├── Controller/          # Capa de presentación (REST endpoints)
│   └── MovieController.java
├── Service/            # Capa de lógica de negocio
│   └── MovieService.java
├── Repository/         # Capa de acceso a datos
│   └── MovieRepository.java
├── Entity/            # Modelo de dominio
│   └── Movie.java
├── DTO/               # Objetos de transferencia de datos
│   ├── MovieCreateDTO.java
│   ├── MovieUpdateDTO.java
│   └── MovieResponseDTO.java
├── Mapper/            # Conversión entre capas
│   └── MovieMapper.java
└── Main.java          # Clase principal
```

## 📦 Patrón DTO Implementado

### 🔄 DTOs por Operación

- **MovieCreateDTO**: Contiene todos los campos necesarios para crear una película
- **MovieUpdateDTO**: Contiene todos los campos para actualizar una película existente  
- **MovieResponseDTO**: Expone solo información básica (id, title, genre) al cliente

### 🎯 Beneficios del Patrón DTO

- **Separación de responsabilidades**: Los DTOs encapsulan solo los datos necesarios
- **Seguridad**: No expone campos internos de la entidad
- **Flexibilidad**: Diferentes DTOs para diferentes operaciones
- **Optimización**: Reduce la transferencia de datos innecesarios

## 🔄 Mapper Pattern

### 📋 Métodos Implementados

- `toResponseDTO(Movie)`: Convierte Entity a DTO de respuesta
- `toEntity(MovieCreateDTO)`: Convierte DTO de creación a Entity
- `updateEntity(Movie, MovieUpdateDTO)`: Actualiza Entity existente con datos del DTO

### ✅ Ventajas

- **Conversión limpia**: Métodos estáticos centralizados
- **Reutilización**: Mismo mapper para diferentes operaciones
- **Mantenibilidad**: Lógica de conversión en un solo lugar

## 🗃️ Persistencia de Datos

### 🏪 Spring Data JPA

- **Repository automático**: Hereda métodos CRUD de JpaRepository
- **Métodos adicionales**: `existsById()` para validaciones
- **Configuración por convención**: Anotaciones JPA estándar
- **Base de datos H2**: En memoria para desarrollo y pruebas

### 📊 Modelo de Entidad

```java
@Entity
public class Movie {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private String director;
    private int durationInMinutes;
    private String description;
}
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
- **cURL**: Para pruebas desde línea de comandos
- **Browser**: Para endpoints GET simples

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

## 🔧 Configuración y Ejecución

### ⚙️ Requisitos Previos

- Java 17+
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### 🚀 Ejecución

```bash
# Clonar el proyecto
git clone [repository-url]

# Navegar al directorio
cd movie-api

# Ejecutar con Maven
mvn spring-boot:run

# O ejecutar el JAR
mvn clean package
java -jar target/movie-api-1.0.0.jar
```

### 🌐 Acceso

- **URL Base**: `http://localhost:8080`
- **Endpoints**: `/movies/*`
- **Base de datos H2**: `http://localhost:8080/h2-console`

## 👨‍💻 Autor

**Rodolfo Nicolás Velasco Fessler**  
Estudiante de Tecnicatura Universitaria en Programación  
**Universidad Tecnológica Nacional (UTN)**

---

*Este proyecto demuestra la implementación práctica de una API REST completa con Spring Boot, aplicando buenas prácticas de desarrollo y patrones de diseño modernos.*