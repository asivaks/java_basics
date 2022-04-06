import java.util.Scanner;

public class JavaBasics {
    private Object myVar;
    // Java can not have input variables without a class -> should cast it into object
    // no myVar.type() in Java
    public static String getType(Object myVar) {
        String type= ((Object)myVar).getClass().getSimpleName();
        return type;
    }



    public static void main(String[] args) {

        //primitive
        byte myByte = 2;             // 128 to 127
        short myShort = 5;           // -32,768 to 32,767
        int myInt = 2000;            //2,147,483,648 to 2,147,483,647
        long myLong = 2000000;       //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 5.99f;       // Floating point number 6 to 7 decimal digits
        double myDouble = 5.9999;    // 15 decimal digits
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        System.out.println(myText);
        System.out.println("myByte type is " + getType(myByte));
        System.out.println("myInt type is " + getType(myInt));
        System.out.println("myLong type is " + getType(myLong));
        System.out.println("myFloat type is " + getType(myFloat));
        System.out.println("myDouble type is " + getType(myDouble));

        byte a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("\nCheck triangle type");
        System.out.print("Enter a:");
        a = in.nextByte();
        System.out.print("Enter b:");
        b = in.nextByte();
        System.out.print("Enter a:");
        c = in.nextByte();

        if ((a+b)>=c && (a+c)>=b && (c+b)>=a) {
            System.out.println("triangle");
            //right 3 4 5
            boolean triangleIsRight = (a*a+b*b==c*c || a*a+c*c==b*b ||Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2))
                    ? true
                    : false;
            System.out.println("Triangle is" + (triangleIsRight?"":" not") + " right");

            String triangleType;
            if (a==b && a==c && b==c)
            {triangleType = "equilateral";}
            else if (a==b || a==c || b==c)
            {triangleType = "isosceles";}
            else {triangleType = "not isosceles";}
            System.out.println("Triangle is " + triangleType);

        } else {
            System.out.println("not a triangle");
        }

        //Array bubble sort
        //create an instance of an array
        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.print("\nArray elements before sorting:");
        //iterate over array using for each loop
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\nArray elements after sorting:");
        //sort
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            //print the sorted element of the array
            System.out.print(arr[i] + " ");
        }

    }
}
