public class StackExamples {
    public static void main(String[] args) {

//       Stack<String> stack = new Stack<>();
//
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//
//        System.out.println("Stack peek " + stack.peek());
//        System.out.println("Stack push " + stack);
//
//        stack.pop();
//
//        System.out.println("Stack pop " + stack.search("A"));

        //java.util.Map<char[], String> maps = new java.util.HashMap<>();
        String strs=  "({[]})";
        Boolean res = isValid(strs);
        System.out.println(res);

    }

    private static Boolean isValid(String strs) {
        java.util.Stack<Character> stackValues = new java.util.Stack<>();
        char[] ch = strs.toCharArray();
        System.out.println("charArray" + ch);

        for(char s: ch){

            //System.out.println(s);
            if(s == '(' || s == '{' || s == '[' )
                stackValues.push(s);
            else if(s == ')' || s == '}' || s == ']'){
                if(stackValues.empty())
                    return false;
                else{
                    char openBracket = stackValues.pop();
                    if ((s == ')' && openBracket != '(') ||
                            (s == '}' && openBracket != '{') ||
                            (s == ']' && openBracket != '[')) {
                        return false; // Mismatched opening/closing pair
                    }
                }
            }
        }
        return stackValues.empty();
    }
}
