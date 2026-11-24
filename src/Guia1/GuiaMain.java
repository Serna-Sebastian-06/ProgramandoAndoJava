package Guia1;

import javax.swing.JOptionPane;

public class GuiaMain {

    public void Guia1() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la lista de ejercicios Guia 1\n" +
                "1. Ejercicios Estructura Condicionales\n" +
                "2. Ejercicios Practico: Ciclos for, while y arreglos\n" +
                "Ingrese una opcion de Ejercicio:"));

        if (opcion == 1) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Ejercicios Estructura Condicionales\n\n" +
                    "Lista de Ejercicios\n\n" +
                    "1. Pida un numero entero al usuario e imprima si es Positivo, Negativo o Cero. Use if - else if - else\n" +
                    "2. Solicite un numero entero y determine si es Par o Impar. Use el operador modulo (%).\n" +
                    "3. Pida la edad del usuario. Si es >= 18 mostrar 'Puede ingresar', si es menor 'Acceso denegado', si es negativa 'Edad invalida'.\n" +
                    "4. Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.\n" +
                    "5. Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400\n" +
                    "6. Pida una nota entre 0 y 100 y clasifiquela: 90-100 Excelente, 80-89 Bueno, 70-79 Aceptable, 60-69 Insuficiente, <60 Reprobado. Valide el rango.\n" +
                    "7. Solicite tres numeros e imprima cual es el mayor. Extra: si hay empate entre dos o los tres, indicarlo.\n" +
                    "8. Calcular valor de compra / facturacion.\n" +
                    "9. Registro y Login.\n" +
                    "10. Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.\n\n" +
                    "Ingrese una opcion de Ejercicio:"));

            if (opcion == 1) {
                Ejercicio1();
            }
            if (opcion == 2) {
                Ejercicio2();
            }
            if (opcion == 3) {
                Ejercicio3();
            }
            if (opcion == 4) {
                Ejercicio4();
            }
            if (opcion == 5) {
                Ejercicio5();
            }
            if (opcion == 6) {
                Ejercicio6();
            }
            if (opcion == 7) {
                Ejercicio7();
            }
            if (opcion == 8) {
                Ejercicio8();
            }
            if (opcion == 9) {
                Ejercicio9();
            }
            if (opcion == 10) {
                Ejercicio10();
            }

        } else if (opcion == 2) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("2. Ejercicios Practico: Ciclos for, while y arreglos.\n\n" +
                    "Lista de Ejercicios\n\n" +
                    "11. Imprimir numeros del 1 al 50.\n" +
                    "12. Imprimir numeros del 50 al 1.\n" +
                    "13. Mostrar numeros pares hasta 100.\n" +
                    "14. Mostrar numeros impares del 1 al 100.\n" +
                    "15. Calcular la suma del 1 al 100.\n" +
                    "16. Calcular la suma de los numeros impares del 1 al 50 usando un ciclo for\n" +
                    "17. Mostrar la tabla de multiplicar del numero 7 usando un ciclo for\n" +
                    "18. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados\n" +
                    "19. Contar cuantos numeros del 1 al 200 son multiplos de 10 usando un ciclo for.\n" +
                    "20. Mostrar los numeros del 1 al 100 que sean divisibles entre 3 Y entre 5 simultaneamente.\n" +
                    "21. Calcular el factorial de un numero almacenado en una variable usando un ciclo for.\n" +
                    "22. Declarar un arreglo de 10 numeros e imprimir cada elemento usando un ciclo for.\n" +
                    "23. Calcular la suma de todos los elementos de un arreglo usando un ciclo for.\n" +
                    "24. Encontrar el numero mayor dentro de un arreglo usando un ciclo for.\n" +
                    "25. Encontrar el numero menor dentro de un arreglo usando un ciclo for.\n" +
                    "26. Contar cuantas veces aparece un numero especifico dentro de un arreglo.\n" +
                    "27. Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados.\n" +
                    "28. Mostrar los primeros 20 numeros y su cubo (n^3) usando un ciclo for.\n" +
                    "29. Recorrer una cadena de texto e imprimir cada caracter en una linea usando un ciclo for.\n\n" +
                    "Ingrese una opcion de Ejercicio:"));

            if (opcion == 11) {
                Ejercicio11();
            }
            if (opcion == 12) {
                Ejercicio12();
            }
            if (opcion == 13) {
                Ejercicio13();
            }
            if (opcion == 14) {
                Ejercicio14();
            }
            if (opcion == 15) {
                Ejercicio15();
            }
            if (opcion == 16) {
                Ejercicio16();
            }
            if (opcion == 17) {
                Ejercicio17();
            }
            if (opcion == 18) {
                Ejercicio18();
            }
            if (opcion == 19) {
                Ejercicio19();
            }
            if (opcion == 20) {
                Ejercicio20();
            }
            if (opcion == 21) {
                Ejercicio21();
            }
            if (opcion == 22) {
                Ejercicio22();
            }
            if (opcion == 23) {
                Ejercicio23();
            }
            if (opcion == 24) {
                Ejercicio24();
            }
            if (opcion == 25) {
                Ejercicio25();
            }
            if (opcion == 26) {
                Ejercicio26();
            }
            if (opcion == 27) {
                Ejercicio27();
            }
            if (opcion == 28) {
                Ejercicio28();
            }
            if (opcion == 29) {
                Ejercicio29();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingreso una opcion invalida");
        }
    }

    public void Ejercicio1() {
        Ejercicio1 signo = new Ejercicio1();
        signo.determinarSigno();
    }

    public void Ejercicio2() {
        Ejercicio2 parImpar = new Ejercicio2();
        parImpar.parOImpar();
    }

    public void Ejercicio3() {
        Ejercicio3 edad = new Ejercicio3();
        edad.validarEdad();
    }

    public void Ejercicio4() {
        Ejercicio4 Calculadora = new Ejercicio4();
        Calculadora.CalculadoraPorSignos();
    }

    public void Ejercicio5() {
        Ejercicio5 Bisiesto = new Ejercicio5();
        Bisiesto.CalcularAnioBisiesto();
    }

    public void Ejercicio6() {
        Ejercicio6 notas = new Ejercicio6();
        notas.SistemaDeNotas();
    }

    public void Ejercicio7() {
        Ejercicio7 Calcular = new Ejercicio7();
        Calcular.CalcularMayor();
    }

    public void Ejercicio8() {
        Ejercicio8 Facturacion = new Ejercicio8();
        Facturacion.CalcularValorDeCompra();
    }

    public void Ejercicio9() {
        Ejercicio9 Registro = new Ejercicio9();
        Registro.LOGIN();
    }

    public void Ejercicio10() {
        Ejercicio10 IMC = new Ejercicio10();
        IMC.CalcularIMC();
    }

    public void Ejercicio11() {
        Ejercicio11 Numeros1a50 = new Ejercicio11();
        Numeros1a50.numeros();
    }

    public void Ejercicio12() {
        Ejercicio12 Numeros50a1 = new Ejercicio12();
        Numeros50a1.numeros50a1();
    }

    public void Ejercicio13() {
        Ejercicio13 Paresen100 = new Ejercicio13();
        Paresen100.Pares100();
    }

    public void Ejercicio14() {
        Ejercicio14 Impares1a100 = new Ejercicio14();
        Impares1a100.NumerosImparesWH();
    }

    public void Ejercicio15() {
        Ejercicio15 SumaDel1Al100 = new Ejercicio15();
        SumaDel1Al100.Suma1a100();
    }

    public void Ejercicio16() {
        Ejercicio16 ImparesConFor = new Ejercicio16();
        ImparesConFor.CalcularSumaImpares();
    }

    public void Ejercicio17() {
        Ejercicio17 TablaSiete = new Ejercicio17();
        TablaSiete.TablaDeMultiplicar7();
    }

    public void Ejercicio18() {
        Ejercicio18 Tablas = new Ejercicio18();
        Tablas.TablasDeMultiplicarDelUnoAlDiez();
    }

    public void Ejercicio19() {
        Ejercicio19 multiplos = new Ejercicio19();
        multiplos.contarMultiplosDeDiez();
    }

    public void Ejercicio20() {
        Ejercicio20 divisibles = new Ejercicio20();
        divisibles.divisiblesTresYCinco();
    }

    public void Ejercicio21() {
        Ejercicio21 factorial = new Ejercicio21();
        factorial.calcularFactorial();
    }

    public void Ejercicio22() {
        Ejercicio22 arreglo = new Ejercicio22();
        arreglo.mostrarArreglo();
    }

    public void Ejercicio23() {
        Ejercicio23 SumaArreglo = new Ejercicio23();
        SumaArreglo.SumarElementosArreglo();
    }

    public void Ejercicio24() {
        Ejercicio24 MayorArreglo = new Ejercicio24();
        MayorArreglo.EncontrarMayorEnArreglo();
    }

    public void Ejercicio25() {
        Ejercicio25 MenorArreglo = new Ejercicio25();
        MenorArreglo.EncontrarMenorEnArreglo();
    }

    public void Ejercicio26() {
        Ejercicio26 ContarNumero = new Ejercicio26();
        ContarNumero.ContarNumeroEnArreglo();
    }

    public void Ejercicio27() {
        Ejercicio27 CuadradoAsteriscos = new Ejercicio27();
        CuadradoAsteriscos.ImprimirCuadradoDeAsteriscos();
    }

    public void Ejercicio28() {
        Ejercicio28 CuboNumeros = new Ejercicio28();
        CuboNumeros.MostrarCuboDeNumeros();
    }

    public void Ejercicio29() {
        Ejercicio29 RecorrerCadena = new Ejercicio29();
        RecorrerCadena.RecorrerCadenaDeTexto();
    }
}