Before the final task of the second week

We should look at how to compare String values.

Let's recall how we compare **primitive** types (`byte, short, int, long, float, double, char`):

```
int a = 78;
int b = 99;

boolean res1 = a == b;
```

Unfortunately, String is not a primitive type. Hence, we should apply the different techniques to compare Strings.

```
String cityFrom = "Kyiv";
String cityTo = "Kyiv";

boolean isEqual1 = cityFrom.equals(cityTo); // true

String name1 = "Olha";
String name2 = "Ivanka";

boolean isEqual2 = name1.equals(name2); // false
// No matter what value stands first (name2 or name)
System.out.println(name2.equals(name1)); // false

// name1.equals(name2) == name2.equals(name1)
```

In the future, we will consider more examples of non-primitives. So far, it is enough to perform the next task.