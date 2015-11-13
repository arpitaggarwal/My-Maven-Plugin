# custom-maven-plugin

###Usage:

```
mvn clean install
mvn com.test:MyPlugin:my-goal
```

By default, shorthand for maven plugin is allowed for plugins with groupIds of **org.apache.maven.plugins** or **org.codehaus.mojo**. 


Edit **<pluginGroups>** in **settings.xml** as follows:

``` 
<pluginGroups>
        <pluginGroup>com.test</pluginGroup>
 </pluginGroups>
```
 
Now you can use as:

```
mvn clean install
mvn MyPlugin:my-goal
```
