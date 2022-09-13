package com.mindtree.empImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mindtree.empService.empService;

public class empImpl implements empService {

	public void writeData() {
		String filename = "C:\\Users\\mindc1jun186\\Desktop\\input.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet 1");
		Object empArr[][] = { { "Employee ID", "Name", "Salary" }, { 101, "Virat", 90000 }, { 102, "Sourav", 89000 },
				{ 103, "Sachin", 88000 }, { 104, "Irfan", 87000 }, { 105, "Yousuf", 86000 }, { 106, "Zaheer", 85000 },
				{ 107, "Yuvraj", 84000 }, { 108, "Rohit", 83000 }, { 109, "Dhoni", 82000 }, { 110, "Raina", 81000 } };
		int rows = empArr.length;
		int cols = empArr[0].length;
		for (int i = 0; i < rows; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < cols; j++) {
				Cell cell = row.createCell(j);
				Object value = empArr[i][j];
				if (value instanceof String)
					cell.setCellValue((String) value);

				else if (value instanceof Integer)
					cell.setCellValue((Integer) value);
			}
		}
		try {
			FileOutputStream output = new FileOutputStream(filename);
			workbook.write(output);
			output.close();
			System.out.println("Written succesfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public void readData() {
		try {
			FileInputStream file = new FileInputStream(
					new File("C:\\Users\\mindc1jun186\\Desktop\\Employee_details.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowitr = sheet.rowIterator();
			while (rowitr.hasNext()) {
				Row row = rowitr.next();
				Iterator<Cell> cellitr = row.cellIterator();
				while (cellitr.hasNext()) {
					Cell cell = cellitr.next();
					switch (cell.getCellType()) {
					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + " ");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue() + " ");
						break;
					}
				}
				System.out.println("");
			}
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
