package com.ejer;
import java.util.Scanner;
import java.util.InputMismatchException;;
public class LuckyNumber {
    static Scanner entrada=new Scanner(System.in);
    private static boolean leido;
    public static int PideMes(){
        int mes=0;
        do{
            try{
             System.out.print("Introduzca el mes : ");
             mes=entrada.nextInt();
             leido=true;
             if (mes<0){
                 System.out.println("No hay meses negativos");
                 entrada.nextLine();
                 leido=false;
             }
             else if (mes>12) {
                 System.out.println("No hay más de 12 meses en el calendario actual");
                 entrada.nextLine();
                 leido=false;
                         
             }
                     
            }catch(InputMismatchException ex){
                System.out.println("Este valor no es un numero entero por favor introduzca otro");
                leido=false;
                entrada.nextLine();             
                
            }
            
        }while(leido==false);
        
      return mes;  
   
    }
	public static void main(String[] args) {

		

	}

}
