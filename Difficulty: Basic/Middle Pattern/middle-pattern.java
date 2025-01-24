//{ Driver Code Starts
//initial code
import java.util.Scanner;
import java.lang.*;
class MiddlePattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s=sc.next();
            GfG g=new GfG();
            g.printPattern(s);
            System.out.println();
            t--;
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


class GfG
{
/*method prints the given pattern in a single line */
	void printPattern(String s)
	{
	   
	    for(int i=0; i<s.length(); i++)
	    {
	        int index = s.length() / 2;
	        for(int j=0; j<=i; j++)
    	    {
    	        if(index < s.length() )
    	        {
    	            System.out.print(s.charAt(index));
    	        }else{
    	            index = 0;
    	            System.out.print(s.charAt(index));
    	        }
    	        index++;
    	       
    	    }
    	    System.out.print("$ ");
    	     
	    }
    }
}

