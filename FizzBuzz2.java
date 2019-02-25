package FizzBuzz;

//FizzBuzz with only 1 print method

public class FizzBuzz2 {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            String output = "";
            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";
            if (i % 15 == 0) output += "FizzBuzz";

            //condition
            System.out.println(output.isEmpty() ? i : output);
        }
    }
}
