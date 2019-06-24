package schooloa.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import net.sf.jsqlparser.statement.select.Select;
import schooloa.bean.ToolsList;
import schooloa.dao.ToolsListMapper;
import schooloa.util.ExcelUtil;
import schooloa.util.JsonData;

@Controller
public class OfficeController {
	@Autowired
	private ToolsListMapper toolsListMapper;
	
	
	@RequestMapping("/importOfficeExcel")
	@ResponseBody
	public JsonData importExcel(MultipartFile file) throws IOException {

		CommonsMultipartFile cFile = (CommonsMultipartFile) file;
		DiskFileItem fileItem = (DiskFileItem) cFile.getFileItem();
		InputStream inputStream = fileItem.getInputStream();

		ExcelUtil<ToolsList> util = new ExcelUtil<ToolsList>(ToolsList.class);// ����excel������
		List<ToolsList> list = util.importExcel("Sheet1", inputStream);// ����
		for (int i = 0; i < list.size(); i++) {
			int insertSelective = toolsListMapper.insertSelective(list.get(i));
		}
		System.out.println(list);
		return JsonData.success();

	}
	//��ǰ�˻�ȡ������Щ����ݺ�ѧ�ڵ�excel����һ�������򣬿��Դ�������������Ҫ��
	@RequestMapping("/getTimeAndXueqi")
	@ResponseBody
	public JsonData gettimeandxueqi()
	{
		List<ToolsList> list=toolsListMapper.selectByExample(null);
		return JsonData.success(list, "success");
	}
	
