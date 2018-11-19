# lab-springboot-multiconfig

The main properties file: **/src/main/resources/application.properties**

> spring.profiles.active=dev

The above will load the profile: 

> application-dev.properties.

The file must be named with the following convention:

> application-{profile_name}.properties

By adding the following line of code to this "dev" profile, you should be able to accss the H2 console from http://localhost:8080/h2-console

> spring.h2.console.enabled=true

Add the following to your **.gitignore** to prevent this profile from being checked into scm

> `### Secrets ###`<br>
> /src/main/resources/application-dev.properties
