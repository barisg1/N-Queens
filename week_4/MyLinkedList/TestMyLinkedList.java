public class TestMyLinkedList 
{
    public static void main(String[] args) 
    {
        MyLinkedList<Integer> lst = new MyLinkedList<>();
        
        System.out.println("Linked List : " +  lst );
        System.out.println("The size of the linked list is : " + lst.size());  
        System.out.println("Is linked list empty : " + lst.isEmpty());

        for(int i=0; i<10; i++)
            lst.add(i);
        
        System.out.println("Linked List : " +  lst ); 
        System.out.println("The size of the linked list is : " + lst.size());
        System.out.println("Is linked list empty : " + lst.isEmpty());
        
        lst.add(5, 10);
        
        System.out.println("Linked List : " +  lst );
        System.out.println("The size of the linked list is : " + lst.size());
        
        int value = lst.get(8);
        
        System.out.println("The value at index 8 is : " + value);
        System.out.println("The size of the linked list is : " + lst.size());
        System.out.println("Linked List : " +  lst );
        
        lst.set(9,11);
        
        System.out.println("The size of the linked list is : " + lst.size());
        System.out.println("Linked List : " +  lst );
        
        lst.remove(4);
        
        System.out.println("The size of the linked list is : " + lst.size());
        System.out.println("Linked List : " +  lst ); 
        
        lst.clear();
        
        System.out.println("Linked List : " +  lst );
        System.out.println("The size of the linked list is : " + lst.size());  
        System.out.println("Is linked list empty : " + lst.isEmpty()); 
    }  
}
