The following topic is called **Debug in IDE**. (IDE - the application where you write the code and )
In other words, the way of how to visualize code in the IDE rather than in the Visualizer.

Debug in IDE has its advantages:
* No limitation for number of commands to be visualized
  * If you put many lines, the visualizer will not be able to run more than around 150 lines
* Can use complex libraries and language features debug(visualize), as the Visualizer works only with standard features 
  * You can use imports different classes and libraries in IDE
* More control and debug features


Terminology of debug in IDE:
* Breakpoint 
  * point where the normal execution of the application is stopped and handed over the control to a user
* Step Over
  * execute the current line
* Step Into
  * execute the current line and go inside the method if current line has a method invocation
* Step Out
  * Go out from the methods if the current line is in the method
* Resume
  * Release control and run application until meet the next breakpoint or program is terminated.
* Calculate
  * Run expression while on debug mode

We go step by step, so let's see a couple of examples of debugging via the visualizer and debug mode:


TODO actions:
Record video1
  put breakpoint
  run in debug mode
  show variables
  Step Over Until End of the program
Record video2 (Resume and two breakpoints)
  put two breakpoint
  run in debug mode
  get control
  show variables
  Resume
  get control 2
  show variables
  Resume to end program
Record video3 (Step Into and Step Out)
  Put Breakpoint 
  StepInto standing on the method invocation 
  Do a couple of steps Step Over
  Step Out
  Resume
  End of program
Record video4 (Expression and Calculate)
  Put Breakpoint 
  Calculate 
  Or add variable
Record video5 (Change variable on the fly)
  Put Breakpoint
  Change Variable and change the flow
  Do 
  

