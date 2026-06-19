import java.util.*;

public class lecture_3_conditions {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18) {
            System.out.println("is an adult");
       
        } else {
            System.out.println("is not an adult");
        }

    }


}



class seven{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}

class eight{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else {
            if (a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }
        }
    }
}
// we can also do else if statement which is like elif statement of python


 class nine {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        }
        else if (a>b) {
        
            System.out.println("a is greater");
        }
        else {
            System.out.println("a is lesser");
            }
        }
    }

    class ten {
        public static void main(String args[]) {       //make sure S is capital in string
            Scanner sc = new Scanner(System.in);
            int button = sc.nextInt();
            if (button == 1) {
                System.out.println("hello");

            }else if (button ==2){
                System.out.println("Namaste");

            }else if (button ==3){
                System.out.println("bonjor");

            }else {
                System.out.println("invalid button");
            }

        }


    }
    // as we can see the code is too big in class 10 soo we use the concept of switch

//aplaya kade ajun 1 masta concept aahe switch mhanun

class eleven{
    public static void main(String args[]) {    //hee donhi line lagnar atch aahe
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();              //hee button chay input sathi 
        switch(button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("bonjor");
            break;
            default : System.out.println("invalid button");   //parat break kraichi garaj nhi kran } already aahe
        }
    }

}