package aplicacion;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConwayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConwayTest
{
    /**
     * Default constructor for test class ConwayTest
     */
    public ConwayTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void dosCelulasJuntasDeberianMorirAlPrimerClic(){
        AutomataCelular ac=new AutomataCelular();
        Conway a =new Conway(ac,5,4);
        Conway b =new Conway(ac,5,5);
        ac.ticTac();
        
        assertEquals(false,(a.isVivo()&&b.isVivo()));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Test
    public void unBloqueDeberiaPermanecerEstatico(){
        AutomataCelular ac=new AutomataCelular();
        Conway a =new Conway(ac,5,4);
        Conway b =new Conway(ac,5,5);
        Conway c =new Conway(ac,6,4);
        Conway d =new Conway(ac,6,5);
        for (int i=0;i<=100;i++){
            ac.ticTac();
        }
        assertEquals(true,(a.isVivo()&&b.isVivo()&&c.isVivo()&&d.isVivo()));
    }
    
    @Test
    public void deberiaParpadear(){
        AutomataCelular ac = new AutomataCelular();
        Conway a =new Conway(ac,5,4);
        Conway b =new Conway(ac,5,5);
        Conway c =new Conway(ac,5,6);
        ac.ticTac();
        Elemento e = ac.getElemento(4,5);
        Elemento f= ac.getElemento(6,5);
        
        boolean p1=(true==(e.isVivo()&&f.isVivo()));
        boolean p2=(false==(a.isVivo()||c.isVivo()));
        
        assertEquals(true,(p1&&p2));
    }
    
}
