package Chapter7.Challenges.Parentheses;
/*
task: return true if a string of parentheses are 'valid'. false if not.
parentheses are valid if all opening parentheses are closed and if no parentheses are closed without being first opened.
eg, valid:
(())
()()
(()())
invalid:
)(
(()
))

 */

public class Parentheses {
    public boolean checkParentheses(String in){
        int parCount = 0;
        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i)=='('){
                parCount++;
            }else{
                parCount--;
            }
            if(parCount <0 ){
                return false;
            }
        }
        if(parCount == 0){
            return true;
        }else{
            return false;
        }
    }
}
