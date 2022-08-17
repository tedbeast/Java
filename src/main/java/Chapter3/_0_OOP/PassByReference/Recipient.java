package Chapter3._0_OOP.PassByReference;

public class Recipient {
    public void recieveMail(Mail m){
/*
        set the opened value to true here.

        notice that even though we only got passed a Mail objecct, we can still modify the mail object,
        and the changes will be reflected by all other parts of the application:
        this is because when we pass objects,
        we pass a memory reference (kind of sending someone an address, which is a lot simpler than moving an entire
        house.)

        Objects are stored on the heap, and all parts of the application access the same heap.
        This rule does not apply to primitive types, which are stored on the stack. When we pass a primitive, we pass
        a fresh copy.

        These terms matter, because the heap can be thought of as a single large body of computer memory, whereas the
        stack is segmented (every new method call creates a new set of variables on the stack, which are then
        discarded when the method finishes.)

 */
    }
}
