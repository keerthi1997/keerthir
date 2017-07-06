import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
if(n%2==0)
System.out.println("n is even");
else
System.out.println("n is odd");

}
}
