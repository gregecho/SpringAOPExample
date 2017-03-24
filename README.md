# SpringAOPExample


  * **Advice** defines both the **what** and the **when** of an aspect.


  * **Join point** is a point in  the execution of the application **where** an aspect can be plugged in. This point could  be a method being called, an exception being thrown, or even a field being modified.


  * **Pointcuts** define the where. A  pointcut definition matches one or more join points at which advice should be woven.


  * **Aspect is the merger of advice and pointcuts**. Taken together, advice and pointcuts  define everything there is to know about an aspect—what it does and where and when it does it.


  * **Weaving** is the process of applying aspects to a target object to create a new proxied object. The aspects are woven into the target object at the specified join points. The weaving can take place at several points in the target object’s lifetime:

    Compile time—Aspects are woven in when the target class is compiled. This requires a special compiler. AspectJ’s weaving compiler weaves aspects this way.
    Class load time—Aspects are woven in when the target class is loaded into the JVM. This requires a special ClassLoader that enhances the target class’s bytecode before the class is introduced into the application. AspectJ 5’s load-time weaving (LTW) support weaves aspects this way.
    Runtime—Aspects are woven in sometime during the execution of the application.


Typically, an AOP container dynamically generates a proxy object that delegates to the target object while weaving in the aspects. This is how Spring AOP aspects are woven.
