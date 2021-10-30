public class GenericMethod2 
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
    
    public static <T> void printArray(T[] inputArray)
    {
        for (T element : inputArray)
            System.out.print(element + " ");

        System.out.println();
    }
}