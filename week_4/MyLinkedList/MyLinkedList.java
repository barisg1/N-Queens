public class MyLinkedList<AnyType> 
{
    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int theSize;
    
    public MyLinkedList()
    {
        clear();
    }
    
    public AnyType get(int idx)
    {
        if(idx<0 || idx>=theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        return getNode(idx).data;
    }
        
    public AnyType set(int idx, AnyType newVal)
    {
        if(idx<0 || idx>=theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;     
        p.data = newVal;   
        return oldVal;
    }
    
    public boolean add(AnyType x)
    {
        add(theSize, x);   
        return true;         
    }
    
    public void add(int idx, AnyType x)
    {
        if(idx<0 || idx>theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        Node<AnyType> p = getNode(idx);
        Node<AnyType> newNode = new Node<>(p.prev, x, p);
        newNode.prev.next = newNode;
        p.prev = newNode; 
        
        theSize++;
    }
         
    public AnyType remove(int idx)
    {
        if(idx<0 || idx>=theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        Node<AnyType> p = getNode(idx);
        p.prev.next = p.next;
        p.next.prev = p.prev;
        
        theSize--;
        
        return p.data;
    }
    
    public int size()
    {
        return theSize;
    }
    
    public boolean isEmpty()
    {
        return theSize == 0;
    }
    
    public void clear()
    {
        head = new Node<>(null, null, null);
        tail = new Node<>(head, null, null);
        head.next = tail;
        
        theSize = 0;
    }
      
    @Override
    public String toString()
    {
        String rStr = "[ ";

        Node<AnyType> temp = head.next;
        for(int i=0; i<theSize; i++)
        {    
            rStr = rStr + temp.data + " ";
            temp = temp.next;
        }    
        rStr = rStr + "]";

        return rStr;
    }
   
    private Node<AnyType> getNode(int idx)
    {
        Node<AnyType> p;
            
        if(idx <= theSize/2)
        {
            p = head.next;
            for(int i=0; i<idx; i++)
                p = p.next;            
        }
        else
        {
            p = tail;
            for(int i=theSize; i>idx; i--)
                p = p.prev;
        } 
        
        return p;
    }
       
    private class Node<AnyType>
    {
        private Node<AnyType> prev;
        private AnyType data;
        private Node<AnyType> next;
        
        public Node(Node<AnyType> p, AnyType d, Node<AnyType> n)
        { 
            prev = p;
            data = d;
            next = n;
        }
    }
}