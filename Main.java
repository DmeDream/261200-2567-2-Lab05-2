public class Main {
    public static void main(String[] args) {
        User john = new User("Jonh",1954,2,18);
        john.displayInfo();
        john.displayHappyBirthday();
        Admin nicolas = new Admin("nicolas",1964,12,18);
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        nicolas.displayHappyBirthday();
    }
}