

//practice problem 07

class Student {
    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Instructor {
    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public int getId() {
        return id;
    }
}

class Course {
    private int id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course(int id, String title, String syllabus, String credits, String prerequisite) {
        this.id = id;
        this.title = title;
        this.syllabus = syllabus;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public int getId() {
        return id;
    }
}

class CourseOffering {
    private int studentId;
    private int instructorId;
    private int courseId;
    private String time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(int studentId, int instructorId, int courseId, String time, 
                         int sectionNo, int roomId, int year, String semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }
}

public class Scenarion2 {
    
}
