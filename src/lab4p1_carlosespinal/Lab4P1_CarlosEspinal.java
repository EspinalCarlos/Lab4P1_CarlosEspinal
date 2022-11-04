
package lab4p1_carlosespinal;
import java.util.Scanner;
public class Lab4P1_CarlosEspinal {
    
    public static void binario(String argu1, String argu2) {
        int num1 = 0;
        int num2 = 0;
        int acum = 0;
        int binario[] = new int [100];
        while (argu1.length() == argu2.length()) { 
        
            for (int i = 0; i< argu1.length(); i++) {
                if (argu1.charAt(i) == '1') {
                    num1 += Math.pow(2,argu1.length()-1-i);
                }//fin if argu 1
            
            }//fin for argu1
            for (int i = 0; i < argu2.length(); i++) {
                if (argu2.charAt(i) == '1') {
                    num2 += Math.pow(2,argu2.length()-1-i);
                }//fin if argu 2
            }//fin for argu 2
            int suma = num1 + num2;
        
            while (suma != 0) {
                binario[acum] = suma%2;
                suma = suma/2;
                acum++;
            }
            for (int i = acum - 1; i >= 0; i--) {
                System.out.print(binario[i]);
            }
        }
        if (argu1.length() != argu2.length()) {
            System.out.println("Asegurese que ambos numeros tengan la misma cantidad de digitos");
        }
    }
    public static void contains(String op1, String op2) {
        int acum = 0;
        for (int i = 0; i < op1.length(); i++) {
            for (int j = 0; j < op2.length(); j++) {
                if (op2.charAt(j) == op1.charAt(i)) {
                    acum++;
                }
            }
        }
        if (acum != op2.length()){
            System.out.println("La cadena" + op1+" no contiene la cadena"+op2);
        }
        else
            System.out.println("La cadena "+ op1 + " contiene la cadena "+op2);
    }
    public static void alpha(String argu) {
        int tiene = 0;
        int notiene = 0;
        String cadenalower = argu.toLowerCase();
        for (int i = 0; i < cadenalower.length(); i++) {
            for (int j = 97; j < 122; j++) {
                if (j == (int) cadenalower.charAt(i)) {
                    tiene++;
                }               
            }
        }
        if (tiene != cadenalower.length()) {
            System.out.println("La cadena contiene otros caracteres ademas de letras");
        }
        else
            System.out.println("La cadena solo contiene letras.");
    }

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("  MENU  ");
            System.out.println();
            System.out.println("Opcion 1: Suma de Binaros");
            System.out.println("Opcion 2: Contains");
            System.out.println("Opcion 3: Alpha");
            System.out.println("Opcion 4: Salida");
            System.out.println();
            System.out.println("Ingrese la opcion con la que desea trabajar: ");
            opcion = read.nextInt();
        
            switch (opcion) {
                case 1:
                    System.out.println("Se ha ingresado la primera opcion");
                    System.out.println("Ingrese el primer numero binario: ");
                    String binario1 = read.next();
                    System.out.println("Ingrese el segundo numero binario: ");
                    String binario2 = read.next();
                    
                    binario(binario1,binario2);
            
                break;
                case 2:
                    System.out.println("Se ha seleccionado la segunda opcion");
                    System.out.println();
                    System.out.println("Ingrese la primera cadena: ");
                    String cad1 = read.next();
                    System.out.println("Ingrese la segunda cadena: ");
                    String cad2 = read.next();
                    
                    contains(cad1,cad2);
            
                
                break;
                case 3:
                    System.out.println("Se ha seleccionado la tercera opcion");
                    System.out.println();
                    System.out.println("Ingrese una cadena: ");
                    String cadena = read.next();
                    
                    alpha(cadena);
                
                break;
            }            
        } while (opcion != 4); //Fin while opciones
            
    }
    
}
