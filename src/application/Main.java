package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aplicación con MenuBar");

        // Crear el layout principal
        BorderPane borderPane = new BorderPane();

        // Crear la barra de menú
        MenuBar menuBar = new MenuBar();

        // Menú "Archivo"
        Menu menuArchivo = new Menu("Archivo");
        MenuItem menuItemNuevo = new MenuItem("Nuevo");
        menuItemNuevo.setOnAction(e -> System.out.println("Acción: Crear nuevo archivo"));
        MenuItem menuItemAbrir = new MenuItem("Abrir");
        menuItemAbrir.setOnAction(e -> System.out.println("Acción: Abrir archivo"));
        MenuItem menuItemGuardar = new MenuItem("Guardar");
        menuItemGuardar.setOnAction(e -> System.out.println("Acción: Guardar archivo"));
        MenuItem menuItemSalir = new MenuItem("Salir");
        menuItemSalir.setOnAction(e -> {
            System.out.println("Acción: Salir de la aplicación");
            primaryStage.close();
        });
        menuArchivo.getItems().addAll(menuItemNuevo, menuItemAbrir, new SeparatorMenuItem(), menuItemGuardar, new SeparatorMenuItem(), menuItemSalir);

        // Menú "Editar"
        Menu menuEditar = new Menu("Editar");
        MenuItem menuItemCortar = new MenuItem("Cortar");
        menuItemCortar.setOnAction(e -> System.out.println("Acción: Cortar"));
        MenuItem menuItemCopiar = new MenuItem("Copiar");
        menuItemCopiar.setOnAction(e -> System.out.println("Acción: Copiar"));
        MenuItem menuItemPegar = new MenuItem("Pegar");
        menuItemPegar.setOnAction(e -> System.out.println("Acción: Pegar"));
        menuEditar.getItems().addAll(menuItemCortar, menuItemCopiar, menuItemPegar);

        // Submenú "Preferencias" dentro de "Editar"
        Menu subMenuPreferencias = new Menu("Preferencias");
        MenuItem menuItemTema = new MenuItem("Tema");
        menuItemTema.setOnAction(e -> System.out.println("Acción: Cambiar tema"));
        MenuItem menuItemIdioma = new MenuItem("Idioma");
        menuItemIdioma.setOnAction(e -> System.out.println("Acción: Cambiar idioma"));
        subMenuPreferencias.getItems().addAll(menuItemTema, menuItemIdioma);
        menuEditar.getItems().add(new SeparatorMenuItem());
        menuEditar.getItems().add(subMenuPreferencias);

        // Menú "Ayuda"
        Menu menuAyuda = new Menu("Ayuda");
        MenuItem menuItemAcercaDe = new MenuItem("Acerca de");
        menuItemAcercaDe.setOnAction(e -> System.out.println("Acción: Mostrar información de la aplicación"));
        MenuItem menuItemManual = new MenuItem("Manual de usuario");
        menuItemManual.setOnAction(e -> System.out.println("Acción: Abrir manual de usuario"));
        menuAyuda.getItems().addAll(menuItemAcercaDe, new SeparatorMenuItem(), menuItemManual);

        // Añadir los menús a la barra de menú
        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        // Añadir la barra de menú al BorderPane (en la parte superior)
        borderPane.setTop(menuBar);

        // Crear la escena
        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}