import java.util.Scanner;
class Main
{
   public static int sq_of_digit(int num)
   {
    int sq = num*num;  
    return sq;
   }
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int sq1 = sq_of_digit(n1);
    System.out.println(sq1);
   }
}