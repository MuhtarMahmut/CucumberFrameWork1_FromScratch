package Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {
    static XSSFSheet Sheet1;
    static {
        try {
            FileInputStream file = new FileInputStream("src/test/java/Utilities/MyExcel.xlsx");
            XSSFWorkbook YahooCredentials = new XSSFWorkbook(file);
             Sheet1=YahooCredentials.getSheet("Sheet1");
        }catch (Exception e){ }
    }

    public static String getData(int rownum, int cellnum){
        return Sheet1.getRow(rownum).getCell(cellnum).getStringCellValue();
    }



}
