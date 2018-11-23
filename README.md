# Text-Editor and HTML Validator
This text editor will let the user enter, change, store, and print text. It will provide an "empty" display screen (or "scrollable page") with a fixed-line length. Those lines could be filled with text, line by line. User will be able to move to a new page, scroll forward or backward, make global changes in the document, save the document, and perform other actions. After saving a document, user will be able to then display it. Before displaying it, user will be able to format it. It will also be used to enter program language source statements or to create documents such as technical manuals. It will also work as HTML validator.

## DEMO

Download the Jar file and double click to run

Or run `java -jar SimpleJavaTextEditor.jar` from the command line

Or run ant on the extracted folder a dist folder will be created run the file(note - make the jar file executable) 


### Important

**Icons directory and its files must be present on the path when running the application (so you will have to move "*icons/*" into "*src/*" directory)**
### tools info
1. Ant- type ant in the teminal to build the project.
2. javadoc - in terminal type javadoc filename.java
3. github - UI based
4. Jar-  in src/ directory type:  jar cmvf ../manifest.mf ../SimpleJavaTextEditor.jar simplejavatexteditor/*.class
5.  Eclipse or Netbeans or terminal+Editor whichever comfortable to you.
6. error-prone - gives possible java errors in form of errors.
type in home ie default terminal location:
java -Xbootclasspath/p:error_prone_ant-2.1.1.jar com.google.errorprone.ErrorProneCompiler /home/ayush/Documents/textedit/src/simplejavatexteditor/UI.java
7. maven(instead of ant) instead of javac only for compiling.
in src directory type ---------- mvn compile.
8. Profling tool:
javac -J-agentlib:hprof=heap=sites Hello.java
