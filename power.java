class power{
public static void main(string[] args){
System.out.print("ENTER BASE AND EXPONENT"); 
Scanner scan =new Scanner(System.in);
base=scan nextInt();
exponent=scan nextInt();
answer=1
for(i=1;i<=exponent;i++)
answer=answer*base;
print(answer)
System.out.print("the power is:",answer);
}
}
