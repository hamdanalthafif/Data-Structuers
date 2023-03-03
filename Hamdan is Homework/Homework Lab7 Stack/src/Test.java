public class Test {

    public static void main(String[] args) {



        LinkedStack <Integer>s=new LinkedStack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.size());
        s.removeAll();
        System.out.println(s.size());
        System.out.println(s.popbottom());
    }
}
