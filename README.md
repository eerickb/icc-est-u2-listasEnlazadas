# 📖 Proyecto de Gestión de Contactos en Java

## 📌 Información General

- **Título:** Implementación de Lista Enlazada y Contactos
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiantes:** Erick Bermeo, Alexander Beltran
- **Fecha:** 11/06/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa una estructura de datos tipo **Lista Enlazada Genérica** en Java, aplicándola a un gestor de contactos simple en consola. El sistema incluye:

- Clase `Node<T>` para representar nodos.
- Clase `LinkedList<T>` con operaciones: agregar, buscar, eliminar, imprimir.
- Clase `Contact<T, U>` para representar contactos con nombre y teléfono.
- Clase `ContactManager` que gestiona la lista de contactos.
- Vista en consola (`ConsoleView`) para interacción con el usuario.
- Controlador (`MenuController`) que coordina vista y lógica.
- Clase `App.java` como punto de entrada principal.

El objetivo es aplicar conceptos de listas enlazadas genéricas y encapsulamiento, utilizando estructuras dinámicas para resolver un problema real.

---

## 🚀 Ejecución

### 📦 Requisitos

- Java 8 o superior
- Editor o IDE como NetBeans, IntelliJ o VS Code

### ▶️ Pasos para compilar y ejecutar

1. **Compila el proyecto:**

```bash
javac App.java Model/*.java Controller/*.java View/*.java
```

2. **Ejecuta el programa:**

```bash
java App
```

3. **Interacción esperada:**

El menú permite al usuario:

- Agregar contactos (nombre y teléfono)
- Buscar contacto por nombre
- Eliminar contacto por nombre
- Ver la lista completa de contactos
- Salir del programa

---

## ✅ Conclusiones

- **Erick Bermeo** concluye que este proyecto le permitió comprender cómo aplicar estructuras de datos genéricas en Java, especialmente listas enlazadas. La práctica de separar las capas de modelo, vista y controlador refuerza la importancia de un buen diseño en aplicaciones escalables. Además, el uso de métodos como `equals()` en objetos personalizados como `Contact` demuestra la relevancia de implementar comparaciones lógicas correctamente en programación orientada a objetos.

---

## 🔗 Repositorio

El código fuente puede ser cargado en un repositorio como GitHub para mejor organización.  
**Repositorio:** https://github.com/eerickb/icc-est-u2-listasEnlazadas.git