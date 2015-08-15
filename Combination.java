import java.util.*;
import java.lang.*;
import java.io.*;

class Combination
{
	public static int count = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		combination( "abcde");
		System.out.println(count);
	}
	
	private static void combination(String str)
	{
		int i=0;
		for(i=1;i<=str.length();i++)
		{
			combination2(str,"",i);
		}
	}
	private static void combination2( String str, String included, int rem_len )
	{
		//System.out.println( str + " " + included + " " + rem_len );
		if( rem_len == 0 )
		{
			System.out.println( included );
			count++;	
		}
		else
		{
			int j=0;
			for( j=0; j<str.length(); j++ )
			{
				combination2( str.substring(j+1), included+str.charAt(j), rem_len-1 );
			}
			
		}
	}
}
