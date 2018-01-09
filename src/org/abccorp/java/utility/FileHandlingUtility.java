package org.abccorp.java.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.abccorp.java.dao.ABCCorpSampleInput;

import org.abccorp.java.facade.FileOperationsFacade;

public class FileHandlingUtility<T> implements FileOperationsFacade {
	
	private String fileName;
	
	@Override
	public List<ABCCorpSampleInput> readCSV() {
		String csvFile = "C:\\Users\\indiahiring\\Desktop\\Gaurav_Dasgupta\\SampleData.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		List<ABCCorpSampleInput> clientData = new ArrayList<>();
		

		try {

			br = new BufferedReader(new FileReader(csvFile));
			br.readLine();
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] input = line.split(cvsSplitBy);
				ABCCorpSampleInput clientInput = new ABCCorpSampleInput();
				clientInput.setFin_type(input[0]);
				clientInput.setSub_type(input[1]);
				clientInput.setTier(input[2]);
				clientInput.setVendor(input[3]);
				clientInput.setRating(input[4]);
				clientInput.setWty(Double.parseDouble(input[5]));
				clientInput.setSox(Double.parseDouble(input[6]));
				clientInput.setAmount(Double.parseDouble(input[7]));
				clientData.add(clientInput);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return clientData;
		
	}

	private String getFileName() {
		// TODO Auto-generated method stub
		return fileName;
	}

	@Override
	public void WriteCSV() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List readXlsx() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeXlsx() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List readTxt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeTxt() {
		// TODO Auto-generated method stub
		
	}

}
