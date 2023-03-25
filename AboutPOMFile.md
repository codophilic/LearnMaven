# Everything About POM File

- POM stands for **Project Object Model**. It is an XML representation of a Maven project held in a file named pom.xml.

-  A project contains configuration files, as well as the developers involved and the roles they play, the defect tracking system, the organization and licenses, the URL of where the project lives, the project's dependencies, and all of the other little pieces that come into play to give code life. It is a one-stop-shop for all things concerning the project. In fact, in the Maven world, a project does not need to contain any code at all, merely a pom.xml.

- The POM contains all necessary information about a project, as well as configurations of plugins to be used during the build process. 

- A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project. It contains default values for most projects. Examples for this is the build directory, which is target; the source directory, which is src/main/java; the test source directory, which is src/test/java; and so on. When executing a task or goal, Maven looks for the POM in the current directory. It reads the POM, gets the needed configuration information, then executes the goal.

- Some of the configuration that can be specified in the POM are the project dependencies, the plugins or goals that can be executed, the build profiles, and so on. Other information such as the project version, description, developers, mailing lists and such can also be specified.

- The POM is independent of any language that's why maven can be use for other languages as well as long as plugin are available in maven to support those language.

## Super POM

- The "super pom.xml" is a concept in Maven that refers to the default parent POM (Project Object Model) that all Maven projects inherit from.

- When you create a new Maven project, Maven automatically sets up the project's POM file with a parent element that references the super POM. This means that any configuration or settings defined in the super POM are inherited by your project's POM file, unless overridden.

- The super POM defines a set of default values and settings for Maven projects, such as the default version of the Java language to use, the default packaging type, and the default repositories to use for downloading dependencies. These default values can be overridden in your project's POM file if needed.

- The super POM is required in Maven because it provides a base set of configurations that ensure consistency across Maven projects. It also allows for a standardized way of defining common settings and plugins across multiple projects.

- In summary, the super POM is an essential part of Maven's inheritance model and provides a base set of configurations that are shared across all Maven projects.

- you can technically edit the super POM, but it's not recommended as it could affect all the Maven projects that inherit from it.

## Minimal POM

- A minimal POM (Project Object Model) is the most basic form of a POM file in Maven. It is the bare minimum required for Maven to recognize a project as a valid Maven project and perform basic tasks such as building, packaging, and deploying.

- A minimal POM file typically includes the following elements:

1. **project** : This is the root element of the POM file and defines the basic information about the project, such as its group ID, artifact ID, and version.

2. **modelVersion** : This element specifies the version of the POM file format being used. In the case of Maven 2 and Maven 3, this is usually set to "4.0.0".

3. **groupId** : This element specifies the unique identifier for the group or organization that the project belongs to.

4. **artifactId** : This element specifies the unique identifier for the project itself.

5. **version** : This element specifies the version number of the project.

6. **packaging** : This element specifies the type of artifact that the project produces, such as "jar" (default), "war", "pom", etc.

7. **dependencies** : This element specifies the dependencies that the project relies on.

- Example

```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>myproject</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <dependencies>
        <!-- specify dependencies here -->
    </dependencies>
</project>
```


## Project Inheritance

- In Maven, project inheritance allows you to define a parent-child relationship between Maven projects by specifying a parent POM for a child project. This enables you to share common configurations, dependencies, and plugins across multiple Maven projects, reducing redundancy and simplifying project management.

- By using project inheritance, you can easily manage dependencies and configurations across multiple Maven projects, reduce duplication of code and settings, and maintain consistency across projects.

-  The Super POM is one example of project inheritance, however you can also introduce your own parent POMs by specifying the parent element in the POM, as demonstrated in the following examples. Here`<parent></parent>` tags is used.

- The packaging type of parent POM is **pom**.

- Example

- Directory Structure

```
.
 |-- my-module
 |   \-- pom.xml
 \-- parent
     \-- pom.xml

```

