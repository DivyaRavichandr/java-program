class alphabetornot{
public static void main(string[] args){
System.out.print("  Enter a character");
Scanner scan =new Scanner(System.in);
char ch=scan.nextInt().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
System.out.print("The character is ALPHABET");
else
System.out.print("NOT a alphabet");
}
}
