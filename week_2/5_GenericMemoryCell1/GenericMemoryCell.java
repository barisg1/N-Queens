public class GenericMemoryCell 
{
    private Object storedValue;
    
    public Object read()
    {
        return storedValue;
    }
    
    public void write(Object x)
    {
        storedValue = x;
    }
}