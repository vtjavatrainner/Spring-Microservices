**Introduction to Microservices** </br>
Microservices are distributed, loosely coupled software services that carry out a small number of well-defined tasks.
This document will introduce you to what is `microservices` and how to build them using Java and Spring boot technology.

**1.1 What is a Mircoservice**</br>
Before the birth of Microservices, all web based applications were built using monolith architecture style. In monolith architecture, entire applications is built as a single artifact including UI code, business logic, database access logic. This single artifact is then deployed on application server.</br>
Application is deployed as a single artifact but multiple development teams work on the application. Each development team own a specific functionality. </br>
For example, when I was working for one of the topmost investment bank, we have developed inhouse discounting application, it has mutiple functional modules like customer onboarding, data warehouse team and mutual funds team.</br>

Size and complexity of monothic application kept growing, communication and coordnation costs between the teams kept increasing. Every time an individual team needed to make a change, the entire application had to be rebuilt, retested and redeployed. Also there is no fault isolation if there is any issue with one of the functionality that will bring down entire application. </br>

A microservice is a small, loosely coupled, distributed service. Microservices allow you to take a large application and decompose it into easy-tomanage components with narrowly defined responsibilities. Microservices help combat the traditional problems of complexity in a large code base by decomposing the large code base down into small, well-defined pieces.





