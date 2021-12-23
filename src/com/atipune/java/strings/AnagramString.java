package com.atipune.java.strings;
import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
public static void areAnagram()
{
	String str1="listen";
	String str2="silent";
	String str3="list";
	char[] char1=str1.toCharArray();
			char[] char2=str2.toCharArray();
					char[] char3=str3.toCharArray();
					Arrays.sort(char1);
					Arrays.sort(char2);
					Arrays.sort(char3);

		System.out.println(Arrays.toString(char1));
		System.out.println(Arrays.toString(char2));
		System.out.println(Arrays.toString(char3));
		boolean flag=false;
		if (str1.length()==str2.length())
		{
			for(int i=0;i< str1.length();i++)
			{
				if(char1[i]==char2[i])
				{
					flag=true;
				}
			}
				
		}
		if(flag) {
			System.out.println("are anagram strings");
		}
		else {
			System.out.println("not anagram strings");
		}
}
	public static void main(String[] args) {
		areAnagram();

	}

}
