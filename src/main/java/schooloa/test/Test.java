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
      XSSFWorkbook workbook = new XSSFWorkbook(); //创建一个表
      XSSFSheet xssfSheet=workbook.createSheet("空表");//一个Sheet
      xssfSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 10));//合并单元格
      xssfSheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 4));
      xssfSheet.addMergedRegion(new CellRangeAddress(1, 1, 6, 10));
      
      XSSFCellStyle xssfCellStyle=workbook.createCellStyle();
      xssfCellStyle.setVerticalAlignment(CellStyle.ALIGN_CENTER);
      
      
      XSSFRow xssfRow=xssfSheet.createRow((short)0);//short0表示从第1行开始输出
      xssfRow.createCell(0).setCellValue("济南大学泉城学院2018年办公用品采购目录");//第一行的第一列
      
      xssfRow=xssfSheet.createRow((short)1);//第二行
      xssfRow.createCell(0).setCellValue("单位:");//第二行的第一列
      xssfRow.createCell(6).setCellValue("人数:");
      
      xssfRow=xssfSheet.createRow((short)3);
      xssfRow.createCell(0).setCellValue("名称");//0代表第1列
      xssfRow.createCell(1).setCellValue("单位");
      xssfRow.createCell(2).setCellValue("单价");//double类型
      xssfRow.createCell(3).setCellValue("数量");
      xssfRow.createCell(4).setCellValue("金额");    
      xssfRow.createCell(6).setCellValue("名称");//0代表列
      xssfRow.createCell(7).setCellValue("单位");
      xssfRow.createCell(8).setCellValue("单价");//double类型
      xssfRow.createCell(9).setCellValue("数量");
      xssfRow.createCell(10).setCellValue("金额");
      
      
      xssfRow=xssfSheet.createRow((short)4);
      xssfRow.createCell(0).setCellValue("蓝圆珠笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.5);//蓝圆珠笔的单价
      xssfRow.createCell(3).setCellValue(111);//蓝圆珠笔的数量
      xssfRow.createCell(6).setCellValue("胶水");//0代表第1列
      xssfRow.createCell(7).setCellValue("瓶");
      xssfRow.createCell(8).setCellValue(1);//胶水的单价
      xssfRow.createCell(9).setCellValue(111);//胶水的数量
      
      
      xssfRow=xssfSheet.createRow((short)5);
      xssfRow.createCell(0).setCellValue("红圆珠笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("胶棒");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(1);
      
      
      xssfRow=xssfSheet.createRow((short)6);
      xssfRow.createCell(0).setCellValue("蓝圆珠笔芯");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.1);
      xssfRow.createCell(6).setCellValue("橡皮");//0代表第1列
      xssfRow.createCell(7).setCellValue("块");
      xssfRow.createCell(8).setCellValue(0.4);
      
      xssfRow=xssfSheet.createRow((short)7);
      xssfRow.createCell(0).setCellValue("红圆珠笔芯");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.1);
      xssfRow.createCell(6).setCellValue("浆糊");//0代表第1列
      xssfRow.createCell(7).setCellValue("瓶");
      xssfRow.createCell(8).setCellValue(1.5);
      
      xssfRow=xssfSheet.createRow((short)8);
      xssfRow.createCell(0).setCellValue("晨光0.5中性笔（黑）");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.8);
      xssfRow.createCell(6).setCellValue("墨汁");//0代表第1列
      xssfRow.createCell(7).setCellValue("瓶");
      xssfRow.createCell(8).setCellValue(3);
      
      xssfRow=xssfSheet.createRow((short)9);
      xssfRow.createCell(0).setCellValue("晨光0.5中性笔（红）");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.8);
      xssfRow.createCell(6).setCellValue("PU皮黑硬皮本");//0代表第1列
      xssfRow.createCell(7).setCellValue("本");
      xssfRow.createCell(8).setCellValue(4.5);
      
      
      xssfRow=xssfSheet.createRow((short)10);
      xssfRow.createCell(0).setCellValue("晨光0.7中性笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(1.8);
      xssfRow.createCell(6).setCellValue("软皮本");//0代表第1列
      xssfRow.createCell(7).setCellValue("本");
      xssfRow.createCell(8).setCellValue(1);
      
      xssfRow=xssfSheet.createRow((short)11);
      xssfRow.createCell(0).setCellValue("晨光1.0中性笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(1.8);
      xssfRow.createCell(6).setCellValue("速写本");//0代表第1列
      xssfRow.createCell(7).setCellValue("本");
      xssfRow.createCell(8).setCellValue(3.5);
      
      
      xssfRow=xssfSheet.createRow((short)12);
      xssfRow.createCell(0).setCellValue("红蓝铅笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("红印尼");//0代表第1列
      xssfRow.createCell(7).setCellValue("盒");
      xssfRow.createCell(8).setCellValue(2);
      
      xssfRow=xssfSheet.createRow((short)13);
      xssfRow.createCell(0).setCellValue("铅笔（2B）");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("转笔刀");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(1);
      
      
      xssfRow=xssfSheet.createRow((short)14);
      xssfRow.createCell(0).setCellValue("彩色铅笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("盒");
      xssfRow.createCell(2).setCellValue(3.5);
      xssfRow.createCell(6).setCellValue("壁纸刀");//0代表第1列
      xssfRow.createCell(7).setCellValue("把");
      xssfRow.createCell(8).setCellValue(2);
      
      
      xssfRow=xssfSheet.createRow((short)15);
      xssfRow.createCell(0).setCellValue("白板笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("剪刀");//0代表第1列
      xssfRow.createCell(7).setCellValue("把");
      xssfRow.createCell(8).setCellValue(2.5);
      
      
      xssfRow=xssfSheet.createRow((short)16);
      xssfRow.createCell(0).setCellValue("白板笔油");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(1.5);
      xssfRow.createCell(6).setCellValue("小刀");//0代表第1列
      xssfRow.createCell(7).setCellValue("把");
      xssfRow.createCell(8).setCellValue(0.25);
      
      xssfRow=xssfSheet.createRow((short)17);
      xssfRow.createCell(0).setCellValue("晨光0.5中性笔芯（黑）");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("得力订书机");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(10);
      
      
      xssfRow=xssfSheet.createRow((short)18);
      xssfRow.createCell(0).setCellValue("晨光0.5中性笔芯（红）");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("得力订书钉");//0代表第1列
      xssfRow.createCell(7).setCellValue("盒");
      xssfRow.createCell(8).setCellValue(1);
      
      
      xssfRow=xssfSheet.createRow((short)19);
      xssfRow.createCell(0).setCellValue("晨光0.7中性笔芯");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.45);
      xssfRow.createCell(6).setCellValue("计算器");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(12);
      
      xssfRow=xssfSheet.createRow((short)20);
      xssfRow.createCell(0).setCellValue("晨光1.0中性笔芯");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(0.45);
      xssfRow.createCell(6).setCellValue("得力函数计算器");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(38);
      
      xssfRow=xssfSheet.createRow((short)21);
      xssfRow.createCell(0).setCellValue("油性记号笔");//0代表第1列
      xssfRow.createCell(1).setCellValue("支");
      xssfRow.createCell(2).setCellValue(1.8);
      xssfRow.createCell(6).setCellValue("口取纸");//0代表第1列
      xssfRow.createCell(7).setCellValue("张");
      xssfRow.createCell(8).setCellValue(0.1);
      
      xssfRow=xssfSheet.createRow((short)22);
      xssfRow.createCell(0).setCellValue("大信笺");//0代表第1列
      xssfRow.createCell(1).setCellValue("本");
      xssfRow.createCell(2).setCellValue(0.75);
      xssfRow.createCell(6).setCellValue("塑料长直尺30cm");//0代表第1列
      xssfRow.createCell(7).setCellValue("把");
      xssfRow.createCell(8).setCellValue(1.5);
      
      xssfRow=xssfSheet.createRow((short)23);
      xssfRow.createCell(0).setCellValue("稿纸");//0代表第1列
      xssfRow.createCell(1).setCellValue("本");
      xssfRow.createCell(2).setCellValue(0.75);
      xssfRow.createCell(6).setCellValue("塑料长直尺40cm");//0代表第1列
      xssfRow.createCell(7).setCellValue("把");
      xssfRow.createCell(8).setCellValue(2);
      
      xssfRow=xssfSheet.createRow((short)24);
      xssfRow.createCell(0).setCellValue("牛皮纸档案袋");//0代表第1列
      xssfRow.createCell(1).setCellValue("个");
      xssfRow.createCell(2).setCellValue(0.4);
      xssfRow.createCell(6).setCellValue("得力长尾夹（大）");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(0.6);
      
      xssfRow=xssfSheet.createRow((short)25);
      xssfRow.createCell(0).setCellValue("塑料档案袋");//0代表第1列
      xssfRow.createCell(1).setCellValue("个");
      xssfRow.createCell(2).setCellValue(0.8);
      xssfRow.createCell(6).setCellValue("得力长尾夹（中）");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(0.45);
      
      xssfRow=xssfSheet.createRow((short)26);
      xssfRow.createCell(0).setCellValue("透明窄胶带");//0代表第1列
      xssfRow.createCell(1).setCellValue("卷");
      xssfRow.createCell(2).setCellValue(0.3);
      xssfRow.createCell(6).setCellValue("得力长尾夹（小）");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(0.25);
      
      xssfRow=xssfSheet.createRow((short)27);
      xssfRow.createCell(0).setCellValue("透明宽胶带");//0代表第1列
      xssfRow.createCell(1).setCellValue("卷");
      xssfRow.createCell(2).setCellValue(3.5);
      xssfRow.createCell(6).setCellValue("5号南孚电池");//0代表第1列
      xssfRow.createCell(7).setCellValue("节");
      xssfRow.createCell(8).setCellValue(1.8);
      
      xssfRow=xssfSheet.createRow((short)28);
      xssfRow.createCell(0).setCellValue("双面窄胶带");//0代表第1列
      xssfRow.createCell(1).setCellValue("卷");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("7号南孚电池");//0代表第1列
      xssfRow.createCell(7).setCellValue("节");
      xssfRow.createCell(8).setCellValue(1.8);
      
      xssfRow=xssfSheet.createRow((short)29);
      xssfRow.createCell(0).setCellValue("双面宽胶带");//0代表第1列
      xssfRow.createCell(1).setCellValue("卷");
      xssfRow.createCell(2).setCellValue(1.2);
      xssfRow.createCell(6).setCellValue("9V双鹿电池");//0代表第1列
      xssfRow.createCell(7).setCellValue("节");
      xssfRow.createCell(8).setCellValue(2.8);
      
      xssfRow=xssfSheet.createRow((short)30);
      xssfRow.createCell(0).setCellValue("泡沫双面胶带");//0代表第1列
      xssfRow.createCell(1).setCellValue("卷");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("得力回形针");//0代表第1列
      xssfRow.createCell(7).setCellValue("盒");
      xssfRow.createCell(8).setCellValue(1);
      
      xssfRow=xssfSheet.createRow((short)31);
      xssfRow.createCell(0).setCellValue("大红纸");//0代表第1列
      xssfRow.createCell(1).setCellValue("张");
      xssfRow.createCell(2).setCellValue(0.4);
      xssfRow.createCell(6).setCellValue("得力起钉器");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(1.8);
      
      xssfRow=xssfSheet.createRow((short)32);
      xssfRow.createCell(0).setCellValue("宣纸");//0代表第1列
      xssfRow.createCell(1).setCellValue("张");
      xssfRow.createCell(2).setCellValue(0.5);
      xssfRow.createCell(6).setCellValue("塑料文件架");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(9.5);
      
      
      xssfRow=xssfSheet.createRow((short)33);
      xssfRow.createCell(0).setCellValue("3.5得力档案盒");//0代表第1列
      xssfRow.createCell(1).setCellValue("个");
      xssfRow.createCell(2).setCellValue(6);
      xssfRow.createCell(6).setCellValue("塑料笔筒");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(5);
      
      xssfRow=xssfSheet.createRow((short)34);
      xssfRow.createCell(0).setCellValue("5.5得力档案盒");//0代表第1列
      xssfRow.createCell(1).setCellValue("个");
      xssfRow.createCell(2).setCellValue(8);
      xssfRow.createCell(6).setCellValue("木质笔筒");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(9);
      
      
      xssfRow=xssfSheet.createRow((short)35);
      xssfRow.createCell(0).setCellValue("文件夹");//0代表第1列
      xssfRow.createCell(1).setCellValue("个");
      xssfRow.createCell(2).setCellValue(3.2);
      xssfRow.createCell(6).setCellValue("1.8米插排");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(28);
      
      xssfRow=xssfSheet.createRow((short)36);
      xssfRow.createCell(0).setCellValue("A4抽杆夹");//0代表第1列
      xssfRow.createCell(1).setCellValue("个");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("3米插排");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(38);
      
      
      xssfRow=xssfSheet.createRow((short)37);
      xssfRow.createCell(0).setCellValue("锥子");//0代表第1列
      xssfRow.createCell(1).setCellValue("把");
      xssfRow.createCell(2).setCellValue(1);
      xssfRow.createCell(6).setCellValue("5米插排");//0代表第1列
      xssfRow.createCell(7).setCellValue("个");
      xssfRow.createCell(8).setCellValue(48);
      
      
      
      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(
      new File("excel/办公用品.xlsx"));//将文件放在excel目录下
      //write operation workbook using file out object
      workbook.write(out);
      out.close();
      System.out.println(" createworkbook.xlsx written successfully");
   }
}