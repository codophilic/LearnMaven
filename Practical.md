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




