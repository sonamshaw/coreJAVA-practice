package com.corejava.java;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Object {
public static void main(String [] args){
	JFrame window=new JFrame(); // window variable that holds JFrame objects,and we are creating a new JFrame object
	window.setTitle("Test Window");//Calling methods on our JFrame object
	window.setSize(600, 400);
	window.setVisible(true);
	
	JLabel label= new JLabel();//JLabel variable holds JLable objects,and we are creating a new JLable to assign to our variable
	label.setText("                                       My Label");
	window.add(label);// we are calling the add method of our JFrame object to add our label to the window
}
}
