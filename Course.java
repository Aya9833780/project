import java.util.ArrayList;
class Course extends Student implements Admin {
    String courseid;
    String courseName;
    int credits;
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();


    public Course(String courseName, String courseid, int credits, String id, String name, String email) {
        super(id, name, email);

        this.courseid = courseid;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String toString() {
        return super.toString() +
                "course name : " + courseName + "course id : " + courseid + "credit id : " + credits;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void AllStudent() {
        for (Student student : students) {
            System.out.println("Student name " + student);
        }

    }

    @Override
    public void addcourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public void printCourse() {
        for (Course course : courses) {
            System.out.println(course);
        }


    }
}


