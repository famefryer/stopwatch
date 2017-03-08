# Stopwatch Task By Triwith Mutitakul (5910545680)
I ran the tasks on a HP Pavilion Notebook, and got these results:<br>
1.Append 50,000 chars to String          ===> 0.642918 sec<br>
2.Append 100,000 chars to String                     ===> 2.044663 sec<br>
3.Append 100,000 chars to StringBuilder              ===> 0.001953 sec<br>
4.Sum 1,000,000,000 double values from an array.     ===> 1.346359 sec<br>
5.Sum 1,000,000,000 Double objects from an array     ===> 4.945911 sec<br>
6.Sum 1,000,000,000 BigDecimal objects from an array ===> 9.366415 sec<br>
<br>
<br>
## Explanation of Results
### String/StringBuilder
   ---From the result,You can see a big different between appended char to String and append char to StringBuilder.It because when you append a new char to String,It will create a new String instead of using the same string.for example,Suppose first you have one string a="Jack" and you want to append "Rose".You use a+"Rose",Yes the result is "JackRose" and your computer has to provide "Jack","Rose","JackRose".But the StringBuilder do not.If you create new StringBuilder "Jack" and you want to append more char.You append it with .append() method.All StringBuilder need to do is just update the same value.Because inside of the StringBuilder has a char[] to collect value.<br>  
   Summarize You actually know if we create a new String it takes time and consume your memory more than use the same String.
### double/Double/BigDecimal
---From the result,Start with the slowest speed "Bigdecimal",adding and calculating number with BigDecimal is too slow because the BigDecimal class is an object not like a primitive type It must contain a attribute and method.Besides,The BigDecimal can store almost every decimal number.That why we called BigDecimal.Actually The greatest skill to store a lot of decimal place is coming with the a lot of memory was consumed.<br>
---Next is "Double",It almost like the BigDecimal class but have no skill to store decimal place.Double class is an object that contain attribute and method inside of it.Actually when you use it for calculating it must need to change that to primitive type.Then change back to object.That why Double class is slower than double.<br>
---Last is the fastest "double",From the two previous paragraph,double is the primitive type.It is faster than Double and BigDecimal because double has no to contain method or attribute like object.<br>
---Summarize double is the fastest because it has no to contain any attribute or method,Double is faster than Bigdecimal because it has no to contain a lot of decimal place like BigDecimal,BigDecimal is the slowest because it need to contain every decimal place of a number.  

