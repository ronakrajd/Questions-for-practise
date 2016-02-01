import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class RM {
	public static void main(String args[])throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(r.readLine());
		while(t-->0){
			String c[]=r.readLine().split(" ");
			int a=Integer.parseInt(c[0]);
			int b=Integer.parseInt(c[1]);
			int n=0;
			 while(a!=b)
		        {
		            if(a<b)
		            {
		                b = b>>1; 
		            }
		            else
		            {
		                a = (a-a%2)>>1;
		            }
		 
		            n++;
		        }
			System.out.println(n);	
			}
		}
}
