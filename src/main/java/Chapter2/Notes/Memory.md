# Memory management

When we think about a computer, we have to imagine the Objects and primitives we create to occupy a set amount of computer memory in a particular place. Let's discuss how it's done:

- when we first designate `Object obj;`, we do not have a real object in memory yet. However, obj still represents a memory reference - you can think of this like an address to a position in your computer's memory. Obj currently points nowhere, so its value is `null`. When we later write `obj = new Object();`, that address now points to a real location.

- This means that we pass references to locations when we pass an object as a parameter to a method. So, changes to an object are actually reflected globally across the app, because we're modifying the same position in memory.

- If there is no longer any reference pointing to a position in memory, Java automatically knows that it should free up the memory for future use. This is known as garbage collection. If we didn't have garbage collection, our programs would crash due to a lack of memory if we weren't manually deallocating memory.