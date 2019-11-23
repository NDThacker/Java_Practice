import java.util.*;
import java.io.*;


public class Driver
{
    public static void main(String[] args)
    {
        int fInt, sInt;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		fInt = Integer.parseInt(br.readLine());
		sInt = Integer.parseInt(br.readLine());

		if(fInt > sInt) System.out.println(">");
		else if(fInt < sInt) System.out.println("<");
		else System.out.println("=");
    }
}