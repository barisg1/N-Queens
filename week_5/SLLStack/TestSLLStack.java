public class TestSLLStack 
{   
    public static void main(String[] args) 
    {
        SLLStack<String> myStack = new SLLStack<>();
        
        myStack.push("Göktuğ");
        myStack.push("Ahmet");
        myStack.push("Sevcan");
        myStack.push("Emre");
        myStack.push("Samet");
        
        System.out.println(myStack);
      
        System.out.println("top : " + myStack.top());
        
        System.out.println(myStack);
        
        myStack.pop();
        myStack.pop();
        
        System.out.println(myStack);
        
        myStack.push("Erkin");
        System.out.println(myStack);
        
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        
        System.out.println(myStack);
    }   
}