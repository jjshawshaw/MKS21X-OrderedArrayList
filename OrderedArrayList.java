public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){}

  public OrderedArrayList(int startCap){
    super(startCap);
  }

  private int findIndex(T value){
    if (value == null) throw new IllegalArgumentException();
    int out = 0;
    for (int i = 0; i < size() - 1; i++) {
      if (value.compareTo(get(i)) < 0) return out;
      else out++;
    }
    return out;
  }

  public boolean add(T newVal){
    super.add(findIndex(newVal), newVal);
    return true;
  }

  public void add(int index, T newVal){
      this.add(newVal);
  }

  public T set(int index, T newVal){
    T out = get(index);
    add(newVal);
    remove(index);
    return out;
  }
}
