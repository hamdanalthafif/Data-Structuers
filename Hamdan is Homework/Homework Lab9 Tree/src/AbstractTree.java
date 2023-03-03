public abstract class  AbstractTree <E> implements Tree<E>{

    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean isInternal(Position<E> p) {
        return numOfChildren(p)>0;
    }

    @Override
    public boolean isExternal(Position<E> p) {
        return numOfChildren(p)==0;
    }

    @Override
    public boolean isRoot(Position<E> p) {
        return p==root();
    }

}
