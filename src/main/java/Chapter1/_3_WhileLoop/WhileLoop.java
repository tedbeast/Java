package Chapter1._3_WhileLoop;

public class WhileLoop {
    /**
    A while loop uses a conditional statement (within parentheses) and runs the code {within curly braces}
    so long as the conditional is true.
    Usually while loops are used for I/O, like waiting for input from the user or waiting for data from the web,
    which are situations where the code has no capability of knowing how many times it should do something
    (eg how many times it should check if it's received input yet).

    For this example, let's use a while loop to get the sum of all numbers between 0 and end (exclusive).
    At the 'code here' point, let's make a while loop that uses the conditional
        i<end
    and contains within its block the code
        sum = sum + i;
        i = i + 1;

    Meaning, so long as as a number i, which we've defined, is less that some number end,
    let's add the number i to sum and increase it by 1.
    So: counting from 0 to end = 6 (excluding 6), we add the numbers to a total count
        (ie as i goes from 0 -> 1 -> 2 -> 3 -> 4 -> 5 sum goes from 0 -> 1 -> 3 -> 6 -> 10 -> 15)
    You can consult existing examples to learn the syntax for a while loop. If you program doesn't stop running,
        that means the conditional you defined is never broken as the code executes.
     **/
    public int whileExample(int end){
        int sum = 0;
        int i = 0;

//        code here

        return sum;
    }
}
