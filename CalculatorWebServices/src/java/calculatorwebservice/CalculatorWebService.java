/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorwebservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gokul
 */
@WebService(serviceName = "CalculatorWebService")
public class CalculatorWebService {

    /**
     * This is a sample web service operation
     */
    
    
    @WebMethod(operationName = "AddIntegers")
    public double add(@WebParam(name = "firstNum") double num1,
            @WebParam(name = "secondNum") double num2) {
        return num1 + num2;
    }

    @WebMethod(operationName = "subIntegers")
    public double sub(@WebParam(name = "firstNum") double num1, 
            @WebParam(name = "secondNum") double num2) {
        return num1 - num2;
    }

    @WebMethod(operationName = "mulIntegers")
    public double mul(@WebParam(name = "firstNum") double num1, 
            @WebParam(name = "secondNum") double num2) {
        return num1 * num2;
    }

    @WebMethod(operationName = "divIntegers")
    public double div(@WebParam(name = "firstNum") double num1, 
            @WebParam(name = "secondNum") double num2) {
        return num1 / num2;
    }
    
}

