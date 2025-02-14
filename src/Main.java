import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");


        int vi=2;
        double vd=2.3;
        char vc='A';
        String cad ="hola";
        boolean vb = false;
        //mostrando variables por pantalla
        //+ actua como operador de concatenacion
        System.out.println("vi: "+vi+"vd: "+vd+"vc: "+vc+"cad: "+cad);

        //conversion de tipos de datos
        vi = (int)2.9 + (int)1.1;
        //LOS TOMA COMO ENTEROS DESDE EL PRINCIPIO AL HACER CAST EN CADA UNO(INT)
        System.out.println("vi: " + vi);
        vi = (int)(2.9 + 1.1);
        //LOS SUMA CON DECIMALES Y LO DEVUELVE EN ENTERO
        System.out.println("vi: " + vi);
        //vi = (int)vb + vb; hay tipos que no so convertibles
        vi = vc +1;
        System.out.println("vi(entero): " + vi + " vi(char): " + (char)vi);

        //OPERADORES
        int a = 1 , b=2;
        System.out.println("a: "+a+" b: "+b);
        a++; //postincremento(hace la operacion y luego se suma 1)
        ++b; //preincremento(se suma 1 primero y despues hace la operacion)
        System.out.println("a: "+a+" b: "+b);
        int c = a++ * ++b;
        System.out.println("a: "+a+" b: "+b+" c: "+c);
        //precedencia de operadores () ++ -- */% +- << = == != >> >=
        boolean bo = (2+8) < ++a || 2+5*9 == a++ + 43;
        //10 < ++a || 2+5*9 == a++ + 43;
        //10 < 4 || 2+5*9 == 4 + 43; (a vale 5)
        //10 < 4 || 47 == 47
        //false || true
        //true
        System.out.println("bo: " + bo + "a: " + a);
        bo = ++a < 10 | ++a == 6; //con un solo | se evaluan los dos lados
        System.out.println("bo: " + bo + "a: " + a);

        cad = "hola";
        //sobrecarga de operadores: el operador se comporta de forma diferente segun sus operandos
        a= 1+1;//suma algebraica
        cad= "1" + "1" + 2+4+5;//+ es concatenacion incluir otro tipo se denomina wrapping
        System.out.println("cad: " + cad);// junta la cadena y lo toma como texto
        String cad1 = cad.substring(2,4);
        System.out.println("cad1: " + cad1);
        bo = "hola".equals("Hola");
        System.out.println("bo: " + bo);





        System.exit(0);



        //leyendo datos del teclado
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

