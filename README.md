# DECISION_APP_MATRIX
This project is a tool developed for Eisenhower's matrix users. 
This app is based on this matrix that can look like this : 
![alt text](https://s1.qwant.com/thumbr/0x380/b/1/4f4017c3cbb150b9f9aedf9b42707f0126a8874876f2454c2f33540eb90ad4/The-Eisenhower-Decision-Matrix-png.png?u=https%3A%2F%2Fluxafor.com%2Fwp-content%2Fuploads%2F2018%2F10%2FThe-Eisenhower-Decision-Matrix-png.png&q=0&b=1&p=0&a=0)



This matrix is divided in 4 parts : 
- important and urgent case 
- important and not urgent case 
- not important and urgent case 
- not important and not urgent case 

![alt text](https://i.imgur.com/NSS8Kzk.png)


At the center of the App, you can click on the Floating action button to see all the tasks. You can:
- see all of the tasks 
- filter the tasks 
- search a specific task
- add or edit a task 

![alt text](https://i.imgur.com/LHMPrEF.png)



Within the edit task layout, you can : 
- mark the name
- set the task as important 
- set the task as urgent
- add the task to Google Calendar 
- delegate the task by sending a message to someone
- add a little description to the task 

![alt text](https://i.imgur.com/PcM7CFK.png)



On the setting screen, you can : 
- change the theme's colors of the matrix 
- click on a switch button to enable notification
- click on a switch button to use the Night Mode or the Light Mode
- Kill the app and send to user on the main screen 
- Send the user to a web page about the Time Management 

![alt text](https://i.imgur.com/8GnxmzB.png)

You will find in the four cases of the matrix, you can : 
- see the tasks that belongs to the appropriate case
- go see all the tasks 

If you scroll from the left to right on the screen, you will find a navigation drawer. 

The code is divided like this : 
- a data folder that contains the database, task class and functions for the database :
    - PreferenceManager.kt 
    - Task.kt
    - TaskDao.kt 
    - TaskDatabase.kt 
- a matrix folder that contains the mains files for the matrix and the settings
    - MainMatrix.kt
    - Settings.kt
- a user interface that contains other folders: 
    - an "add edit task folder" to edit the tasks :
        - AddEditTaskFragment.kt
        - AddEditTaskView.kt
    - a "delete all completed" folder to delete the tasks : 
        - DeleteAllCompletedDialogFragment.kt
        - DeleteAllCompletedViewModel.kt
    - a "matrix interface" folder that contains the code files of the mains cases : 
        - MatrixFragmentINU.kt
        - MatrixFragmentIU.kt
        - MatrixFragmentNINU.kt
        - MatrixFragmentNIU.kt 
    - a "tasks" folder that contains the code files to show, adapt the tasks
        - TaskAdapter.kt
        - TasksFragment.kt
        - TasksViewModel.kt
    - the MainActivity.kt file that contains the content of the Layout for all the tasks
- an "util" folder that contains a ToDoApplication.kt file 
- a "directory interface" folder that contains AppModule.kt

Among Layout files are the following layouts : 
- activity_main.xml that show every tasks and filter them
- activity_main_matrix.xml that show the main view of the matrix and the first image of the app 
- activity_settings.xml that shows the Settings view
- fragment_add_edit_task.xml that shows the view of Edit Tasks
- fragment_important_not_urgent.xml that shows the view of this case 
- fragment_important_urgent.xml that shows the view of this case
- fragment_not_important_not_urgent.xml that shows the view of this case
- fragment_not_important_urgent.xml that shows the view of this case
- fragment_tasks.xml that shows the tasks view for activity_main.xml 
- item_task.xml that shows is depicted one task 
- nav_header.xml that shows a view for the navigation drawer

Among the menu folder : 
- drawer_menu.xml for the navigation drawer
- menu_fragment_tasks.xml to select an option for activity_main.xml

Among the Navigation folder : 
- nav_graph.xml that is used to navigate through different views

Current state of the project : 
Currently here is what is not done yet : 
- filter the tasks through the cases 
- Night mode and Light mode that work properly
- buttons to change the theme's colors that work properly 
- save the data written on the description text within a task
- stop to duplicate a task when marked as important or urgent 
- configure the buttons of the navigation drawer 

Put apart those problems that would require a little bit more of time and investment, everything works as wanted. 

Positives and negatives aspects of Android Studio : 
Positives aspects : 
- Android is easy to access
- versatile, user can do many things 
- auto translation from java to kotlin
- many documentations and tutorials to help the developer
- developer's work can touch millions of Android users
- un fast, direct and concrete rendering 
- Android Studio adapts the code when you need it 
- it is easy to create a rendering with the layout technologies
- to test your application on your personal smartphone 
- java and kotlin are programing languages oriented toward objects, which make them easier to read the code and understand
- the split view and design view to check what the developer is doing
- structure projects

Negatives aspects : 
- logical statements to get from the languages and Android Studio itself, such as the gradle files
- a necessary investment to understand correctly 
- Android Studio is reserved for Google's technologies
- things will be harder if you are not good with java
- Android Studio consumes a lot in terms of battery

Main developers for this project : 
- DUMAY-ROGER Guillaume 
- PIOT Fabien 
- PUDAL Loïc 
Group 1Y12 
ESME SUDRIA LYON 
2020-2021

feedback for the course : 
- give access of simple tutorials to students (even though they can find it on the web)
