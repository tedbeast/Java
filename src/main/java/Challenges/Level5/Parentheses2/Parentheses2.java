package Challenges.Level5.Parentheses2;

//this problem has three sets of parentheses : {}, [], ()
//test if a string has valid usage of these, ie opening parentheses are always closed.
/*
eg,

valid cases:
{}()
()
({}[])
({[]})

invalid cases:
({)}
}}{{
())

this is a difficult problem. One of the java collections may help you here. good luck!

 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Parentheses2 {
    public boolean validate(String in){
        Deque<Character> pars = new ArrayDeque<Character>();
        for(int i = 0; i < in.length(); i++){
            char current = in.charAt(i);
            if(current == '(' || current == '[' || current == '{'){
                pars.push(current);
            }else{
                if(pars.isEmpty()){
                    return false;
                }
                char popped = pars.pop();
                /*
                switch(current){
                    case '}' :
                        if(popped != '{')
                            return false;
                        break;
                    case ']' :
                        if(popped != '[')
                            return false;
                        break;
                    case ')' :
                        if(popped != '(')
                            return false;
                        break;
                }*/
                if(current == '}' && popped != '{'){
                    return false;
                }
                else if(current == ']' && popped != '['){
                    return false;
                }
                else if(current == ')' && popped != '('){
                    return false;
                }
            }
        }
        if(pars.isEmpty()){
            return true;
        }
        return false;
    }
}
