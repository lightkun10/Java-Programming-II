package Quiz_Class_diagram_with_yUML_service_help;

public class Class {

    private Teacher teacher;
    private String course;

    public Class(Teacher teacher, String course) {
       this.teacher = teacher;
       this.course = course;
    }

    public void printInformation() {
        System.out.println(this.course + ", teacher: " + this.teacher);
    }

}
