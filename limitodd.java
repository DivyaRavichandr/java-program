import java.util.Scanner;
class limitodd{
public static void main(String args[]){
int m,n;
Scanner scan=new Scanner(System.in);
m=scan.nextInt();
n=scan.nextInt();
for i in range(m,n+1){
while(i%2!==0){
System.out.println(i);
i++;
}
}
}
}
