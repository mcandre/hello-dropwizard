# hello-dropwizard - a basic Dropwizard service

# EXAMPLE

```
$ gradle shadowJar
$ bin/hello-dropwizard server src/main/resources/hellodropwizard.yml
...

$ curl localhost:8080/hello-dropwizard
{"content":"Hello, World!"}

$ curl localhost:8081/healthcheck
{"deadlocks":{"healthy":true},"template":{"healthy":true}}
```

# REQUIREMENTS

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.7+
* [Gradle](http://gradle.org/) 2.1+

## Optional

* [Sonar](http://www.sonarqube.org/)
* [Infer](http://fbinfer.com/)

E.g., `brew install gradle sonar sonar-runner infer`

# CREDITS

Based on the official [Dropwizard docs](http://www.dropwizard.io/0.7.1/docs/getting-started.html)
