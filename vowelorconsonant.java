import java.util.Scanner
class vowelorconsonant{
public static void main(string[] args){
System.out.print("ENTER A CHARACTER:");
Scanner scan =new Scanner(System.in);
char ch=scan.next().charAt(0);
if(ch='a','e','i','o','u')
System.out.print("The character is VOWEL");
else
System.out.print("The character is CONSONANT");
}
}
