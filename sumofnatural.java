class sumofnatural{
public static void main(string[] args){
i=1;
int N;
sum=0;
System.out.print("ENTER NUMBER UPTO WHICH IT SHOULD BE ADDED");
Scanner scan =new Scanner(System.in);
N=scan nextInt();
while(i<=N){
sum=sum+i;
i++;
print(sum)
}
System.out.print("The sum of N natural numbers is:",sum);
}
}
