# arcs

Api Rest Cucumber Solution




# Run

Project is created based on the default cucumber archetype.

Run specific test
```mvn clean verify -Dcucumber.filter.tags="@SomeTag1"```

Run specific test with specific config file
```mvn clean verify -Dcucumber.filter.tags="@SomeTag1" -DconfigFile=local```


Run All tests by tag
```mvn clean verify -Dcucumber.filter.tags="@Regression"```


Run All tests by specific class and config file. You can add more config files, as per environment, in the src/test/resources/config folder

```mvn verify -DtestSuite=RunCucumberTest -DconfigFile=local```


