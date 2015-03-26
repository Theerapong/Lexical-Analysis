# LexicalAnalysis


การบ้านวิชาหลักภาษาโปรแกรม

# โจทย์
 ให้เขียนโปรแกรมการทำ Lexical analysis จาก Source code ที่อยู่ใน Text file ดังต่อไปนี้
 	      if (a >= b) b = 42;
 แล้วให้ได้ผลลัพท์เป็น Token stream ดังต่อไปนี้
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
แล้วให้นำผลลัพธ์ที่ได้บันทึกไว้ใน Text file

# รายละเอียดของโปรแกรม

มี 2 Class คือ

(1)	Class ชื่อ MyMain
มี Main method

(2)	Class ชื่อ LexicalAnalysis
มี Method ดังนี้
-	setSourceCodeInOneLine
-	stringToCharArray
-	checkEachChar
-	writeToFile
       
      โดยโปรแกรมจะอ่านข้อมูลจากไฟล์ชื่อ My_Input.txt แล้วบันทึกผลลัพธ์ไปยังไฟล์ชื่อ My_Output.txt ใน Directory เดียวกับตัวโปรแกรม
