# kotlin-study
kotlin-study


#### 语句和表达式
```text
val(Value)不可变引用，类的只读属性.java中的final   
var(Variable)可变引用，类的可读，可写属性.java中的非final   
语句和表达式的区别在于，表达式有值，并且能作为另一个表达式的一部分使用；类比正则表达式   
而语句总是包围着它的代码块中的顶层元素，并且没有自己的值。  
在Kotlin中if是表达式，而不是语句。即可以像return a+b一样使用一个return,也不需要使用function封装
在Kotlin中除了循环(for,do和do/while)以外大多数控制结构都是表达式。这种结合控制结构和其它表达式的能力可以简明扼要地表示许多常见的模式。
在Java中，所有的控制结构都是表达式。要取得每种情况的值，需要使用多个return，或使用function封装

Java中的赋值操作是表达式，Kotlin中赋值操作是语句

```