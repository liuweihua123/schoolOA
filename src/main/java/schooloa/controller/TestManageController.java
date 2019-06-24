package schooloa.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.util.SystemOutLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import schooloa.bean.TestManage;
import schooloa.service.TestManageService;
import schooloa.util.JsonData;
import schooloa.util.PageResult;
import schooloa.util.UpLoadUtil;

@Controller
public class TestManageController {
	@Autowired
	TestManageService manageService;
	/**
	 * 条件查询
	 * @param professional，classname，courseno，page
	 * @return 
	 */
	@RequestMapping("/selectQig")
	@ResponseBody
	public JsonData selectmanage(String professional,String classname,String courseno,int page){
		List<Map<String,Object>> list=manageService.gettestm(professional, classname, courseno,page);
		Integer count=manageService.gettestm2(professional, classname, courseno);
		PageResult<Map<String ,Object>> pagedata = new PageResult<>(list, count);
		return JsonData.success(pagedata);
		
	}
	
	/**
	 * 上传考试试卷
	 * @param id
	 * @return 
	 */
	@RequestMapping("/inserttestPaperPath")
	@ResponseBody
	public JsonData inserttestPaperPath(MultipartFile file, TestManage testManage, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		testManage.setTestpaperpath(filefath);
		int count = manageService.inserttestPaperPath(testManage);
		return count > 0 ? JsonData.success(filefath) : JsonData.fail("修改失败!");
	 }
	/**
	 * 上传试卷答案
	 * @param id
	 * @return 
	 */
	@RequestMapping("/inserttestAnswerPath")
	@ResponseBody
	 public JsonData inserttestAnswerPath(MultipartFile file, TestManage testManage, HttpServletRequest request)
			 throws IllegalStateException, IOException {
		 String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		 testManage.setTestanswerpath(filefath);
		 int count = manageService.inserttestAnswerPath(testManage);
		 return count > 0 ? JsonData.success(filefath) : JsonData.fail("修改失败!");
	 }
	/**
	 * 上传上机压缩包
	 * @param id
	 * @return 
	 */
	@RequestMapping("/insertcomputerTestPath")
	@ResponseBody
	 public JsonData insertcomputerTestPath(MultipartFile file, TestManage testManage, HttpServletRequest request)
			 throws IllegalStateException, IOException {
		 String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		 testManage.setComputertestpath(filefath);
		 int count = manageService.insertcomputerTestPath(testManage);
		 return count > 0 ? JsonData.success(filefath) : JsonData.fail("修改失败!");
	 }
	/**
	 * 上传电子成绩单
	 * @param id
	 * @return 
	 */
	@RequestMapping("/inserttranscriptPath")
	@ResponseBody
	 public JsonData inserttranscriptPath(MultipartFile file, TestManage testManage, HttpServletRequest request)
			 throws IllegalStateException, IOException {
		 String filefath=UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		 testManage.setTranscriptpath(filefath);
		 int count = manageService.inserttranscriptPath(testManage);
		 return count > 0 ? JsonData.success(filefath) : JsonData.fail("修改失败!");
	 }
	/**
	 * 删除列表数据
	 * @param id
	 * @return 
	 */
	@RequestMapping("/deletetestmanage")
	@ResponseBody
	public JsonData deletetextmanage(TestManage testManage){
		 int count=manageService.deletetestmanage(testManage);
		 return count > 0 ? JsonData.success() : JsonData.fail("删除失败!");
	 }
	
	/**
	 * 修改列表数据
	 * @param id
	 * @return 
	 */
	@RequestMapping("/updatetestmanage")
	@ResponseBody
	public JsonData updatetestmanage(TestManage testManage){
		 int count=manageService.updatetestmanage(testManage);
		 return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	 }
	
	/**
	 * 插入列表数据
	 * @param id
	 * @return 
	 */
	@RequestMapping("/inseerttmanage")
	@ResponseBody
	public JsonData inseerttmanage(TestManage testManage){
		 int count=manageService.updatetestmanage(testManage);
		 return count > 0 ? JsonData.success() : JsonData.fail("插入失败!");
	 }
	
}
