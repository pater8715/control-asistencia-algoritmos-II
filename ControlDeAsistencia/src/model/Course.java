package model;

/**
 * @author ALBERTO
 */
public class Course {

    private int id;
    private String name;
    private String classroom;
    private final Student[] students;
    private Teacher teacher;

    /**
     * @return the id course
     */
    public int getId() {
        return id;
    }

    public Course(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    /**
     * @param id the id course to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name of the course
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name course to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the classroom of the course
     */
    public String getClassroom() {
        return classroom;
    }

    /**
     * @param classroom the classroom of the course
     */
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    /**
     * @param pos position to set
     * @return the student the position set
     */
    public Student getStudent(int pos) {
        return students[pos];
    }

    /**
     * @param student the student to set
     * @param pos     position of the student in array
     */
    public void setStudent(Student student, int pos) {
        this.students[pos] = student;
    }

    /**
     * @return the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * @return size of the array students
     */
    public int size() {
        return students.length;
    }
}
