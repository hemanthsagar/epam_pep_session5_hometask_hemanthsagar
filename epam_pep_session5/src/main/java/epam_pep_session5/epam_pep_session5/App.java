package epam_pep_session5.epam_pep_session5;


public class App extends Thread
{
    public void run()
    {
        creategui a=new creategui();
        a.createguifunction();
    }
    public static void main(String args[])
    {
        App t1=new App();
        t1.start();
    }
}
