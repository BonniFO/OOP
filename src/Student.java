public class Student {
    public String name;
    public String surname;
    protected int age;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
   }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade(){
        return age -6;
    }

    public void showSmile(){
        System.out.println("@    @");
        System.out.println("      ");
        System.out.println("^^^^^^");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
