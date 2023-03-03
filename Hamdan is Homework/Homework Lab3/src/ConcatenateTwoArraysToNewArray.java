import java.util.Arrays;

public class ConcatenateTwoArraysToNewArray {
    public static void main(String[] args) {

        Student[] Student1=new Student[3];
        Student1[0]=new Student(11,"ahmed");
        Student1[1]=new Student(22,"hussein");
        Student1[2]=new Student(33,"saad");

        Student[] Student2=new Student[3];
        Student2[0]=new Student(44,"hamdan");
        Student2[1]=new Student(55,"mohammed");
        Student2[2]=new Student(66,"fatima");

        Student[] Student3=new Student[6];


        int j=0;
        for (int i = 0; i <6; i++) {
            if (i<=2)
            Student3[i]=Student1[i];
            else
            {Student3[i]=Student2[j];
                  j++;
                }

        }
        System.out.println(Arrays.toString(Student3)); /** cout Student3 array**/
    }
}
