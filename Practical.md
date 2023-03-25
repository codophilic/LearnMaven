# Maven using Eclipse

## Standard Directory structure

- When we create a project it follows a standard directory structure which allows others to know the code properly rather then figuring out in custom directories.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/2.jpg)

## Key Concepts

1. **POM file:*** Project Object Model file located in the root of maven project which consists of project meta data, dependencies and plugins.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/3.jpg)

![](https://github.com/codophilic/LearnMaven/blob/main/Images/4.jpg)

2. **Project Coordinates:** It is use to uniquely identify a project similar to GPS coordinates (basically getting informatiion to identify / locatte the project)

![](https://github.com/codophilic/LearnMaven/blob/main/Images/5.jpg)

![](https://github.com/codophilic/LearnMaven/blob/main/Images/6.jpg)

3. **Dependencies:** If we require dependencies we just need to define it in pom.xml file in dependencies section which is downloaded by maven. It is optional to provide version number in dependencies by it becomes important when we are performing DevOps using it.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/7.jpg)

- To get these dependencies coordinates we can go to the maven central repository.

4. **Maven Archetypes:** In Maven, an archetype is a template or blueprint for creating new projects. It defines the structure, files, and configuration required for a specific type of project, and can be used to generate a starting point for a new project that follows a specific architecture or pattern.

- It is basically starter directories structure based on the developer requirements.

- Maven provides several built-in archetypes for creating different types of projects, each with a specific project structure and configuration. Some of the most commonly used archetypes are:

1. `maven-archetype-quickstart`: This is the most basic archetype for creating a simple Java project with a single source file and a basic POM file.

2. `maven-archetype-webapp`: This archetype is used for creating a web application project with a predefined directory structure for web resources and deployment descriptors.

3. `maven-archetype-j2ee-simple`: This archetype is used for creating a Java EE 6 web application project with a predefined directory structure for Java classes, web resources, and deployment descriptors.

4. `maven-archetype-j2ee-webapp`: This archetype is used for creating a Java EE 6 web application project with a predefined directory structure for Java classes, web resources, deployment descriptors, and JUnit tests.

5. `maven-archetype-ear`: This archetype is used for creating an EAR (Enterprise Archive) project, which is a standard format for packaging and deploying multiple Java EE modules as a single application.

6. `maven-archetype-quickstart-jdk8`: This is a variation of the maven-archetype-quickstart archetype that includes support for Java 8 features, such as lambdas and streams.

- These are just a few examples of the many archetypes available in Maven. Developers can also create their own custom archetypes to suit their specific project needs or requirements.

- These archetypes can be created using Maven CLI or IDE's like eclipse, Netbeans,, IntelliJ etc.

## QuickStart

- This folder consists of basic maven quickstart directory structure for a standalone project with JAR file as output.

## Dependencies

- Google/Gauva provides different utilities which can be used as a dependencies in our maven

- In Maven, there are primarily two types of dependencies: direct dependencies and transitive dependencies.

1. Direct dependencies: Direct dependencies are the dependencies that are explicitly specified in the pom.xml file of a project. For example, if you have a project that uses the Spring framework, you would specify the Spring dependencies in your pom.xml file as direct dependencies.

2. Transitive dependencies: Transitive dependencies are the dependencies that are not directly specified in the pom.xml file, but are required by one of the direct dependencies. For example, if you have a project that uses the Spring framework and the Spring framework uses a third-party library called Hibernate, then Hibernate would be a transitive dependency of your project.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/8.jpg)

3. Optional dependencies: These are dependencies that are not required for the project to function, but may be useful in certain scenarios. For example, if your project has a web interface, you may include an optional dependency on a logging framework that logs HTTP requests and responses for debugging purposes.

- Example

```
<dependencies>
  <dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk-s3</artifactId>
    <version>1.12.76</version>
    <optional>true</optional>
  </dependency>
</dependencies>

```
- In this example, the aws-java-sdk-s3 library is declared as an optional dependency. This library provides access to Amazon S3, but is not required for the project to function.


4. Provided dependencies: These are dependencies that are required for compiling the project, but are expected to be provided by the environment in which the project will run. For example, if your project is a web application that will run on a Java web server, the servlet API may be a provided dependency.

- Example

```
<dependencies>
  <dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.1.0</version>
    <scope>provided</scope>
  </dependency>
</dependencies>

```

- In this example, the javax.servlet-api library is declared as a provided dependency. This library provides the Servlet API, but is expected to be provided by the container in which the web application will run.

5. Test dependencies: These are dependencies that are only required for running tests on the project, and are not included in the final build of the project. For example, if your project uses JUnit for unit testing, you would include JUnit as a test dependency in your pom.xml file.

```
<dependencies>
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
  </dependency>
</dependencies>

```
- In this example, the junit library is declared as a test dependency. This library provides a testing framework for writing and running unit tests on the project.

6. System dependencies: These are dependencies that are not available in any public repository, but are available on the local file system or network. They are specified in the pom.xml file with a `<systemPath>` element.

```
<dependencies>
  <dependency>
    <groupId>com.example</groupId>
    <artifactId>example-library</artifactId>
    <version>1.0</version>
    <scope>system</scope>
    <systemPath>${project.basedir}/lib/example-library.jar</systemPath>
  </dependency>
</dependencies>

```

- In this example, the example-library library is declared as a system dependency. This library is not available in any public repository, but is available on the local file system.

7. Import dependencies: These are used in multi-module projects to share dependencies between modules. An import dependency allows you to specify a set of dependencies in a parent pom.xml file that can be used by all the child modules of the project.

## Maven Classpath

- In Maven, the classpath is a list of directories and JAR files that the Java Virtual Machine (JVM) uses to locate classes and resources needed to run an application.

- For example, let's say you have a Maven project that depends on the Spring Framework. When you build your project, Maven will automatically download the Spring Framework JAR file from the Maven repository and add it to your project's classpath. This means that when you run your application, the JVM will be able to locate and use the classes and resources provided by the Spring Framework.

- The classpath is managed by Maven and is determined by the project dependencies, along with any additional directories and files specified in the project configuration.

- For instance, suppose you have a project that has a dependency on the Apache Commons Lang library. When you compile your project, Maven will automatically add the Commons Lang JAR file to your classpath so that your project can use the classes provided by the library.

- In summary, the classpath in Maven is a list of directories and JAR files that contain the classes and resources required to run your application. Maven manages the classpath and automatically includes project dependencies as well as any additional resources specified in the project configuration.

### Types of Maven classpath 

1. `compile classpath`: This classpath is used during compilation and includes the project's own compiled classes and resources, as well as all transitive dependencies with a compile scope.

- For example, let's say you have a Maven project that depends on the Spring Framework and the Apache Commons Lang library. When you build your project, Maven will automatically download the Spring Framework and Commons Lang JAR files from the Maven repository and add them to your project's compile classpath. This means that when you compile your project, you can use the classes and resources provided by these libraries.

2. `test classpath`: This classpath is used during the testing phase and includes the compile classpath, as well as dependencies with a test scope.

- For instance, suppose you have a Maven project that contains JUnit tests. When you run your tests, Maven will automatically add the JUnit JAR file to your project's test classpath. This means that your tests can use the JUnit framework to run and verify your code.

3. `run classpath`: This classpath is used when running the application and includes the compile classpath, as well as dependencies with a runtime scope.

- For example, suppose you have a Maven project that builds a web application using the Spring Framework. When you deploy your application to a web server, the server will use the run classpath to locate the Spring Framework JAR file and any other runtime dependencies needed to run your application.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/9.jpg)

