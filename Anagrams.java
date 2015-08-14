import java.util.*;
import java.lang.*;
import java.io.*;

public class Anagrams
{
	public static int count = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "abcde";
		printAnagrams("", str );
		System.out.println( count );
	}
	
	public static void printAnagrams( String fixed, String variable )
	{
		if( variable.length() == 1 )
		{
			System.out.println( fixed + variable );
			count++;
		}
		else
		{
			int i = 0;
			for ( i = 0; i < variable.length(); i++ )
			{
				String remaining = variable.substring( 0, i ) + variable.substring( i+1, variable.length());
				printAnagrams( fixed + variable.charAt( i ), remaining );
			}
		}
	}
}
