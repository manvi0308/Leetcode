public class Counter {
    // function to count number of chars, integer and double 
        // function to count number of chars, integer and double 

        public static void TypeCounter(String sentence){
            // Identify the different types present in an input string and report their counts. each of the substring, separated by one or more spaces, is one of either the string, integer or double type. Print the results on 3 lines in the order shown in the example below
            for(char ch : sentence.toCharArray()){
                if(ch == ' '){
                    continue; 
                }

                else if(Character.isDigit(ch)){
                    // check if double
                    
                }
            }
            
        }
}