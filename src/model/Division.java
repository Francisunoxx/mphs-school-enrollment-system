/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * <p>
 * <h2>Division</h2>
 * <br>
 * is a class that represents a payment term's divisions. <br>
 * Payment Terms are :
 * <br>
 * 1.) Cash <br>
 * 2.) Semestral <br>
 * 3.) Quarterly <br>
 * 4.) Monthly <br>
 * <br>
 * For instance, 
 * <br>
 * * First Semester <br>
 * * Second Semester <br>
 * * First Quarter <br>
 * * Second Quarter <br>
 * * Third Quarter <br> and so on<br><br>... are all considered of type <b>Division</b>
 * <br>
 * </p>
 * 
 *
 * @author John Ferdinand Antonio
 */
public class Division {
    private int id;
    private String code;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
