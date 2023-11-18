public class MaleStudent extends Student {
    private final String gender;

    public MaleStudent(String name, String surname, int age) {
        super(name, surname, age);
        this.gender = "male";
    }
}
