import java.lang.*; 
import java.io.*; 
import java.util.*; 
class reversestring{
  public static void main(String[] s1,int input2){
    String d="";
    String s="";
    String[] s1=input.split(" ");
    int n=input2/10;
    len=s1[n-1].length();
if(len%2!=0){
  String a=s1[n-1].substring(0,(len/2)+1);
  String b=new StringBuffer(a).reverse().toString();
  String c=s1[n-1].substring(len/2,len);
  d=b+c;
}
else{
  String a=s1[n-1].substring(0,len/2);
  String b=new StringBuffer(a).reverse().toString();
  String c=s1[n-1].substring(len/2,len);
  d=b+c;
}
int n=n/10;
len=s1[n-1].length();

if(len%2!=0){
  String a=s1[n-1].substring(0,(len/2)+1);
  String b=new StringBuffer(a).reverse().toString();
  String c=s1[n-1].substring(len/2,len);
  s=b+c;
}
else{
  String a=s1[n-1].substring(0,len/2);
  String b=new StringBuffer(a).reverse().toString();
  String c=s1[n-1].substring(len/2,len);
  s=b+c;
}
ans=d+" "+s;
return ans;
}

}
