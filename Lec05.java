//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lec05 {
public  static  void main(String[] args) {
    User john = new User("John", 1954, 12, 18);
    john.displayInfo();
    john.displayHappyBirthday();
    Admin nicolas = new Admin("nicolas", 1964, 12, 18);
    nicolas.displayInfo();
    nicolas.displayInfo(true);
    nicolas.displayInfo(false);
    nicolas.displayHappyBirthday();

}

}