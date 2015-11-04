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

# CREDITS

Based on the official [Dropwizard docs](http://www.dropwizard.io/0.7.1/docs/getting-started.html)
