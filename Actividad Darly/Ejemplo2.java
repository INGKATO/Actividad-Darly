import java.util.Scanner;
 public class Ejemplo2{
  public static void main(String [] args){
   int nombre_v[]=new int[5]; 
  Scanner sc=new Scanner(System.in); 
  for (int i=0; i<5;i++){
  System.out.println("ingresa un numero entero"); 
  nombre_v[i]=sc.nextInt();
   }
   for(int j=0; j<5;j++){ 
   System.out.println(nombre_v[j]); 
   }
  }
}
 
   