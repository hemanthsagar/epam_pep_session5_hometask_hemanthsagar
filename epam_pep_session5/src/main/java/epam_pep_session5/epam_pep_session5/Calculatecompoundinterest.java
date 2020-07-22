package epam_pep_session5.epam_pep_session5;


//program to calculate compound interest
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Logger;

public class Calculatecompoundinterest
{
    public static void calculatecompoundinterest()
    {
        creategui obj1=new creategui();
        TextField tf1=obj1.getTextField1();
        TextField tf2=obj1.getTextField2();
        TextField tf3=obj1.getTextField3();
        String s1=tf1.getText();
        String s2=tf2.getText();
        String s3=tf3.getText();
        try
        {
            Double p=Double.parseDouble(s1);
            Double t=Double.parseDouble(s2);
            Double r=Double.parseDouble(s3);
            Double ci=p*(Math.pow((1+(r/100)),t));
            ci=Math.round(ci*100.0)/100.0;
            // Create a Logger
            Logger logger
                    = Logger.getLogger(
                    Calculatesimpleinterest.class.getName());

            // Call info method
            logger.info("compound interest = "+Double.toString(ci-p));

        }
        catch(NumberFormatException e)
        {
            Logger logger
                    = Logger.getLogger(
                    Calculatecompoundinterest.class.getName());

            // Call info method
            logger.warning("please fill correct information");
        }

    }
}