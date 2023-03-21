import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Que ejercicio desea ver?");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
                break;
            }
            case 2:
            {
                ejercicio2();
                break;
            }
            case 3:
            {
                ejercicio3();
                break;
            }
            case 4:
            {
                ejercicio4();
                break;
            }
            case 5:
            {
                System.out.println("Ingrese el numero a evaluar. ");
                int numero = scan.nextInt();
                ejercicio5(numero);
                break;
            }
            case 6:
            {
                System.out.println("Ingrese el numero a evaluar. ");
                int numero = scan.nextInt();
                ejercicio6(numero);
                break;
            }
            case 7:
            {
                System.out.println("Ingrese el numero a evaluar");
                int numero = scan.nextInt();
                ejercicio7(numero);
                break;
            }
            case 8:
            {
                System.out.println("Ingrese un nombre, sera saludado. ");
                String nombre = scan.nextLine();
                nombre = scan.nextLine();
                ejercicio8(nombre);
                break;
            }
            case 9:
            {
                System.out.println("Ingrese el numero a evaluar. ");
                int numero = scan.nextInt();
                ejercicio9(numero);
                break;
            }
            case 10:
            {
                System.out.println("Ingrese grados fahrenheit, se pasaran a centigrados. ");
                double gradosFahrenheit = scan.nextDouble();
                ejercicio10(gradosFahrenheit);
                break;
            }
            case 11:
            {
                System.out.println("Ingrese el valor de el radio de la circunferencia. ");
                double radio = scan.nextDouble();
                ejercicio11(radio);
                break;
            }
            case 12:
            {
                System.out.println("Ingrese la velocidad. ");
                double velocidad = scan.nextDouble();
                ejercicio12(velocidad);
            }
            case 13:
            {
                System.out.println("Cateto 1");
                double c1 = scan.nextDouble();
                System.out.println("Cateto 2");
                double c2 = scan.nextDouble();
                ejercicio13(c1,c2);
                break;
            }
            case 14:
            {
                System.out.println("Ingrese el radio de la esfera para saber su volumen. ");
                double radio = scan.nextDouble();
                ejercicio14(radio);
                break;
            }
            case 15:
            {
                System.out.println("Ingrese la base del triangulo. ");
                double base = scan.nextDouble();
                System.out.println("Ingrese la altura del triangulo. ");
                double altura = scan.nextDouble();
                ejercicio15(base,altura);
                break;
            }
            case 16:
            {
                System.out.println("Ingrese un numero de 3 cifras. ");
                int numero = scan.nextInt();
                ejercicio16(numero);
                break;
            }
            case 17:
            {
                System.out.println("Ingrese un numero de 5 cifras. ");
                int numero = scan.nextInt();
                ejercicio17(numero);
                break;
            }
            case 18:
            {
                System.out.println("Ingrese una hora valida.");
                int hora = scan.nextInt();
                System.out.println("Ingrese minutos validos. ");
                int minutos = scan.nextInt();
                System.out.println("Ingrese segundos valids. ");
                int segundos = scan.nextInt();

                int flag = ejercicio18(hora, minutos, segundos);

                if (flag== 0)
                {
                    System.out.println("La hora es valida");
                    System.out.println("Son las: " + hora + ":" + minutos + ":" + segundos);
                }
                else
                {
                    System.out.println("La hora no es valida");
                }
                break;
            }
        }

    }

    public static void ejercicio1() {
        int n = 1;
        double a = 125454;
        char c = 'a';

        System.out.println("n = " + n);
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        double suma = n + a;
        double resta = a - n;
        int valor = (int) c;

        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("valor de caracter = " + valor);
    }

    public static void ejercicio2() {
        int X = 84;
        int Y = 12;
        double N = 5312;
        double M = 260611;

        double suma = X + M;
        double resta = M - Y;
        int mutiplicacion = X * Y;
        int division = X / Y;

        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + mutiplicacion);
        System.out.println("Division = " + division);
    }

    public static void ejercicio3() {
        int n = 510;

        int incrementar = n + 77;
        int reducir = n - 3;
        int duplicar = n * 2;

        System.out.println("incrementar = " + incrementar);
        System.out.println("reducir = " + reducir);
        System.out.println("duplicar = " + duplicar);
    }

    public static void ejercicio4() {
        int A = 15;
        int B = 30;
        int C = 2;
        int D = 72;
        int aux = 0;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }

    public static void ejercicio5(int numero) ///Es par o impar.
    {
        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }

    public static void ejercicio6(int numero) ///Me dice si es positivo o negativo.
    {
        if (numero > 0) {
            System.out.println("El valor es positivo");
        } else if (numero < 0) {
            System.out.println("El valor es negativo");
        } else {
            System.out.println("El valor es neutro");
        }
    }

    public static void multiploDe5(int numero)
    {
        if(numero % 5 == 0)
        {
            System.out.println("El numero es multiplo de 5. ");
        }
        else
        {
            System.out.println("El numero no es multiplo de 5.");
        }
    }
    public static void multiploDe10 (int numero)
    {
        if(numero % 10 == 0)
        {
            System.out.println("El numero es multiplo de 10. ");
        }
        else
        {
            System.out.println("El numero no es multiplo de 10. ");
        }
    }
    public static void menorOmayorA100 (int numero)
    {
        if(numero > 100)
        {
            System.out.println("El numero es mayor a 100.");
        }
        else if (numero < 100)
        {
            System.out.println("El numero es menor a 100.");
        }
        else
        {
            System.out.println("El numero es 100. ");
        }
    }
    public static void ejercicio7 (int numero)
    {
        ejercicio6(numero);
        ejercicio5(numero);
        multiploDe5(numero);
        multiploDe10(numero);
        menorOmayorA100(numero);
    }
    public static void ejercicio8 (String nombre)
    {
        System.out.println("Buenos dias, " + nombre);
    }
    public static void ejercicio9 (int numero)
    {
        int doble = numero * 2;
        int triple = numero * 3;

        System.out.println("El doble de el numero elegido es: " + doble);
        System.out.println("El triple de el numero elegido es " + triple);
    }
    public static void ejercicio10 (double gradosFahrenheit)
    {
        System.out.println("Grados en Fahrenheit: " + gradosFahrenheit);
        double gradosCentigrados = (gradosFahrenheit - 32) / 1.8;
        System.out.println("Grados Fahrenheit pasados a Centigrados: " + gradosCentigrados);
    }
    public static void ejercicio11 (double valorRadio)
    {
        double pi = 3.1416;
        double area = (valorRadio * valorRadio) * pi;
        double longitud = valorRadio * pi;

        System.out.println("El area del circulo es de: " + area);
        System.out.println("La longitud del circulo es de: " + longitud);
    }
    public static void ejercicio12 (double velocidadKm)
    {
        ///Revisar
        double velocidadMs = (velocidadKm * 1000) / 3600;
        System.out.println("La velocidad en metros por segundo es: " + velocidadMs);

    }
    public static void ejercicio13 (double c1, double c2)
    {
        double hipotenusa = Math.hypot(c1, c2);
        System.out.println("hipotenusa = " + hipotenusa);
    }
    public static void ejercicio14 (double radio)
    {
        double volumen = ((4 * Math.PI * Math.pow(radio,3) / 3));
        System.out.printf("Volumen de la esfera: " + volumen);
    }
    public static void ejercicio15 (double base, double altura)
    {
        double area = (base * altura) / 2;
        System.out.println("El area es: " + area);
    }
    public static void ejercicio16 (int num)
    {
        System.out.println("Numero completo: " + num);
        System.out.println("La primer cifra es: " + num/100);
        System.out.println("La segunda cifra es: " + num/10 % 10);
        System.out.println("La segunda cifra es: " + num % 10);
    }
    public static void ejercicio17 (int num)
    {
        System.out.println("Numero completo: " + num);
        System.out.println("Primera cifra: "+ num/10000);
        System.out.println("Tercera cifra: " + num/100 % 10);
        System.out.println("Ultima cifra: "+ num % 10);
    }
    public static int validarHora (int hora)
    {
        int flag = 0;
        if(hora > 24 || hora < 0)
        {
            flag = 1;
        }
        return flag;
    }
    public static int validarMinutoSegundo (int hora)
    {
        int flag = 0;
        if(hora > 59 || hora < 0)
        {
            flag = 1;
        }
        return flag;
    }

    public static int ejercicio18 (int hora,int minuto,int segundo)
    {
        int flag = validarHora(hora);
        if(flag == 0)
        {
            flag = validarMinutoSegundo(minuto);
            if (flag == 0)
            {
                flag = validarMinutoSegundo(segundo);

            }
        }

        return flag;
    }
}