# kotlin-sandbox

* https://kotlinlang.org/


# Command Line Setup

* https://kotlinlang.org/docs/tutorials/command-line.html

	SDKMAN!

	An easier way to install Kotlin on UNIX based systems such as OS X, Linux, Cygwin, FreeBSD and Solaris is by using SDKMAN!. Simply run the following in a terminal and follow any instructions:

	$ curl -s https://get.sdkman.io | bash

	Next open a new terminal and install Kotlin with:

	$ sdk install kotlin


# Creating and running a first application

    Create a simple application in Kotlin that displays Hello, World!. Using our favorite editor, we create a new file called hello.kt with the following:

    fun main(args: Array<String>) {

        println("Hello, World!")
    }

    The -d option indicates what we want the output of the compiler to be called and may be either a directory name for class files or a .jar file name. The -include-runtime option makes the resulting .jar file self-contained and runnable by including the Kotlin runtime library in it. If you want to see all available options run

    $ kotlinc -help


# Run the application.

	$ java -jar hello.jar


# Compiling a library

	If you're developing a library to be used by other Kotlin applications, you can produce the .jar file without including the Kotlin runtime into it.

	$ kotlinc hello.kt -d hello.jar

	Since binaries compiled this way depend on the Kotlin runtime you should make sure the latter is present in the classpath whenever your compiled library is used.

	You can also use the kotlin script to run binaries produced by the Kotlin compiler:

	$ kotlin -classpath hello.jar HelloKt

	HelloKt is the main class name that the Kotlin compiler generates for the file named hello.kt.


# Getting Started with IntelliJ IDEA 

* https://kotlinlang.org/docs/tutorials/getting-started.html
* http://hadihariri.com/2014/01/06/intellij-idea-minimal-survival-guide/
* http://hadihariri.com/2013/12/29/jvm-minimal-survival-guide-for-the-dotnet-developer/
* https://www.jetbrains.com/help/idea/getting-started-with-gradle.html


	Create a New Project. We select Java Module and select the SDK. Kotlin works with JDK 1.6+. Also, select the Kotlin (Java) checkbox.


# Using Gradle

* https://gradle.org/kotlin/
* https://kotlinlang.org/docs/reference/using-gradle.html
* https://github.com/JetBrains/kotlin-examples/tree/master/gradle/hello-world
* https://github.com/gradle/kotlin-dsl/tree/master/samples

	$ gradle init
	$ gradle init --dsl kotlin

	In order to build Kotlin with Gradle you should set up the kotlin-gradle plugin, apply it to your project and add kotlin-stdlib dependencies. Those actions may also be performed automatically in IntelliJ IDEA by invoking the Tools | Kotlin | Configure Kotlin in Project action.

	* https://kotlinlang.org/docs/reference/using-gradle.html#plugin-and-versions

	
	
	* https://kotlinlang.org/docs/reference/using-gradle.html#targeting-the-jvm
	* https://kotlinlang.org/docs/reference/using-gradle.html#configuring-dependencies





















