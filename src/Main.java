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

    }
}