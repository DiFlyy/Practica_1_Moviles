# 📱 Proyecto: Ejercicio de Activities y Fragments

Este proyecto es parte de la práctica de desarrollo móvil.  
Tiene como objetivo mostrar el uso de **Activities** y **Fragments** en Android para explicar diferentes elementos de interfaz de usuario.  

Incluye dos versiones:
- ✅ **Versión en Kotlin (Android nativo)**
- 🚧 **Versión en Flutter**

---

## 🛠️ Ejercicio 1: Instalación de Herramientas

Para este proyecto fue necesario instalar y configurar las siguientes herramientas:

- **Android Studio**  
  IDE oficial para desarrollo en Android.  
  [Descargar Android Studio](https://developer.android.com/studio)

- **Java Development Kit (JDK)**  
  Se recomienda usar **Amazon Corretto**, una distribución gratuita y certificada de OpenJDK.

- **Maven**  
  Herramienta de automatización para construcción de proyectos.

- **Git y GitHub**  
  Para control de versiones y repositorios remotos.

- **Docker**  
  Utilizado en lugar de XAMPP para la gestión de bases de datos.

- **Node.js**  
  Entorno de ejecución para JavaScript del lado del servidor.

- **Flutter**  
  (Instalación obligatoria para este curso; la versión Flutter de este proyecto será agregada en este mismo repositorio.)

---

### 📸 Evidencias de instalación

<img width="1600" height="843" alt="image" src="https://github.com/user-attachments/assets/ef6a0fcb-39eb-4bb4-845b-b1481b315db4" />

_Aquí se insertarán las capturas de pantalla del entorno de desarrollo configurado:_  
1. Instalación de Android Studio  
2. Emulador ejecutando la app "Hello Android"  
3. Configuración de Git y GitHub  
4. Instalación de Docker y Node.js  
5. Instalación de Flutter  

---

## 🛠️ Ejercicio 2: Transiciones entre Activities y Fragments

### 🎯 Objetivo
Crear una aplicación Android que demuestre el uso de **Activities** y **Fragments** para explicar diferentes elementos de interfaz de usuario.

### 📋 Instrucciones
1. **Estructura de la App**  
   - Una `MainActivity` que contiene 5 `Fragments`:
     - Fragment 1: **TextFields (EditText)**
     - Fragment 2: **Botones (Button, ImageButton)**
     - Fragment 3: **Elementos de selección (CheckBox, RadioButton, Switch)**
     - Fragment 4: **Listas (RecyclerView)**
     - Fragment 5: **Elementos de información (TextView, ImageView, ProgressBar)**

2. **Navegación**  
   Se implementó un **BottomNavigationView** para acceder a cada fragment.

3. **Contenido de cada Fragment**  
   - 📝 Un título descriptivo  
   - 🎨 Ejemplos visuales  
   - 💡 Explicación breve (2-3 líneas)  
   - ⚡ Una demostración interactiva  

4. **Versión en Flutter y Kotlin**  
   - La versión en **Kotlin (Android nativo)** ya está implementada.  
   - La versión en **Flutter** se agregará más adelante en este mismo repositorio.  

---

### ✅ Requisitos Técnicos
- Una MainActivity con navegación entre fragments.  
- Cinco Fragments diferentes, funcionales e interactivos.  
- Diseño limpio y organizado.  
- Funcionalidad que conecte diferentes fragments.  

---

## 📦 Entregables

- Código fuente en este repositorio.  
- Capturas de pantalla mostrando la app en funcionamiento.  
- README.md con descripción del proyecto, instrucciones de uso y evidencias.  

---

## ▶️ Instrucciones de ejecución

1. Clonar el repositorio:

git clone https://github.com/tu-usuario/tu-repo.git

2. Abrir el proyecto en Android Studio.

3. Conectar un dispositivo físico o crear un emulador.

4. Ejecutar la aplicación con Run ▶️.

Evidencias de Kotlin:
![Screenshot_20250921-015604_Practica1_Moviles](https://github.com/user-attachments/assets/b2d99265-2342-47b6-8233-6dc44b6375b1)
![Screenshot_20250921-015610_Practica1_Moviles](https://github.com/user-attachments/assets/edbb4a96-0869-4e3f-b5b9-38c5ba6a6708)
![Screenshot_20250921-015618_Practica1_Moviles](https://github.com/user-attachments/assets/11b8827c-78c1-45e3-ae73-1955f2dbc71a)
![Screenshot_20250921-015631_Practica1_Moviles](https://github.com/user-attachments/assets/da6b13f3-0a29-4bd3-b46c-11f504a9aa63)
![Screenshot_20250921-015644_Practica1_Moviles](https://github.com/user-attachments/assets/20a01cfa-ea66-4a9c-8ac7-6093f8dd7d99)


---
Dificultades encontradas

Error de tema Theme.AppCompat → se resolvió ajustando el themes.xml con un tema compatible con MaterialComponents.

Problemas con android:exported en AndroidManifest.xml → se resolvió añadiendo explícitamente el atributo requerido por Android 12+.

Conflictos iniciales con Jetpack Compose → se corrigió cambiando a una implementación con Fragments tradicionales.

---
🔍 Hallazgos

El uso de BottomNavigationView permite una navegación más fluida y profesional.

Es importante mantener todos los textos en strings.xml para evitar advertencias y facilitar la localización.

La estructura modular con Fragments hace que la app sea más mantenible y escalable.

---

📌 Próximos pasos

🚀 Implementar la versión en Flutter de este mismo proyecto.

📸 Agregar capturas y videos de la app en funcionamiento.

📄 Mejorar la documentación con ejemplos visuales.







