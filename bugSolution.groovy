```groovy
class MyClass {
    String name

    MyClass(String name) {
        this.name = name
    }

    String getName() {
        return name
    }

    // Correct method signature and implementation
    static String getClassName() {
        return MyClass.class.name
    }
}

MyClass myObj = new MyClass("Example")
println myObj.getName() // Works fine
println MyClass.getClassName() // Works correctly
```