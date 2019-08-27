package general;

public class Panagram {
	public void missingChars(String str){
		String temp=str.toLowerCase();
		int[] bitChar = new int[26];

		for(int i=0; i < (temp.length()); i++){
			if(temp.charAt(i)-97>=0){
				bitChar[temp.charAt(i)-97]=1;
			}
		}
		
		for(int i =0; i< (bitChar.length) ; i++){
			if(bitChar[i]==0){
				System.out.println((char)(i+97));		
			}
		}
		
	}

	public static void main(String[] args) {
		
		// take out some chars and try running the method
		String str = "The quick brown fox jumps over the lazy dog";
		Panagram ob = new Panagram();
		ob.missingChars(str);

	}

}
