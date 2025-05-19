package nrcm;

public class day3_1 {

	public static void main(String[] args) {
		String s="helloworld";
		String vowel="";
		String consonant="";
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel+=ch;
			}
			else if(ch>='a' && ch<='z') {
				consonant=ch+consonant;
			}
		}
		System.out.println("vowel:"+vowel);
		System.out.println("consonant:"+consonant);
	}
			
		}

