# Gestion De Personal

Este proyecto fue desarrollado en solitario como parte del Proyecto 2 de la materia Programación 2 (2023). Se trata de un sistema de gestión de personal que permite administrar postulantes, evaluadores, entrevistas y puestos de trabajo. 

El sistema cuenta con persistencia de datos y actualización en tiempo real mediante `firePropertyChange` y `PropertyChangeSupport`. Fue desarrollado en **Java** con **Apache NetBeans**, utilizando **JFrame** para la interfaz gráfica.

---

## 📂 Estructura del Proyecto

### 📝 Funcionamiento General

Al iniciar, el programa pregunta si se desea cargar datos:
- **Sí**: Si nunca se ha utilizado el programa, inicia un sistema nuevo. Si ya hay datos previos, los carga desde un archivo.
- **No**: Inicia normalmente sin cargar datos previos.

Al cerrar, el sistema **guarda automáticamente** todos los datos en el archivo.

### 🔹 Funcionalidades Principales

1️⃣ **Agregar Temática**
   - Permite registrar un lenguaje de programación o herramienta.
   - Se debe ingresar un nombre único y una descripción (ambos obligatorios).

2️⃣ **Alta de Postulante**
   - Se ingresan los datos del postulante (todos los campos obligatorios).
   - Se selecciona el tipo de trabajo deseado (remoto, presencial o mixto).
   - Luego, se abre una ventana donde se agregan las temáticas que domina y el nivel de conocimiento.

3️⃣ **Eliminar Postulante**
   - Lista todos los postulantes registrados.
   - Permite seleccionar y eliminar un postulante del sistema.

4️⃣ **Agregar Evaluador**
   - Permite registrar evaluadores, quienes realizan entrevistas.
   - Los evaluadores se diferencian por su cédula.
   - Un postulante **no puede ser evaluador** y viceversa.

5️⃣ **Ingreso de Entrevista**
   - Se selecciona un evaluador y un postulante.
   - Se registra el puntaje obtenido y comentarios sobre la entrevista.

6️⃣ **Registro de Puesto**
   - Se define un nuevo puesto de trabajo.
   - Se establece el tipo de trabajo (presencial, remoto o mixto).
   - Se asignan los temas requeridos para el puesto.

7️⃣ **Consulta para Puesto**
   - Se selecciona un puesto y el nivel requerido en los temas.
   - Se muestran los postulantes que cumplen con los requisitos.
   - Permite exportar los resultados en un archivo `.txt`.

8️⃣ **Historial del Postulante**
   - Lista todos los postulantes registrados.
   - Al seleccionar uno, se muestran sus datos, entrevistas y comentarios.

9️⃣ **Consulta por Temática**
   - Lista todas las temáticas registradas.
   - Muestra la cantidad de postulantes con nivel mayor a 5 en cada temática.
   - Indica cuántos puestos requieren dicha temática.

---

## 🚀 Cómo Ejecutar el Proyecto

El sistema incluye un ejecutable y código fuente. Para ejecutarlo:

1. Abrir el proyecto en **Apache NetBeans**.
2. Compilar y ejecutar desde el entorno de desarrollo.
3. También se puede ejecutar directamente desde el ejecutable.

> **Nota:** La persistencia de datos se gestiona mediante archivos, por lo que los datos se guardan y cargan automáticamente.

---

## 👨‍💻 Tecnologías Utilizadas

- **Lenguaje:** Java
- **IDE:** Apache NetBeans
- **Interfaz:** JFrame
- **Patrón de Observador:** `firePropertyChange`, `PropertyChangeSupport`
- **Persistencia:** Archivos locales

---

## 📌 Autor

📍 **Mariano Pérez**

Este proyecto fue desarrollado de forma individual como parte del **Proyecto 2 de la materia Programación 2 (2023)**.

---

Si tenés dudas o querés más detalles sobre el funcionamiento, podés revisar el código fuente incluido. 😊
