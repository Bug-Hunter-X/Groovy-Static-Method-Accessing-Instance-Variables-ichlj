```groovy
class MyClass {
    String name

    MyClass(String name) {
        this.name = name
    }

    String getName() {
        return name
    }

    // Incorrect method signature; should be static
    def static getClassName() {
        return this.class.name
    }
}

MyClass myObj = new MyClass("Example")
println myObj.getName() // Works fine
println MyClass.getClassName() // Throws runtime exception
```