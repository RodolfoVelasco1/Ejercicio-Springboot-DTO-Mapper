# 🎬 API REST Películas - Guía de Uso con Postman

## 📋 Información del Proyecto

**Autor:** Rodolfo Nicolás Velasco Fessler  
**Universidad:** Universidad Tecnológica Nacional (UTN)  
**Carrera:** Tecnicatura Universitaria en Programación  

## 🚀 Configuración Inicial

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
  "description": "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station."
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
  "description": "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."
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
```json
RuntimeException: Película no encontrada con ID: 999
```
#### Status Code: `500 Internal Server Error`

## 📝 Notas Importantes

- **Persistencia**: Los datos se pierden al reiniciar la aplicación (H2 en memoria)
- **IDs**: Se generan automáticamente comenzando desde 1
- **DTOs**: Las respuestas solo muestran información básica, no todos los campos de la entidad
- **Errores**: La aplicación actual no tiene manejo sofisticado de errores (retorna 500 para IDs inexistentes)
