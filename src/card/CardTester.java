package card;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class CardTester {
    public static void main(String[] args)
    {
        Card c1=new Card("Clubs",5);
        c1.setSuit("Hearts");
        System.out.println ("New suit is "+ c1.getSuit());
        
    }
}
