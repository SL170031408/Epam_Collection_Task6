package custom;
import java.util.Arrays;

public class Collection_L<List1> 
{
    private int sz = 0;
    private static final int it_is_cap = 10;
    private Object items[ ];
    public Collection_L() 
    {
        items = new Object[it_is_cap];
    }
    public void add(List1 l)
    {
        if (sz == items.length)
        {
            CheckCapacity();
        }
        items[sz++] = l;
    }

    @SuppressWarnings("unchecked")
	public List1 get(int i)
    {
        if (i >= sz || i < 0) 
        {
            throw new IndexOutOfBoundsException("Position " + i + ", Size " + i);
        }
        return (List1) items[i];
    }
    @SuppressWarnings("unchecked")
	public List1 remove(int i) 
    {
        if (i >= sz || i < 0)
        {
            throw new IndexOutOfBoundsException("Position " + i + ", Size " + i);
        }
        Object item = items[i];
        int no_of_elements = items.length - ( i + 1 ) ;
        System.arraycopy( items, i + 1, items, i, no_of_elements ) ;
        sz--;
        return (List1) item;
    }
    public int size() {
        return sz;
    }
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < sz ;i++) {
             sb.append(items[i].toString());
             if(i<sz-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void CheckCapacity() {
        int newSize = items.length * 2;
        items = Arrays.copyOf(items, newSize);
    }
}