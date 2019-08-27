package general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlatformStats {

	public String processData(String fileName) throws IOException{
		List<List<String>> data = readFile(fileName);  // parsed csv content
		
		DataClass dc;  // structure to store the values of each column
		
		List<DataClass> processedData = new ArrayList<DataClass>();

		int len=data.size();
		String result="";
		
		for(int i=0;i<len;i++){
			if(processedData.contains(data.get(i).get(0))){
				//Logic create the objects for the DataClass structure and filter the content
			}
			//populate result based on logic
		}
		
		//Logic to populate processed data into csv
		return result;
	}
	
	private List<List<String>> readFile(String csvFileName) throws IOException {
	    String line = null;
	    BufferedReader stream = null;
	    List<List<String>> csvData = new ArrayList<List<String>>();

	    try {
	        stream = new BufferedReader(new FileReader(csvFileName));
	        while ((line = stream.readLine()) != null) {
	            String[] splitted = line.split(",");
	            List<String> dataLine = new ArrayList<String>(splitted.length);
	            for (String data : splitted)
	                dataLine.add(data);
	            csvData.add(dataLine);
	        }
	    } finally {
	        if (stream != null)
	            stream.close();
	    }
	    return csvData;
	}
}