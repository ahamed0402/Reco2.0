package compliance;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenexample {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(
                "C:\\Users\\ahamed.i\\eclipse-workspace\\grc\\Testdata\\Holiday Master_Template.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getLastRowNum();
        int cel = sheet.getRow(2).getLastCellNum();

        System.out.println("Total number of rows: " + rows);
        System.out.println("Total number of cells: " + cel);

        for (int r = 0; r <= rows; r++) {
            XSSFRow currentrow = sheet.getRow(r);
            if (currentrow != null) { 
                for (int c = 0; c < cel; c++) {
                    XSSFCell currentcel = currentrow.getCell(c);
                    if (currentcel != null) {
                        System.out.println(currentcel.toString() + "\n");
                    } else {
                        System.out.println("Cell is empty at row " + r + ", column " + c + "\n");
                    }
                }
            } else {
                System.out.println("Row is null at index " + r + "\n");
            }
        }

        workbook.close();
        file.close();
    }
}











/*
 * package compliance;
 * 
 * import java.io.FileInputStream; import java.io.IOException;
 * 
 * import org.apache.poi.xssf.usermodel.XSSFCell; import
 * org.apache.poi.xssf.usermodel.XSSFRow; import
 * org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
 * 
 * public class Datadrivenexample {
 * 
 * public static void main(String[] args) throws IOException {
 * 
 * FileInputStream file = new FileInputStream(
 * "C:\\Users\\ahamed.i\\eclipse-workspace\\grc\\Testdata\\Holiday Master_Template.xlsx"
 * );
 * 
 * XSSFWorkbook workbook = new XSSFWorkbook(file);
 * 
 * XSSFSheet sheet = workbook.getSheetAt(0);
 * 
 * int rows = sheet.getLastRowNum();
 * 
 * int cel = sheet.getRow(2).getLastCellNum();
 * 
 * System.out.println("Total no. of rows:" + rows);
 * System.out.println("Total no. of cells:" + cel);
 * 
 * for (int r = 0; r <= rows; r++)
 * 
 * { XSSFRow currentrow = sheet.getRow(r);
 * 
 * 
 * for (int c = 0; c < cel; c++)
 * 
 * { XSSFCell currentcel = currentrow.getCell(c);
 * System.out.println(currentcel.toString()+"\n"); } }
 * 
 * workbook.close(); file.close();
 * 
 * } }
 */