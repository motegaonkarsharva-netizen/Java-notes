import java.util.*;

public class loop{
    public static void main(String[] args) {
        /*
        for loop
        for(initialisation;condition;updation){
        }
        initialisation is basically i of python
        condition is when the loop will stop
        updation is basically i+=1 shite
         */
        for (int counter=0 ; counter<3 ; counter = counter+1){
            System.out.println("Hello java");
        }

    }
}


 class twelve {
    public static void main(String[] args) {

        // counter++ is just counter = counter + 1
        for (int counter = 0; counter < 11; counter++) {
            System.out.println(counter);    //if we want the numbers in a single line we can just add +" " with counter as (counter+" ")
        }
    }
}


/*
while loop
define the counter
while(condition){
    do something
    i++
}
*/
class thirteen {
    public static void main(String[] args) {
        int i=0;
        while (i <11) {
            System.out.println(i);
            i=i+1;  //i++
        }
    }

}


//do while loop
 //basically while but condition badme check hoti hai mhange 1 da tari code run hoil

 class fourteen{
   public static void main(String[] args) {
    int i=0;
    do {
        System.out.println(i);
        i=i+1;

    }while(i<11);
   
    }
}
// one disadvantage of do while loop is ki I'lll run the loop atleast once
class fifteen{
    public static void main(String[] args) {
        int i = 12;
        while(i<11){         
            System.out.println(i);
        }

        do{     //hya case madhe 12 eak da tari print hoil atch
            System.out.println(i);

        }while(i<11);       //make sure you put the ";" in do while loop
    }

}

// Question-to print sum of n natural numbers



class sixteen{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        System.out.println(sum);
        }
        
        
    }
}

class seventeen{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int i=0;i<11;i++){
            
        System.out.println(i*n);
        }
        
        
    }
}