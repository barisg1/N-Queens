public class GenericMethod1 
{
    public static void main(String[] args) 
    {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        printArray(integerArray); 
        printArray(doubleArray); 
        printArray(characterArray);
    }
    
    public static void printArray(Object[] inputArray)
    {
        for(Object element : inputArray)
            System.out.print(element + " ");

        System.out.println();
    }
}