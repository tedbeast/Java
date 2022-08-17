# Core Language Repo
Hello!

This repository is intended to help you learn some topics of our core language (java). This style of repo grew from my desire for you all to improve at your own pace and skill level. It's fine to chapters if they feel entirely trivial, but you should not skip to the next chapter if you don't know how to complete a section. Sections are ordered for your convenience. I recommend always working on the coding challenges last.

Every section will contain a readme on how to approach the problems within.

## Test driven develpment
The repository is structured around TDD (test-driven-development), which is a real practice that companies follow, if they have the resources to spare. This means that we write the tests for our code **before** the implementations. On a difficult project, this leads to a smooth development process where progress is easily measured, which is great for businesses.

In order to write tests, here I have written junit tests for you in a test class in each challenge's package. **You can and should read the tests, but you should not modify the tests in any way.**

The structure of a junit test class is as follows: every one of the test classes first declares an object for the respective challenge. (Because java is OOP, we have to organize our challenges in this unintuitive way). Every test class will contain a method annotated as @BeforeClass: this method contains code to instantiate an object for the challenge we are solving. The test classes then each contain several methods annotated with @Test, which marks them as methods which will be run when we run the test classes. These methods will use the object we instantiated previously to see how it behaves. We use Assert to determine if a test passes: all tests contain some input and an expected value, and we assert that the actual output resembles the expected output. If the assertion fails, the test fails. Tests also fail if an error is thrown (unless we're asserting that an error is thrown.)

In order to run the tests, you should be able to run them in intellij in the same way that you run any main class (the 'magic green button' to the left of your code). Mind that, in intellij, the 'magic green button' at the top right of the class reflects the last-run class, not the class you are currently looking at. You could also use maven command mvn:test, but that will run all the test cases which will take too long.

## Approximate deadlines
Although I aim to make learning personalized to all skill levels, there are also minimum expectations to be met in your ability to complete the contained challenges.

* If you are in a 12 week-cohort, Chapters 1 and 2 MUST be completed by Friday week 1.
* Chapter 3 should be completed by the end of the Java section (week 2 of 12 week cohort, week 1 of 10 week.)
* Chapter 4 should be completed by the end of your first project.
* Chapter 5 should be completed by the end of the training.

If you are able to proceed at a faster pace, please do so, and I also recommend continuing incomplete content into Staging.

## Take breaks

"Every day we should hear at least one little song, read one good poem, see one exquisite picture, and, if possible, speak a few sensible words." *Johann Wolfgang von Goethe*

All the best

Ted Balashov