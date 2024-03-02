# Using objects

## FallingObjects

In this exercise you will get more experience with objects.

## Setting up

Create a new class called `FallingObjects`. Note that you must work in Visual Studio Code or IntelliJ. BlueJ will not work for this lab. 

## Background information

An object is a _thing_ in memory, which consists of some internal data, and ways of acting on that data (methods).

Whereas a primitive value (such as 27.3) has a primitive data type (such as `double`), objects (such as a bunch of text containing the letters _"hello"_) has a data type which is a *class* (such as `String`). The
most important differences between primitives and objects is that
objects can store more complicated data internally, and can have
built-in methods that act on that data. For example, suppose we have a
variable `d` containing a `String` object. We can determine the length
of the text stored in it by making the `d.length()` method call.
However, the primitive data types (`double`, `int`, etc.) don\'t have
any such actions defined.

## Writing the program

In this lab you will work with the Particle class you have just
downloaded. Every particle object that we create keeps track of its current position and velocity. Look at the [documentation for the `Particle` class](Particle.html), and notice that there is a section called _"Constructor Summary"_. The fact that there are constructors available for this class means that the `Particle` class is an *instantiable class* - in English, this simply means that we can make objects of type `Particle`. We are going to use `Particle` objects to write a program that solves a few elementary physics problems.

First we will tackle the following problem:

> Suppose a rock is dropped from a 100 meter high cliff. How high off the ground would it be after 2.63 seconds?

The plan is to create a `Particle` object which represents an object 100 meters over the ground, then tell the object to simulate freefall for 2.63 seconds, and finally we will ask the object about its current vertical position.

So, we want to create a `Particle` object. First declare a variable that is capable of holding an object of type `Particle` (notice the syntax here is the same as with primitive data types).

```java
Particle rock;
```

Currently, the rock variable doesn't hold an object yet. We will create a `Particle` object by calling a *constructor* for the `Particle` class. To do this, we use the keyword `new`, followed by the class name and a pair of parentheses () for the argument list:

```java
rock = new Particle();
```

**The line above does not compile** (try it). To see why, let's refer to the [`Particle` class documentation](Particle.html) again, and notice that there is one constructor available, which is documented like this:

  ----
  **Constructor Summary**                                                                                                                       
  ----
  **[`Particle`](Particle.html#Particle(double,%20double,%20double,%20double))**`(double xPos, double yPos, double xVel, double yVel)`  
  Makes a new particle with the given x and y position and velocity.                                                                  

  ----

The 4 `double` values `xPos`, `yPos`, `xPos`, and `xPos` are *arguments* (i.e. inputs), and work the same way as with method calls. We will need to supply values for them. Notice that the constructor summary doesn't say whether it expects the inputs to be in meters, feet, or inches. However, if you click on the word `Particle` in the constructor summary, you will be brought to a detailed view which gives such information.
**Change** the line of code we just wrote, adding in these values. Note
that the `yPos` is 100 since we want the rock to be 100 meters off the
ground, and since we are dropping it, there is no starting velocity
(thus the last two entries are zeros):

```java
rock = new Particle(0, 100, 0, 0);
```

Now we will ask our object for its current vertical position, just to demonstrate that it is actually keeping track of it. Looking at the [`Particle` class documentation](Particle.html) again, we see that there is a method called `getYPosition()`, which returns a `double` representing the current position of the object. Notice that this is **not** a static method. The *only difference* between calling a static method and a non-static method is that the non-static method is called
directly on some object instead of the class itself:

```java
double d;
d = rock.getYPosition();
System.out.println("The rock started " + d + " meters off the ground.");
```

Non-static methods such as this are called directly on the object. But that makes sense, as we could have many different `Particle` objects, each with a different vertical position. Otherwise, how would Java know which `Particle` object we are talking about?

Now we will make our `rock` object simulate freefall for 2.63 seconds. Looking back at the [`Particle` class documentation](Particle.html), we see a method called `passTime`, which appears to do what we want. Note that it has a `void` return type, so we don\'t get any return value back from this one (remember doing
that in lab07?):

```java
rock.passTime(2.63);
```

Next, print out the Y position of the rock again. Write some code to do this now. After this step you should have a program that looks like this:

```output
The rock started 100.0 meters off the ground.
After 2.63 seconds, the rock was 66.10719 meters off the ground.
```

There you have it. You are now using objects (we have actually done stuff like this with `Scanner` and `String` - do you see the connection?). Here 's the next problem we will tackle:

> Suppose someone kicked a soccer ball with a horizontal velocity of 14.62 meters per second and a vertical velocity of 7.25 meters per second. How much horizontal distance has it covered after 3/4 of a second?

An important point is that you can create many objects, and each object will separately track its internal data. To see this, we will create a second variable capable of holding a `Particle` object.

```java
Particle ball;
```

Now initialize `ball` by calling the constructor of the `Particle` class. Use the `passTime` method to simulated the desired amount of freefall time. Check the [`Particle` class documentation](Particle.html) to see if you can find a method that helps you figure out how much horizontal distance has been covered. Your program should look like this now:

```output
The rock started 100.0 meters off the ground.
After 2.63 seconds, the rock was 66.10719 meters off the ground.
The ball has covered 10.965 meters.
```

Finally, we will solve the following problem:

> Suppose a laptop thrown from 148 meters high, with a starting downwards velocity of 8 meters per second. Print out whether or not it is airborne after 4.75 seconds.

Author's note: This is **not** recommended behavior! Instead, go to the help desk if something goes wrong with your machine.

Create a third `Particle` object and use an `if` statement to check the vertical position, seeing if it is still greater than zero after falling 4.75 seconds. Here is the final program:

```output
The rock started 100.0 meters off the ground.
After 2.63 seconds, the rock was 66.10719 meters off the ground.
The ball has covered 10.965 meters.
The laptop is no longer airborne after 4.75 seconds.
```

----

If you are looking for an extra challenge: figure out how long it would take for the laptop to hit the ground, with .01 second accuracy (hint: use a loop and make it fall by small increments).

----

If you are looking for another challenge: Ask for the initial position and velocity of a pebble as user input, and then tell the user how long it took for the pebble to hit the ground.

When you are done, have the instructor check off your work.
