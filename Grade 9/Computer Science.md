# Computer Science Review Sheet

> ## Exam Layout
>> |Part|Description|Marks|
>> |:---|:----------|:----|
>> |```A```|**True / False**|10|
>> |```B```|**Multiple Choice**<br>- All java code learnt, selection, loops, methods, Arrays, methods, strings|38|
>> |```C```|**Short & Long Answers**<br>- Compare and contrast short code, methods, problem solving|20|
>> |```Total```||68|

# Unit 1: Intro To Programming

> ```Comments```: are used to explain and clarify program ocde for human reader   

> |Operator|Uses|Description|
> |:-------|:---|:----------|
> |+|a + b|Addition|
> |-|a- b|Subtraction|
> |*|a * b|Multiplication|
> |/|a / b|Division|
> |%|a % b|Mod, the Remainder|

> **BEDMAS** rules still apply

> ## Strings

>> **```String:```** means a group of many characters     
>> **```String Concatenation```**: means that two strings are combined into one using the "r" sign      

> ## Variables
> - Holder for data       
> - We can use words instead of just a single letter
> - can store more than just numbers     
> - a place in memory (RAM: random access memory) where it can be stored or referred to      
> - Name, type, value

>> To declare a variable 
>>  1. Name
>>  2. Data Type

>> A variable is the name of a reserved memory location     
>> A varaible name is called an identifier      
>> Reserved words cannot be used as an identifier    

> ## Java Primitives

> Variables can be created for any of the data types listed       
> The chart shows examples of how to create a new variable for each primitive    

> |Type|Range|Size|Variable|Declaration|
> |:---|:----|:---|:-------|:----------|
> |byte|-128 to 127|8 bits|bits_8|byte bits_8;|
> |short|-32768 to 32767|16 bits|TALL|short TALL;|
> |int|-2 billion to 2 billion|32-bits|sum|int sum;|
> |long|-9 quintillion to 9 quintillion(huge)|64 bits|mile|long mile;|
> |float|-3.4e<sup>+/-38</sup> to 3.4e<sup>+/-38</sup>|32 bits|pi|float pi;|
> |double|-1.7e<sup>+/-308</sup> to 1.7<sup>+/-308</sup>|64 bits|stuff|double stuff;|
> |char|Single (unicode) characters|16 bits|letter|char letter;|

> ## Operations

>> |Operation|Notation|Equivalent|Result Type|
>> |:--------|:-------|:---------|:----------|
>> |equals|a == b||boolean|
>> |addition|a + b||number|
>> |subtraction|a - b||number|
>> |multiplication|a * b||number|
>> |division|a / b||number|
>> |less|a < b||boolean|
>> |less or equal|a > b|a <= b||boolean|
>> |more|a >= b|not (a < b)|boolean|
>> |more or equal|a >= b|not(a == b)|boolean|
>> |negation|-b|0 - b|number|

> ## Sample Code
>> ``` java
>> class AddTip{
>>    public static void main(String[]args){
>>      double amount; // variable declaration, 
>>                     // can store a double(real number)
>>                     // no value assigned to it yet
>>                     // variable name is identifier
>>      double pi = 3.1415926;
>>      amount = 19.95;  // variable amount has been assigned value of 19.95
>>      amount = amount + 3.00; // takes current vaue of amount(19.95) and add 3.00 to it
>>                              // then assigns the new value to amount(22.95)
>>      System.out.print("We will pay $");
>>      System.out.print(amount);
>>      System.out.print(" for the pizza delivery");
>>      // prints amount
>>    }
>> }
>> ```

> ## Java Data Types
>> ### Java primitive types
>>> boolean      

>>> number:    
>>> - integer
>>>   - byte
>>>   - short
>>>   - int
>>>   - long
>>>   - char
>>> - floating-point
>>>   - float
>>>   - double

>>> **Remember** ```String``` is not a primitive type      

>> ```equals(String)``` - Method compares the current string to another string and returns true if the two contain the same value, false if different

>> ```substring(int, int)``` - takes two values - an int for the first character and an int for the last character (exclusive)
    - substring(1, 10) returns the substring from index 1 to index ```9```
    - returns that part of the string 

>> ### Strings
>> - String - a set of individual characters
>>   - string start at zero - zero indexing
>>   - an array of characters

