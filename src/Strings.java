public class Strings {
    /*
    Strings, which are widely used in Java programming, are a sequence of characters.
    In Java programming language, strings are treated as objects.
    The Java platform provides the String class to create and manipulate strings.
     */
    public static void main(String args[]) {
        String palindrome = "I want pizza now";
        int len = palindrome.length();
        System.out.println("String Length is : " + len);

        //immutable means  once the object is created, we cannot change its content

        //char charAt(int index)
        //Returns the character at the specified index. -- where did 'i' come from?
        String s = "Strings are immutable";
        char result = s.charAt(3);
        System.out.println(result);

        //public boolean contentEquals(StringBuffer sb)
        //This method returns true if and only if this String represents the same sequence of characters as specified in StringBuffer.
        String str1 = "Not immutable";
        String str2 = "Strings are immutable";
        StringBuffer str3 = new StringBuffer( "Not immutable");

        boolean  answer = str1.contentEquals( str3 );
        System.out.println(answer);

        answer = str2.contentEquals( str3 );
        System.out.println(answer);
    }
}
