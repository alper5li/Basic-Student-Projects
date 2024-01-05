public class Student {
    private String fname;
    private String lname;
    private String id;

    private String stClass;
    private double percentage;
    private String grade;

    public Student(String lname, String fname, String id, double percentage,
                   String grade,String stClass) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        this.percentage = percentage;
        this.grade = grade;
        this.stClass=stClass;
    }
    public String getFirstName() {
        return fname;
    }
    public String getLastName() {
        return lname;
    }
    public String getID() {
        return id;
    }
    public double getPercentage() {
        return percentage;
    }
    public String getGrade() {
        return grade;
    }
    public String getStClass(){return stClass;}


}
