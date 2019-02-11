import java.util.Scanner;
class sumofnatural{
public static void main(String[] args){
int i=1;
int N;
 intsum=0;
System.out.print("ENTER NUMBER UPTO WHICH IT SHOULD BE ADDED");
Scanner scan =new Scanner(System.in);
N=scan. nextInt();
while(i<=N){
sum=sum+i;
i++;
}
System.out.print(+sum);
}
}
