public class App {
// Task: We have a number N which has an initial value of 16 and the task is to reduce the given number to 1 by repeated division of 2. 
// Approach:

// Initialize a variable number_of_operation with a value 0 .
// Run a for loop from N till 1.
// In each iteration reduce the value of N to half.
// Increment the number_of_operation variable by one.
// Return the number_of_operation variable.

    static void logarithmic(){
        //initialize N as 16
        int N=16;
        //initialize number of operations as 0
        int number_of_operation=0;
        //run a for loop for N till 1
        for(;N>1;N=N/2){
            number_of_operation++;
        }
        System.out.println("Number of operations Variable to reduce N to 1 is: "+number_of_operation);
    }
    public static void main(String[] args) {
        System.out.println("The logarithmic time complexity question was taken from Geeks for geeks website");;
        System.out.println("Time complexity");
        logarithmic();
    }
}
