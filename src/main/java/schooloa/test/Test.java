package schooloa.test;

import java.io.*;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
public class Test 
{
   public static void main(String[] args)throws Exception 
   {
	 
      //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook(); //����һ����
      XSSFSheet xssfSheet=workbook.createSheet("�ձ�");//һ��Sheet
      xssfSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 10));//�ϲ���Ԫ��
      xssfSheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 4));
      xssfSheet.addMergedRegion(new CellRangeAddress(1, 1, 6, 10));
      
      XSSFCellStyle xssfCellStyle=workbook.createCellStyle();
      xssfCellStyle.setVerticalAlignment(CellStyle.ALIGN_CENTER);
      
      
      XSSFRow xssfRow=xssfSheet.createRow((short)0);//short0��ʾ�ӵ�1�п�ʼ���
      xssfRow.createCell(0).setCellValue("���ϴ�ѧȪ��ѧԺ2018��칫��Ʒ�ɹ�Ŀ¼");//��һ�еĵ�һ��
      
      xssfRow=xssfSheet.createRow((short)1);//�ڶ���
      xssfRow.createCell(0).setCellValue("��λ:");//�ڶ��еĵ�һ��
      xssfRow.createCell(6).setCellValue("����:");
      
      xssfRow=xssfSheet.createRow((short)3);
      xssfRow.createCell(0).setCellValue("����");//0�����1��
      xssfRow.createCell(1).setCellValue("��λ");
      xssfRow.createCell(2).setCellValue("����");//double����
      xssfRow.createCell(3).setCellValue("����");
      xssfRow.createCell(4).setCellValue("���");    
      xssfRow.createCell(6).setCellValue("����");//0������
      xssfRow.createCell(7).setCellValue("��λ");
      xssfRow.createCell(8).setCellValue("����");//double����
      xssfRow.createCell(9).setCellValue("����");
      xssfRow.createCell(10).setCellValue("���");
      
      
      xssfRow=xssfSheet.createRow((short)4);
      xssfRow.createCell(0).setCellValue("��Բ���");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.5);//��Բ��ʵĵ���
      xssfRow.createCell(3).setCellValue(111);//��Բ��ʵ�����
      xssfRow.createCell(6).setCellValue("��ˮ");//0�����1��
      xssfRow.createCell(7).setCellValue("ƿ");
      xssfRow.createCell(8).setCellValue(1);//��ˮ�ĵ���
      xssfRow.createCell(9).setCellValue(111);//��ˮ������
      
      
      xssfRow=xssfSheet.createRow((short)5);
      xssfRow.createCell(0).setCellValue("��Բ���");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("����");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1);
      
      
      xssfRow=xssfSheet.createRow((short)6);
      xssfRow.createCell(0).setCellValue("��Բ���о");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.1);
      xssfRow.createCell(6).setCellValue("��Ƥ");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(0.4);
      
      xssfRow=xssfSheet.createRow((short)7);
      xssfRow.createCell(0).setCellValue("��Բ���о");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.1);
      xssfRow.createCell(6).setCellValue("����");//0�����1��
      xssfRow.createCell(7).setCellValue("ƿ");
      xssfRow.createCell(8).setCellValue(1.5);
      
      xssfRow=xssfSheet.createRow((short)8);
      xssfRow.createCell(0).setCellValue("����0.5���Աʣ��ڣ�");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.8);
      xssfRow.createCell(6).setCellValue("ī֭");//0�����1��
      xssfRow.createCell(7).setCellValue("ƿ");
      xssfRow.createCell(8).setCellValue(3);
      
      xssfRow=xssfSheet.createRow((short)9);
      xssfRow.createCell(0).setCellValue("����0.5���Աʣ��죩");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.8);
      xssfRow.createCell(6).setCellValue("PUƤ��ӲƤ��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(4.5);
      
      
      xssfRow=xssfSheet.createRow((short)10);
      xssfRow.createCell(0).setCellValue("����0.7���Ա�");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(1.8);
      xssfRow.createCell(6).setCellValue("��Ƥ��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1);
      
      xssfRow=xssfSheet.createRow((short)11);
      xssfRow.createCell(0).setCellValue("����1.0���Ա�");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(1.8);
      xssfRow.createCell(6).setCellValue("��д��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(3.5);
      
      
      xssfRow=xssfSheet.createRow((short)12);
      xssfRow.createCell(0).setCellValue("����Ǧ��");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("��ӡ��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(2);
      
      xssfRow=xssfSheet.createRow((short)13);
      xssfRow.createCell(0).setCellValue("Ǧ�ʣ�2B��");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("ת�ʵ�");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1);
      
      
      xssfRow=xssfSheet.createRow((short)14);
      xssfRow.createCell(0).setCellValue("��ɫǦ��");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(3.5);
      xssfRow.createCell(6).setCellValue("��ֽ��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(2);
      
      
      xssfRow=xssfSheet.createRow((short)15);
      xssfRow.createCell(0).setCellValue("�װ��");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("����");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(2.5);
      
      
      xssfRow=xssfSheet.createRow((short)16);
      xssfRow.createCell(0).setCellValue("�װ����");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(1.5);
      xssfRow.createCell(6).setCellValue("С��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(0.25);
      
      xssfRow=xssfSheet.createRow((short)17);
      xssfRow.createCell(0).setCellValue("����0.5���Ա�о���ڣ�");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("���������");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(10);
      
      
      xssfRow=xssfSheet.createRow((short)18);
      xssfRow.createCell(0).setCellValue("����0.5���Ա�о���죩");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("�������鶤");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1);
      
      
      xssfRow=xssfSheet.createRow((short)19);
      xssfRow.createCell(0).setCellValue("����0.7���Ա�о");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.45);
      xssfRow.createCell(6).setCellValue("������");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(12);
      
      xssfRow=xssfSheet.createRow((short)20);
      xssfRow.createCell(0).setCellValue("����1.0���Ա�о");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(0.45);
      xssfRow.createCell(6).setCellValue("��������������");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(38);
      
      xssfRow=xssfSheet.createRow((short)21);
      xssfRow.createCell(0).setCellValue("���ԼǺű�");//0�����1��
      xssfRow.createCell(1).setCellValue("֧");
      xssfRow.createCell(2).setCellValue(1.8);
      xssfRow.createCell(6).setCellValue("��ȡֽ");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(0.1);
      
      xssfRow=xssfSheet.createRow((short)22);
      xssfRow.createCell(0).setCellValue("���ż�");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.75);
      xssfRow.createCell(6).setCellValue("���ϳ�ֱ��30cm");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1.5);
      
      xssfRow=xssfSheet.createRow((short)23);
      xssfRow.createCell(0).setCellValue("��ֽ");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.75);
      xssfRow.createCell(6).setCellValue("���ϳ�ֱ��40cm");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(2);
      
      xssfRow=xssfSheet.createRow((short)24);
      xssfRow.createCell(0).setCellValue("ţƤֽ������");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.4);
      xssfRow.createCell(6).setCellValue("������β�У���");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(0.6);
      
      xssfRow=xssfSheet.createRow((short)25);
      xssfRow.createCell(0).setCellValue("���ϵ�����");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.8);
      xssfRow.createCell(6).setCellValue("������β�У��У�");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(0.45);
      
      xssfRow=xssfSheet.createRow((short)26);
      xssfRow.createCell(0).setCellValue("͸��խ����");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("������β�У�С��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(0.25);
      
      xssfRow=xssfSheet.createRow((short)27);
      xssfRow.createCell(0).setCellValue("͸������");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(3.5);
      xssfRow.createCell(6).setCellValue("5�����ڵ��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1.8);
      
      xssfRow=xssfSheet.createRow((short)28);
      xssfRow.createCell(0).setCellValue("˫��խ����");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("7�����ڵ��");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1.8);
      
      xssfRow=xssfSheet.createRow((short)29);
      xssfRow.createCell(0).setCellValue("˫�����");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(1.2);
      xssfRow.createCell(6).setCellValue("9V˫¹���");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(2.8);
      
      xssfRow=xssfSheet.createRow((short)30);
      xssfRow.createCell(0).setCellValue("��ĭ˫�潺��");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("����������");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1);
      
      xssfRow=xssfSheet.createRow((short)31);
      xssfRow.createCell(0).setCellValue("���ֽ");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.4);
      xssfRow.createCell(6).setCellValue("��������");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(1.8);
      
      xssfRow=xssfSheet.createRow((short)32);
      xssfRow.createCell(0).setCellValue("��ֽ");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("�����ļ���");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(9.5);
      
      
      xssfRow=xssfSheet.createRow((short)33);
      xssfRow.createCell(0).setCellValue("3.5����������");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(6);
      xssfRow.createCell(6).setCellValue("���ϱ�Ͳ");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(5);
      
      xssfRow=xssfSheet.createRow((short)34);
      xssfRow.createCell(0).setCellValue("5.5����������");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(8);
      xssfRow.createCell(6).setCellValue("ľ�ʱ�Ͳ");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(9);
      
      
      xssfRow=xssfSheet.createRow((short)35);
      xssfRow.createCell(0).setCellValue("�ļ���");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(3.2);
      xssfRow.createCell(6).setCellValue("1.8�ײ���");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(28);
      
      xssfRow=xssfSheet.createRow((short)36);
      xssfRow.createCell(0).setCellValue("A4��˼�");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("3�ײ���");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(38);
      
      
      xssfRow=xssfSheet.createRow((short)37);
      xssfRow.createCell(0).setCellValue("׶��");//0�����1��
      xssfRow.createCell(1).setCellValue("��");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("5�ײ���");//0�����1��
      xssfRow.createCell(7).setCellValue("��");
      xssfRow.createCell(8).setCellValue(48);
      
      
      
      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(
      new File("excel/�칫��Ʒ.xlsx"));//���ļ�����excelĿ¼��
      //write operation workbook using file out object
      workbook.write(out);
      out.close();
      System.out.println(" createworkbook.xlsx written successfully");
   }
}