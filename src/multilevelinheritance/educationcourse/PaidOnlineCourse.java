package multilevelinheritance.educationcourse;

public class PaidOnlineCourse extends OnlineCourse{
    public int fee;
    public int discount;

    public PaidOnlineCourse(String courseName , int duration , String platform,boolean isRecorded,int fee,int discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void display(){
        System.out.println("Online Paid Course : ");
        super.display();
        System.out.println("Fee : " + fee);
        System.out.println("Discount : " + discount);

    }
}