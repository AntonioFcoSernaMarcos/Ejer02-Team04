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
    public static int PideAño(){
        int año=0;
        do{
         try{
             System.out.print("Digame el año de su nacimiento(introduzca 0 para salir): ");
             año=entrada.nextInt();
             leido=true;
             
            if (año<0){
                System.out.println("No existen años negativos a no ser que seas un niandertal");
                leido=false;
                entrada.nextLine();
                
            }
            else if (año>2020){
                System.out.println("Este numero no es válido debido a que sino serias un espermatozoide");
                leido=false;
                entrada.nextLine();
            }
             
         }   catch(InputMismatchException ex){
             System.out.println("Este valor no es numero entero por favor introduzca otro valor");
             leido=false;
             entrada.nextLine();
         }
        }while(leido==false);
        
        return año;
    }
	public static void main(String[] args) {

		

	}

}
