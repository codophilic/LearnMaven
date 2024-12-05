# Maven

## What is maven?

- Maven is a popular build automation tool used primarily for Java projects, although it can be used for other programming languages as well. Maven simplifies the process of building, testing, and deploying software by providing a consistent and repeatable way to manage dependencies, build artifacts, and manage project configurations.

- In Maven, a build refers to the process of compiling source code, running tests, and packaging the application into a deployable format such as a JAR, WAR, or EAR file. The build process is defined in a configuration file called pom.xml, which is located in the root directory of the Maven project.

- Maven uses a declarative approach to build configuration, which means that developers only need to specify what they want to build and Maven takes care of the details. For example, developers can define project dependencies in the pom.xml file and Maven will automatically download and manage those dependencies during the build process.

### What are these WAR & JARs?

- WAR (Web Application Archive) and JAR (Java Archive) files are typically used for Java-based web applications.

- A WAR file is a compressed file format used to package a collection of web resources, such as JSP files, HTML files, images, and other resources required by a web application. It also includes the compiled Java classes and other resources required by the application. The WAR file is typically deployed to a web container or application server, such as Apache Tomcat or JBoss.

- A JAR file, on the other hand, is a compressed file format used to package Java class files, associated metadata, and other resources required by a Java application. JAR files are used to distribute and share Java libraries or executable Java applications.

- Both WAR and JAR files are created using build tools like Maven or Gradle, which compile source code and package the application into the appropriate file format. The specific file format used depends on the type of application being developed and the deployment environment. For example, a standalone Java application (like a java program with main method (psvm)) might be packaged as a JAR file, while a web application might be packaged as a WAR file. WAR (Web Application Archive) and JAR (Java Archive) files are typically used for Java-based web applications.


- J2EE (Java 2 Platform, Enterprise Edition) is a platform for building enterprise-level applications in Java. It provides a set of APIs and services for developing, deploying, and managing distributed, multi-tier applications.

- EAR (Enterprise Archive) and WAR (Web Archive) files are both used in J2EE applications, but for different purposes.

- WAR files are used to package and deploy web components of a J2EE application, such as JSPs, servlets, and HTML pages. A WAR file typically contains only web-related resources and libraries.

- EAR files, on the other hand, are used to package and deploy the entire J2EE application, including both web components and business components. An EAR file can contain multiple WAR files, EJB (Enterprise JavaBeans) JAR files, and resource files, as well as libraries required by the application.

- The main difference between WAR and EAR files is the scope of the application they represent. A WAR file is limited to the web components of the application, while an EAR file includes the entire J2EE application(like resources (images,video to display in application), APIs, Libraries,Config giles).

- The use of EAR files is important in J2EE applications because they allow developers to package and deploy the entire application as a single unit, providing a consistent and standardized deployment model. It also allows for easier management of dependencies and versioning of the application components.

### why it is called archive files?

- A WAR file and a JAR file are both named as archive files because they contain a collection of files and directories compressed into a single file, much like how files are stored in an archive. The term "archive" refers to a file that contains one or more files, usually compressed to save space and make it easier to transfer or distribute.

### Some other deployable formats in java?

- In addition to WAR and EAR files, there are other deployable formats for Java applications. Here are a few examples:

1. JAR (Java ARchive) files: JAR files are similar to ZIP files, and can be used to package Java classes, resources, and other files into a single archive file. JAR files are commonly used to distribute Java libraries or executable Java applications.

2. OSGi bundles: OSGi is a modular system for Java that allows applications to be dynamically composed from a set of reusable components called bundles. OSGi bundles are similar to JAR files, but include additional metadata and functionality for managing dependencies, versioning, and lifecycle management.

3. RAR (Resource Adapter Archive) files: RAR files are used to deploy Java EE resource adapters, which provide connectivity between Java EE applications and non-Java EE systems, such as messaging systems or databases. RAR files typically contain Java classes, configuration files, and other resources required for the resource adapter to operate.

4. Applets: Applets are Java programs that are designed to be run within a web browser, and can be embedded in HTML pages or accessed through a Java applet viewer. Applets are typically packaged as JAR files, and can be signed and verified to ensure security when running in a browser.

- These are just a few examples of the different types of deployable formats for Java applications. The choice of format depends on the specific requirements of the application and the deployment environment.


