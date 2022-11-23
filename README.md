# Logging Java App
Simple implementation of log4j lib 

Tools:
1. log4j (version: 2.19.0)
2. Maven
3. Java 17

## Creating a Maven Project
1. Create a folder to store the project
2. Run the command ``` mvn archetype:generate ``` to see the archetype options shared by Maven
3. Choose the default ```maven-archetype-quickstart```: *option 1947* (when this README have been written)
4. Continue choosing the *default options* until the end 
5. Define the *groupId* and *artifactId* for your project

### Message level
1. TRACE
2. DEBUG
3. INFO
4. WARN
5. ERROR
6. FATAL

## Adding the log4j dependency in the project
Link: https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.19.0
```
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.19.0</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.19.0</version>
</dependency>
```
## Using the Logger instance
```
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App  {
    private final static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ) {
        logger.trace("Trace level message.");
        logger.debug("Debug level message.");
        logger.info("Info level message.");
        logger.warn("Warning level message.");
        logger.error("Error level message.");
        logger.fatal("Fatal level message.");
    }
}
```
> When we use an instance directly, this pattern is called Singleton. So, the Logger is built using the Singleton pattern. </br>
> We pass the class *App* as a parameter of the instance method *getLogger*. So, for each class that we need to use a Logger, we have to declare a private logger to manage each specific class where it is instantiated.

See that we declared all the log levels as an example. Now we have to configure a propertie file that is going to receive the settings that will be presented by the Logger.

## Log4j2.properties
1. Create a resources subfolder, inside the main folder and put the log4j2.properties inside the resources folder
> Obs: pay attention: the name of the file must be log4j2.properties.

2. Follow the documentation from Apache to configure the file:
Link: https://logging.apache.org/log4j/2.x/manual/configuration.html

```
appender.console.type = Console
appender.console.name = STDOUT
appender.console.layout.type = PatternLayout
appender.console.layout.pattern = %d{dd-MM-yyyy hh:mm:ss:mi} %-5p %c{1}:%L - %m%n

rootLogger = trace, STDOUT
```
> Here, we've just set the Logger to present the logs in the Console and following some defined pattern for all the information, as we can see below.

![image](https://user-images.githubusercontent.com/39681960/203455815-564c6a56-2f7f-4c83-8171-aab98c744014.png)
















