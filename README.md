# Android-Dev-Mini-Projects
This repository contains Learning materials on Android Development

***************************************
			DAY 1
***************************************


Step1 : Download Android Studio and Set it Up

Step2 : Learn about Folder Structure of an Android Project (34:40-50:00)

	#manifests 
	-every android app has an androidmanifest.xml file. It contains info. that a device needs to run the app.
	-acts as an intermediater between android os and our application
	-you can add different permissions inside the manifests file
	-contains details about all the activities

	#java 
	-Contains all the source code files we create during the development of the app eg: second activity
	-Has 3 sub folders/directories
		1. com.example.myapplication -to store source code files
		2. com.example.myapplication (android test) -to create classes related to instrumented testing (testing involved with the device)
		3. com.example.myapplication (test) -to create classes related to normal unit testing

-------------------------------------------------------------------------------
|
|			NOTE
|
|	-kotlin language has been created on top of java language, on top of java libraries.
|	-kotlin is more advanced, mordern version of java
-------------------------------------------------------------------------------


	#Gradle Scripts
	-automated build system
	-automatically do required configurations


Step3 : Build your first Android App (50:00 - 1:49:00)

-------------------------------------------------------------------------------
|			NOTE
|
|	-In android a create() func. is called when an activity is first created.
|	-Use sp for text & dp for margin, border, etc
-------------------------------------------------------------------------------


***************************************
			DAY 2
***************************************

1. Kotlin Fundamentals. (1:49:00 - 2:35:00)
	-Refer to text files 1.1 to 1.4 

2. Activity Lifecycle. (2:40:00 - )
	-Research type work on Android Activity Lifecycle using Logcat messages 
	
	#Logcat (2:35:00 - 2:40:00)
	-It displays sys messages and the messages that we added to our app using the log class.
	-It displays messages in real time and kepps a history.
	-It helps us to understand the code to and find errors

3. Object Oriented Kotlin
