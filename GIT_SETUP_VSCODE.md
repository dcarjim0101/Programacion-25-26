# 🚀 Configuración Git en VS Code - Programación

## ✅ Estado Actual

Tu repositorio está completamente configurado y listo para usar desde VS Code:

- **Usuario Git:** dcarjim0101
- **Email:** dcarjim0101@g.educaand.es
- **Repositorio Remoto:** https://github.com/dcarjim0101/Programacion-25-26.git
- **Rama Principal:** master

---

## 📝 Cómo Usar Git desde VS Code

### **Opción 1: Control de Versiones Integrado (Recomendado)**

#### Paso 1: Abrir la carpeta en VS Code
1. En VS Code, ve a **File → Open Folder**
2. Selecciona: `C:\Users\02_1DAW_alum\Desktop\programacion`
3. ¡La carpeta se abrirá con Git automáticamente habilitado!

#### Paso 2: Ver los cambios
- Haz clic en el icono de **Source Control** (la ramita de Git) en la barra lateral izquierda
- Verás todos los archivos modificados, nuevos o eliminados

#### Paso 3: Hacer cambios (Workflow básico)

**A. Agregar archivos a staging:**
- Haz clic en el `+` junto a cada archivo que quieras subir
- O haz clic en el `+` general para agregar todos

**B. Escribir un mensaje de commit:**
- En el campo "Message" escribe un resumen de los cambios
- Ejemplo: "Añadir nuevo ejercicio de Java"

**C. Hacer commit:**
- Presiona `Ctrl + Enter` o haz clic en el botón **Commit** (✓)

**D. Hacer push (Subir al repositorio):**
- Haz clic en los **tres puntos** (...) en la esquina superior del panel de Source Control
- Selecciona **Push** (o presiona `Ctrl + Shift + P` → "Git: Push")

---

### **Opción 2: Terminal Integrada en VS Code**

1. Abre la terminal en VS Code: `Ctrl + ` (backtick)
2. Usa los comandos Git normales:

```bash
# Ver estado
git status

# Agregar archivos
git add .

# Hacer commit
git commit -m "Tu mensaje aquí"

# Hacer push
git push origin master
```

---

## 🎯 Workflow Completo (Paso a Paso)

### **Cuando termines de trabajar:**

1. **En VS Code:**
   - Abre la carpeta `programacion`
   - Haz cambios en tus archivos

2. **Guardar cambios:**
   - `Ctrl + S` (guardar archivo)

3. **Subir cambios:**
   - Clic en icono **Source Control** (ramita)
   - Revisa los archivos modificados
   - Haz clic en `+` para cada archivo (o todos)
   - Escribe mensaje de commit
   - Presiona `Ctrl + Enter` para commit
   - Haz clic en `...` → **Push**

---

## 💡 Consejos Útiles

### **Mensajes de Commit Claros:**
- ✅ "Añadir clase Vehiculo con métodos"
- ✅ "Corregir bug en método esAntiguo"
- ✅ "Actualizar portfolio del Tema 4"
- ❌ "cambios" (demasiado vago)

### **Commit Frecuentemente:**
- Haz commits pequeños y frecuentes
- Cada cambio lógico merece su propio commit
- Facilita rastrear cambios y deshacer si es necesario

### **Ver Historial:**
- En Source Control → Haz clic en **COMMITS**
- O presiona `Ctrl + Shift + P` → "Git: View History"

---

## 🔐 Autenticación Git

Tu configuración ya está hecha, pero si necesitas cambiar credenciales:

**En terminal:**
```bash
# Configurar nombre de usuario
git config --global user.name "Tu Nombre"

# Configurar email
git config --global user.email "tu.email@ejemplo.com"

# Guardar credenciales (Windows)
git config --global credential.helper wincred
```

---

## 🐛 Problemas Comunes

### **"No puedo hacer push"**
- Verifica la conexión a internet
- Comprueba que el repositorio URL es correcto: `git remote -v`
- Intenta hacer `git pull` primero

### **"Los cambios no aparecen en Source Control"**
- Guarda los archivos: `Ctrl + S`
- Recarga VS Code: `Ctrl + Shift + P` → "Developer: Reload Window"

### **"Necesito deshacer cambios"**
- En Source Control, haz clic derecho en archivo → **Discard Changes**

---

## 📦 Extensiones Recomendadas (Opcional)

Aunque VS Code tiene git integrado, estas extensiones pueden ayudarte:

- **GitLens** - Muestra información de commits en cada línea
- **Git Graph** - Visualiza el historial de git
- **Gitignore** - Genera archivos .gitignore

---

## ✨ ¡Listo para Empezar!

Ya tienes todo configurado. Solo abre la carpeta `programacion` en VS Code y comienza a trabajar. Los cambios se sincronizarán automáticamente con tu repositorio en GitHub.

**¡A programar! 🚀**

---

**Última actualización:** 21 de enero de 2026
