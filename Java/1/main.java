import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        Student Alper1 = new Student("Alper","Beşli","190209030",30,"80","11A");
        Student Alper2 = new Student("Beşli","Alper","190209030",57,"44","12B");

        System.out.println("_______Alper_1__________");
        System.out.println(stInfo(Alper1));
        System.out.println(stCalc(Alper1));
        System.out.println("_______Alper_2__________");
        System.out.println(stInfo(Alper2));
        System.out.println(stCalc(Alper2));
        System.out.println("_____________________________");

    }



    public static String stCalc(Student name)
    {

        String x = name.getGrade();
        System.out.println("Grade :"+x);
        int xtoint = Integer.valueOf(x);
        double y = name.getPercentage();
        System.out.println("Percentage :"+y);
        double z = (xtoint*y)/100;
        return "Score : "+z;
    }
public static String stInfo(Student name){
        return "\n First Name: "+name.getFirstName()+"\n Last Name: "+name.getLastName()+"\n Grade: "+name.getGrade()+"\n ID: "+name.getID()+"\n Percentage: "+name.getPercentage()+"\n Class: "+name.getStClass()+"\n\n";
}







}
