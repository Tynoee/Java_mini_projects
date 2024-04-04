public class Student {
    String name;
    int studentId;
    char gradeLevel;

    public Student(String name, int studentId, char gradeLevel) {
        this.name = name;
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getGradeLevel() {
        return gradeLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        if (studentId > 0) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid!  ID must be a positive integer.");
        }
    }

    public void setGradeLevel(char gradeLevel) {
        if (gradeLevel >= 'A' && gradeLevel <= 'E') {
            this.gradeLevel = gradeLevel;
        } else {
            System.out.println("Invalid grade level. Grade level must be a character from A to E.");
        }
    }

    public static void main(String[] args) {
        
        Student student1 = new Student("Tinotenda Chidume", 43981 , 'A');
        System.out.println("Student name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Grade level: " + student1.getGradeLevel());

    }
}
