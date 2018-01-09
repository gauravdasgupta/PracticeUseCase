package org.abccorp.java.facade;

import java.util.List;

public interface FileOperationsFacade<T> {
	
	List<T> readCSV();
	void WriteCSV();
	List<T> readXlsx();
	void writeXlsx();
	List<T> readTxt();
	void writeTxt();
	
}
