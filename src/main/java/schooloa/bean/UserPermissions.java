package schooloa.bean;

import java.util.List;

public class UserPermissions {
    private Integer id;

    private String role;

    private String jobnumber;

    private String password;

    private String professional;
    
    private List<UserInfo> lUserInfos;//���ݿ�����û�У�����Ϊ�����г����е�userinfo

    public List<UserInfo> getlUserInfos() {
		return lUserInfos;
	}

	public void setlUserInfos(List<UserInfo> lUserInfos) {
		this.lUserInfos = lUserInfos;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber == null ? null : jobnumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }
}