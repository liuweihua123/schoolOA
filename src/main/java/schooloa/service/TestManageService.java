package schooloa.service;

import java.util.List;
import java.util.Map;

import javax.xml.soap.Text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schooloa.bean.TestManage;
import schooloa.bean.TestManageExample;
import schooloa.dao.TestManageMapper;

@Service
public class TestManageService {
	@Autowired
	TestManageMapper manageMapper;
	public List<Map<String, Object>> gettestm(String professional,String classname,String courseno,Integer page)
	{
		
		if (page == null || page <= 0) {
			int page1 = 1;
			return manageMapper.selectTestManngerhavep(professional, classname, courseno,page1);
		}else{
			int page1=(page-1)*15;
			return manageMapper.selectTestManngerhavep(professional, classname, courseno,page1);
		}
		
	}
	
	public Integer gettestm2(String professional,String classname,String courseno)
	{
			return manageMapper.selectTestManngerhavep2(professional, classname, courseno);
	}
	
	
	
	
	 public int inserttestPaperPath(TestManage testManage){
		return manageMapper.updateByPrimaryKeySelective(testManage);
	 }
	 public int inserttestAnswerPath(TestManage testManage){
		return manageMapper.updateByPrimaryKeySelective(testManage);
	 }
	 public int insertcomputerTestPath(TestManage testManage){
			return manageMapper.updateByPrimaryKeySelective(testManage);
	 }
	 public int inserttranscriptPath(TestManage testManage){
			return manageMapper.updateByPrimaryKeySelective(testManage);
	 }
	 
	 public int deletetestmanage(TestManage testManage){
		int id=testManage.getId();
		return manageMapper.deleteByPrimaryKey(id);
		 
	 }
	 
	 public int updatetestmanage(TestManage testManage){
		 TestManageExample example =new TestManageExample();
		 example.createCriteria().andIdEqualTo(testManage.getId());
		 return manageMapper.updateByExampleSelective(testManage, example);
	 }
	 
	 
	 public int inserttestmanage(TestManage testManage){
		 return manageMapper.insertSelective(testManage);
	 }
	 
}
