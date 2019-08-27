package general;

import java.util.ArrayList;
import java.util.List;

public class CharSequenceCount {
	
	public void sequenceCount(String str){
		int count=0;
		List<Character> list = new ArrayList<Character>(); 
		for(int i=0;i<str.length();i++){
			if((i<str.length()-1) && (str.charAt(i+1)==str.charAt(i))){
				count++;
			}
			else{
				count++;
				list.add(str.charAt(i));
				list.add((char)(count+(int)'0'));
				count=0;
			}
		}
		String st=list.toString()
				.replace(",", "")  //remove the commas
			    .replace("[", "")  //remove the right bracket
			    .replace("]", "")  //remove the left bracket
			    .trim();
		System.out.println(st);		
	}

	public static void main(String[] args) {
		// print the repeating number of chars with count - aaabbbcc =a3b3c2
		String str="aaabbbcc";
		CharSequenceCount ob = new CharSequenceCount();
		ob.sequenceCount(str);
	}

}
