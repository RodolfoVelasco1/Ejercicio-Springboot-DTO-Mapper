# 🎬 API REST Películas - Guía de Uso con Postman

## 📋 Información del Proyecto

**Autor:** Rodolfo Nicolás Velasco Fessler  
**Universidad:** Universidad Tecnológica Nacional (UTN)  
**Carrera:** Tecnicatura Universitaria en Programación  

## 🚀 Configuración Inicial

### ⚙️ Requisitos Previos

- Java 17+
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### ⚙️ Ejecutar el Proyecto

1. **Clonar y abrir el proyecto en tu IDE**
2. **Ejecutar la aplicación Spring Boot**
   ```bash
   mvn spring-boot:run
   ```
3. **Verificar que la aplicación esté corriendo**
   - URL base: `http://localhost:8080`
   - Puerto: `8080`

## 📡 Endpoints Disponibles

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| `POST` | `/movies` | Crear nueva película |
| `GET` | `/movies` | Obtener todas las películas |
| `GET` | `/movies/{id}` | Obtener película por ID |
| `PUT` | `/movies/{id}` | Actualizar película existente |
| `DELETE` | `/movies/{id}` | Eliminar película |

## 🧪 Guía de Pruebas con Postman

### 📝 1. Crear Nueva Película (POST)

#### Configuración en Postman:
- **Método**: `POST`
- **URL**: `http://localhost:8080/movies`
- **Headers**: 
  - `Content-Type: application/json`

#### EJEMPLO 1
#### Body (raw JSON):
```json
{
  "title": "Star Wars: Episode IV - A New Hope",
  "genre": "Science Fiction",
  "releaseYear": 1977,
  "director": "George Lucas",
  "durationInMinutes": 121,
  "description": "Luke Skywalker, teams up with a wise Jedi, a young pilot, a hairy Wookiee, and two robots. Together, they must save the galaxy".
}
```

#### Respuesta Esperada:
```json
{
  "id": 1,
  "title": "Star Wars: Episode IV - A New Hope",
  "genre": "Science Fiction"
}
```

#### Status Code: `200 OK`

---

#### EJEMPLO 2
#### Body (raw JSON):
```json
{
  "title": "The Godfather",
  "genre": "Crime",
  "releaseYear": 1972,
  "director": "Francis Ford Coppola",
  "durationInMinutes": 175,
  "description": "An old crime boss gives control of his secret empire to his son."
}
```

#### Respuesta Esperada:
```json
{
  "id": 2,
  "title": "The Godfather",
  "genre": "Crime"
}
```

#### Status Code: `200 OK`

---

### 📋 2. Obtener Todas las Películas (GET ALL)

#### Configuración en Postman:
- **Método**: `GET`
- **URL**: `http://localhost:8080/movies`
- **Headers**: No requeridos

#### Respuesta Esperada:
```json
[
  {
    "id": 1,
    "title": "Star Wars: Episode IV - A New Hope",
    "genre": "Science Fiction"
  },
  {
    "id": 2,
    "title": "The Godfather",
    "genre": "Crime"
  }
]
```

#### Status Code: `200 OK`

---

### 🔍 3. Obtener Película por ID (GET BY ID)

#### Configuración en Postman:
- **Método**: `GET`
- **URL**: `http://localhost:8080/movies/1`
- **Headers**: No requeridos

#### Respuesta Esperada:
```json
{
  "id": 1,
  "title": "Star Wars: Episode IV - A New Hope",
  "genre": "Science Fiction"
}
```

#### Status Code: `200 OK`

#### Si el ID no existe:
#### Status Code: `500 Internal Server Error`

---

### ✏️ 4. Actualizar Película (PUT)

#### Configuración en Postman:
- **Método**: `PUT`
- **URL**: `http://localhost:8080/movies/1`
- **Headers**: 
  - `Content-Type: application/json`

#### Body (raw JSON):
```json
{
  "title": "Star Wars 4 (Updated)",
  "genre": "Sci-Fi Adventure",
  "releaseYear": 1977,
  "director": "George Lucas",
  "durationInMinutes": 121,
  "description": "Updated description: Luke Skywalker begins a journey that will change the galaxy forever."
}
```

#### Respuesta Esperada:
```json
{
  "id": 1,
  "title": "Star Wars 4 (Updated)",
  "genre": "Sci-Fi Adventure"
}
```

#### Status Code: `200 OK`

#### Si el ID no existe:
#### Status Code: `500 Internal Server Error`

---

### 🗑️ 5. Eliminar Película (DELETE)

#### Configuración en Postman:
- **Método**: `DELETE`
- **URL**: `http://localhost:8080/movies/1`
- **Headers**: No requeridos

#### Respuesta Esperada:

#### Status Code: `200 OK`

#### Si el ID no existe:
#### Status Code: `500 Internal Server Error`

---

## 🔄 Flujo de Pruebas Completo

### Secuencia Recomendada:

1. **POST** - Crear 2-3 películas
2. **GET ALL** - Verificar que se crearon correctamente
3. **GET BY ID** - Consultar una película específica
4. **PUT** - Actualizar una película existente
5. **GET BY ID** - Verificar que se actualizó correctamente
6. **DELETE** - Eliminar una película
7. **GET ALL** - Verificar que se eliminó correctamente

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

## 📝 Notas Importantes

- **Persistencia**: Los datos se pierden al reiniciar la aplicación (H2 en memoria)
- **IDs**: Se generan automáticamente comenzando desde 1
- **DTOs**: Las respuestas solo muestran información básica (id, title, genre)
- **Errores**: La aplicación retorna 500 para IDs inexistentes
- **Actualización**: PUT requiere enviar todos los campos, funciona como reemplazo completo
- **Eliminación**: DELETE es irreversible, elimina permanentemente la película
