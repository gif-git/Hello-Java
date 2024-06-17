import java.io.*;
class ap
{
double ar(float b,float h)
{
double area;
area=0.5*b*h;
return area;
}
double pr(float a1,float b1,float c1)
{
double perim;
perim=a1+b1+c1;
return perim;
}
}
class triangle
{
public static void main(String args[])throws IOException
{
float b1,ht;
float a,b,c;
double ar,peri;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the base and height Values ");
b1=Float.parseFloat(br.readLine());
ht=Float.parseFloat(br.readLine());
ap tar=new ap();
ar=tar.ar(b1,ht);
System.out.println("Area of Triangle is: "+ar);
System.out.println("Enter the three sides of the triangle");
a=Float.parseFloat(br.readLine());
b=Float.parseFloat(br.readLine());
c=Float.parseFloat(br.readLine());
peri=tar.pr(a,b,c);
System.out.println("Perimeter of Triangle is: "+peri);
} }
