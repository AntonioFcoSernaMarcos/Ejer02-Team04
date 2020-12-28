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
    public static int PideDia(int m){
        int dia=0;
        do{
           try{
               System.out.print("Introduzca un dia : ");
               dia=entrada.nextInt();
               switch(m){
                   case 1:
                       if (dia>31){
                           System.out.println("No hay mas de 31 dias en el mes de Enero");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                       
                   case 2:
                        if (dia>29){
                           System.out.println("No hay mas de 29 dias en el mes de Febrero");
                           leido=false;
                           entrada.nextLine();
                           
                       }
                        else{
                            leido=true;
                        };break;
                      
                   case 3:
                       if (dia>31){
                           System.out.println("No hay mas de 31 dias en el mes de Marzo");
                           leido=false;
                           entrada.nextLine();
                       }
                        else{
                            leido=true;
                        };break;
                       
                   case 4:
                       if (dia>30){
                           System.out.println("No hay mas de 30 dias en el mes de Abril");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                   case 5:
                       if (dia>30){
                           System.out.println("No hay mas de 30 dias en el mes de Mayo");
                           leido=false;
                           entrada.nextLine();
                           
                       } else{
                            leido=true;
                        };break;
                       
                   case 6:
                       if (dia>30){
                           System.out.println("No hay mas de 30 dias en el mes de Junio");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                      
                   case 7:
                       if (dia>31){
                           System.out.println("No hay mas de 31 dias en el mes de Julio");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                       
                   case 8:
                       if (dia>31){
                           System.out.println("No hay mas de 31 dias en el mes de Agosto");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                       
                   case 9:
                       if (dia>30){
                           System.out.println("No hay mas de 30 dias en el mes de Septiembre");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                       
                   case 10:
                       if (dia>31){
                           System.out.println("No hay mas de 31 dias en el mes de Octubre");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                       
                   case 11:
                       if (dia>30){
                           System.out.println("No hay mas de 30 dias en el mes de Noviembre");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                       
                   case 12:
                       if (dia>31){
                           System.out.println("No hay mas de 31 dias en el mes de diciembre");
                           leido=false;
                           entrada.nextLine();
                       } else{
                            leido=true;
                        };break;
                       
                       
               }
           } catch(InputMismatchException ex){
               System.out.println("Este valor no es valido por favor introduzca otro");
               entrada.nextLine();
           }
        }while (leido==false);
        
        return dia;
    }
    public static int Lnum(int d, int m, int a){
        int millares=0;
         int centenas=0;
         int decenas=0;
         int unidades=0; 
         int lunum=0;
         lunum=a+m+d;
          millares=lunum/1000;
          centenas=(lunum%1000)/100;
          decenas=((lunum%1000)/10)%10;
          unidades=lunum%10;
          lunum=millares+centenas+decenas+unidades;
           if (lunum/10==0){
             lunum=millares+centenas+decenas+unidades;
          }
          else{
          decenas=lunum/10;
          unidades=lunum%10;
          lunum=decenas+unidades;
         
     }
           return lunum;
     }
	public static void main(String[] args) {
		 int dia=0;
	        int mes=0;
	        int año=0;
	        int lunum=0;
	        año=PideAño();
	        while (año!=0){
	         mes=PideMes();
	         dia=PideDia(mes);
	        lunum=Lnum(dia,mes,año);
	        System.out.println("Tu numero de la suerte es :"+lunum);
	        lunum=0;
	        año=PideAño();
	        }
	    }
		

	}


