import java.util.Scanner;
class ticket
{
   public static void main(String arg[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Code\t");
       char t= sc.next().charAt(0);
       System.out.println("Ticekt Fair\t");
      
       switch(t)
       {
           case ('d'): System.out.println("15");
           	   	break;
           case ('r'): System.out.println("20");
           	   	break;
           case ('w'): System.out.println("30");
           	   	break;
           case ('c') : System.out.println("40");
           		break;
           default: System.out.println("Invalid code");
       }
       
   }
}
