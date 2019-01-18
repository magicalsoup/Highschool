# Computer Science Review Sheet

> ## Exam Layout
>> |Part|Description|Marks|
>> |:---|:----------|:----|
>> |```A```|**True / False**|10|
>> |```B```|**Multiple Choice**<br>- All java code learnt, selection, loops, methods, Arrays, methods, strings|38|
>> |```C```|**Short & Long Answers**<br>- Compare and contrast short code, methods, problem solving|20|
>> |```Total```||68|

## Intro To Programming

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

> ## Varaibles
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

>> String - object data type
>> ```equals(String)``` 

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
>> to tell compiler to include scanner class in the .class file       
>> line at very top of file
>> create scanner using 
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


# Unit 2 Arrays

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
>  - result si a ```negative integer``` if this String object lexicographically(alphabetically) precedes the argument string
>  - result is a ```positive integer``` if this string object
>  - result is ```zero``` if the string are equal




