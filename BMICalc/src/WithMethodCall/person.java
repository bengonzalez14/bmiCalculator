/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WithMethodCall;

/**
 *
 * @author ben-g
 */
public class person {
    
    void getBMI(double Weight, double Height){
        
        double BMI = Weight/(Height*Height);
        
        System.out.println(BMI);
}
}