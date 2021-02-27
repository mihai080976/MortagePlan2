# MortagePlan2
* The ".java" file provided in src folder can be compiled and run in any supported IDE like Eclipse,IntelliJ or Netbeans.
* Do verify that correct file path is mentioned in PayCalculator's 16th line where File f1=new File("file path here");
* This application works for the provided file and if you do want to provide new inputs do remember to  edit the file in same format as
  provided which is "|Customer,Total loan,Interest,Years" (each inputed seperated by a ',').
* I have formated the "E (Fixed monthly payment" to show up to 2 decimal places, if you want the exact answer change
  "df2.format(E)" to just "E" at line 32 in PayCalculator file.
*The tests throws an exception if the fill is empty.
