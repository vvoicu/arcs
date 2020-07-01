# arcs

Api Rest Cucumber Solution. Sample project configuration with structure and configurations for filter run and class run.
Capability to configure multiple environment configurations via config property files.

Project is created based on the default cucumber archetype.

# Run


Run specific test
```mvn clean verify -Dcucumber.filter.tags="@SomeTag1"```

Run specific test with specific config file
```mvn clean verify -Dcucumber.filter.tags="@SeTag2" -DconfigFile=local```


Run specific test with secondary config file - ! file contains invalid configurations !
```mvn clean verify -Dcucumber.filter.tags="@SeTag2" -DconfigFile=local2```


Run All tests by tag
```mvn clean verify -Dcucumber.filter.tags="@Regression"```


Run specific test by specific class and config file. You can add more config files, as per environment, in the src/test/resources/config folder

```mvn verify -DtestSuite=RunCucumberTest -DconfigFile=local```


