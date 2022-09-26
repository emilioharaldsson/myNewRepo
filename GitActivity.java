public class GitActivity {
    public static void main(String[] args) {
        int numberOfFans = 5000;
        System.out.println("There are "+numberOfFans+ " fans at my show");
        // The range of int variables is from -2billion to +2billion 
        // If we want to store more numbers, we need the long DT
        // You need to include an "L" at the end to specify to Java that you're using a Long
        long numberOfStreams = 700000000000L;
        System.out.println("I have a total of " + numberOfStreams + " streams in all platforms!");
        // Why not use Long all the time? Becuase of memory or performance 
        // int --> 4 bytes
        // long --> 8 bytes
        // Doubles 
        // Doubles are used to store decimal values 
        double percentSuccess = 0.95;
        System.out.println("I got a " + percentSuccess + " on the test today");
        // You CANNOT store a double in an int or long variable, but you can store whole numbers in the a double
        // Java will interepret the double variable w/ whole number as a decimal, and add a decimal point at the end 
        double myFreinds = 3;
        System.out.println(myFreinds); // 3.0

        // Note: always use doubles for arithmatic... int and long DTs will alawyas yield whole numbers. 
        
    }
}