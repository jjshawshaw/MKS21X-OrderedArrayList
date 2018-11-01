public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){}

  public NoNullArrayList(int startCap){
    super(startCap);
  }

  public boolean add(T newVal){
    if (newVal == null) throw IllegalArgumentException();
    else {
      super.add(newVal);
    }
  }

  public boolean set(T newVal){
    if (newVal == null) throw IllegalArgumentException();
    else {
      super.set(newVal);
    }
  }
}
