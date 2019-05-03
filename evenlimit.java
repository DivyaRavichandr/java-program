import java.util.Scanner;
class evenlimit{
public static void main(String [] args){
	int m,n,i;
	Scanner scan=new Scanner(System.in);
	m=scan.nextInt();
	n=scan.nextInt();
	for(i=m;i<=n;i++)
	{
		if(i%2==0)
		System.out.println(i);
		else
		System.out.print(" ");
		
	}
	
}
}
