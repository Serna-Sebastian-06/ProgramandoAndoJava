package Guia1;

import javax.swing.JOptionPane;

public class GuiaMain {

    public void Guia1() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la lista de ejercicios Guia 1\n" +
                "1.Ejercicios Estructura Condicionales\n" +
                "2.Ejercicios Practico: Ciclos for, while y areglos\n" +
                "Ingrese una opcion de Ejercicio:"));

        if (opcion == 1) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Ejercicios Estructura Condicionales\n\n" +
                    "Lista de Ejercicios\n\n" +
                    "4. Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.\n" +
                    "5. Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400\n" +
                    "6. Pida una nota entre 0 y 100 y clasifiquela: 90-100 Excelente, 80-89 Bueno, 70-79 Aceptable, 60-69 Insuficiente, <60 Reprobado. Valide el rango.\n" +
                    "7. Solicite tres numeros e imprima cual es el mayor. Extra: si hay empate entre dos o los tres, indicarlo.\n" +
                    "8. Calcular valor de compra / facturacion.\n" +
                    "9. Registro y Login.\n" +
                    "10. Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.\n\n" +
                    "Ingrese una opcion de Ejercicio:"));

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
            opcion = Integer.parseInt(JOptionPane.showInputDialog("2.Ejercicios Practico: Ciclos for, while y areglos.\n\n" +
                    "Lista de Ejercicios\n\n" +
                    "11. Imprimir numeros del 1 al 50.\n" +
                    "12. Imprimir numeros del 50 al 1.\n" +
                    "13. Mostrar numeros pares hasta 100.\n" +
                    "14. Mostrar numeros impares del 1 al 100.\n" +
                    "15. Calcular la suma del 1 al 100.\n" +
                    "16. Calcular la suma de los numeros impares del 1 al 50 usando un ciclo for\n" +
                    "17. Mostrar la tabla de multiplicar del numero 7 usando un ciclo for\n" +
                    "18. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados\n\n" +
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

        } else {
            JOptionPane.showMessageDialog(null, "Ingreso una opcion invalida");
        }
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

}