package schooloa.controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import schooloa.bean.TrainingProgram;
import schooloa.bean.TrainingProgramExample;
import schooloa.service.TrainingProgramService;
import schooloa.util.ExportExcel;
import schooloa.util.JsonData;
import schooloa.util.ReadExcels;
import schooloa.util.UpLoadUtil;

@Controller
public class TrainingProgramController {

	@Autowired
	TrainingProgramService trainingProgramService;
	
	
	@RequestMapping("/getTrainingProgram")
	@ResponseBody
	public JsonData getTP() {
		return JsonData.success(trainingProgramService.getTrainingProgram(), "success");
	}
	
	//����id����
	@RequestMapping("/updateTP")
	@ResponseBody
	public JsonData updateTP(TrainingProgram trainingProgram)
	{
		
		TrainingProgramExample trainexample=new TrainingProgramExample();
		int count=trainingProgramService.UpdateTrinPro(trainingProgram, trainexample);
		if (count>0) {
			return JsonData.success(null, "success");
		} else {
			return JsonData.fail("����ʧ��");
		}
		
	}
	//����idɾ��
	@RequestMapping("/deleteByid")
	@ResponseBody
	public JsonData deletebyid(@RequestParam(value="id")Integer id)
	{
		int c=trainingProgramService.deleteByid(id);
		if (c>0) {
			return JsonData.success(null, "ɾ���ɹ�");
		} else {
			return JsonData.fail("ɾ��ʧ��");
		}
	}

	// �ϴ�excel�ļ�
	//�������excel�ļ��������ݿ���
	
