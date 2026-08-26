# 📝 Task Tracker CLI

Una aplicación de consola (CLI) desarrollada en Java para gestionar tareas de manera eficiente, construida paso a paso desde cero.

## 🚀 Estado del Proyecto
> En desarrollo 🛠️ (Actualmente implementando el almacenamiento de datos).

## 🛠️ Tecnologías Utilizadas
* **Java** (Programación Orientada a Objetos)
* **Git & GitHub** (Control de versiones)

## 📌 ¿Cómo funciona? (Estructura de la Tarea)
Cada tarea cuenta con los siguientes atributos serializados manualmente a JSON:
* `id`: Identificador único numérico.
* `description`: Texto descriptivo de la tarea.
* `status`: Estado actual (ej. *todo*, *in-progress*, *done*).
* `createdAt`: Fecha y hora de creación.
* `updateAt`: Fecha y hora de la última modificación.

## 💻 Ejemplo de Salida (JSON)
El sistema convierte los objetos Java en una estructura JSON con formato *pretty-print*:
```json
{
	"id": 1,
	"description": "Arreglar el BUG de la clase Task.java",
	"status": "todo",
	"createdAt": "2026-08-26 16:30:00",
	"updateAt": "2026-08-26 16:30:00"
}
```

## ⚙️ ¿Cómo ejecutarlo?
1. Clona el repositorio. 
2. Compila las clases en tu IDE favorito (IntelliJ IDEA). 
3. Ejecuta el comando add para registrar una nueva tarea por consola.