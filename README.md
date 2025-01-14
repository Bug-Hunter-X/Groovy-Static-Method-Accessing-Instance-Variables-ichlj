# Groovy Static Method Bug
This example demonstrates an issue in Groovy related to using the `this` keyword within static methods. Attempting to access instance variables or methods of the class directly within the static method results in a runtime error. 

## Bug
The `getClassName()` method incorrectly tries to access the `class` property using `this`, which doesn't work correctly inside a static context.

## Solution
The solution involves removing the use of `this` in the static context.  Since we are already within the class definition, we can use the class name directly to get its name.