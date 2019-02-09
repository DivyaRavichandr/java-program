import java.util.Scanner{
class armstrong{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
int num, a,total=0;
while(num>0){
a=num%10;
total=total+a*a*a;
num=num/10;
}
if(num==total)
System.out.print("yes ");
else
System.out.print("no");
}
}
}