## Why Maven?

- Suppose you are developing a Java web application that uses several external libraries or dependencies, such as Spring Framework, Hibernate, and Log4j. These libraries have their own dependencies, which can be complex and difficult to manage manually. In addition, you need to package your application into a WAR file, run tests, and deploy the application to a server.

- Without Maven, you would need to manually download and manage all of the required libraries and dependencies, which can be time-consuming and error-prone. You would also need to manually configure the build process, `which can be complex and difficult to maintain as the project grows.

- With Maven, you can define the project's dependencies in the pom.xml file, and Maven will automatically download and manage those dependencies during the build process. Maven also provides a consistent and repeatable way to build, test, and deploy the application. The pom.xml file defines the build process, and developers can easily run the build process using Maven commands, such as mvn clean install.

- Overall, Maven simplifies the development process and helps ensure that projects are built consistently, making it an essential tool for software development teams.

## How Maven works?

- Let's say you are developing a Java project that uses several external libraries, such as Apache Commons Math and Joda-Time. Here's how Maven would help you manage these dependencies and build your project:

1. Define project dependencies: You would specify the external libraries your project depends on in a configuration file, usually called pom.xml. This file is the heart of the Maven build process, and it defines the project's metadata, dependencies, and build settings.

2. Download dependencies: Once you've defined the project dependencies, Maven automatically downloads them from a remote repository or a local cache. This ensures that all developers working on the project have access to the same libraries and versions.

3. Compile and build the project: After all dependencies are downloaded, Maven compiles your project's source code and creates a binary output, such as a JAR or WAR file. This output file contains all the necessary resources, such as classes, properties, and configuration files.

4. Run tests: Maven can also run your project's unit tests to ensure that it works correctly. You can configure Maven to run tests automatically during the build process, or you can run them manually using a command.

5. Deploy the project: Once the build process is complete, Maven can deploy the output file to a local or remote repository, or it can package the project into a distributable format, such as a JAR or WAR file.

### deploy on server

- When we say "deploy a WAR file on an application server", we mean that we are installing and running a web application (web containers/servlet containers like Tomcat) on the server by deploying a WAR file. Here's how it works:

1. First, the web application is packaged into a WAR (Web Application Archive) file, which contains all the resources and dependencies required by the application, such as JSPs, servlets, HTML pages, JavaScript files, CSS files, and other web-related files.

2. The WAR file is then deployed on the application server using the server's deployment tools or administration console. This process typically involves uploading the WAR file to the server and initiating the deployment process.

3. During deployment, the application server unpacks the WAR file and installs the web application into a web container. The web container is responsible for managing the lifecycle of the web application and providing services such as session management, security, and request processing.

4. Once the web application is deployed, it is available for clients to access through a web browser or other HTTP clients. The application server maps the URL of the web application to the corresponding servlet or JSP file in the application, and forwards the request to the appropriate component.

5. The web application runs within the web container on the application server, and can access resources and services provided by the container, such as JDBC data sources, JNDI resources, and other Java EE services

## Does maven supports only java?

- Maven is primarily designed to work with Java projects, but it can also be used with other programming languages and technologies through the use of plugins.

- While there are plugins available for other languages and technologies, Maven's support for those languages and technologies may not be as extensive as it is for Java.

- The output of the Maven build process depends on the specific programming language and technology being used. For compiled languages like C and C++, the output is typically an executable binary file. For interpreted languages like JavaScript, the output is typically a minified and optimized source code file. For mobile platforms like Android, the output is typically an APK file that can be installed on a mobile device. For .NET it isi DLL or exe file.


## Maven Central repository

- Maven has a central repository, which is a shared repository of Java libraries and dependencies that can be accessed by developers around the world. This central repository serves as the default source of dependencies for Maven projects, and contains millions of artifacts that can be searched, downloaded, and used in Maven projects.

- The central repository works similarly to Docker Hub, which is a central registry for Docker images. Both repositories provide a centralized location for storing and sharing dependencies and artifacts, and allow developers to easily download and use these dependencies in their projects.

![alt text](https://github.com/codophilic/LearnMaven/blob/main/Images/1.jpg)

- The local repository is located at  `c:\Users\UserID\.m2\repository`.













