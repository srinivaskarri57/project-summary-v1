package general;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		String csvFile = "F:\\Books\\000 Training\\KC\\Eclipse\\basket.csv";
		String line="";
		String separator=",";
		BufferedReader br = null;
		FileReader fr;
		try{
			fr = new FileReader(csvFile);
			br = new BufferedReader(fr);
			while((line=br.readLine())!=null ){
				String[] basket = line.split(separator);
				System.out.println("F:: "+basket[0]+" D::"+basket[1]+" C1::"+basket[2]+"  C2::"+basket[3]);
				
			}
			
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Fine not found");
		}
		catch(IOException ioe){
			System.out.println("No input");
		}
		finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
	}

}
