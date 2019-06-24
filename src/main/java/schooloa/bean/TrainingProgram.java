package schooloa.bean;

import java.util.Date;


public class TrainingProgram  {
    /**
	 * 
	 */

	private Integer id;

    private String professional;
    
    private String grade;
    
    private String courseno;
    
    private String coursename;
    
    private Double credit;
    
    private Double totalhour;
    
    private Double theoryhour;
    
    private Double experimenthour;
    
    private Double computerhour;
    
    private String testform;
    
    private String coursetype;
    
    private String beginsemester;
   
    private String syllabuspath;
   
    private String teachingplanpath;
 
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getCourseno() {
        return courseno;
    }

    public void setCourseno(String courseno) {
        this.courseno = courseno == null ? null : courseno.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getTotalhour() {
        return totalhour;
    }

    public void setTotalhour(Double totalhour) {
        this.totalhour = totalhour;
    }

    public Double getTheoryhour() {
        return theoryhour;
    }

    public void setTheoryhour(Double theoryhour) {
        this.theoryhour = theoryhour;
    }

    public Double getExperimenthour() {
        return experimenthour;
    }

    public void setExperimenthour(Double experimenthour) {
        this.experimenthour = experimenthour;
    }

    public Double getComputerhour() {
        return computerhour;
    }

    public void setComputerhour(Double computerhour) {
        this.computerhour = computerhour;
    }

    public String getTestform() {
        return testform;
    }

    public void setTestform(String testform) {
        this.testform = testform == null ? null : testform.trim();
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype == null ? null : coursetype.trim();
    }

    public String getBeginsemester() {
        return beginsemester;
    }

    public void setBeginsemester(String beginsemester) {
        this.beginsemester = beginsemester == null ? null : beginsemester.trim();
    }

    public String getSyllabuspath() {
        return syllabuspath;
    }

    public void setSyllabuspath(String syllabuspath) {
        this.syllabuspath = syllabuspath == null ? null : syllabuspath.trim();
    }

    public String getTeachingplanpath() {
        return teachingplanpath;
    }

    public void setTeachingplanpath(String teachingplanpath) {
        this.teachingplanpath = teachingplanpath == null ? null : teachingplanpath.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}