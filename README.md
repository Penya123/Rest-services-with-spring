# Rest-services-with-spring
# 📡 Building REST Services with Spring

Este repositorio contiene la implementación práctica de la guía **“Building REST services with Spring”** del sitio oficial de Spring.  
Aprenderás a construir un servicio **RESTful** usando **Spring Boot**, **Spring MVC**, **Spring Data JPA** y **Spring HATEOAS** paso a paso.

🔗 Base de la guía: https://spring.io/guides/tutorials/rest :contentReference[oaicite:4]{index=4}

---

## 🧠 ¿Qué vas a encontrar aquí?

- 🚀 Un servicio REST básico con operaciones **CRUD** para la entidad `Employee`.
- 📊 Uso de **Spring Data JPA** para persistencia con una base de datos en memoria (H2).
- 🧩 Implementación de **Spring HATEOAS** para enlaces en las respuestas y API más *RESTful*. :contentReference[oaicite:5]{index=5}
- 🧪 Ejemplos de llamadas HTTP con `curl`.
- 📁 Código dividido según las secciones de la guía oficial.

---
## 🛠 Tecnologías

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring HATEOAS
- Base de datos H2 (en memoria)

---
## 🚀 Cómo ejecutar

### Opción 1: Desde IDE
1. Importa el proyecto en tu IDE favorito (IntelliJ / Eclipse / VSCode).
2. Ejecuta la clase `PayrollApplication`.
3. Abre tu terminal o Postman.

### Opción 2: Desde Terminal
```bash
./mvnw clean spring-boot:run
