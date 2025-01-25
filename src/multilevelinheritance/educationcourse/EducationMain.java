package multilevelinheritance.educationcourse;

import java.time.Year;

public class EducationMain {
    public static void main(String[] args){
        Course c1 = new OnlineCourse("Java",2,"Zoom", true);
        OnlineCourse o1 = new PaidOnlineCourse("C++",3,"GoogleMeet",false,20000,500);
        c1.display();
        o1.display();
    }
}
