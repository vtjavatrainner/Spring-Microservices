Spring Boot brings a great deal of magic to Spring application development. But there are four core tricks that it performs:</br></br>
■ Automatic configuration—Spring Boot can automatically provide configuration for application functionality common to many Spring applications.</br></br>
■ Starter dependencies—You tell Spring Boot what kind of functionality you need, and it will ensure that the libraries needed are added to the build.</br></br>
■ The command-line interface—This optional feature of Spring Boot lets you write complete applications with just application code, but no need for a traditional project build.</br></br>
■ The Actuator—Gives you insight into what’s going on inside of a running Spring Boot application.</br></br>

Each of these features serves to simplify Spring application development in its own way. We’ll look at how to employ them to their fullest throughout this book. But for now, let’s take a quick look at what each offers.
</br></br>
<b1>AUTO-CONFIGURATION</b1></br></br>
In any given Spring application’s source code, you’ll find either Java configuration or XML configuration (or both) that enables certain supporting features and functionality for the application. 
For example, if you want to write an application that accesses a relational database with JDBC, we need to write below code to crete Spring’s JdbcTemplate as a bean in the Spring application context. </br></br>
```java
@Bean
public JdbcTemplate jdbcTemplate(DataSource dataSource) {
return new JdbcTemplate(dataSource);
}
```
To create a `DatsSource`, following code is needs to be added.
```Java
@Bean
public DataSource dataSource() {
return new EmbeddedDatabaseBuilder()
.setType(EmbeddedDatabaseType.H2)
.addScripts('schema.sql', 'data.sql')
.build();
}
```
Like this there are multiple common configuration which developers needs to create. If its common why to create those? why not its automatically configured? </br></br>
Spring Boot can automatically configure these common configuration scenarios. If Spring Boot detects that you have the H2 database library in your application’s classpath, it will automatically configure an embedded H2 database. If JdbcTemplate is in
the classpath, then it will also configure a JdbcTemplate bean for you. There’s no need for you to worry about configuring those beans. They’ll be configured for you, ready to inject into any of the beans you write.</br></br>


<b1>STARTER DEPENDENCIES</b1></br></br>
It can be challenging to add dependencies to a project’s build. What library do you need? What are its group and artifact? Which version do you need? Will that version play well with other dependencies in the same project? </br></br>
Spring Boot offers help with project dependency management by way of starter dependencies. Starter dependencies are really just special Maven (and Gradle) dependencies that take advantage of transitive dependency resolution to aggregate commonly used libraries under a handful of feature-defined dependencies. </br></br>
For example, suppose that you’re going to build a REST API with Spring MVC that works with JSON resource representations. Additionally, you want to apply declarative validation per the JSR-303 specification and serve the application using an embedded Tomcat server. To accomplish all of this, you’ll need (at minimum) the following eight dependencies in your Maven or Gradle build: </br></br>
■ org.springframework:spring-core </br>
■ org.springframework:spring-web </br>
■ org.springframework:spring-webmvc </br>
■ com.fasterxml.jackson.core:jackson-databind </br>
■ org.hibernate:hibernate-validator </br>
■ org.apache.tomcat.embed:tomcat-embed-core </br>
■ org.apache.tomcat.embed:tomcat-embed-el </br>
■ org.apache.tomcat.embed:tomcat-embed-logging-juli </br> </br>

On the other hand, if you were to take advantage of Spring Boot starter dependencies, you could simply add the Spring Boot “web” starter (org.springframework.boot:spring-boot-starter-web) as a build dependency. This single dependency will transitively pull in all of those other dependencies so you don’t have to ask for them all. </br></br>
But there’s something more subtle about starter dependencies than simply reducing build dependency count. Notice that by adding the “web” starter to your build, you’re specifying a type of functionality that your application needs. Your app is a web application, so you add the “web” starter. Likewise, if your application will use JPA persistence, then you can add the “jpa” starter. If it needs security, you can add the “security” starter. In short, you no longer need to think about what libraries you’ll need to support certain functionality; you simply ask for that functionality by way of the pertinent starter dependency.</br></br>

<b1>THE COMMAND-LINE INTERFACE (CLI)</b1></br></br>
In addition to auto-configuration and starter dependencies, Spring Boot also offers an intriguing new way to quickly write Spring applications. The Spring Boot CLI makes it possible to write applications by doing more than writing
the application code. </br></br>

<b1>THE ACTUATOR</b1></br></br> 
The final piece of the Spring Boot puzzle is the Actuator. Where the other parts of Spring Boot simplify Spring development, the Actuator instead offers the ability to inspect the internals of your application at runtime. 
With the Actuator installed, you can inspect the inner workings of your application, including details such as :- </br></br>
■ What beans have been configured in the Spring application context </br>
■ What decisions were made by Spring Boot’s auto-configuration </br>
■ What environment variables, system properties, configuration properties, and command-line arguments are available to your application </br>
■ The current state of the threads in and supporting your application </br>
■ A trace of recent HTTP requests handled by your application </br>
■ Various metrics pertaining to memory usage, garbage collection, web requests, and data source usage </br>
The Actuator exposes this information in two ways: via web endpoints or via a shell interface. </br></br>
