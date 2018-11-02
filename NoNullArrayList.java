import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){}

  public NoNullArrayList(int startCap){
    super(startCap);
  }

  public boolean add(T newVal){
    if (newVal == null) throw new IllegalArgumentException();
    else {
      super.add(newVal);
      return true;
    }
  }

  public void add(int index, T newVal){
    if (newVal == null) throw new IllegalArgumentException();
    else {
      super.add(index, newVal);
    }
  }


  public T set(int index, T newVal){
    if (newVal == null) throw new IllegalArgumentException();
    else {
      return super.set(index, newVal);
    }
  }
}