## Types of Maven Scope applied on dependencies

- Dependencies scopes are required in Maven to define the scope of a particular dependency and how it should be used in the project. This is important because not all dependencies are needed at every phase of a project's lifecycle, and using unnecessary dependencies can increase the project's size and complexity.

- These scopes are defined using `<scope></scope>` tags.

- Example

```
	<dependency>
	    <groupId>jakarta.servlet</groupId>
	    <artifactId>jakarta.servlet-api</artifactId>
	    <version>6.0.0</version>
	    <scope>provided</scope>
	</dependency>
```
- Maven provides 6 types of dependencies scopes

1. *compile* : This is the default scope. Dependencies with this scope are included in the classpath for compilation and packaging. This scope is used for dependencies that are required at compile time and runtime. Dependencies with compile scope are included in the compile, test, and run classpaths.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/10.jpg)


2. *provided* : Dependencies with this scope are expected to be provided by the runtime environment. They are included in the classpath for compilation, but not packaged with the application.This scope is used for dependencies that are required for compilation, but are expected to be provided by the runtime environment. Dependencies with provided scope are included in the compile classpath, but not in the test or run classpaths.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/12.jpg)


3. *runtime* : Dependencies with this scope are required at runtime, but not for compilation. They are not included in the classpath for compilation, but are included in the classpath at runtime. This scope is used for dependencies that are required at runtime, but not needed for compilation. Dependencies with runtime scope are included in the test and run classpaths, but not in the compile classpath.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/12.jpg)

4. *test* : Dependencies with this scope are used only for testing the application. They are not included in the classpath for compilation or packaging, but are included in the classpath for testing.This scope is used for dependencies that are only needed for testing. Dependencies with test scope are included in the test classpath, but not in the compile or run classpaths.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/11.jpg)

5. *system* : Dependencies with this scope are similar to provided scope, but the path to the dependency is specified explicitly. This scope should be used only in rare cases, as it can create portability issues.This scope is used for dependencies that are not available in a public repository and must be provided by the local system. Dependencies with system scope are included in the compile classpath, but not in the test or run classpaths.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/14.jpg)

6. *import* : When using the import scope, there will typically be multiple pom.xml files involved.

- One pom.xml file will be the "shared" POM file that contains the actual dependencies that are being shared across multiple projects. This shared POM file can be located in a separate Maven project, or it can be located within one of the projects that is using it.

- The other pom.xml files will be in the projects that are using the shared dependencies. These projects will use the import scope to reference the shared POM file, which allows them to inherit the shared dependencies without having to manually list them in their own pom.xml files.

![](https://github.com/codophilic/LearnMaven/blob/main/Images/15.jpg)

## About POM file

- Refer AboutPOMFile markdown


