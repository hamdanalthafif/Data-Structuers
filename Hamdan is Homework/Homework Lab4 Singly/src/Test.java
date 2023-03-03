import java.io.Serializable;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> S=new SinglyLinkedList<>();

        System.out.println(S.isEmpty());
        System.out.println(S.size());

        S.addFirst(1);
        S.addLast(2);
        S.addLast(3);
        S.addFirst(4);

        System.out.println("  ");

        SinglyLinkedList<Integer> Ss=new SinglyLinkedList<>();
        Ss.addFirst(5);
        Ss.addLast(6);
        Ss.addLast(7);
        Ss.addFirst(8);


        System.out.println(S.Last());

//        while (!S.isEmpty())
//         System.out.print(S.printLinkedList()+"\t");

        S.SLL2(Ss);
        System.out.println(S.size());
        while (!S.isEmpty())
        {
            System.out.print(S.removeFirst()+" ");


       // S.rotate();
    }
}}
