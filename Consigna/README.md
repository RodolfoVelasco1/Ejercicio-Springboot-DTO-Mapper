# 📋 Consigna del Ejercicio - API REST para Gestión de Películas

## 🎯 Objetivo Principal

Crear una **API REST completa en Spring Boot** para gestionar las películas de un servicio de Streaming, implementando todas las operaciones CRUD (Create, Read, Update, Delete), utilizando **DTOs** para exponer solo los datos necesarios al cliente, y un **mapper** para la conversión entre capas.

Se debe implementar un DTO para cargar nuevas películas con toda su información correspondiente, otro DTO para actualizar películas existentes, y un DTO de respuesta que permita al usuario obtener solo la información necesaria de las películas.

## 🛠️ Requerimientos Técnicos

### 🏗️ Estructura de Paquetes Sugerida
```
com.example/
├── Controller/
├── Service/
├── Repository/
├── Entity/
├── DTO/
└── Mapper/
```

### 📦 Dependencias de Spring Boot
- `spring-boot-starter-web` (API REST)
- `spring-boot-starter-data-jpa` (Persistencia)
- Base de datos H2 (para desarrollo)

### 📦 Patrón DTO (Data Transfer Object)

- Crear DTOs específicos para diferentes operaciones:
  - **MovieCreateDTO**: Para crear nuevas películas
  - **MovieUpdateDTO**: Para actualizar películas existentes  
  - **MovieResponseDTO**: Para respuestas al cliente
- Exponer solo los datos necesarios en cada endpoint
- Separar el modelo interno de la API pública

### 🔄 Patrón Mapper

- Implementar conversiones entre Entity y DTO
- Incluir método para actualizar entidades existentes
- Centralizar la lógica de mapeo
- Mantener código limpio y reutilizable

## 🌐 Endpoints Requeridos

| Método HTTP | Endpoint | Descripción | DTO Entrada | DTO Salida |
|-------------|----------|-------------|-------------|------------|
| `GET` | `/movies` | Obtener todas las películas | - | `MovieResponseDTO[]` |
| `GET` | `/movies/{id}` | Obtener película por ID | - | `MovieResponseDTO` |
| `POST` | `/movies` | Crear nueva película | `MovieCreateDTO` | `MovieResponseDTO` |
| `PUT` | `/movies/{id}` | Actualizar película completa | `MovieUpdateDTO` | `MovieResponseDTO` |
| `DELETE` | `/movies/{id}` | Eliminar película | - | `String` |

## 🎯 Operaciones CRUD Detalladas

### 📝 CREATE (POST)
- Recibir todos los datos de la película
- Validar información requerida
- Generar ID automáticamente
- Retornar información básica de confirmación

### 📖 READ (GET)
- **GET ALL**: Listar todas las películas con información resumida
- **GET BY ID**: Obtener película específica con información resumida
- Manejar casos de ID inexistente

### ✏️ UPDATE (PUT)
- Actualizar película existente por ID
- Reemplazar todos los campos con nueva información
- Mantener el ID original
- Retornar información actualizada

### 🗑️ DELETE (DELETE)
- Eliminar película por ID
- Verificar existencia antes de eliminar
- Retornar confirmación de eliminación
- Manejar casos de ID inexistente

## 🧪 Pruebas Esperadas

El proyecto debe permitir:

1. **Crear películas** via POST con todos los datos
2. **Listar todas las películas** via GET con información resumida
3. **Consultar película específica** via GET por ID
4. **Actualizar película completa** via PUT
5. **Eliminar película** via DELETE
6. **Persistencia** en base de datos H2
7. **Conversión automática** JSON ↔ DTO
8. **Manejo básico de errores** para IDs inexistentes

## 💡 Consejos para la Implementación

### Orden de Desarrollo Sugerido:
1. **Entidad Movie** con anotaciones JPA
2. **DTOs**: Create, Update y Response
3. **Repository** heredando de JpaRepository
4. **Mapper** con métodos estáticos para todas las conversiones
5. **Service** con lógica de negocio para todas las operaciones
6. **Controller** con todos los endpoints REST

### Consideraciones Técnicas:
- **Usar ResponseEntity** para mejor control de respuestas HTTP
- **Validar existencia** antes de actualizar/eliminar
- **Manejo de excepciones** básico con RuntimeException
- **Métodos del mapper** específicos para cada tipo de conversión

## 🎓 Conceptos de Aprendizaje

Al completar este ejercicio, habrás aplicado:
- **API REST completa** con Spring Boot
- **Operaciones CRUD** completas
- **Patrón DTO** para transferencia de datos
- **Patrón Mapper** para conversión entre capas
- **Spring Data JPA** para persistencia
- **Inyección de dependencias** con Spring
- **Arquitectura en capas** bien definida
- **Métodos HTTP** apropiados para cada operación

---

**Tiempo estimado**: 6-8 horas  
**Dificultad**: Intermedio-Avanzado  
**Prerequisitos**: Conocimientos básicos de Spring Boot, JPA y API REST

## 🏆 Criterios de Evaluación

- ✅ Implementación completa de CRUD
- ✅ Uso correcto de DTOs para cada operación
- ✅ Mappers funcionando correctamente
- ✅ Endpoints REST siguiendo convenciones
- ✅ Manejo básico de errores
- ✅ Código limpio y bien estructurado
- ✅ Funcionalidad probada con Postman