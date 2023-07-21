public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();

    }
    static void checkAll(){
        checkCityRegister();
        checkWeeding();
        checkStudent();
        checkChildren();
    }
    static void checkCityRegister(){
        System.out.println("City Register is running");
    }

    static void checkWeeding(){
        System.out.println("Weeding check running");
    }

    static void checkStudent(){
        System.out.println("Student check running");
    }
    static void checkChildren(){
        System.out.println("Children check running");
    }
}
