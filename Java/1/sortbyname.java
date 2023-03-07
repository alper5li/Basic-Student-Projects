
import java.util.*;



    public class sortbyname implements Comparator<Student> {
        public int compare(Student p1, Student p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }

    }


