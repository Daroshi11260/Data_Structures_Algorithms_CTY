# Lab 1

In this lab, you will extend a codebase to incorporate a singularly linked list.
You'll be implementing enough of the linked list to maintain the current functionality (plus some).

## Setup
1. Download the base project and open it in IntelliJ.
2. Change the package to incorporate your name
3. Run the program to investigate the current behavior.
4. Change all instances of the word `ArrayList` to `LList`
5. Create the `LList` class and extend the appropriate interface or classes.

## Implementation Details
* Your `LLNode` class must be an inner class
* `LLNode` should never be a return or parameter type of public methods.
* Add optimizations to your `LList` class to allow for the best O() time complexity.
* You'll need to create an iterator for `LList` class because a for-each loop uses it to traverse your list.
* Your `LList` class must implement the `List` interface but need not completely implement every method.
Methods which have incomplete implementations should throw a `NotImplementedException`
* All non-private methods must have proper JavaDoc comments.

## Rubric (Base Tier)
* Style/Documentation 
  * Variable names
  * Commenting and JavaDoc
* Method Implementation
  * `add` - At the end, beginning, and in the middle
  * `remove` by index - At the end, beginning, and in the middle
  * `size` - calculate the size of your list
  * Other methods and the `LLNode` class
* Iterator Implementation

## Additional Tiers
1. Add the ability to handle global key events:
   1. ESC - deselect all objects
   2. Delete - delete the selected objects
2. Add the ability to move the selected shape
   1. Arrow keys
   2. Click a drag with the mouse
3. Add a custom tool (rectangle/circle) and provide a way to swtich between tools
