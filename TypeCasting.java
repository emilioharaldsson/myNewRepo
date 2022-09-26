public class TypeCasting {
    public static void main(String[] args) {
        // type casting refers converting DTs.. for example how to convert a double to an int 
        // the following will throw an error: 
        // double decimal = 1.1;
        // int interfer = decimal;

        // This is beacuse you need to first cast the double variable to int. 

        double decimal = 1.1;
        int interger = (int)decimal;
        System.out.println(interger);  // 1
        // By type casting a double to int, you chop off the decimal point value; 
        
    }
}
