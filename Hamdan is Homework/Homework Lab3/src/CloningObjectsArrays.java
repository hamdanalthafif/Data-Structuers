import java.lang.reflect.Array;
import java.util.Arrays;

public class CloningObjectsArrays {
    public static void main(String[] args) {

        Student[] Student1=new Student[3];
        Student1[0]=new Student(11,"ahmed");
        Student1[1]=new Student(22,"hussein");
        Student1[2]=new Student(33,"saad");

        Student[] Student2=new Student[3];

        for (int i = 0; i < Student1.length; i++) {
            Student2[i]=Student1[i];
        }
        System.out.println(Arrays.toString(Student2));
    }
}

