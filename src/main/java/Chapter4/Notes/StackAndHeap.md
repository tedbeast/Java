# Stack and Heap

Memory in Java is split between two important sections of memory: the stack and heap.

The heap is a large block of memory that contains the memory space for Objects as well as the String pool. All objects, threads, etc share the same heap.

The stack is the body of memory where method calls and primitive variables are stored. Stacks work in the same way that the Stack collection works: when a new method is called, a new entry is pushed onto the stack that represents the currently-executed method, along with its parameters. This is how Java knows where to return to after a method is complete, and also why primitive variables do not follow the pass-by-reference rule that Objects do.