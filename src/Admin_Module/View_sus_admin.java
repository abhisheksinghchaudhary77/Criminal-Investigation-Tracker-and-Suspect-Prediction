/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Module;

/**
 *
 * @author Abhishek S Chaudhary
 */
public class View_sus_admin {
    private int id_cases;
    private String nameofsus, mobile, address, relation, date, note;
    
    public View_sus_admin(int id_cases, String nameofsus, String mobile, String address, String relation, String date, String note){
        this.id_cases = id_cases;
        this.nameofsus = nameofsus;
        this.mobile = mobile;
        this.address = address;
        this.relation = relation;
        this.date = date;
        this.note = note;
    }

    View_sus_admin(int aInt, String string, String string0, String string1, String string2, String string3, String string4, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getcase_id(){
        return id_cases;
    }
    public String getsusname(){
        return nameofsus;
    }
    
    public String getmobile(){
        return mobile;
    }
    
    public String getaddress(){
        return address;
    }
    
    public String getrelation(){
        return relation;
    }
    
    public String getdate(){
        return date;
    }
    public String getnote(){
        return note;
    }
}
