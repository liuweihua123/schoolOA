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
	
	//根据id更新
	@RequestMapping("/updateTP")
	@ResponseBody
	public JsonData updateTP(TrainingProgram trainingProgram)
	{
		
		TrainingProgramExample trainexample=new TrainingProgramExample();
		int count=trainingProgramService.UpdateTrinPro(trainingProgram, trainexample);
		if (count>0) {
			return JsonData.success(null, "success");
		} else {
			return JsonData.fail("更新失败");
		}
		
	}
	//根据id删除
	@RequestMapping("/deleteByid")
	@ResponseBody
	public JsonData deletebyid(@RequestParam(value="id")Integer id)
	{
		int c=trainingProgramService.deleteByid(id);
		if (c>0) {
			return JsonData.success(null, "删除成功");
		} else {
			return JsonData.fail("删除失败");
		}
	}

	// 上传excel文件
	//将导入的excel文件导进数据库中
	
	@RequestMapping("/importExcel")
	@ResponseBody
	public JsonData importExcel(HttpServletRequest request,MultipartFile file)
	{
		MultipartHttpServletRequest multipartHttpServletRequest=(MultipartHttpServletRequest) request;
		MultipartFile file1=multipartHttpServletRequest.getFile("file");
		//file1.getInputStream();
		
		//这个是返回绝对路径
		String path=request.getSession().getServletContext().getRealPath("/");
        
		ReadExcels readExcels = new ReadExcels();
		try {
			//这个是返回相对路径
			String filepath=UpLoadUtil.saveFile(file1, path);
			String truepath=path+filepath;
			List<List<Object>> excleDataList = readExcels.readExcel(new File(truepath));
			for (int i = 1; i < excleDataList.size(); i++) {
				List<Object> list = excleDataList.get(i);//这里的list就是一行数据
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
	
	//导出为excel文件
	// 以excel的形式导出
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
		header.add("专业");
		header.add("年级");
		header.add("课程编号");
		header.add("课程名称");
		header.add("学分");
		header.add("总学时");
		header.add("理论学时");
		header.add("实验学时");
		header.add("上机学时");
		header.add("考试形式");
		header.add("课程类别");
		header.add("开课学期");
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
		
		String xtpath=request.getSession().getServletContext().getRealPath("/");//项目根目录
		String realpath=xtpath+"excel";
		System.out.println(realpath);
		/*try (OutputStream out = new FileOutputStream("D:/" + dateString + "test.xls") // 输出目的地
 
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
	
	
	//开始
	/**
	 * 查询培养计划表
	 * @param courseno
	 * @return 
	 */
	@RequestMapping("/selectQing.json")
	@ResponseBody
	public JsonData selectQing(TrainingProgram trainingProgram){
		if(trainingProgram.getCourseno().equals("")){
			return JsonData.fail("请输入课程编号");
		}else{
			return trainingProgramService.selectQing(trainingProgram);
		}
		
	}
	
	/**
	 * 上传教学大纲
	 * @param id
	 * @return 
	 */
	@RequestMapping("/uploadsyllabusPath")
	@ResponseBody
	public JsonData uploadsyllabusPath(MultipartFile file, TrainingProgram trainingProgram, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 保存文件到
		String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		trainingProgram.setSyllabuspath(filefath);
		int count = trainingProgramService.Uploadsyllabus(trainingProgram);
		return count > 0 ? JsonData.success(filefath) : JsonData.fail("修改失败!");
	}
	/**
	 * 上传授课计划
	 * @param id
	 * @return 
	 */
	@RequestMapping("/uploadTeachingPath")
	@ResponseBody
	public JsonData uploadTeachingPath(MultipartFile file, TrainingProgram trainingProgram, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 保存文件到
		String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		trainingProgram.setTeachingplanpath(filefath);
		int count = trainingProgramService.Uploadsyllabus(trainingProgram);
		return count > 0 ? JsonData.success(filefath) : JsonData.fail("修改失败!");
	}
	


}
