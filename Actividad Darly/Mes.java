import java.util.Scanner; 
  public class Mes{
   public static void main(String [] args){
    Scanner sc= new Scanner(System.in); 
    int dias []= new int[12];
    int mes[]= new int[12];
     dias[0]=31;
     dias[1]=28;
     dias[2]=31;
     dias[3]=30;
     dias[4]=31;
     dias[5]=30;
     dias[6]=31;
     dias[7]=31;
     dias[8]=30;
     dias[9]=31;
     dias[10]=30;
     dias[11]=31;
     for(int i=0; i<1;i++){
       System.out.println("Escribe el mes del 0-12");
        mes[i]=sc.nextInt();  
      System.out.println("el mes seleccionado es " + mes[i] + " tiene : " + dias[i] + " dias"); 
      }
   }
}