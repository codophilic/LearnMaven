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

1. **<project>** : This is the root element of the POM file and defines the basic information about the project, such as its group ID, artifact ID, and version.

2. **<modelVersion>** : This element specifies the version of the POM file format being used. In the case of Maven 2 and Maven 3, this is usually set to "4.0.0".

3. **<groupId>** : This element specifies the unique identifier for the group or organization that the project belongs to.

4. **<artifactId>** : This element specifies the unique identifier for the project itself.

5. **<version>** : This element specifies the version number of the project.

6. **<packaging>** : This element specifies the type of artifact that the project produces, such as "jar" (default), "war", "pom", etc.

7. **<dependencies>** : This element specifies the dependencies that the project relies on.

- Example

```
<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
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

-  The Super POM is one example of project inheritance, however you can also introduce your own parent POMs by specifying the parent element in the POM, as demonstrated in the following examples. Here <parent></parent> tags is used.

- Example

- Directory Structure

```
.
 |-- my-module
 |   `-- pom.xml
 `-- parent
     `-- pom.xml
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
































