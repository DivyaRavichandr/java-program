import java. util. Scanner; 
class alphabetornot{
public static void main(String[] args){
System.out.print("  Enter a character");
Scanner scan =new Scanner(System.in);
char ch=scan.next().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
System.out.println("The character is ALPHABET");
else
System.out.println("NOT a alphabet");
}
}
