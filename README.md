*(This project was a part of studying at Kasetsart University, Thailand)*

# Project from Principles of Programming subject called LexicalAnalysis".
(การบ้านวิชาหลักภาษาโปรแกรม)

# Topic/Question 
(โจทย์)

This software will be proceed "Lexical analysis" from source code into a text file following:

(ให้เขียนโปรแกรมการทำ Lexical analysis จาก Source code ที่อยู่ใน Text file ดังต่อไปนี้)

 	      if (a >= b) b = 42;
        
Then, show the results to be "Token stream" following:

(แล้วให้ได้ผลลัพท์เป็น Token stream ดังต่อไปนี้)

      IF
      
      LPAREN
      
      ID(a)
      
      GEQ
      
      ID(b)
      
      RPAREN
      
      ID(b)
      
      BECOMES
      
      INT(42)
      
      SCOLON
      
      
   
Then, save these results into text file.

(แล้วให้นำผลลัพธ์ที่ได้บันทึกไว้ใน Text file)

# รายละเอียดของโปรแกรม

There are 2 classes following:

มี 2 Class คือ

(1) "MyMain" class. and there is main method.

Class ชื่อ MyMain, มี Main method


(2) The "LexicalAnalysis" class, there are methods following:

Class ชื่อ LexicalAnalysis มี Method ดังนี้:

-	setSourceCodeInOneLine
-	stringToCharArray
-	checkEachChar
-	writeToFile
       
  
  
       Software will read data from the file named "My_Input.txt", then save the result to the file named "My_Output.txt", in the same directory.
       
      โดยโปรแกรมจะอ่านข้อมูลจากไฟล์ชื่อ My_Input.txt แล้วบันทึกผลลัพธ์ไปยังไฟล์ชื่อ My_Output.txt ใน Directory เดียวกับตัวโปรแกรม
