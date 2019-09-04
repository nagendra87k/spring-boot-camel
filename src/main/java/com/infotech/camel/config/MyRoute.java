package com.infotech.camel.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
 
@Component
public class MyRoute extends RouteBuilder {
 
    @Override
    public void configure() throws Exception {
        //from("file:C:/SpringBootWorkSpace_6/SpringBootCamelIntegration/input").to("file:C:/SpringBootWorkSpace_6/SpringBootCamelIntegration/output");
        from("localhost:8088/mockStudentPortSoap11?WSDL&interface=StudentPortSoap11&part=students.wsdl").to("http://localhost:8080/ws");
        //from("/Users/pavankumar/Desktop/inputFolder?noop=true").to("/Users/pavankumar/Desktop/outputFolder");
    }
}