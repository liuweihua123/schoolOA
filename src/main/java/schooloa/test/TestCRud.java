package schooloa.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import schooloa.bean.ToolsList;
import schooloa.bean.TrainingProgram;
import schooloa.bean.TrainingProgramExample;
import schooloa.bean.UserPermissions;
import schooloa.dao.ToolsListMapper;
import schooloa.service.TrainingProgramService;
import schooloa.service.UserInfoService;
import schooloa.service.UserPermissionsService;
import schooloa.util.ReadExcels;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestCRud {

	@Autowired
	UserPermissionsService userPS;

	@Autowired
	UserInfoService userinforser;

	@Autowired
	TrainingProgramService trainingProgramService;
	
	@Autowired
	ToolsListMapper toolsListMapper;

	public void test() {
		List<UserPermissions> list = userPS.getUserPermission();
		for (UserPermissions userPermissions : list) {
			System.out.println(userPermissions.getJobnumber() + " " + userPermissions.getRole());

		}
	}

	@Test
	@Ignore
	public void test2() {
		List<UserPermissions> list = userPS.getUPANDUI();
		for (UserPermissions userPermissions : list) {
			System.out.println(userPermissions.getlUserInfos().get(0).getEducation());
		}
	}

	@Test
	@Ignore
	public void test3() {
		TrainingProgram trainingProgram = new TrainingProgram();
		trainingProgram.setProfessional("���պ���");
		TrainingProgram trainingProgram2 = new TrainingProgram();
		trainingProgram2.setProfessional("��ľ����");

		List<TrainingProgram> list = new ArrayList<>();
		list.add(trainingProgram);
		list.add(trainingProgram2);
		for (TrainingProgram trainingProgram3 : list) {
			trainingProgramService.insertListbyOne(trainingProgram3);
		}
	}

	@Test
	@Ignore
	public void test4() {
		ReadExcels readExcels = new ReadExcels();
		try {
			List<List<Object>> excleDataList = readExcels.readExcel(new File("D:\\a.xlsx"));
			for (int i = 1; i < excleDataList.size(); i++) {
				List<Object> list = excleDataList.get(i);//�����list����һ������

				//System.out.println(list);//���һ�����ݣ��������3��
				//System.out.println(list.get(0));
				//System.out.println(list.get(1));//���һ������ĵ�һ�����ݣ��������3��
				//System.out.println();
				//System.out.println(list.get(2));
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
			e.printStackTrace();
		}
	}
	
	@Test
	@Ignore
	public void Test5()
	
	{
		List<TrainingProgram> list=trainingProgramService.getAllExcel();
		
		for (TrainingProgram trainingProgram : list) {
			System.out.println(trainingProgram.getExperimenthour());
		}
	}
	
	@Test
	@Ignore
	public void tst()
	{
		int count=trainingProgramService.getAllExcelCount();
		System.out.println("���ݿ��������ǣ�"+count);
	}
	
	@Test
	@Ignore
	public void test1()
	{
		TrainingProgram trainingProgram=new TrainingProgram();
		trainingProgram.setId(40);
		trainingProgram.setProfessional("ũѧ");
		TrainingProgramExample trainingProgramExample=new TrainingProgramExample();
		int count=trainingProgramService.UpdateTrinPro(trainingProgram, trainingProgramExample);
		if (count>0) {
			System.out.println("�ɹ�");
			
		}else
		{
			System.out.println("ʧ��");
		}
	}
	
	@Test
	@Ignore
	public void testr()
	{
		String role="1";
		String professional="�������";
		List<UserPermissions> list=userPS.getUPAndUiByRoleAndProfessional(role, professional);
		for (UserPermissions userPermissions : list) {
			System.out.println(userPermissions.getlUserInfos());
		}
		
	}
	@Test
	public void test55()
	{
		String time="2015";
		String semester="��һѧ��";
		String professional="�������";
		ToolsList toolsList=toolsListMapper.selectByTimeAndSemeterAndProfessional(time, semester, professional);
		System.out.println(toolsList.getAsichouganjia());
	}
	

}
