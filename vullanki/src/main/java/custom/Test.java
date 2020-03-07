package custom;
public class Test
{
    public static void main(String[] args) 
    {
    	Collection_L<String>sample = new Collection_L<String>();
        sample.add("abc123");
        sample.add("def456");
        sample.add("9999");
        sample.add("dhiraj");
        System.out.println("Full List: "+sample);
        System.out.println("capacity: "+sample.size());
        sample.remove(1);
        sample.remove(2);
        System.out.println("The List after removing abc123,dhiraj: "+sample);
        System.out.println("The Size of the list after remove operation: "+sample.size());
        System.out.println("The element at index1 is : "+sample.get(1) );
    }
}