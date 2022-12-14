# SortingTriangles task 03

# General requirements
1.	When passing invalid parameters for execution, 
the application should not crash.
2.	Running without parameters displays instructions for using the program.
3.	Parameters are passed in the order given in the job description.

## 3.	SortingTriangles

Develop a console program that prints triangles in descending order of their area. After adding each new
triangle, the program asks if the user wants to add another one. If the user answers “y” or “yes” (case
insensitive), the program will ask you to enter data for another triangle, otherwise it will output the result to
the console.
- Calculation of the area of a triangle should be made according to Heron's formula.
- Each triangle is defined by the name and lengths of its sides.
Input format (separator - comma):<br/>\<name>, \<side length>, \<side length>, \<side length>
- The application must handle floating point input.
- Input must be case insensitive, spaces, tabs.
- The data output should be the following example:

============= Triangles list: ================/
1. \[Triangle first]: 17.23cm
2. \[Triangle 22]: 13cm
3. \[Triangle 1]: 1.5cm

### Launching the program:
As a user you can start the project by running the class Main in src/main/java and follow the instruction on the console. 
