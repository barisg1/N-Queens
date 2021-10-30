public class TestMyArrayList 
{
    public static void main(String[] args) 
    {
        MyArrayList<Integer> lst = new MyArrayList<>();
        
        System.out.println("Array List : " +  lst );
        System.out.println("The size of the array list is : " + lst.size());  
        System.out.println("Is array list empty : " + lst.isEmpty());

        for(int i=0; i<10; i++)
            lst.add(i);
        
        System.out.println("Array List : " +  lst ); 
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Is array list empty : " + lst.isEmpty());
        
        lst.add(5, 10);
        
        System.out.println("Array List : " +  lst );
        System.out.println("The size of the array list is : " + lst.size());
        
        int value = lst.get(8);
        
        System.out.println("The value at index 8 is : " + value);
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Array List : " +  lst );
        
        lst.set(9,11);
        
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Array List : " +  lst );
        
        lst.remove(4);
        
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Array List : " +  lst ); 
        
        lst.clear();
        
        System.out.println("Array List : " +  lst );
        System.out.println("The size of the array list is : " + lst.size());  
        System.out.println("Is array list empty : " + lst.isEmpty());
    }  
}
