/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WithoutCall;

/**
 *
 * @author ben-g
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Person Bob = new Person();
        Bob.Weight = 200;
        Bob.Height = 1.5;
       
        Person Bill = new Person();
        Bill.Weight = 100;
        Bill.Height = 2;
        
        Person Ben = new Person();
        Ben.Weight = 90;
        Ben.Height = 1.7;
        
        double BobBMI = (Bob.Weight/(Bob.Height*Bob.Height));
        System.out.println(BobBMI);
        
        double BillBMI = (Bill.Weight/(Bill.Height*Bill.Height));
        System.out.println(BillBMI);
        
        double BenBMI = (Ben.Weight/(Ben.Height*Ben.Height));
        System.out.println(BenBMI);
        
        
}
}