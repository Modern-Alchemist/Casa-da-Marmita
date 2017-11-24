/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.jPrecos;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author a16041967
 */
public class JPrecoTest {
    
    public JPrecoTest(){}
    
    @Test
    public void deveriaRetornar1aoReceber1(){
        int esperado = 1;
        int retornado;
        jPrecos precos = new jPrecos();
        retornado = precos.jPrecos(esperado);
        assertEquals(esperado,retornado);
        
    }
}
