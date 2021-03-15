package examples;

public class FizzBuzz {

    public static void main(String[] args) {
    fizzBuzzTest();
    }

    public static void fizzBuzzTest(){
        for (int i = 1; i<=100; i++){

            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i == 3 || i%3==0){
                System.out.println("Fizz");
            }
            else if (i == 5 || i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

 
}

