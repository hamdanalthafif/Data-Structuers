import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {
    boolean isEmpty();
    int size();
    int numOfChildren(Position<E>p);
    boolean isInternal(Position<E>p);
    boolean isExternal(Position<E>p);
    boolean isRoot(Position<E>p);
    Position<E> root();
    Position<E> parent(Position<E> p);
    Iterable <Position<E>>children(Position<E>P);
    Iterator<E> iterator();
    Iterable<Position<E>> POSITIONS();    //all positions in tree
}
