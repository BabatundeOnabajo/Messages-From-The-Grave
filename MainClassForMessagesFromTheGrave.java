/* 
 */
package com.mycompany.messagesfromthegrave;

import javax.swing.*; //We use the Swing framework to design the front-end interface

public class MainClassForMessagesFromTheGrave extends JFrame {

    public MainClassForMessagesFromTheGrave(){
        
    super("Messages From The Grave - The App That Helps Loved Ones Remember You When You Are Gone");
    setSize(650, 650); //This sets the size of the window.
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setVisible(true);
    
    }
    
    public static void main(String[] args){
    MainClassForMessagesFromTheGrave mainClassForMessagesFromTheGrave = new MainClassForMessagesFromTheGrave();
    
    }
    
}
