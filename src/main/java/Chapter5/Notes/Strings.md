#String pool

String are Objects, but they are a special type of object that enjoys a unique type of storage and do not need to be instantiated like regular objects. Because Strings are so heavily used, the developers of Java found it more efficient to store copies of the same String as the same memory position. For this reason, strings are actually immutable: attempting to modify a String just creates a new String.

StringBuilder can be used to generate strings that are mutable. StringBuffer is a version of StringBuilder that can be used with multithreading.