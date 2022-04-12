package classpart;

public class Student {

    int studentID;
    String studentName;
    int grade;
    String address;

    public Student() {}

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }

    public void showStudentInFor() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {

        int i = 10;

        Student studentLee = new Student(100, "이순신");
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        studentLee.showStudentInFor();
        studentKim.showStudentInFor();

    }
}
