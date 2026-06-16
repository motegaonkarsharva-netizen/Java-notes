import java.util.*;  //for class6


/* 
 system.out.print("hello world");
this line is used to print output in java 
1)how?
-> we'll get to know that in oops lecture
2)what's ;?
-> without; the code line will keep running


3)Boiler plate
->basically the minimum structure Java needs to run your program. Think of it as the skeleton of a Java app.
package com.apnacollege;

public class Main {
    public static void main(String[] args) {
        
    }
}

*/




public class lecture_second_variable_inputoutput {
    public static void main(String[] args) {

        // output
        System.out.print("Hello java");
        System.out.print("Hello java");
    }
}

// to make sure they get printed in diferent lines we add ln to print function of previous line

class one{
      public static void main(String[] args){
    
        System.out.println("Hello java");
        System.out.print("Hello java");
      }
}

//or else we can also use \n in the string itself
class two{
      public static void main(String[] args){
    
        System.out.print("Hello java\n");
        System.out.print("Hello java");
      }
}
//and if u want to print both of them at the same time add->
/*      System.out.print("Hello java"); (iske neeche)
        System.out.println();
        
        one.main(args);
*/

/*
public class lecture_second_variable_inputoutput {
    public static void main(String[] args) {

        // output
        System.out.print("Hello java");
        System.out.print("Hello java");
        
        System.out.println();   (like this)
        one.main(args);
    }
}



class one{
      public static void main(String[] args){
    
        System.out.println("Hello java");
        System.out.print("Hello java");
      }
}
*/

class three{
    public static void main(String[] args){
    
        System.out.print("Hello java\nHello java\nHello java");
      }


}



 class four {
    public static void main(String[] args) {

        // variables
        String name = "tony stark";
        int age = 48;
        double price = 25.25;     

        int a = 25;
        int b = 10;
    }
}

/*
datatypes
1)primitive-> pahile se hote hai
byte -> 1 byte= 8 bit
short
char ->2 byte
boolean->1 byte
int->4byte
long->8byte
float ->4byte
double->8byte

2)non primitive
string
array
class 
object
interface

*/


class five{
        public static void main(String[] args) {

        // variables
        int a = 10;
        int b = 25;

        int sum = a + b;
        System.out.println(sum);     //apan 2 operations la sobat print kru shakto pn tee dogha eaka class madhe aasaila pahije

        int diff = b - a;            // same with other operations jee apan python madhe kele hote
        System.out.println(diff);
        
        int mul = a*b;
        int div = (mul/diff);

        System.out.println(div);

       
    }
}


class six{
    public static void main(String[] args){

        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextInt()
        //nextFloat()
        System.out.println(name);

    }
}


