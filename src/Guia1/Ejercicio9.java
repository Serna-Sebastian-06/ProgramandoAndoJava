package Guia1;

import java.util.Scanner;

/* Simule un login: usuario correcto 'admin', contrasena '1234'. Si coinciden mostrar 'Bienvenido',
si no 'Credenciales incorrectas'. Use equals().
Basico */

public class Ejercicio9 {

    public void LOGIN() {

        String User;

        String Paswor;

        System.out.println("LOGIN");

        Scanner UC = new Scanner(System.in);

        System.out.println("Ingrese el usuario");

        User = UC.next();


        System.out.println("Ingrese la contraseña");

        Paswor = UC.next();

        if (User.equals("admin") && Paswor.equals("1234")) {

            System.out.println("Bienvenido");

        }else{
            System.out.println("Credenciales incorrectas");
        }

        UC.close();

    }

}
