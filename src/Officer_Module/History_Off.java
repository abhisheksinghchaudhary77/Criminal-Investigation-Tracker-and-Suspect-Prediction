/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Officer_Module;

/**
 *
 * @author Abhishek S Chaudhary
 */
public class History_Off {
    private int id_cases, idofficers;
    private String history, date;
    
    public History_Off(int id_cases, String history, String date, int idofficers){
        this.id_cases = id_cases;
        this.history = history;
        this.date = date;
        this.idofficers = idofficers;
    }
    public int getcase_id(){
        return id_cases;
    }
    public String gethistory(){
        return history;
    }
    public String getdate(){
        return date;
    }
    public int getidofficers(){
        return idofficers;
    }
}
