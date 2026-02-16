import java.util.Scanner;

public class element {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[];
        int x;
        int key;

        System.out.println("Enter the number of elements in the array : ");
        x = sc.nextInt();

        arr = new int[x];

        for (int i = 0; i < x; i++)
        {
            System.out.println("Enter element no. " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search : ");
        key = sc.nextInt();
        int flag = 0;
        int index = 0;

        for (int i = 0; i < x; i++)
        {
            if (arr[i] == key)
            {
                flag = 1;
                index = i;
                break;
            }
        }

        if (flag == 1)
        {
            System.out.println("Element found at index : " + index + "...");
        }

        if (flag == 0)
        {
            System.out.println("Element not found....");
        }
    }
}
