Python Me 
Spring Boot JSP Example Tutorial
author: Ramesh Fadatare
JSP SPRING BOOT

← Back to Spring Boot Tutorial

In this tutorial, we will learn how to create a simple Spring boot hello world example with JSP.
Learn spring boot at https://www.javaguides.net/p/spring-boot-tutorial.html.
Learn JSP at https://www.javaguides.net/p/jsp-tutorial.html
Spring Boot aims to make it easy to create Spring-powered, production-grade applications and services with minimum fuss. It takes an opinionated view of the Spring platform so that new and existing users can quickly get to the bits they need.


JSP is a Java-based server-side template engine to create dynamic web pages.

Video Tutorial
This tutorial explained in-detail in below video tutorial:

Tools and technologies used
Spring boot 2+
Spring framework 5+
IDE - Eclipse STS
Maven 3+
Embedded tomcat server 8.5+
JSP/JSTL
Development Steps

1. Create a Spring Boot Application
There are many ways to create a Spring Boot application. You can refer below articles to create a Spring Boot application.
>> Create Spring Boot Project With Spring Initializer
>> Create Spring Boot Project in Spring Tool Suite [STS]
2. Add maven dependencies
<?xml version="1.0" encoding="UTF-8"?>
<project
    xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.6.RELEASE</version>
        <relativePath />
        <!-- lookup parent from repository -->
    </parent>
    <groupId>net.javaguides</groupId>
    <artifactId>springboot-jsp-hello-world-example</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>springboot-jsp-hello-world-example</name>
    <description>Demo project for Spring Boot and JSP</description>
    <packaging>war</packaging>
    <properties>
        <java.version>1.8</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <!-- JSTL for JSP -->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    </dependencies>
    <build>
        <finalName>springboot-webapp</finalName>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
In order to work with JSP/JSTL, we need to add below two dependencies:
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
<!-- JSTL for JSP -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>
3. Create Spring MVC Controller
Let's create a simple spring MVC controller with method handler:
package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({
        "/",
        "/hello"
    })
    public String hello(@RequestParam(value = "name", defaultValue = "World",
        required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
4. JSP ViewResolver Configuration in application.properties file
Let's add below properties in application.properties file to configure view resolver for JSP:
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
5. Create JSP page
Let's create a simple JSP page under webapp/WEB-INF/jsp folder structure. If webapp folder not exists then create webapp/WEB-INF/jsp folder structure and then create JSP pages under it.
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h2 align="center"> Hello ${name}!</h2>
</body>
</html>