package cbank.cust.entity;

import jakarta.persistence.*;

@Entity
@Table(name="feedback")
public class Feedback {
    @Id
    @GeneratedValue
    @Column(name="fid")
    private int fid;

    @Column(name="ftype")
    private String ftype;

    @Column(name="fname")
    private String fname;

    @Column(name="femail")
    private String femail;

    @Column(name="fmobile")
    private String fmobile;

    @Column(name="fstaff")
    private String fstaff;

    @Column(name="fbranch")
    private String fbranch;

    @Column(name="fdesc")
    private String fdesc;

 

    public int getFid() {
        return fid;
    }

 

    public void setFid(int fid) {
        this.fid = fid;
    }

 

    public String getFtype() {
        return ftype;
    }

 

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

 

    public String getFname() {
        return fname;
    }

 

    public void setFname(String fname) {
        this.fname = fname;
    }

 

    public String getFemail() {
        return femail;
    }

 

    public void setFemail(String femail) {
        this.femail = femail;
    }

 

    public String getFmobile() {
        return fmobile;
    }

 

    public void setFmobile(String fmobile) {
        this.fmobile = fmobile;
    }

 

    public String getFstaff() {
        return fstaff;
    }

 

    public void setFstaff(String fstaff) {
        this.fstaff = fstaff;
    }

 

    public String getFbranch() {
        return fbranch;
    }

 

    public void setFbranch(String fbranch) {
        this.fbranch = fbranch;
    }

 

    public String getFdesc() {
        return fdesc;
    }

 

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc;
    }



}