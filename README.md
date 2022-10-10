# Core Language Repo
Hello!

This repository is intended to help you learn some topics of our core language (java). This style of repo grew from attempts for you all to improve at your own pace and skill level. It is organized into chapters, which are groupings of a few core-language concepts and some puzzles which you will solve. I can not control how much you look up on your own, but use good sense: for language-specific details (eg how do strings work?), looking up info is obviously encouraged. For logic puzzles (eg how do I reverse a string?), you have much more to gain from taking the time to think through the problems yourself.

If you haven't had much experience beforehand, you may find that programming is a tricky thing in that reading articles and watching videos doesn't guarantee that you'll get any better at programming (especially with coding challenges). For this reason, the repo is structured such that everyone has a place where they can start with problems they understand, and everyone should have enough content to cover for them to proceed at a steady pace.

## Git
If you are new to Git, you will have to become accustomed to the basics in order to use this repo. Please install gitbash and use, in your command line, the command `git clone url`, replacing 'url' with the url of this repository. This will generate, in whatever current directory of your command line was in, a new folder named Java which will contain all the contained files together with an already set-up git local repository. After this, you can open that folder in your IDE of choice (Intellij, Eclipse, VSCode, etc).

## Test driven development
The repository is structured around TDD (test-driven-development), which is a real practice that companies follow. This means that we write the tests for our code **before** the implementations. On a difficult project, this leads to a smooth development process where progress is easily measured, which makes it a great business practice.

In order to write tests, here I have written junit tests for you in a test class in each challenge's package. **You can and should read the tests, but you should not modify the tests in any way.**

The structure of a junit test class is as follows: every one of the test classes first declares an object for the respective challenge. (Because java is OOP, we have to organize our challenges in this unintuitive way). Every test class will contain a method annotated as @BeforeClass: this method contains code to instantiate an object for the challenge we are solving. The test classes then each contain several methods annotated with @Test, which marks them as methods which will be run when we run the test classes. These methods will use the object we instantiated previously to see how it behaves. We use Assert to determine if a test passes: all tests contain some input and an expected value, and we assert that the actual output resembles the expected output. If the assertion fails, the test fails. Tests also fail if an error is thrown (unless we're asserting that an error is thrown.)

In order to run the tests, you should be able to run them in intellij in the same way that you run any main class (the 'magic green button' to the left of your code). Mind that, in intellij, the 'magic green button' at the top right of the class reflects the last-run class, not the class you are currently looking at. You could also use maven command mvn:test, but that will run all the test cases which will take too long.

## Approximate deadlines
I am still working through accurately organizing the repo by difficulty. In order for everyone to keep pace with learning programming fundamentals, here are the minimum requirements for your abilities week-by-week:

1) if you are in a 12-week cohort, chapters 1 and 2 should be completed by Friday of week 1. This is a hard deadline. 12-week cohorts should also complete chapter 3 by end of week 2.
2) if you are in a 10-week cohort, chapters 1-3 should be completed by Friday of week 1 (you can skip chapters if you like)
3) chapter 4 should be completed by the end of your first project.
4) chapter 5 should be completed by the end of the training.

If you are able to proceed at a faster pace, please do so, and I also recommend continuing incomplete content into Staging.

## Take breaks

"Every day we should hear at least one little song, read one good poem, see one exquisite picture, and, if possible, speak a few sensible words." *Johann Wolfgang von Goethe*

## License information
This repository and the code contained may not be distributed without the express written permission of Theodore Balashov. Present Revature employees are permitted to freely use the contained content for their own enrichment. You may contact Theodore at theodore.balashov@revature.com for inquiries. 

All the best

Ted Balashov