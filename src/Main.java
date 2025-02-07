import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");


        int vi=2;
        double vd=2.3;
        char vc='A';
        String cad ="hola";
        System.out.println("vi: "+vi+"vd: "+vd+"vc: "+vc+"cad: "+cad);
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un valor entero");
        vi=sc.nextInt();
        System.out.println("Valor entero leido " + vi);

        if (vi%2 == 0){
            System.out.println("El numero: "+vi+" es un numero par");
        }else{
            System.out.println("El numero: "+vi+" es un numero impar");
        }

        //Sentencias de vifurcaciopn anidada
        if (vi<50){
            System.out.println("El numero: "+vi+" es un numero < que 50");
        }else if (vi>50){
            System.out.println("El numero: "+vi+" es un numero > que 50");
        }else if (vi==50){
            System.out.println("El numero: "+vi+" es un numero == que 50");
        }

        //Sentencias switch case
        System.out.println("Introduzca color (R/r, V/v, A/a)");
        cad=sc.next();
        vc=cad.charAt(0);

        switch (vc){
            case 'A':
            case 'a':
                System.out.println("El color es AZUL ");
                break;
            case 'R':
            case 'r':
                    System.out.println("El color es ROJO ");
                break;
            case 'V':
            case 'v':
                        System.out.println("El color es VERDE ");
                break;

                default:
                    System.out.println("Color erroneo ");
        }


        if (vc=='A'){
            System.out.println("OK");
        }

        //Buclws cuando se conoce el numero de iteraciones
        int suma1=0, suma2=0;
        for (int i=0;i<10;i++){
            suma1=suma1+i;
            suma2+=i;
        }
        System.out.println("SUMA 1: "+suma1 + " SUMA 2: "+suma2);
        //HACER BUCLE QUE SOLICITE NUMEROS AL USUARIOS HASTA QUE INTRODUZCA UN NUMERO PAR
        System.out.println("introduce un numero: ");
        int num= 1;
        while (num%2!=0 ){
            num=sc.nextInt();
            System.out.println("NUMERO par: "+num);
            if (num%2!=0){
                System.out.println("El numero: "+num+" es un numero impar");
            }
        }
    }

}

