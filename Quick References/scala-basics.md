## Declaring variables
```
val x = 1  // immutable - declared a constant, you can’t change its contents.
var x = 1  // mutable - declared a variable whose contents can vary

val lang = "Scala Programming"         // implicit type - Inferred from the type of the expression with which you initialize it.
val lang: String = "Scala Programming" // explicit type - Specify the type explicitly while initialize.

```
#### Note:
- Best practice use a val unless you really need to change the contents.
- Type of a variable is always written after the name of the variable. This makes it easier to read declarations with complex types.
- Use semicolons (;), if you have multiple statements on the same line.
