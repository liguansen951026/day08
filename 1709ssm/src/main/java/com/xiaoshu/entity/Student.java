package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "stu_tb")
public class Student implements Serializable {
    @Id
    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_sex")
    private String sSex;

    @Column(name = "s_hobby")
    private String sHobby;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "s_birth")
    private Date sBirth;

    @Column(name = "m_id")
    private Integer mId;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Transient
    private String start;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Transient
    private String end;
    
    public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	@Transient
    private Major major;
    
    public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	private static final long serialVersionUID = 1L;

    /**
     * @return s_id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * @param sId
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * @return s_name
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName
     */
    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    /**
     * @return s_sex
     */
    public String getsSex() {
        return sSex;
    }

    /**
     * @param sSex
     */
    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    /**
     * @return s_hobby
     */
    public String getsHobby() {
        return sHobby;
    }

    /**
     * @param sHobby
     */
    public void setsHobby(String sHobby) {
        this.sHobby = sHobby == null ? null : sHobby.trim();
    }

    /**
     * @return s_birth
     */
    public Date getsBirth() {
        return sBirth;
    }

    /**
     * @param sBirth
     */
    public void setsBirth(Date sBirth) {
        this.sBirth = sBirth;
    }

    /**
     * @return m_id
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * @param mId
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    @Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sSex=" + sSex + ", sHobby=" + sHobby + ", sBirth="
				+ sBirth + ", mId=" + mId + ", start=" + start + ", end=" + end + ", major=" + major + "]";
	}
}