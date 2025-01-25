package multilevelinheritance.educationcourse;

public class Course {
    public String courseName;
    public int duration;

    public Course(String courseName , int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    public void display(){
        System.out.println("Course Details : ");
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration);

    }
}
