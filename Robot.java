package com.davidj.java;

//creating a class
public class Robot {

    //The class has a string
    String name;

    //this is the class constructor where I define stuff. Here I am saying a string parameter (name) can be defined at creation
    Robot(String name) {
        //here i define the name variable, but see how it matches the name we gave the String variable?
        //if we run it like name = name, we get a null value so we put this. in front
        this.name = name;

    }

    //method, an action the class can do preceded by its return type, i.e., whether it returns anything to the line that calls it
    void speak (String msg) {
        System.out.println(msg + name);
    }
        public static void main (String[] args){

        //creating a new class and passing string variable in
        Robot r = new Robot("Debbie");
        //(now that i pass in the string at creation, I don't need to define the string variable)
        // r.name = "Debbie";
           r.speak("hey there! It's me, ");

        //create a second robot
        Robot s = new Robot("Fred");
        s.speak("my name is ");


        }
}