>> - Char(acter) - hold the same type of information as a string - but only one character
>>   - use single quotes rather than double quotes
>>   - many different methods that can be used with char
>>   - uses less memory than a string 

>>> ```java
>>> String name = "Ms Andrighetti";
>>> String firstThree, lastEleven;
>>> firstThree = name.substring(0, 3);
>>> lastEleven = name.substring(4, 15);
>>> System.out.println(firstThree);
>>> System.out.println(lastEleven);
>>> ```

>> - first character is index 0 because zero-indexed
>> - substring specifies the first characters you want and the last character you don't want
>> - if you try to access a point beyond the end of the String, you will get an error

>> - ```length()``` - tells you how many character are in a string
>>   - length gives you the length of string not last index of the string
>>> ```java
>>> String word = "Hello";
>>> int length = word.length();
>>> System.out.println(length);
>>> ```

>> ### Boolean Expressions
>> -  can only have 2 possible value(true or false)     
>> - compare must be compatible type     

>>> |Symbol|Meaning|
>>> |:-----|:------|
>>> |==|equal to|
>>> |!=|not equal to|
>>> |>|greater than|
>>> |<|less than|
>>> |>=|greater than or equal to|
>>> |<=|less than or equal to|

>> ```Modulus operator (%)```: returns the remainder of 2 numbers        
>> ```String```: stores characters / text     
>> ```String comparison```: different from primitive type comparison     
>>   - cannot use ```==``` sign
>>   - use boolean expression ```object1.equals(object2)```

> ## Reading Input (Scanner Class)

>> ```import``` scanner class to use it      
>> use 
>> ```java 
>> import java.util.Scanner;  
>> ``` 
> - to tell compiler to include scanner class in the .class file       
> - line at very top of file
> - create scanner using 
>> ```java
>> Scanner myScanner = new Scanner(System.in);
>> ```

