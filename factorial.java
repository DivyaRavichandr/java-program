import java.util.Scanner;
class factorial{
public static void main(String[] args){
int i=1;
int fact=1;
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
for(i=1;i<=N;i++){
fact=fact*i;
}
System.out.println(+fact);
}
}
