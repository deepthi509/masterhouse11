package interest;
  
/* Test Comments 20200724 */
import java.util.*;
import java.io.PrintWriter.*;
import java.io.*;
public class Housecost1{
	static int n;
	static float cost;

public void method() {
PrintWriter pw = new PrintWriter(System.out,true);
Scanner sc=new Scanner(System.in);

pw.printf("Enter the square feet:");
          n=sc.nextInt();
	pw.printf("\nEnter the choice:");
	int choice=sc.nextInt();

  switch(choice) {
	case 1:
      cost=1200*n;
  	break;
  case 2:
      cost=1500*n;
  	break;
  case 3:
  	cost=1800*n;
  	break;
  case 4:
  	cost=2500*n;
  	break;
  default:
  	pw.write("invalid choice");
  }
 pw.write("\n cost for house"+cost);
 pw.close();
 }
public static void main (String args[]) {
             
	    Housecost1 hc=new Housecost1();
	hc.method();
            
}
}


