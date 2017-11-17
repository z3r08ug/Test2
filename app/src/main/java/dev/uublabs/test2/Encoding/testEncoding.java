package dev.uublabs.test2.Encoding;

import java.util.ArrayList;

public class testEncoding 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(f("Errors in strategy cannot be correct through tactical maneuvers"));
		
		
		System.out.println(g("Hello there! Apple!"));
	}

	public static String f (String s)
	{
		String encoded = "";

		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] alphabet_backwards = {"z","y","x","w","v","u","t","s","r","q","p","o","n","m","l","k","j","i","h","g","f","e","d","c","b","a"};

		String s2 ="";
		s2=s.toLowerCase();

		for(int x = 0; x < s2.length(); x++)
		{
			if(s.charAt(x) == ' ')
			{
				encoded += " "; x++;
			}
			for(int y = 0; y <alphabet.length;y++)
			{
				if(s2.charAt(x) == alphabet[y].charAt(0))
				{
					encoded += alphabet_backwards[y];
				}
			}
		}

		return encoded;
	}
	public static String g (String s)
	{
		String result = "";
		s = s.toLowerCase();
		int [] alphacount = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int x = 0; x<s.length();x++)
		{
			switch(s.charAt(x))
			{
			case 'a':
				alphacount[0]++;
				break;
			case 'b':
				alphacount[1]++;
				break;
			case 'c':
				alphacount[2]++;
				break;
			case 'd':
				alphacount[3]++;
				break;
			case 'e':
				alphacount[4]++;
				break;
			case 'f':
				alphacount[5]++;
				break;
			case 'g':
				alphacount[6]++;
				break;
			case 'h':
				alphacount[7]++;
				break;
			case 'i':
				alphacount[8]++;
				break;
			case 'j':
				alphacount[9]++;
				break;
			case 'k':
				alphacount[10]++;
				break;
			case 'l':
				alphacount[11]++;
				break;
			case 'm':
				alphacount[12]++;
				break;
			case 'n':
				alphacount[13]++;
				break;
			case 'o':
				alphacount[14]++;
				break;
			case 'p':
				alphacount[15]++;
				break;
			case 'q':
				alphacount[16]++;
				break;
			case 'r':
				alphacount[17]++;
				break;
			case 's':
				alphacount[18]++;
				break;
			case 't':
				alphacount[19]++;
				break;
			case 'u':
				alphacount[20]++;
				break;
			case 'v':
				alphacount[21]++;
				break;
			case 'w':
				alphacount[22]++;
				break;
			case 'x':
				alphacount[23]++;
				break;
			case 'y':
				alphacount[24]++;
				break;
			case 'z':
				alphacount[25]++;
				break;
			}
		}
		result += "{\n\n";
		for(int x = 0; x < alphacount.length; x++)
		{
			switch(x)
			{
			case 0:
				result += "a:"+alphacount[0]+"\n";
				break;
			case 1:
				result += "b:"+alphacount[1]+"\n";
				break;
			case 2:
				result += "c:"+alphacount[2]+"\n";
				break;
			case 3:
				result += "d:"+alphacount[3]+"\n";
				break;
			case 4:
				result += "e:"+alphacount[4]+"\n";
				break;
			case 5:
				result += "f:"+alphacount[5]+"\n";
				break;
			case 6:
				result += "g:"+alphacount[6]+"\n";
				break;
			case 7:
				result += "h:"+alphacount[7]+"\n";
				break;
			case 8:
				result += "i:"+alphacount[8]+"\n";
				break;
			case 9:
				result += "j:"+alphacount[9]+"\n";
				break;
			case 10:
				result += "k:"+alphacount[10]+"\n";
				break;
			case 11:
				result += "l:"+alphacount[11]+"\n";
				break;
			case 12:
				result += "m:"+alphacount[12]+"\n";
				break;
			case 13:
				result += "n:"+alphacount[13]+"\n";
				break;
			case 14:
				result += "o:"+alphacount[14]+"\n";
				break;
			case 15:
				result += "p:"+alphacount[15]+"\n";
				break;
			case 16:
				result += "q:"+alphacount[16]+"\n";
				break;
			case 17:
				result += "r:"+alphacount[17]+"\n";
				break;
			case 18:
				result += "s:"+alphacount[18]+"\n";
				break;
			case 19:
				result += "t:"+alphacount[19]+"\n";
				break;
			case 20:
				result += "u:"+alphacount[20]+"\n";
				break;
			case 21:
				result += "v:"+alphacount[21]+"\n";
				break;
			case 22:
				result += "w:"+alphacount[22]+"\n";
				break;
			case 23:
				result += "x:"+alphacount[23]+"\n";
				break;
			case 24:
				result += "y:"+alphacount[24]+"\n";
				break;
			case 25:
				result += "z:"+alphacount[25]+"\n";
				break;
			}
		}
		result+="\n}";
		
		return result;
	}

}
