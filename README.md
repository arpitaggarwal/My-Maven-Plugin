# custom-maven-plugin
###Usage:

```
mvn clean install
mvn com.test:MyPlugin:my-goal
```

By default, shorthand for maven plugin is allowed for plugins with groupIds of ```org.apache.maven.plugins``` or ```org.codehaus.mojo```. However, we can add our group to this list by adding our plugin groupId as a pluginGroup in a pluginGroups section of our maven settings.xml file.

So, open your ```settings.xml``` and search for string ```<pluginGroups>``` and replace it with below:

    ```
    <pluginGroups>
        <pluginGroup>com.test</pluginGroup>
    </pluginGroups>
    ```

Now execute commands:

```
mvn clean install
mvn MyPlugin:my-goal
```
