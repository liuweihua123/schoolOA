package schooloa.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExportExcel {

	
	public static void generateExcel(String sheetName, List<String> header, List<List<String>> body, OutputStream out) {
		// �½�excel����
		Workbook excel = new HSSFWorkbook();
		// ���һ��sheet
		Sheet hssfSheet = excel.createSheet(sheetName);
		// ��excel��񴴽�һ�У�excel���к��Ǵ�0��ʼ��
		// ���ñ�ͷ
		Row firstRow = hssfSheet.createRow(0);
		for (int columnNum = 0; columnNum < header.size(); columnNum++) {
			// ������Ԫ��
			Cell hssfCell = firstRow.createCell(columnNum);
			// ���õ�Ԫ���ֵ
			hssfCell.setCellValue(header.size() < columnNum ? "-" : header.get(columnNum));
		}
		// �ֶ������п���һ��������ʾҪΪ�ڼ����裻���ڶ���������ʾ�еĿ�ȣ�nΪ�иߵ���������
		for (int i = 0; i < body.size() + 7; i++) {
			hssfSheet.setColumnWidth((short) i, (short) (28 * 200));
		}
 
		// ������������
		for (int rowNum = 0; rowNum < body.size(); rowNum++) {
			// ��excel��񴴽�һ�У�excel���к��Ǵ�0��ʼ��
			Row hssfRow = hssfSheet.createRow(rowNum + 1);
			List<String> data = body.get(rowNum);
			for (int columnNum = 0; columnNum < data.size(); columnNum++) {
				// ������Ԫ��
				Cell hssfCell = hssfRow.createCell(columnNum);
				// ���õ�Ԫ���ֵ
				hssfCell.setCellValue(data.size() < columnNum ? "-" : data.get(columnNum));
			}
		}
		try {
			excel.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
