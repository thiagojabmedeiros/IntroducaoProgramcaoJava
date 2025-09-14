package class_exercises_1;

public class student {
    private String name;
    private int age;
    private course course;
    
    public student(){}
    public student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public student(String name, int age, course course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }

    public course getcourse(){
        return course;
    }
    public void setcourse(course course){
        this.course = course;
    }

    public void datashow(){
        System.out.println("Student: " + name + ", Age: " + age);
        if (course != null){
            System.out.println("Course: " + course.getname() + ", Timework: " + course.gettimework());
        }
        if(course.getteacher() != null){
            System.out.println("Teacher: " + course.getteacher().getname() + ", Speciality: " + course.getteacher().getspeciality());
        }
    }

}
