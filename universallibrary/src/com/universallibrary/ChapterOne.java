/*
 * Licence NO LICENSE
 * Copyright 2017 William Boswall
 * It is required to include this license and copyright notice.  
 * You are permitted to use it in Private Domain but NOT in commercial.  
 * For commercial domain(s), you need a separate license for that.  
 * It is forbidden to distribute it, modify it, and sublicensing.  
 */
package com.universallibrary;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 * @version 0.0.0.1
 * @since 28 May 2017
 */
public class ChapterOne
{
    public void SayHello()
    {
        System.out.println("Hello, World!");
        System.out.println("First Java Application");
        System.out.println("This is a test"); 
    }
    public void SayHelloSecond()
    {
        //Demonstrationg comments
        /*This shows
        that these comments
        don't matter
        */
        System.out.println("My new and improved");//this line executes
        //up to where the comment started
        /*Everything but the println() is a comment*/
        System.out.println("Java Application");
    }
    public void FullName()
    {
        System.out.println("William Boswall");
    }
    public void PersonalInfo()
    {
        String fullName="William Boswall";
        String email="wboswall@live.com";
        String phoneNum="902-368-5009";
        System.out.println(fullName+""+email+""+phoneNum);
    }
    public void TableAndChairs()
    {
        System.out.println("X"+"                     "+"X");
        System.out.println("X"+"                     "+"X");
        System.out.println("X"+"     "+"XXXXXXXXXX"+"      "+"X");
        System.out.println("XXXXX"+" "+"X        X"+"  "+"XXXXX");
        System.out.println("X   X"+" "+"X        X"+"  "+"X   X");
        System.out.println("X   X"+" "+"X        X"+"  "+"X   X");
    }
    public void FavoriteSong()
    {
        System.out.println("All the world's indeed a stage\n" +
        "And we are merely players\n" +
        "Performers and portrayers\n" +
        "Each another's audience\n" +
        "Outside the gilded cage");
    }
    public void Comments()
    {
        //Program comments are nonexecuting statements you add to a file for the purpose of documentation.
    }
    public void CommentsDialog()
    {
        String message="Program comments are nonexecuting statements you add to a file for the purpose of documentation.";
        JOptionPane.showMessageDialog(null,message);
    }
    public void BurmaShave()
    {
        System.out.println("Shaving Brushes\n" +
        "you'll soon see 'em\n" +
        "On a shelf \n" +
        "In some museum \n" +
        "Burma Shave");
    }
    public void RandomGuess()
    {
        JOptionPane.showMessageDialog(null,"The number is "+(1+(int)(Math.random()*10)));
    }
}
