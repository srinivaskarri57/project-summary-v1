package general;

public class FirstNonRepeatingChar {
	
	public int firstChar(String strData){
		char ch='0';
		String str = strData.toLowerCase();
		int len = str.length();

		for(int i=0;i<len;i++){
			if(str.indexOf(str.charAt(i), 0) == str.lastIndexOf(str.charAt(i))){
				System.out.println(str.charAt(i));
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNonRepeatingChar ob = new FirstNonRepeatingChar();
		String str = "first non repeating char first";
		if((ob.firstChar(str)==0)){
			System.out.println("No single characters in the string: "+str);
		}
	}

}
