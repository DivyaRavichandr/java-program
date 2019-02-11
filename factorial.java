import java.util.Scanner;
class factorial{
int i=1,fact=1;
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
while(i<=N){
fact=fact*i;
i++;
System.out.println(+fact);
}
}
