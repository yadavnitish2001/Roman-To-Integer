package com.convertromantoint.convert;

public class ConvertRomanToInt {

	public static int value(char r) 
	{
		if(r=='I') {
			return 1;
		}
		if(r=='V') {
			return 5;
		}
		if(r=='X') {
			return 10;
		}
		if(r=='L') {
			return 50;
		}
		if(r=='C') {
			return 100;
		}
		if(r=='D') {
			return 500;
		}
		if(r=='M') {
			return 1000;
		}
		return -1;
	}
	public static int romanToInteger(String str) {
		int res=0;
		for (int i = 0; i < str.length(); i++) {
			int c1=value(str.charAt(i));
			if((i+1)<str.length()) {
				int c2=value(str.charAt(i+1));
				if(c1>c2) {
					res+=c1;
				}
				else {
					res=res+c2-c1;
					i++;
				}
			}
			else {
				res+=c1;
			}

		}
		return res;
	}

}

