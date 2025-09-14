package class_exercises_1;

public class Main {
    public static void main(String[] args){

        teacher x = new teacher();
        x.setname("David Malan");
        x.setspeciality("Computer Science");

        course y = new course();
        y.setname("CS50");
        y.setteacher(x);
        y.settimework(4);

        student z = new student();
        z.setname("Thiago Medeiros");
        z.setage(21);

        student z1 = new student();
        z1.setname("Thiago Medeiros");
        z1.setage(21);
        z1.setcourse(y);
 
        z1.datashow();
        
    }

}
