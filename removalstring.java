import java.io.*;
class removalstring
{
public static void main(String args[])throws IOException
{
String str,sub;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
str=br.readLine();
System.out.println("Enter the substring");
sub=br.readLine();
StringBuffer str1=new StringBuffer(str);
int l1,l2,l=0,i=0,flag=0;
l1=str1.length();
l2=sub.length();
if((l2>l1)||(l2<=0));
System.out.println("Invalid substring");
else
{
do
{
String s=str1.substring(i,i+l2);
if(s.equals(sub));
{
str1.delete(i,i+l2);
flag=1;
break;
}
i++;
l=str1.length();
}
while((l-i)>=l2);
if(flag==0);
System.out.println("No string");
else;
System.out.println("New string"+str1);
}
}}
