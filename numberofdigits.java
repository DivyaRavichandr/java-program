class numberofdigits{
public static void main(string[] args){
int count=0;
System.out.print("enter an integer");
Scanner scan =new Scanner(System.in);
a=scan nextInt();
while(a>0){
a=a/10;
++count;
print(count);
System.out.print("no.of digits in integer is:",count);
}
}
