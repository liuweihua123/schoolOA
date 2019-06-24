package schooloa.bean;

import java.util.Date;

public class TestManage {
    private Integer id;

    private String professional;

    private String classname;

    private String courseno;

    private String testpaperpath;

    private String testanswerpath;

    private String computertestpath;

    private String transcriptpath;

    private Date posttime;

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

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getCourseno() {
        return courseno;
    }

    public void setCourseno(String courseno) {
        this.courseno = courseno == null ? null : courseno.trim();
    }

    public String getTestpaperpath() {
        return testpaperpath;
    }

    public void setTestpaperpath(String testpaperpath) {
        this.testpaperpath = testpaperpath == null ? null : testpaperpath.trim();
    }

    public String getTestanswerpath() {
        return testanswerpath;
    }

    public void setTestanswerpath(String testanswerpath) {
        this.testanswerpath = testanswerpath == null ? null : testanswerpath.trim();
    }

    public String getComputertestpath() {
        return computertestpath;
    }

    public void setComputertestpath(String computertestpath) {
        this.computertestpath = computertestpath == null ? null : computertestpath.trim();
    }

    public String getTranscriptpath() {
        return transcriptpath;
    }

    public void setTranscriptpath(String transcriptpath) {
        this.transcriptpath = transcriptpath == null ? null : transcriptpath.trim();
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }
}