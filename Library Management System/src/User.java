/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAYE
 */
class User {
    
    private int sno,studentid;
    private String firstname,lastname,status,school;
    
    public User(int sno, int studentid, String firstname, String lastname, String status, String school){
        
        this.sno=sno;
        this.studentid=studentid;
        this.firstname=firstname;
        this.lastname=lastname;
        this.status=status;
        this.school=school;
        
    }
    public int getsno(){
        return sno;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return firstname;
    }
    public String getstatus(){
        return status;
    }
    public String getschool(){
        return school;
    }

    Object getstudentid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
