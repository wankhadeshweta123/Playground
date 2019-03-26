import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int i = 1; i <= n; i++)
	    { 
            // Handle stars for each row
	        for(int j = 1; j <= n;j++)
	        {
                // Condition to print stars 
	            if((i == 1) || (j == 1) || 
                   (i == n) || (j == n))
	            {
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}