	@RequestMapping("/importExcel")
	@ResponseBody
	public JsonData importExcel(HttpServletRequest request,MultipartFile file)
	{
		MultipartHttpServletRequest multipartHttpServletRequest=(MultipartHttpServletRequest) request;
		MultipartFile file1=multipartHttpServletRequest.getFile("file");
		//file1.getInputStream();
		
		//����Ƿ��ؾ���·��
		String path=request.getSession().getServletContext().getRealPath("/");
        
		ReadExcels readExcels = new ReadExcels();
		try {
			//����Ƿ������·��
			String filepath=UpLoadUtil.saveFile(file1, path);
			String truepath=path+filepath;
			List<List<Object>> excleDataList = readExcels.readExcel(new File(truepath));
			for (int i = 1; i < excleDataList.size(); i++) {
				List<Object> list = excleDataList.get(i);//�����list����һ������
				TrainingProgram trainingProgram=new TrainingProgram();
				trainingProgram.setProfessional(list.get(0).toString());
				trainingProgram.setGrade(list.get(1).toString());
				trainingProgram.setCourseno(list.get(2).toString());
				trainingProgram.setCoursename(list.get(3).toString());
				trainingProgram.setCredit(Double.parseDouble(list.get(4).toString()));
				trainingProgram.setTotalhour(Double.parseDouble(list.get(5).toString()));
				trainingProgram.setTheoryhour(Double.parseDouble(list.get(6).toString()));
				trainingProgram.setExperimenthour(Double.parseDouble(list.get(7).toString()));
				trainingProgram.setComputerhour(Double.parseDouble(list.get(8).toString()));
				trainingProgram.setTestform(list.get(9).toString());
				trainingProgram.setCoursetype(list.get(10).toString());
				trainingProgram.setBeginsemester(list.get(11).toString());
				trainingProgramService.insertListbyOne(trainingProgram);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			JsonData.fail(e.getMessage());
		}
		return JsonData.success(null, "import success!");
		
	}
	
	//����Ϊexcel�ļ�
	// ��excel����ʽ����
	@RequestMapping("/derivedExcel")
	@ResponseBody
	public JsonData derivedExcel(HttpServletRequest request) {
		int num = 20000;
		List<TrainingProgram> tPrograms = trainingProgramService.getAllExcel();
		int count = trainingProgramService.getAllExcelCount();
		Map<String, Object> modelList = new HashMap<>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat annual = new SimpleDateFormat("yyyy");
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");
		int total = count / num + 1;
		List<String> header = new ArrayList<>();
		header.add("רҵ");
		header.add("�꼶");
		header.add("�γ̱��");
		header.add("�γ�����");
		header.add("ѧ��");
		header.add("��ѧʱ");
		header.add("����ѧʱ");
		header.add("ʵ��ѧʱ");
		header.add("�ϻ�ѧʱ");
		header.add("������ʽ");
		header.add("�γ����");
		header.add("����ѧ��");
		modelList.put("total", total);
		modelList.put("number", count);
		modelList.put("enterprises", tPrograms);
		List<List<String>> body = new ArrayList<>();
		for (int i = 0; i < tPrograms.size(); i++) {
			List<String> data = new ArrayList<>();
			data.add(tPrograms.get(i).getProfessional());
			data.add(tPrograms.get(i).getGrade());
			data.add(tPrograms.get(i).getCourseno());
			data.add(tPrograms.get(i).getCoursename());
			data.add(String.valueOf(tPrograms.get(i).getCredit()));
			data.add(String.valueOf(tPrograms.get(i).getTotalhour()));
			data.add(String.valueOf(tPrograms.get(i).getTheoryhour()));
			data.add(String.valueOf(tPrograms.get(i).getExperimenthour()));
			data.add(String.valueOf(tPrograms.get(i).getComputerhour()));
			data.add(tPrograms.get(i).getTestform());
			data.add(tPrograms.get(i).getCoursetype());
			data.add(tPrograms.get(i).getBeginsemester());	
			body.add(data);
		}
		Date date = new Date();
 
		String dateString = formatter.format(date);
		
		String xtpath=request.getSession().getServletContext().getRealPath("/");//��Ŀ��Ŀ¼
		String realpath=xtpath+"excel";
		System.out.println(realpath);
		/*try (OutputStream out = new FileOutputStream("D:/" + dateString + "test.xls") // ���Ŀ�ĵ�
 
		) {
			ExportExcel exportExcel=new ExportExcel();
			exportExcel.generateExcel("sheetName", header, body, out);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			//OutputStream out = new FileOutputStream("D:/" + dateString + "test.xls");
			OutputStream out = new FileOutputStream(xtpath+"/excel" + dateString + "test.xls");
			ExportExcel exportExcel=new ExportExcel();
			exportExcel.generateExcel("sheetName", header, body, out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return JsonData.success();
	}
	
	
	//��ʼ
	/**
	 * ��ѯ�����ƻ���
	 * @param courseno
	 * @return 
	 */
	@RequestMapping("/selectQing.json")
	@ResponseBody
	public JsonData selectQing(TrainingProgram trainingProgram){
		if(trainingProgram.getCourseno().equals("")){
			return JsonData.fail("������γ̱��");
		}else{
			return trainingProgramService.selectQing(trainingProgram);
		}
		
	}
	
	/**
	 * �ϴ���ѧ���
	 * @param id
	 * @return 
	 */
	@RequestMapping("/uploadsyllabusPath")
	@ResponseBody
	public JsonData uploadsyllabusPath(MultipartFile file, TrainingProgram trainingProgram, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// �����ļ���
		String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		trainingProgram.setSyllabuspath(filefath);
		int count = trainingProgramService.Uploadsyllabus(trainingProgram);
		return count > 0 ? JsonData.success(filefath) : JsonData.fail("�޸�ʧ��!");
	}
	/**
	 * �ϴ��ڿμƻ�
	 * @param id
	 * @return 
	 */
	@RequestMapping("/uploadTeachingPath")
	@ResponseBody
	public JsonData uploadTeachingPath(MultipartFile file, TrainingProgram trainingProgram, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// �����ļ���
		String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		trainingProgram.setTeachingplanpath(filefath);
		int count = trainingProgramService.Uploadsyllabus(trainingProgram);
		return count > 0 ? JsonData.success(filefath) : JsonData.fail("�޸�ʧ��!");
	}
	


}
