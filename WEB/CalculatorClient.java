package calculator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CalculatorClient {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8080/calculator?wsdl");

        QName qname = new QName(
            "http://calculator/",
            "CalculatorServiceService"
        );

        Service service = Service.create(url, qname);

        CalculatorInterface calc = service.getPort(CalculatorInterface.class); 

        System.out.println("Result: " + calc.add(10, 20));
    }
}