package class_exercises_1;

public class teacher {
    private String name;
    private String speciality;
    
    public teacher(){
        name = "";
        speciality = "";
    }
    public teacher(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getspeciality(){
        return speciality;
    }
    public void setspeciality(String speciality){
        this.speciality = speciality;
    }
    
        
}
    

