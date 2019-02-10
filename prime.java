import java.util.Scanner;
class prime{
public static void main(String args[]){
int n,count=0,i;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
for(i=2;i<=n;i++){
if(n%2==0){
count++;
break;
}
}
if(count==0)
System.out.print("yes");
else
System.out.print("no");
}
}
