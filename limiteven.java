import java.util.Scanner;
class limiteven{
public static void main(String arg[]){
Scanner scan=new Scanner(System.in);
m=scan.nextInt();
n=scan.nextInt();
for i in xrange(m,n+1){
if(i%2==0){
print(i);
i++;
}
}
System.out.print("the even numbers are",i);
}
}
