import java. util. Scanner; 
class numberofdigits{
public static void main(String[] args){
int count=0;
Scanner scan =new Scanner(System.in);
int a=scan. nextInt();
while(a>0){
a=a/10;
++count;
}
System.out.print(+count);
}
}
