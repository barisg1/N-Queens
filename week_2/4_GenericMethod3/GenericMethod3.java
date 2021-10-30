public class GenericMethod3
{
    public static void main(String[] args) 
    {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println(myContains(integerArray, 3));
        System.out.println(myContains(doubleArray, 8.8));
        System.out.println(myContains(characterArray, 'E'));
    }
 
    public static <T> boolean myContains(T[] inputArray, T val)
    {
        for (T element : inputArray)
            if(val.equals(element))
                return true;
        
        return false;
    } 
}