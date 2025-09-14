package class_exercises_1;

public class course {
    private String name;
    private int timework;
    private teacher teacher;

    public course(){
        name = "";
        timework = 0;
        teacher = null;
    }
    public course(String name, int timework, teacher teacher) {
        this.name = name;
        this.timework = timework;
        this.teacher = teacher;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public int gettimework(){
        return timework;
    }
    public void settimework(int timework){
        this.timework = timework;
    }

    public teacher getteacher(){
        return teacher;
    }
    public void setteacher(teacher teacher){
        this.teacher = teacher;
    }
}
