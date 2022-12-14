package admin.crud.entity;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table
public class Issues {



   
    @Id
    @GeneratedValue
    @Column(name="iid")
    private int id;
    
    @Column(name="iname")
    private String iname;
    
    @Column(name="iaccno")
    private String  iaccno;
    
    @Column(name="iemail")
    private String iemail;
    
    @Column(name="imobile")
    private String imobile;
    
    @Column(name="idate")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@Temporal(TemporalType.DATE)
    private String idate;
    
    @Column(name="itype")
    private String itype;
    
    @Column(name="idesc")
    private String idesc;



   public int getId() {
        return id;
    }



   public void setId(int id) {
        this.id = id;
    }



   public String getIname() {
        return iname;
    }



   public void setIname(String iname) {
        this.iname = iname;
    }



   public String getIaccno() {
        return iaccno;
    }



   public void setIaccno(String iaccno) {
        this.iaccno = iaccno;
    }



   public String getIemail() {
        return iemail;
    }



   public void setIemail(String iemail) {
        this.iemail = iemail;
    }



   public String getImobile() {
        return imobile;
    }



   public void setImobile(String imobile) {
        this.imobile = imobile;
    }



   public String getIdate() {
        return idate;
    }



   public void setIdate(String idate) {
        this.idate = idate;
    }



   public String getItype() {
        return itype;
    }



   public void setItype(String itype) {
        this.itype = itype;
    }



   public String getIdesc() {
        return idesc;
    }



   public void setIdesc(String idesc) {
        this.idesc = idesc;
    }
    
    
    



   
}