	@RequestMapping("/exportExcel")
	@ResponseBody
	public JsonData exportexcel(HttpServletRequest request,@RequestParam(value="time") String time,@RequestParam(value="semester") String semester,@RequestParam(value="professional") String professional) throws IOException
	{
		ToolsList toolsList=toolsListMapper.selectByTimeAndSemeterAndProfessional(time, semester, professional);
		
		// Create Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook(); // ����һ����
		XSSFSheet xssfSheet = workbook.createSheet("�ձ�");// һ��Sheet
		xssfSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 10));// �ϲ���Ԫ��
		xssfSheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 4));
		xssfSheet.addMergedRegion(new CellRangeAddress(1, 1, 6, 10));

		XSSFCellStyle xssfCellStyle = workbook.createCellStyle();
		xssfCellStyle.setVerticalAlignment(CellStyle.ALIGN_CENTER);

		XSSFRow xssfRow = xssfSheet.createRow((short) 0);// short0��ʾ�ӵ�1�п�ʼ���
		xssfRow.createCell(0).setCellValue("���ϴ�ѧȪ��ѧԺ"+toolsList.getTime()+"��칫��Ʒ�ɹ�Ŀ¼");// ��һ�еĵ�һ��

		xssfRow = xssfSheet.createRow((short) 1);// �ڶ���
		xssfRow.createCell(0).setCellValue("��λ:");// �ڶ��еĵ�һ��
		xssfRow.createCell(6).setCellValue("����:");

		xssfRow = xssfSheet.createRow((short) 3);
		xssfRow.createCell(0).setCellValue("����");// 0�����1��
		xssfRow.createCell(1).setCellValue("��λ");
		xssfRow.createCell(2).setCellValue("����");// double����
		xssfRow.createCell(3).setCellValue("����");
		xssfRow.createCell(4).setCellValue("���");
		xssfRow.createCell(6).setCellValue("����");// 0������
		xssfRow.createCell(7).setCellValue("��λ");
		xssfRow.createCell(8).setCellValue("����");// double����
		xssfRow.createCell(9).setCellValue("����");
		xssfRow.createCell(10).setCellValue("���");

		xssfRow = xssfSheet.createRow((short) 4);
		xssfRow.createCell(0).setCellValue("��Բ���");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.5);// ��Բ��ʵĵ���
		xssfRow.createCell(3).setCellValue(toolsList.getLyzb());// ��Բ��ʵ�����
		xssfRow.createCell(6).setCellValue("��ˮ");// 0�����1��
		xssfRow.createCell(7).setCellValue("ƿ");
		xssfRow.createCell(8).setCellValue(1);// ��ˮ�ĵ���
		xssfRow.createCell(9).setCellValue(toolsList.getJiaoshui());// ��ˮ������

		xssfRow = xssfSheet.createRow((short) 5);
		xssfRow.createCell(0).setCellValue("��Բ���");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.5);
		xssfRow.createCell(3).setCellValue(toolsList.getHyzb());
		xssfRow.createCell(6).setCellValue("����");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1);
		xssfRow.createCell(9).setCellValue(toolsList.getJiaobang());

		xssfRow = xssfSheet.createRow((short) 6);
		xssfRow.createCell(0).setCellValue("��Բ���о");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.1);
		xssfRow.createCell(3).setCellValue(toolsList.getLyzbx());
		xssfRow.createCell(6).setCellValue("��Ƥ");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(0.4);
		xssfRow.createCell(9).setCellValue(toolsList.getXiangpi());

		xssfRow = xssfSheet.createRow((short) 7);
		xssfRow.createCell(0).setCellValue("��Բ���о");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.1);
		xssfRow.createCell(3).setCellValue(toolsList.getHyzbx());
		xssfRow.createCell(6).setCellValue("����");// 0�����1��
		xssfRow.createCell(7).setCellValue("ƿ");
		xssfRow.createCell(8).setCellValue(1.5);
		xssfRow.createCell(9).setCellValue(toolsList.getJianghu());

		xssfRow = xssfSheet.createRow((short) 8);
		xssfRow.createCell(0).setCellValue("����0.5���Աʣ��ڣ�");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.8);
		xssfRow.createCell(3).setCellValue(toolsList.getCgfivezxbh());
		xssfRow.createCell(6).setCellValue("ī֭");// 0�����1��
		xssfRow.createCell(7).setCellValue("ƿ");
		xssfRow.createCell(8).setCellValue(3);
		xssfRow.createCell(9).setCellValue(toolsList.getMozhi());

		xssfRow = xssfSheet.createRow((short) 9);
		xssfRow.createCell(0).setCellValue("����0.5���Աʣ��죩");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.8);
		xssfRow.createCell(3).setCellValue(toolsList.getCgfivezxbhong());
		xssfRow.createCell(6).setCellValue("PUƤ��ӲƤ��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(4.5);
		xssfRow.createCell(9).setCellValue(toolsList.getPupiheiyingpiben());

		xssfRow = xssfSheet.createRow((short) 10);
		xssfRow.createCell(0).setCellValue("����0.7���Ա�");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(1.8);
		xssfRow.createCell(3).setCellValue(toolsList.getCgsevenzxb());
		xssfRow.createCell(6).setCellValue("��Ƥ��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1);
		xssfRow.createCell(9).setCellValue(toolsList.getRuanpiben());
		

		xssfRow = xssfSheet.createRow((short) 11);
		xssfRow.createCell(0).setCellValue("����1.0���Ա�");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(1.8);
		xssfRow.createCell(3).setCellValue(toolsList.getCgonezxb());
		xssfRow.createCell(6).setCellValue("��д��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(3.5);
		xssfRow.createCell(9).setCellValue(toolsList.getSuxieben());
		
		

		xssfRow = xssfSheet.createRow((short) 12);
		xssfRow.createCell(0).setCellValue("����Ǧ��");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.3);
		xssfRow.createCell(3).setCellValue(toolsList.getHlqb());
		xssfRow.createCell(6).setCellValue("��ӡ��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(2);
		xssfRow.createCell(9).setCellValue(toolsList.getHongyinni());
		

		xssfRow = xssfSheet.createRow((short) 13);
		xssfRow.createCell(0).setCellValue("Ǧ�ʣ�2B��");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.5);
		xssfRow.createCell(3).setCellValue(toolsList.getTwobqb());
		xssfRow.createCell(6).setCellValue("ת�ʵ�");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1);
		xssfRow.createCell(9).setCellValue(toolsList.getZhuanbidao());
		

		xssfRow = xssfSheet.createRow((short) 14);
		xssfRow.createCell(0).setCellValue("��ɫǦ��");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(3.5);
		xssfRow.createCell(3).setCellValue(toolsList.getCsqb());
		xssfRow.createCell(6).setCellValue("��ֽ��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(2);
		xssfRow.createCell(9).setCellValue(toolsList.getBizhidao());

		xssfRow = xssfSheet.createRow((short) 15);
		xssfRow.createCell(0).setCellValue("�װ��");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(1);
		xssfRow.createCell(3).setCellValue(toolsList.getBaibanbi());
		xssfRow.createCell(6).setCellValue("����");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(2.5);
		xssfRow.createCell(9).setCellValue(toolsList.getJiandao());

		xssfRow = xssfSheet.createRow((short) 16);
		xssfRow.createCell(0).setCellValue("�װ����");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(1.5);
		xssfRow.createCell(3).setCellValue(toolsList.getBaibanbiyou());
		xssfRow.createCell(6).setCellValue("С��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(0.25);
		xssfRow.createCell(9).setCellValue(toolsList.getXiaodao());

		xssfRow = xssfSheet.createRow((short) 17);
		xssfRow.createCell(0).setCellValue("����0.5���Ա�о���ڣ�");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.3);
		xssfRow.createCell(3).setCellValue(toolsList.getChengguangwuzhongxingbixinhei());
		xssfRow.createCell(6).setCellValue("���������");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(10);
		xssfRow.createCell(9).setCellValue(toolsList.getDelidingshuji());

		xssfRow = xssfSheet.createRow((short) 18);
		xssfRow.createCell(0).setCellValue("����0.5���Ա�о���죩");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.3);
		xssfRow.createCell(3).setCellValue(toolsList.getChengguangwuzhongxingbixinhong());
		xssfRow.createCell(6).setCellValue("�������鶤");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1);
		xssfRow.createCell(9).setCellValue(toolsList.getDelidingshuding());

		xssfRow = xssfSheet.createRow((short) 19);
		xssfRow.createCell(0).setCellValue("����0.7���Ա�о");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.45);
		xssfRow.createCell(3).setCellValue(toolsList.getChenguangqizhongxingbixin());
		xssfRow.createCell(6).setCellValue("������");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(12);
		xssfRow.createCell(9).setCellValue(toolsList.getJisuanqi());

		xssfRow = xssfSheet.createRow((short) 20);
		xssfRow.createCell(0).setCellValue("����1.0���Ա�о");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(0.45);
		xssfRow.createCell(3).setCellValue(toolsList.getChenguangyizhongxingbixin());
		xssfRow.createCell(6).setCellValue("��������������");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(38);
		xssfRow.createCell(9).setCellValue(toolsList.getDelihanshujisuanqi());
		

		xssfRow = xssfSheet.createRow((short) 21);
		xssfRow.createCell(0).setCellValue("���ԼǺű�");// 0�����1��
		xssfRow.createCell(1).setCellValue("֧");
		xssfRow.createCell(2).setCellValue(1.8);
		xssfRow.createCell(3).setCellValue(toolsList.getYouxingjihaobi());
		xssfRow.createCell(6).setCellValue("��ȡֽ");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(0.1);
		xssfRow.createCell(9).setCellValue(toolsList.getKouquzhi());

		xssfRow = xssfSheet.createRow((short) 22);
		xssfRow.createCell(0).setCellValue("���ż�");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.75);
		xssfRow.createCell(3).setCellValue(toolsList.getDaxinfa());
		xssfRow.createCell(6).setCellValue("���ϳ�ֱ��30cm");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1.5);
		xssfRow.createCell(9).setCellValue(toolsList.getSuliaochangzhichisanshi());
		

		xssfRow = xssfSheet.createRow((short) 23);
		xssfRow.createCell(0).setCellValue("��ֽ");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.75);
		xssfRow.createCell(3).setCellValue(toolsList.getGaozhi());
		xssfRow.createCell(6).setCellValue("���ϳ�ֱ��40cm");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(2);
		xssfRow.createCell(9).setCellValue(toolsList.getSuliaochangzhichisishi());

		xssfRow = xssfSheet.createRow((short) 24);
		xssfRow.createCell(0).setCellValue("ţƤֽ������");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.4);
		xssfRow.createCell(3).setCellValue(toolsList.getNiupizhidangandai());
		xssfRow.createCell(6).setCellValue("������β�У���");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(0.6);
		xssfRow.createCell(9).setCellValue(toolsList.getDelichangweijiada());

		xssfRow = xssfSheet.createRow((short) 25);
		xssfRow.createCell(0).setCellValue("���ϵ�����");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.8);
		xssfRow.createCell(3).setCellValue(toolsList.getSuliaodangandai());
		xssfRow.createCell(6).setCellValue("������β�У��У�");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(0.45);
		xssfRow.createCell(9).setCellValue(toolsList.getDelichangweijiazhong());

		xssfRow = xssfSheet.createRow((short) 26);
		xssfRow.createCell(0).setCellValue("͸��խ����");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.3);
		xssfRow.createCell(3).setCellValue(toolsList.getToumingzhaijiaodai());
		xssfRow.createCell(6).setCellValue("������β�У�С��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(0.25);
		xssfRow.createCell(9).setCellValue(toolsList.getDelichangweijiaxiao());

		xssfRow = xssfSheet.createRow((short) 27);
		xssfRow.createCell(0).setCellValue("͸������");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(3.5);
		xssfRow.createCell(3).setCellValue(toolsList.getToumingkuangjiaodai());
		xssfRow.createCell(6).setCellValue("5�����ڵ��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1.8);
		xssfRow.createCell(9).setCellValue(toolsList.getWuhaonanfudianchi());


		xssfRow = xssfSheet.createRow((short) 28);
		xssfRow.createCell(0).setCellValue("˫��խ����");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.5);
		xssfRow.createCell(3).setCellValue(toolsList.getShuangmianzhaijiaodai());
		xssfRow.createCell(6).setCellValue("7�����ڵ��");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1.8);
		xssfRow.createCell(9).setCellValue(toolsList.getQihaonanfudianchi());

		xssfRow = xssfSheet.createRow((short) 29);
		xssfRow.createCell(0).setCellValue("˫�����");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(1.2);
		xssfRow.createCell(3).setCellValue(toolsList.getShuangmiankuanjiaodai());
		xssfRow.createCell(6).setCellValue("9V˫¹���");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(2.8);
		xssfRow.createCell(9).setCellValue(toolsList.getJiufushuangludianchi());

		xssfRow = xssfSheet.createRow((short) 30);
		xssfRow.createCell(0).setCellValue("��ĭ˫�潺��");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(1);
		xssfRow.createCell(3).setCellValue(toolsList.getPaomoshuangmianjiaodai());
		xssfRow.createCell(6).setCellValue("����������");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1);
		xssfRow.createCell(9).setCellValue(toolsList.getDelihuixingzhen());

		xssfRow = xssfSheet.createRow((short) 31);
		xssfRow.createCell(0).setCellValue("���ֽ");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.4);
		xssfRow.createCell(3).setCellValue(toolsList.getDahongzhi());
		xssfRow.createCell(6).setCellValue("��������");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(1.8);
		xssfRow.createCell(9).setCellValue(toolsList.getDeliqidingqi());

		xssfRow = xssfSheet.createRow((short) 32);
		xssfRow.createCell(0).setCellValue("��ֽ");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(0.5);
		xssfRow.createCell(3).setCellValue(toolsList.getXuanzhi());
		xssfRow.createCell(6).setCellValue("�����ļ���");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(9.5);
		xssfRow.createCell(9).setCellValue(toolsList.getSuliaowenjianjia());

		xssfRow = xssfSheet.createRow((short) 33);
		xssfRow.createCell(0).setCellValue("3.5����������");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(6);
		xssfRow.createCell(3).setCellValue(toolsList.getSanwudelidanganhe());
		xssfRow.createCell(6).setCellValue("���ϱ�Ͳ");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(5);
		xssfRow.createCell(9).setCellValue(toolsList.getSuliaobitong());

		xssfRow = xssfSheet.createRow((short) 34);
		xssfRow.createCell(0).setCellValue("5.5����������");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(8);
		xssfRow.createCell(3).setCellValue(toolsList.getWuwudelidanganhe());
		xssfRow.createCell(6).setCellValue("ľ�ʱ�Ͳ");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(9);
		xssfRow.createCell(9).setCellValue(toolsList.getMuzhibitong());

		xssfRow = xssfSheet.createRow((short) 35);
		xssfRow.createCell(0).setCellValue("�ļ���");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(3.2);
		xssfRow.createCell(3).setCellValue(toolsList.getWenjianjia());
		xssfRow.createCell(6).setCellValue("1.8�ײ���");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(28);
		xssfRow.createCell(9).setCellValue(toolsList.getYidianbamichapai());

		xssfRow = xssfSheet.createRow((short) 36);
		xssfRow.createCell(0).setCellValue("A4��˼�");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(1);
		xssfRow.createCell(3).setCellValue(toolsList.getAsichouganjia());
		xssfRow.createCell(6).setCellValue("3�ײ���");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(38);
		xssfRow.createCell(9).setCellValue(toolsList.getSanmichapai());

		xssfRow = xssfSheet.createRow((short) 37);
		xssfRow.createCell(0).setCellValue("׶��");// 0�����1��
		xssfRow.createCell(1).setCellValue("��");
		xssfRow.createCell(2).setCellValue(1);
		xssfRow.createCell(3).setCellValue(0);//û�ҵ���Ӧ���ֶ�
		xssfRow.createCell(6).setCellValue("5�ײ���");// 0�����1��
		xssfRow.createCell(7).setCellValue("��");
		xssfRow.createCell(8).setCellValue(48);
		xssfRow.createCell(9).setCellValue(toolsList.getWumichapai());

		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String dateString = formatter.format(date);
		
		// Create file system using specific name
		String path=request.getSession().getServletContext().getRealPath("/");
		System.out.println(path);
		FileOutputStream out = new FileOutputStream(new File(path+dateString+"�칫��Ʒ.xlsx"));// ���ڱ��������ļ�
		// write operation workbook using file out object
		workbook.write(out);
		out.close();
		System.out.println(" createworkbook.xlsx written successfully");
		return JsonData.success(dateString+"�칫��Ʒ.xlsx",null);//��������
	}
	

}
