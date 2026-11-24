package Guia2;

import javax.swing.JOptionPane;

import ConexionDb.InicializarDB;
import Guia2.CatalogoDeVideojuegos.models.InserciónDeDatos;
import Guia2.CatalogoDeVideojuegos.models.UsuarioTabla;
import Guia2.CatalogoDeVideojuegos.models.VideojuegoTabla;
import Guia2.CatalogoDeVideojuegos.views.LoginView;

public class MainPersistenciaData {
    public void MenuBaseDeDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresando A Ejercicios Base De Datos \n" +
                        "1.Actividad 3.3 Guia 2 Crear Base de Ejemplo \n" +
                        "2.Actividad 3.4 Creando Sistema Con Login"));

        if (opcion == 1) {
            InicializarDB crearTabDb = new InicializarDB();
            crearTabDb.crearTablas();
        }
        
        if (opcion == 2) {
            UsuarioTabla.crearTabla();
            VideojuegoTabla.crearTabla();
            InserciónDeDatos.insertarDatosInicialesUsuario();
            InserciónDeDatos.insertarDatosInicialesVideojuegos();

            LoginView loginView = new LoginView();
            loginView.mostrarLogin();
        }
    }
}