>> |To read this...|...Make this method call|
>> |:--------------|:-----------------------|
>> |a number with no decimal point in it|nextInt()|
>> |a number with a decimal point in it|nextDouble()|
>> |a word(ending in a blank space, for example)|next()|
>> |a line(or what remains of a line after you've already read some data from the line)|nextLine()|
>> |a single character(such as a letter, a digit or a punctuation character|next.charAt(0)|

> ## Output
> - using standard output system:

>> ```java
>> System.out.println()
>> ```

> - this outputs to the console

> ## Selection statements
> - allow java to make a decision     
> - depending on decision, program will function differently each time it is run      

>> ```java
>> if(condition){
>>    //then perform some commands
>>    // outcome
>> }
>>```

>> ### Example:

>>> ```java
>>> int age = 17;
>>> if(age >= 16){
>>>     // execute if condition
>>>     System.out.println("You are " + age);
>>>     System.out.println("You can learn to drive");
>>> } // skips if condition not met
>>>```

>> ### ```=``` vs ```==```
>> -  ```=```: assignment    
>> - ```==```: comparison    

>> ### if.... else if.... else

>>> ```java
>>> if(condition){
>>>    statement1;
>>> } else{
>>>    statement2;
>>> // -----------------------
>>> }
>>> if(num > 10){
>>>    System.out.println("Your number is greater than 10");
>>> } else{
>>>    System.out.println("Your number is less than or equal to 10");
>>> }
>>> ```

>>  - used when program needs to choose from a variety of situations
>>  - use else if to specify another condition
>>  - helps to control the flow of your program
>>  - helps make decision when 3 or more conditions must be considered
>>  - makes program more efficient

>>> ```java
>>> if(age >= 16){
>>>    System.out.println("You can drive");
>>> }else if(age == 15){
>>>    System.out.println("You can drive next year");
>>> }
>>> ```
>>>  - else if statement is additonal part of if statement     
>>>  - can be multiple else if statement in a single if construct     
>>>  - one if statement can only run one outcome       

>> else - used to specify outcome that will be run if one other conditions are met      
>> debugging - the process of finding out and correcting erros in a program       

> ## Types of Errors

>> ```Compile-Time-Errors``` - Complier checks syntax
>> - syntax error - how you write your statements(your grammar)
>>    - Spelling mistakes      
>>    - Punctuation errors    
>>    - Missing brackets, curly brackets, key words
>> - Incompatible types of data    
>> - .class file not created      

>> ```Logical Error``` - Hardest to detect/solve
>>  - compiles and runs correctly but incorrect results
>>  - wrong formula
>>  - wrong approach taken

>> ```Run-time Error``` - occur during program execution
>>  - causes program to terminate abnnormally
>>  - try dividing by zero


> ## Logical Statements
>> True/False     
>> 3 basic logical operator
>>  ```OR/AND/NOT```

>> **```AND```**: when all values are true
>> **```OR```**: when at least one value is true
>> **```NOT```**: flips the value of a statement

>> ### Truth Table
>> - Used to study logic by computer scientists

>>> | X | Y |X OR Y|X AND Y|
>>> |:--|:--|:-----|:------|
>>> |T|T|T|T|
>>> |T|F|T|F|
>>> |F|T|T|F|
>>> |F|F|F|F|

>> operator precendence - evaluate left to right
>> 1. AND( & & ) - checks first statement, if it is true, check the second one
>> 2. OR( | | ) - checks the first statement and second statement
>> 3. NOT( ! ) - reverses the statement

> ## Loops

>> Allows coders to repeat code     
>> Exit condition in loop      

>> ```java
>> while(condition){
>>  // do something
>> }
>> ```

>> ### While Loops
>> - consists of a condition statement that are executed while the condition is true      
>> - types of conditions used in a while statement are the same as in the ```if statement```     
>> - while the condition is true, repeat the statements in the loop

>>> ```java
>>> while(num <= 10){
>>>    System.out.println("Enter a number higher than 10.");
>>>    num = scan.nextInt();
>>> }
>>> ```

>> - the program continues repeating until the num is greater than 10      
>> - there may be times when you may want to specify more than one condition     
>> - no limit to the number of conditions, but should limit to 2 or 3     
>> - can combine conditions(logical statements) using ```&&``` and ```||``` conditional  operators

>>> ```java
>>> while(num >= 1 && num <= 10){ // runs until num is between 1 and 10
>>>     num = myScanner.nextInt();
>>> }
>>> ```

>> Incrementing By One
>> ``` java
>>   mynumber = mynumber + 1;
>>   // is the same as:
>>   mynumber += 1;
>>   // is the same as:
>>   mynumber++;
>> 
>> ```

>> Why counter: To keep track of how many times a loop has executed     

>> ```java
>> int counter = 0;
>> int guess = 0;
>> while(guess != 7){
>>    System.out.println("Guess a number between 1 and 10");
>>    guess = scan.nextInt();
>>    counter++;
>> }
>> System.out.println("It took you " + counter + " tries!");
>> ```


>> ### For Loops
>> - include three distinct statements separated by semicolon     
>> - first statement declares the counter variable           
>> - second statement specifies exit condition    
>> - third statement increments the counter variable after each iteration of the loop
>> - counter variable only exists within loop

>>> ```while``` and ```for``` loop: - may not need to run if condition is false

>>> ```java
>>> for(int i = 0; i < 10; i++){ // this loop runs 10 times
>>>     // do stuff here
>>> }
>>> ```

>> ### Accumulator
>>  - variables that add any value to a sum or total      
>>  - realize the need for the variable     
>>  - declare the variable
>>  - initialize it (give it a start value, usually 0)
>>  - accumulate the value in a loop (add the value to the variable)

>> ### Do while Loop

>>> They must run minimum once
>>> After running once, it checks the continue condition at the end of the iteration

>>> ```java
>>> do {
>>>   // do stuff here
>>> }while(condition);
>>> ```

>>> Example

>>> ```java
>>> public static void main(String[]args){
>>>    Scanner sc = new Scanner(System.in);
>>>    int total = 0, value;
>>>    do {
>>>       System.out.println("Enter values to sum and 0 to quit");
>>>       value = input.nextInt();
>>>       total = total + value;
>>>    }while(value != 0);
>>>    System.out.println("Your total is: " + total);
>>> }
>>> ```

> ### Random Number Generation
>> ### Method 1

>> ```java
>> import java.util.Random;
>> public class {
>>     public static void main(String[]args){
>>         Random randGen = new Random();
>>         int randNumber = randGen.nextInt(100) + 1;
>>     }
>> }
>> ```

>> ### Method 2   

>> using Math class

>> ```java
>> int myRandNumber = (int) (Math.random() * 100) + 1;
>> ```

> ## Reading From Files
>> ### Why read from files?
>>  - speed
>>  - less errors
>>  - easier to read, individual cases
>>  - get data from sources other than the keyboard
>>  - changing info is easy (only on the file)
>>  - more efficient (less time to test)
>>  - large data can be entered quickly (less room for error)
>>  - at the ```testing stage```, data can be carefully chosen to test the program

>> ### Intializing
>>> ```java
>>> Scanner fsc = new Scanner("myfile.txt");
>>> ```

>> ### Example Program
>>> ```java
>>> import java.io.File;
>>> import java.util.Scanner;
>>> public class ReadData {
>>>     public static void main(String[]args) throws IOException{
>>>         File file = new File("summerschool.txt");
>>>         Scanner input = new Scanner(file);
>>>         while(input.hasNext()) {
>>>             String firstName = input.next();
>>>             double avg = input.nextDouble();
>>>             System.out.println(firstName + " " + avg);
>>>         }
>>>         input.close();
>>>     }
>>> }
>>> ```

>> ### Why write from files? (store to disk)
>>  - you can save it for future use
>>  - print hard copy results and distribute it
>>  - write to a retrievable medium
>>  - store the info
>>  - make it more available to others
>>  - large data can be collected, stored, formatted acoording to needs

>> ```java
>> import java.io.PrintWriter; // can be used to create a file and write
>> // for example
>> output.println("hello world!"); output.printf("hello world!\n"); output.print("hello world!");
>> ```

>> ### Intializing

>>> ```java
>>> PrintWriter output = new PrintWriter("mytextfile.txt");
>>> ```

>> ### Example Program

>>> ``` java
>>> import java.io.File;
>>> import java.io.PrintWriter;
>>> public class PrintWriterExample {
>>>     public static void main(String[]args) throws IOException {
>>>         File myFile = new File("secretmessage.txt");
>>>         PrintWriter output = new PrintWriter(myFile);
>>>         output.println("hello");
>>>         output.println("world!");
>>>         out.close();
>>>     }
>>> }
>>> ``` 


# Unit 2: Arrays

> ```Arrays```: a data structure that allow you to hold multiple pieces of data, in a single object     
>   - hold a predetermined number of elements
>   - must be same type
>      ``` java
>      int, String, char, boolean, double, complex types
>      ```
>    - [] - square brackets means index
>    - arrays always start at 0 index
>    - must be assigned a fixed size
>    - use counted loop with array to do things

> ## Example:

>> ```java
>>  // declare an array of 5 integer
>>  int [] numArray = new int[5];
>>  // set the 0 index of numArray to 123
>>  numArray[0] = 123;
>>  // get the array size
>>  int arraySize = numArray.length;
>> ```

> ### Mid - program initialization of arrays
> - can declare the array at the beginning ant set size 
> - All variable and arrays must be declared at the beginning of the program for proper conventions
>> ```java
>> // declare variables and array
>> String[] names;
>> int numValues;
>> System.out.println("How many names?");
>> numValues = scan.nextInt();
>> // initialize array
>> names = new String[numValues];
>> ```

> ## Display
> - Simply iterate throughout the array and just print out all the elements
> - A ```for``` loop or ```while``` loop can be used
> - Simple display code

>> ```java
>> System.out.print("The elements in the array are: ");
>> for(int i = 0; i < array.length; i++){
>>     System.out.print(array[i] + " ");
>> }
>> System.out.println();
>> ```

> ## Search

> - To iterate through in array, or to search an element
> - Just loop through the array until you find the element
> - Use ```length``` to iterate through the entire array
> - Use appropriate comparators like ```==``` and ```.equals()```
> - Simple search code

>> ```java
>> int element = 12;
>> for(int i = 0; i < array.length; i++){
>>     if(array[i] == element){
>>         System.out.println("Element found at index: " + i);
>>         break;
>>     }
>> }
>> ```

> ## Finding The Average

> - Sum all the elements of the list and divide by the number of elements
> - Simple average finding code

>> ```java
>> int sum = 0;
>> for(int i = 0; i < array.length; i++){
>>     sum += array[i];
>> }
>> double average = sum / array.length;
>> System.out.println("The average is: " + average);
>> ```

> ## Finding Min / Max

>> ### Finding the Min
>> - Algorithm

>>> ```
>>> set the min to the first element, we assume its the minimum
>>> go through each element in the array, if we find an element that is smaller than the current min 
>>> change the current min to it, we can use either Math.min() or the < operator
>>> after iterating through the entire list, the min will be the smallest number
>>> ```

>> - Code
>>> ```java
>>> int min = array[0];
>>> for(int i = 0; i < array.length; i++){
>>>     if(array[i] < min){
>>>         min = array[i];
>>>     }
>>> }
>>> System.out.println("Smallest value is: " + min);
>>> ```

>> ### Finding the Max
>> - Algortihm

>>> ```
>>> set the max to the first element, we assume its the maximum
>>> go through each element in the array, if we find an element that is bigger than the current max 
>>> change the current max to it, we can use either 'Math.max()' or the '>' operator
>>> after iterating through the entire list, the min will be the biggest number
>>> ```

>> - Code
>>> ```java
>>> int max = array[0];
>>> for(int i = 0; i < array.length; i++){
>>>     if(array[i] > max){
>>>         max = array[i];
>>>     }
>>> }
>>> System.out.println("Biggest value is: " + max);
>>> ```

# Unit 3: Sorting
  - ```sorting```: the process of arranging a list of items into a well-defined order
  - final list rearrangement of the original list

> ## Bubble Sort
> - when x numbers in array, loop x - 1 times
> - The bubble sort algorithm works by swapping   adjacent pairs in the list until all adjacent pairs are sorted in order, at which the entire list is sorted
> - by making passes through the array, each pass moves from left to right
> - the first pass compares element 1 and element 2 and swaps them if they are out of order, then compares element 2 and element 3 and swaps them if they are out of order, and so on
> - the largest element is moved to the right
> - for a length of n, there are n - 1 passes

>> |Pass 1|Pass 2|Pass 3|Pass 4|
>> |:-----|:-----|:-----|:-----|
>> |```3 6``` 5 4 2|```3 5``` 4 2 6|```3 4``` 2 5 6|```3 2``` 4 5 6|    
>> |3 ```6 5``` 4 2|3 ```5 4``` 2 6|3 ```4 2``` 5 6|2 3 4 5 6|    
>> |3 5 ```6 4``` 2|3 4 ```5 2``` 6|3 2 4 5 6|    
>> |3 5 4 ```6 2```|3 4 2 5 6|
>> |3 5 4 2 6|

>> |Number of Elements|Number of Passes|Number of Comparisons|
>> |:-----------------|:---------------|:--------------------|
>> |4|3|6|
>> |5|4|10|
>> |6|5|15|
>> |7|6|21|
>> |8|7|28|
>> |9|8|36|
>> |10|9|45|
>> |```n```|```n - 1```|```n * (n - 1) / 2```|

> ## Algorithm

>> ```
>> repeat the following n -1 times
>>   for each element in the array, starting at the first element
>>       compare items in current positions with the element in the next position
>>       if item in current position is greater than item in next position then
>>          swap the 2 items using the following steps
>>          temp = current list item
>>          current list item = next list item
>>          next list item = temp
>> ```

> ## Code

>> ```java
>> // array called list
>> for (int i = 0; i < list.length - 1; i++){
>>     for(int j = 0; j < list.length - 1 - i; j++){
>>         if(list[j]  > list[j + 1]){
>>             int temp = list[j];
>>             list[j] = list[j + 1];
>>             list[j + 1] = temp;
>>         }
>>     }
>> }
>> ```

> ```CompareTo(String)```
>  - result is a ```negative integer``` if this String object lexicographically(alphabetically) precedes the argument string
>  - result is a ```positive integer``` if this string object
>  - result is ```zero``` if the string are equal

# Unit 4: Methods
> ```methods``` - subprograms in java
>   - a group of programming statements that are given a name
> two types of methods
> - ```function-type methods``` - calculates and returns a value
> - ```procedure-type methods``` - executes some commands and has a void return type

> ## Why Methods
> - allows for code to be reused throughout a program
> - more efficient and neatly organized programs
> - allow for easy modification later on

> ## Examples:
>> ```java
>> public static int square(int number){
>>    return number * number;
>> }
>>
>> public static void printHelloWorld(){
>>    System.out.println("Hello World!");
>> }
>> ```

>> int - return - type
>> square - method name
>> int number - formal parameter

> ## Built in methods

>> |Method|Description|
>> |:-----|:----------|
>> |```Math.abs(x)```| returns the absolute value of the paramter x|
>> |```Math.random()```|returns a pseudorandom value uniformally distributed between 0 and 1|
>> |```Math.round(x)```|returns the value of x rounded according to the usual arithmetic rules|
>> |```Math.ceil(x)```|returns the value of x rounded up to the nearest integer|
>> |```Math.floor(x)```|returns the value of x rounded down to the nearest integer|
>> |```Math.max(x, y)```|returns the greatest of values x and y|
>> |```Math.min(x, y)```|returns the smallest of values x and y|
>> |```Math.sqrt(x)```|returns the value of the square root of x|
>> |```Math.pow(x, y)```|returns the value if x raised to the power of y|
>> |```Math.PI```|returns the double value of the mathemetical π|
>> |```.charAt(x)```|returns the character at index x|
>> |```.substring(st, ed)```|returns the string beginning at st and ending at ed(exclusive)|
>> |```.toLower()```|returns the lower-cased version of the string|
>> |```.toUpper()```|returns the upper-cased version of the string|
>> |```.split(regex)```|splits the string at index(s) where the ```regex``` appears and returns an array of strings|
>> |```isCharacter(x)```|checks if x is an character|

> ## More on Methods 
>>  - ```signature``` - method name and parameter
>>  - if method is to be used outside the class in which it is defined, it must be declared as a public in the class
>>  - call or invoke a method to use it
>>  - ```formal parameter``` - the names of the parameter accepted in the signature
>>  - ```actual parameter``` - the values passed into a method
>>  - if no parameters, empty set of parentheses are used
>>    - ```java
>>      c.readInt();
>>      ```

> ## Return Type Methods
> - public static ```return type``` ```method name```(parameters) 
> - Example:
>>  ```java
>>   public static int square(int num1){
>>       // do stuff here
>>   }
>>   ```

> ## Void Type Methods
> - public static void ```method name```(parameters)
> - Example:
>>  ```java
>>   public static void drawPicture(){
>>       // do stuff here
>>   }
>>   
>>   public static void draw4Circles(int x1, int y1, int x2, int y2){
>>       // do stuff here
>>   }
>>   ```

> ## Java language - Strongly typed
> - meaning you are not allowed to assign a value to a variable that is consistent with its declare type

> **```Scope of variable```** - the part of the program over which the variable can be accessed or referenced
> - referes to the ```accessibility``` of a variable
> - variables cannot be accessed before they are declared

> Variables can be declared in several different places
>  - class bodies (referred to as global or class level variables)
>  - as parameters to methods(in method signature)
>  - in a method body
>  - in a statement block (like a loop or a while loop)

>> ```java 
>> public class VariableExample{
>>    static Scanner myScanner = new Scanner(System.in);
>>
>>    public static void main(String[]args){
>>        // main method
>>    }
>> }
>> ```

> - Description of Example
>   - variable myScanner is declared outside of the main method in the class level
>   - the variable is considered to be a global variable that can be accessed anywhere in the class
>   - for now, global variables should have the keyword ```static``` preceding the declaration

> - In methods
>   - a method may declare local variable in the body of the method for use onlyin that method
>   - variable may also be declared in the parameter list - only can be accessed in the method

>> ```java
>> public static int thirdPower(double number){
>>     int cube; // local variable
>>     cube = number * number * number;
>>     return cube;
>> }
>>
>> public static double thirdPower(double number){
>>     double cube;
>>     cube = number * number * number;
>>     return cube;
>> }
>> ```

>   - variable cube in thirdpower is local to that method
>   - local variables cannot be accessed from outside of the method

> - In blocks of code
>   - variables defined in a block are only accessible from within the block
>   - the scope of the variable is the block in which it is defined

>> ```java
>> for(int x = 0; x < 5; x++){
>>    System.out.println(x);
>> }
>> ```
>>   - the variable x can only be accessed in the for loop

> ## Method void return type
> - return type void means that a method will not return a value
> - the method can still have parameter when the return type is void

> ## Naming conventions
> - method names should indicate an action
> - verbs make good methods names
> - methods names should begin with a lowercase letter and then an uppercase letter should begin with each word within the name
> - method names may not contain spaces

> ## Pass By Value

>> ```java
>> public static void drawBar(int length){
>>     for(int i = 0; i < length; i++){
>>          System.out.print("* ");
>>     }
>>     System.out.println();
>> }
>> ```

> - means that when a method is called, a ```copy``` of the value of each argument is passed to the method
> - this copy can be changed inside the method, however such a change will have no effect on the actual argument
> - copies of the actual parameter values from main are sent to the methods, where they become ```foramal parameters```. When the method is finished, the copies are discarded. The actual ```paramter``` values remain unchanged. Notice that nothing is returned in the above method and how values ```a``` and ```b``` are not changed in the main method when passed in the method below

>> ```java
>> public static void main(String[]args){
>>     int a = 0, b = 10;
>>     System.out.println("The starting value of a and b are: " + a + " and " + b);
>>     change(a, b);
>>     System.out.println("The values of a and b are: " a + " and " + b);
>> }
>> public static void change(int a, int b){
>>      a = 999;
>>      b = 21;
>> }
>> ```

> ## Pass by reference

> - occurs when an object is passed to a method, its memory address location (its ```reference```) is used
> - ```Arrays``` behave like objects, their memory location is passed to the method
> - that means that when an array is manipulated in the method that we are actually ```changing``` the array
> - be cautious when sending an array in the method as it will change the data in the original array

>> ```java
>> public static void main(String[]args){
>>     int array[] = new int[4];
>>     a[0] = 1000;
>>     a[1] = 2000;
>>     a[2] = 3000;
>>     a[3] = 4000;
>>     System.out.print("The values of the array are: ");
>>     for(int i = 0; i < a.length; i++){
>>          System.out.print(a[i] + " ");
>>     }
>>     System.out.println();
>>     System.out.println();
>> 
>>     change(array);
>>
>>     System.out.print("The values of the array are: ");
>>     for(int i = 0; i < a.lengh; i++){
>>          System.out.print(a[i] + " ");
>>     }
>>     System.out.println();
>> }
>> public static void change(int array[]){
>>      array[0] = 1;
>>      array[1] = 2;
>>      array[2] = 3;
>>      array[3] = 4;
>> }
>> ```

# Unit 5: Software Design Process

> ## 5 Steps

>> |Step #|Description|
>> |:-----|:----------|
>> |Analysis|Also called ```problem solving```, its the process of ```breaking problems down into smaller more manageable parts```|
>> |Design|In this stage, an ```algorithm``` which is a set of instructions defined to solve the problem|
>> |Implementaion|Also referred to as ```coding```. Where you express the algorithm in a ```programming language```|
>> |Testing|Invlovles the running of the program will a full range of data. Valid data: ```the data the user should be inputting.``` Invalid data: ```incorrect or unexpected data```|
>> |Maintenance|```Maintaining a program over time so that any changes are needed are incorporated```|

> **```valid data```**: the data the user should be inputting
> **```invalid data```**: ```incorrect``` or ```unexpected``` data
> **```algorithm```**: a set of ```insturction``` defined to ```solve``` the problem
> **```Well designed program```**: a program that ```reliably``` solves the problem it was created to solve
> **```Waterfall Model```**: A flow chart, each phase must be completed before the next one

> ## Programmers
> - Programmers have the abilites to:
> - 1. Solve Problems
> - 2. Organize information
> - 3. Design Solutions
> - 4. Express instructions in a logical sequence
> - 5. Input them into a computer

> - My Points for abilities and characteristics:
>   - 1. Communicate, collabration
>   - 2. Present their solution
>   - 3. Work as a team

# Unit 6: Problem Solving

> ## Code Correction
> - ```;``` semicolons
> - Accessing outside of specified range of a ```string``` or ```array```
> - Missing or extra brackets ```{}```, ```()```, ```[]```
> - Undeclared variables, scope of an variable
> - Wrong method calls
> - incorrect syntax

> ## Problem solving
> - **Debugging**
> - Printing out code
> - Rubber ducking your code

# Credits
> Creator, Editor: --> magicalsoup (ME)!     
> Helper, Information Provider(s): --> Matthew Wong, Samantha Ouyang




