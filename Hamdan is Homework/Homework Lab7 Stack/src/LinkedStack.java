public class LinkedStack<E> implements Stack{
    SinglyLinkedList<E> list = new SinglyLinkedList<>();
    @Override
    public boolean isEmpty() {return list.isEmpty();}

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {return list.first();}

    @Override
    public void push(Object e) {list.addFirst((E) e);
    }

    @Override
    public Object pop() {return list.removeFirst();
    }


    public void printListReverse(LinkedStack<E> list) {
        LinkedStack<E> stack = new LinkedStack<>();
        while (!list.isEmpty()) stack.push(list.pop());
        list = stack;
        while (!list.isEmpty()) System.out.println(stack.pop());
    }

    public static <E> E popBottom(LinkedStack<E> stack) {
        while (!stack.isEmpty()) {
            E t = (E) stack.pop();
            if (stack.isEmpty()) return t;
        }
        return null;
//        while (stack.size()!=1)stack.pop();
//        return stack.top();
    }

    public E bottom() {
        while (this.size() != 1) this.pop();
        return this.top();
    }

    public E popbottom() {
        while (!this.isEmpty()) {
            E t = (E) this.pop();
            if (this.isEmpty()) return t;
        }
        return null;
    }

    public void transfer(Stack<E> S,Stack<E> T)
    {
        while (!S.isEmpty())
        {
            T.push(S.pop());
        }
    }
    public void removeAll()
    {
        while (!isEmpty())
        {
            pop();
        }
    }
}
