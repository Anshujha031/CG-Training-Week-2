package multilevelinheritance.educationcourse;

public class OnlineCourse extends Course{

    public String platform;
    public boolean isRecorded;

    public OnlineCourse(String courseName , int duration , String platform,boolean isRecorded){
        super(courseName , duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void display(){
        System.out.println("Online Courses");
        super.display();
        System.out.println("Platform : " + platform);
        System.out.println("isRecorded : " + isRecorded);
    }

}
