public class SLLStack<AnyType> 
{
    private Node<AnyType> theTop;
    private int theSize;
    
    public AnyType top() 
    {
        if (theSize == 0)
            throw new RuntimeException("Stack is empty!");
            
        return theTop.getData(); 
    }
	
    public void push(AnyType newData) 
    {
        Node<AnyType> newNode = new Node<>();
        newNode.setData(newData); 
        newNode.setNext(theTop);  
        theTop = newNode;         
        
        theSize++;
    }

     public AnyType pop()
     {  
        if (theSize == 0)
            throw new RuntimeException("Stack is empty!");
   
        AnyType returnValue = theTop.getData(); 
        theTop = theTop.getNext();      
        theSize--;                      
        
        return returnValue;
    }
    
    public int size() 
    { 
        return theSize;
    }

    public boolean isEmpty() 
    {
        return theSize == 0;
    }

    @Override
    public String toString() 
    {
        String rStr = "[ ";

        Node<AnyType> temp = theTop;
        for (int i=0; i<theSize; i++)
        {
            rStr = rStr + temp.getData() + " "; 
            temp = temp.getNext();             
        }
        rStr = rStr + "]";
        
        return rStr;
    }
}
