package com.java101app;

/*
 * Licence NO LICENSE
 * Copyright 2017 William Boswall
 * It is required to include this license and copyright notice.  
 * You are permitted to use it in Private Domain but NOT in commercial.  
 * For commercial domain(s), you need a separate license for that.  
 * It is forbidden to distribute it, modify it, and sublicensing.  
 */
import com.universallibrary.CarleysMotto;
import com.universallibrary.ChapterOne;
import com.universallibrary.SammysMotto;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 * @version 0.0.0.1
 * @since 28 May 2017
 */
public class Java101App 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ChapterOne displayWork=new ChapterOne();
        displayWork.SayHello();
        displayWork.SayHelloSecond();
        //default title and icon
        JOptionPane.showMessageDialog(null,"My First Java Message");
        displayWork.FullName();
        displayWork.PersonalInfo();
        displayWork.TableAndChairs();
        displayWork.FavoriteSong();
        displayWork.Comments();
        displayWork.CommentsDialog();
        displayWork.BurmaShave();
        displayWork.RandomGuess();
        CarleysMotto carley=new CarleysMotto();
        carley.CarleysMotto();
        carley.CarleysMottoMod();
        SammysMotto sammy=new SammysMotto();
        sammy.SammysMotto();
        sammy.SammysMottoMod();
    }    
}
