import java.util.Scanner;
class armstrong{
public static void main(String args[]){
System.out.print("enter the interval a and b");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int num=scan.nextInt();
int total=0;
while(a<=num && num>=b){
num=num%10;
total=total+num*num*num;
num=num/10;
}
if(num==total)
System.out.print("the armstrong number",num);
else
System.out.print("no armstrong number");
}
}
