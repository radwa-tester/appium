Feature: Create New Task
Scenario: The User can add new task 
Given click add new tasks
Given Enter"<TaskName>"
When click save
Then Task added successfully

Examples:
|TaskName |
|cucumber Task 1 |
|cucumber Task 2 |