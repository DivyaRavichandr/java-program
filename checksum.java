import java.util.Scanner;
class checksum{
public static void main(String[] args){
int a;
Scanner scan =new Scanner(System.in);
a=scan.nextInt();
if(a<0)
System.out.print("The number is negative");
else if(a>0)
System.out.print("The number is postive");
else
System.out.print("The number is zero");
}
}
