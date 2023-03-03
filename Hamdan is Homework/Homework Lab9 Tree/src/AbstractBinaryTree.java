import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<E> extends  AbstractTree<E> implements BinaryTree<E> {
    {

        public Position<E> sibling (Position < E > p) {
        Position<E> par = parent(p);
        if (par == null) return null;
        if (left(par) != null) return right(p);
        else return left(p);
    }

        @Override
        public int numOfChildren (Position < E > p) {
        int c = 0;
        if (right(p) != null) c++;
        if (left(p) != null) c++;
        return c;
    }

        @Override
        public Iterable<Position<E>> children (Position < E > p) {
        List<Position<E>> all = new ArrayList<>(2);
        if (left(p) != null) all.add(left(p));
        if (right(p) != null) all.add(right(p));
        return all;
    }
    }
}
