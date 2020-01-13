
package com.sheridan.douvinos;

/**
 *
 * @author Douvinos
 */
public class Card {
    private String mSuit;
    private int mValue;
    
    public Card(String suit, int value){
        setSuit(suit);
        setValue(value);
    }
    
    public String getSuit(){
        return mSuit;
    }
    public int getVlaue(){
        return mValue;
    }
    
    public void setSuit(String newSuit){
       if (newSuit.equals("Spades") || newSuit.equals("Hearts") || 
           newSuit.equals("Clubs") || newSuit.equals("Diamonds")){
           mSuit = newSuit;
       }
    }
    
    public void setValue(int newValue){
        mValue = newValue;
    }
}
