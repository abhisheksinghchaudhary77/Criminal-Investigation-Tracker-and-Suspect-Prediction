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
public class View_Evi_admin {
    private int id_cases, idofficers, points;
    private String evidence, type, suspect_name, note, date;
    
    public View_Evi_admin(int id_cases, String evidence, String type, String suspect_name, String note, int points, String date, int idofficers){
        this.id_cases = id_cases;
        this.evidence = evidence;
        this.type = type;
        this.suspect_name = suspect_name;
        this.note = note;
        this.points = points;
        this.date = date;
        this.idofficers = idofficers;
    }
    public int getcase_id(){
        return id_cases;
    }
    public String getevidence(){
        return evidence;
    }
    
    public String gettype(){
        return type;
    }
    
    public String getsus_name(){
        return suspect_name;
    }
    
    public String getnote(){
        return note;
    }
    
    public int getpoints(){
        return points;
    }
    public String getdate(){
        return date;
    }
    public int getidofficers(){
        return idofficers;
    }
}
