import java.util.*;
import java.io.*;


public class Driver
{
    public static void main(String[] args)
    {
        int fInt = 0, sInt = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			fInt = Integer.parseInt(br.readLine());
			sInt = Integer.parseInt(br.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}

		if(fInt > sInt) System.out.println(">");
		else if(fInt < sInt) System.out.println("<");
		else System.out.println("=");
    }
}
