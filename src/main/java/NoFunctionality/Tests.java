package NoFunctionality;
public class Tests {

    public static void main(String[] args) {
        User u1 = new User("mail1", "asdfasdfasdf", "Student");
        User u2 = new User("mail2", "asdfasdfasdf", "Student");
        User u3 = new User("mail3", "asdfasdfasdf", "Student");
        User u4 = new User("mail4", "asdfasdfasdf", "Student");
        System.out.println(u1.getUserID());
        System.out.println(u2.getUserID());
        System.out.println(u3.getUserID());
        System.out.println(u4.getUserID());
    }
}
