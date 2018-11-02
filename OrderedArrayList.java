public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){}

  public OrderedArrayList(int startCap){
    super(startCap);
  }

  private int findIndex(T value){
    int out = 0;
    for (int i = 0; i < size() - 1; i++) {
      if (get(i).compareTo(get(i + 1)) < 0) return out;
      else out++;
    }
    return out;
  }

  public boolean add(T newVal){
    super.add(findIndex(newVal), newVal);
    return true;
  }

  public void add(int index, T newVal){
    if (index == size() && get(index).compareTo(get(index + 1)) > 0) throw new IllegalArgumentException();
    else {
      super.add(index, newVal);
    }
  }

  public T set(int index, T newVal){
    add(newVal);
    return remove(index);
  }
}