- POM File

```
<project>
  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>com.mycompany.app</groupId>
    <artifactId>my-app</artifactId>
    <version>1</version>
    <relativePath>../parent/pom.xml</relativePath>
  </parent>

  <artifactId>my-module</artifactId>
</project>
```
## Project Aggregation

- In project aggregation, we have a parent project that aggregates multiple child projects. The parent project contains a POM file that defines common settings, such as dependency management and build configuration, that are shared by all of the child projects.

- Each child project also has its own POM file that references the parent POM file. This establishes a parent-child relationship between the parent project and its child projects.

- Now, when we build the parent project, it also builds all of its child projects. This means that all of the child projects inherit the common settings defined in the parent POM file.

- In summary, project aggregation allows us to manage multiple related projects as a single entity, while still maintaining a parent-child relationship between the parent project and its child projects. The parent project defines common settings that are shared by all of the child projects, and the child projects inherit these settings from the parent project.

- In project aggregation, you can define all the dependencies in the parent POM and don't define any dependencies in the child POMs. Instead, you define the modules for each child project in the parent POM and inherit the parent POM in the child projects. This way, the child projects can inherit all the common configurations and dependencies from the parent POM without having to define them again in their own POMs.

- Project inheritance is a specific type of project aggregation, where there is a single parent-child relationship between projects. When you have more than one project that share common settings and dependencies, you can use project aggregation to group them together under a common parent project.

- Project aggregation can be seen as a higher-level concept that includes project inheritance as a specific use case. It allows you to manage multiple projects together, share common settings and dependencies, and simplify management. Project inheritance, on the other hand, is useful when you have a specific parent-child relationship between two projects, and you want to inherit some settings and dependencies from the parent project.

- Project inheritance is like a multi-level inheritance, where each child project inherits settings and dependencies from its parent project, and the parent project can also inherit settings and dependencies from its own parent project.

- On the other hand, project aggregation is like multiple inheritance , grouping multiple projects together under a common parent project. Each child project still has its own independent settings and dependencies, but they can also share common settings and dependencies defined in the parent project.

- So project inheritance is a hierarchical relationship between parent and child projects, while project aggregation is more like a logical grouping of projects that share some common functionality or configuration.

- To defined multi child project we used `<module></module>` tag. The parent pom has a **pom** packaging type.

- The purpose of defining modules in the parent POM is to specify which child projects belong to the multi-module build. This allows the parent POM to manage the build for all the child projects and ensure that they are built in the correct order.

- By specifying the modules in the parent POM, you are essentially creating a hierarchy of projects with a clear parent-child relationship. The child projects inherit the dependencies and plugins defined in the parent POM, and they can also override or add to these settings if needed.

- Defining modules is an essential part of the project aggregation process because it allows the parent POM to manage the build for all the child projects and ensure that they are built in the correct order. Without this hierarchy, it would be difficult to manage the dependencies and plugins for all the child projects, and the build process would become more complex.

## Project Interpolation and Variables

- Project Interpolation is the ability of Maven to replace variables (also called properties) in POM files and other configuration files with their corresponding values at runtime. Variables can be defined in different ways, such as in the POM file itself, in the Maven settings file, or passed as command line arguments.

- Variables are useful for defining values that are used throughout a project, such as the version number of a project, the name of an organization, or the path to a particular file. By using variables, you can avoid hard-coding values in multiple places and make it easier to maintain consistency across the project.

- In Maven, variables are defined in the `<properties>` section of the POM file. This section contains key-value pairs, where the key is the variable name and the value is the variable's value. Once defined, variables can be referenced anywhere in the POM using the ${variableName} syntax.

- Example

```
<properties>
  <project.version>1.0.0</project.version>
</properties>

<dependencies>
  <dependency>
    <groupId>com.example</groupId>
    <artifactId>my-project</artifactId>
    <version>${project.version}</version>
  </dependency>
</dependencies>
```




























