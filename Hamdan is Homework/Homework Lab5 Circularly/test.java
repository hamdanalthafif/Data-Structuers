public class test {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> Cl=new CircularlyLinkedList<>();
        System.out.println(Cl.isEmpty());
        Cl.AddFirst(1);
        Cl.AddLast(2);
        Cl.AddLast(3);
        Cl.AddLast(4);


        CircularlyLinkedList<Integer> Cl2=new CircularlyLinkedList<>();
        Cl2.AddFirst(1);
        Cl2.AddLast(2);
        Cl2.AddLast(6);
        Cl2.AddLast(4);


        System.out.println(Cl.Same(Cl2)); /**في هذه الدالة يجب ان يكون جميع العناصر متساويه عدا اول عنصر**/
        System.out.println(Cl.equals(Cl2));  /**في هذه الدالة يجب ان يكون جميع العناصر متساويه **/
        System.out.println(Cl.SizeFuntaion());  /**في هذه الدالة يتم طباعة الحجم او عدد العناصر**/
    }
}
