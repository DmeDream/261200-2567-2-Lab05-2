import java.time.LocalDate;
public class Admin extends User {
    public Admin(){
        super();
    }
    public Admin(String name,int year,int month,int day){
        super(name,year,month,day);
    }

    public void displayInfo(boolean full){
        if(full == true){
            super.displayInfo();
            System.out.println("User type : admin");
            System.out.println("Today's : " +LocalDate.now());
        }
        else{
            System.out.println("Admin Name : " + name);
        }
    }
    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - dob.getYear();
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }

}