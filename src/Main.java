public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", "Black", 15);
        Student student1 = new Student("Anya", "White", 17);
        Student student2 = new Student("Fill", "Doll");

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

//        System.out.println(student.getGrade());
//        System.out.println(student1.getGrade());
        student.showSmile();
//        System.out.println(student.getAge());



    }
}