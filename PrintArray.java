

public class PrintArray {
    public static void display(Integer arr[]){
        for(Integer a:arr){
            System.out.println(a);
        }

    }

    public static void display(char arr[]){
        for(char a:arr){
            System.out.println(a);
        }

    }

    public static void display(double arr[]){
        for(double a:arr){
            System.out.println(a);
        }

    }
    public static void main(String[] args){

        Integer arr1[]={1,2,3,4,5};
        double arr2[]={1.0,2.0,3.0,4.0,5.0};
        char arr3[]={'a','b','c'};

        PrintArray.display(arr1);
        PrintArray.display(arr2);
        PrintArray.display(arr3);



    }


}
