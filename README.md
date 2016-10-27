# TeamManagement

This application is a manager of teams. A web service has been created to provide:

- list of teams
- specific team by its name.


#Tools
This project has been done using:

- Maven to generate the structure of the project. Also, Maven is managing the dependencies of the project.
- Jersey is a specific implementation of JAX-RS. It can be deployed in several servers easily and it´s a clear tool to implement RESTFul architecture.
- Log4j is the chosen tool to trace the application. It´s easy to setup and it has several configurations depending on the needs.
- Rest Assured is being used to test the web services. The test can be done as a JUnit test. It uses the given/when/then notation which is quite easy to read. Also it has a strong API to manipulate the response and write assertions sentences.

#Running application

A get http call to http://localhost:8080/TeamManage/api/list will give you the list of the teams.

A post http call with the content-type set to 'application/json' will give you the team requested by JSON
url: http://localhost:8080/TeamManage/api/get

JSON request:
{
  "name":"Cadiz C.F."
}

#Notes
This project has been deployed on Tomcat 9
