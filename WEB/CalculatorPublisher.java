package calculator;

import javax.xml.ws.Endpoint;

public class CalculatorPublisher {

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:8080/calculator",
            new CalculatorService()
        );

        System.out.println("Service running at http://localhost:8080/calculator?wsdl");
    }
}