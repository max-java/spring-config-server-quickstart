# spring-config-server-quickstart

in client:
1. add dependency on 
#####    // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-config
#####    implementation group: 'org.springframework.cloud', name: 'spring-cloud-starter-config', version: '3.0.4'

2. add properties
##### spring.application.name=jis6
##### spring.config.import=optional:configserver:http://localhost:8888

3. use -Dspring.profiles.active=dev to switch between profiles.

##### In config repository put properties file named by application name: jis6.properties of jis6.yml. That will be default profile.
##### To make properties for another profile add it name following hyphen: jis6-dev.properties

## Endpoints
http://localhost:8888/test-config.properties
http://localhost:8888/jis6/master


## Docker
build image
```bash
 docker build -t tutrit/config_server .
```
run image
```bash
docker run -p 8888:8888 tutrit/config_server
```