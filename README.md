# MenuBarApp
![](https://scontent.fgye30-1.fna.fbcdn.net/v/t1.15752-9/441909974_480769164347734_5986161821305223324_n.png?_nc_cat=106&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeFO6DsUycQ5uO6tjUb8wH20pZB5h7pY5QmlkHmHuljlCVnPl8Y5B6EkRVO9qsVkFs1SRp_lOiOgCjMs1f6TwtNI&_nc_ohc=wcVhGFxjVz8Q7kNvgGdUWkR&_nc_ht=scontent.fgye30-1.fna&oh=03_Q7cD1QEkFSEJ8aYf-rd3eSFFY_pGcECeqmBQ1FpBqOZM3vIEqA&oe=668D980A)

# Aplicación JavaFX con Barra de Menú

Esta aplicación demuestra cómo crear y utilizar una barra de menú en JavaFX. Las barras de menú son componentes esenciales en la mayoría de las aplicaciones de escritorio, proporcionando una forma organizada y familiar para que los usuarios accedan a diversas funcionalidades.

## Descripción del Código

El código está escrito en Java utilizando el framework JavaFX. La clase principal `Main` extiende `Application`, que es la clase base para todas las aplicaciones JavaFX.

### Estructura de la Interfaz

- **BorderPane (`borderPane`):** 
  - Es el layout principal de la aplicación.
  - Permite colocar elementos en cinco regiones: top, bottom, left, right, y center.
  - En este caso, la barra de menú se coloca en la región top.

- **MenuBar (`menuBar`):**
  - Es el contenedor principal para todos los menús.
  - Se añade al `BorderPane` con `borderPane.setTop(menuBar)`.

### Menús y Elementos de Menú

1. **Menú "Archivo":**
   - **Nuevo:** Simula la acción de crear un nuevo archivo.
   - **Abrir:** Simula la acción de abrir un archivo.
   - **Guardar:** Simula la acción de guardar un archivo.
   - **Salir:** Cierra la aplicación (`primaryStage.close()`).
   - Usa `SeparatorMenuItem` para agrupar lógicamente los elementos.

2. **Menú "Editar":**
   - **Cortar, Copiar, Pegar:** Simulan acciones de edición básicas.
   - **Submenú "Preferencias":**
     - **Tema:** Simula cambiar el tema de la aplicación.
     - **Idioma:** Simula cambiar el idioma de la aplicación.

3. **Menú "Ayuda":**
   - **Acerca de:** Simula mostrar información sobre la aplicación.
   - **Manual de usuario:** Simula abrir un manual de usuario.

### Acciones de los Elementos de Menú

- Cada `MenuItem` tiene un `EventHandler` configurado con `setOnAction(e -> ...)`.
- En este ejemplo, las acciones imprimen mensajes en la consola (`System.out.println()`).
- En una aplicación real, estas acciones llamarían a métodos que realizan las operaciones correspondientes.

### Escena y Visualización

- Se crea una `Scene` con el `BorderPane` como root y dimensiones de 600x400 píxeles.
- La escena se establece en el `Stage` (ventana) y se muestra.

## Cómo Ejecutar

1. Asegúrate de tener Java y JavaFX instalados.
2. Compila el código con `javac Main.java`.
3. Ejecuta la aplicación con `java Main`.

## Características Destacadas

- **Submenús:** Demuestra cómo anidar menús (por ejemplo, "Preferencias" dentro de "Editar").
- **Separadores:** Usa `SeparatorMenuItem` para organizar visualmente los elementos del menú.
- **Acción de Salida:** Muestra cómo cerrar la aplicación desde un elemento de menú.

## Casos de Uso

- **Editores de Texto/Código:** Menús para operaciones de archivo y edición.
- **Aplicaciones de Diseño:** Menús para herramientas, vistas, y preferencias.
- **Juegos:** Menús para iniciar juego, configuraciones, y puntuaciones.
- **Cualquier App de Escritorio:** Menús son un patrón de diseño estándar.

## Extensibilidad

1. **Más Menús y Elementos:** Añade menús para "Ver", "Herramientas", etc.
2. **Atajos de Teclado:** Usa `setAccelerator()` para añadir atajos.
3. **Menús Contextuales:** Implementa `ContextMenu` para menús de clic derecho.
4. **Menús Dinámicos:** Habilita/deshabilita elementos según el estado de la app.

## Notas

- Este código es un punto de partida. En una app real, reemplazarías `System.out.println()` con lógica real.
- JavaFX ofrece estilos CSS para personalizar la apariencia de los menús.
- Los menús son parte de la accesibilidad; asegúrate de que sean navegables con teclado.
