# Spring-boot-simple-rest-api
This is a simple Spring boot rest api application. Response will return a JSON that will contain candidates data which can be filtered by using a parameter (skill) via URL.

## What you'll need
Java 11

Maven 3.3+

lombok

Docker CE

## To start
To start this application, clone this repo (https://github.com/DivitGitHub/spring-boot-simple-rest-api.git)

Build:
```
mvn install
```
And then run the Application class.

## To run as a container (Docker)
build image (root directory of project):
```
docker build -f Dockerfile -t docker-spring-boot-api .
```

Run container:
```
docker run -p 8888:8888 docker-spring-boot-api
```
## Screenshots

![screenshot_1](https://user-images.githubusercontent.com/26686429/50444893-f6fef780-0902-11e9-80b7-2427b0cadcab.png)


![screenshot_2](https://user-images.githubusercontent.com/26686429/50444895-f8302480-0902-11e9-84d9-759d6b75b030.png)

## About
I started this project for fun which showcase a bit of Springboot, Java 11, Docker, lombok and lambda.
