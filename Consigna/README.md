# 📋 Consigna del Ejercicio - API REST para Gestión de Películas

## 🎯 Objetivo Principal

Crear una **API REST en Spring Boot** para gestionar las películas de un servicio de Streaming, utilizando **DTOs** para exponer solo los datos necesarios al cliente, y un **mapper** para la conversión entre capas.
Se aconseja la utilización de un DTO para cargar nuevas películas con toda su información correspondiente, y otro DTO que permita al usuario obtener solo la información necesaria de las películas.

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

- Crear DTOs específicos para diferentes operaciones
- Exponer solo los datos necesarios en cada endpoint
- Separar el modelo interno de la API pública
- Se aconseja un DTO para recibir datos para crear una nueva película, y un DTO para enviar datos de respuesta al cliente (solo con la información que pueda ser importante para el cliente)

### 🔄 Patrón Mapper

- Implementar conversiones entre Entity y DTO
- Centralizar la lógica de mapeo
- Mantener código limpio y reutilizable

## 🌐 Endpoints Requeridos

| Método HTTP | Endpoint | Descripción |
|-------------|----------|-------------|
| `GET` | `/movies` | Obtener todas las películas | 
| `GET` | `/movies/{id}` | Obtener película por ID |
| `POST` | `/movies` | Crear nueva película |


## 🧪 Pruebas Esperadas

El proyecto debe permitir:

1. **Crear película** via POST con todos los datos
2. **Listar películas** via GET con información resumida
3. **Consultar película específica** via GET por ID
4. **Persistencia** en base de datos H2
5. **Conversión automática** JSON ↔ DTO

## 💡 Consejos para la Implementación

- **Empezar por la entidad** y configurar JPA correctamente
- **Crear los DTOs** antes que el mapper
- **Implementar el mapper** con métodos estáticos simples
- **Repository simple** heredando de JpaRepository
- **Service delgado** enfocado en lógica de negocio
- **Controller limpio** enfocado solo en HTTP

## 🎓 Conceptos de Aprendizaje

Al completar este ejercicio, habrás aplicado:
- **API REST** con Spring Boot
- **Patrón DTO** para transferencia de datos
- **Patrón Mapper** para conversión entre capas
- **Spring Data JPA** para persistencia
- **Inyección de dependencias** con Spring
- **Arquitectura en capas** bien definida

---

**Tiempo estimado**: 4-6 horas  
**Dificultad**: Intermedio  
**Prerequisitos**: Conocimientos básicos de Spring Boot, JPA y API REST