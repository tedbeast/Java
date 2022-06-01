package Level1.StringReverse;
/*
task: return the reverse of a string.

please know string reverse... very common interview question
 */

public class StringReverse {
    public String reverse(String s){
        /*
        this is again a problem that can be solved multiple ways, depending on our
        knowledge of the language
         */
        /*
        String result = "";
        for(int i = 0; i < s.length(); i++){
            result += s.charAt(s.length()-i-1);
        }
        return result;
        */

        /*
        couple other ways around this:
        we could use a stringBuilder, which is like a string, but it's mutable
        (remember that strings, when stored in memory, are not able to change,
        rather a new string is created
         */
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();

    }
}
