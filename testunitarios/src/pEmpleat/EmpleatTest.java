import org.testng.annotations.Test;
import pEmpleat.Empleat;
import pMatricad.Matricad;

import static org.testng.Assert.*;

public class EmpleatTest {
    private Empleat instance;

    @Test
    public void testCalculaSalariBrut_Vendedor_Valido() {
        Empleat empleat = new Empleat();
        double salariBrut = empleat.calculaSalariBrut("venedor", 2000, 5);
        assertEquals(salariBrut, 1000 + 100 + (5 * 18.57));
    }

    @Test(expectedExceptions = Exception.class)
    public void testCalculaSalariBrut_TipoEmpleat_NoValido() {
        Empleat empleat = new Empleat();
        empleat.calculaSalariBrut("programador", 2000, 5);
    }

    @Test(expectedExceptions = Exception.class)
    public void testCalculaSalariBrut_VendesMes_Negativas() {
        Empleat empleat = new Empleat();
        empleat.calculaSalariBrut("venedor", -100, 5);
    }

    @Test(expectedExceptions = Exception.class)
    public void testCalculaSalariBrut_HoresExtra_Negativas() {
        Empleat empleat = new Empleat();
        empleat.calculaSalariBrut("encarregat", 3000, -3);
    }

    @Test
    public void testCalculaSalariBrut_PrimerLimitePrima() {
        Empleat empleat = new Empleat();
        double salariBrut = empleat.calculaSalariBrut("venedor", 1000, 0);
        assertEquals(salariBrut, 1000 + 100);
    }

    @Test
    public void testCalculaSalariBrut_SegundoLimitePrima() {
        Empleat empleat = new Empleat();
        double salariBrut = empleat.calculaSalariBrut("encarregat", 2500, 0);
        assertEquals(salariBrut, 1500 + 200);
    }

    @Test
    public void testCalculaSalariBrut_SalarioBase_1500() {
        Empleat empleat = new Empleat();
        double salariBrut = empleat.calculaSalariBrut("encarregat", 2000, 0);
        assertEquals(salariBrut, 1500 + 100);
    }

    @Test
    public void testCalculaSalariBrut_SalarioBase_1000() {
        Empleat empleat = new Empleat();
        double salariBrut = empleat.calculaSalariBrut("venedor", 1500, 0);
        assertEquals(salariBrut, 1000 + 100);
    }

    @Test
    public void testCalculaSalariBrut_NoPrima() {
        Empleat empleat = new Empleat();
        double salariBrut = empleat.calculaSalariBrut("encarregat", 800, 0);
        assertEquals(salariBrut, 1500);
    }
    // Casos de prueba para calculaSalariNet

    @Test
    public void testCalculaSalariNet_NoRetencion() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(800);
        assertEquals(salariNet, 800);
    }

    @Test
    public void testCalculaSalariNet_Retencion16PorCiento() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(1200);
        assertEquals(salariNet, 1008);
    }

    @Test
    public void testCalculaSalariNet_Retencion20PorCiento() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(1800);
        assertEquals(salariNet, 1440);
    }

    @Test(expectedExceptions = Exception.class)
    public void testCalculaSalariNet_SalariBrut_Negatiu() {
        Empleat empleat = new Empleat();
        empleat.calculaSalariNet(-1000);
    }

    @Test
    public void testCalculaSalariNet_SalarioBruto_999() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(999);
        assertEquals(salariNet, 999);
    }

    @Test
    public void testCalculaSalariNet_SalarioBruto_1500() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(1500);
        assertEquals(salariNet, 1260);
    }

    @Test
    public void testCalculaSalariNet_SalarioBruto_3000() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(3000);
        assertEquals(salariNet, 2400);
    }

    @Test
    public void testCalculaSalariNet_SalarioBruto_10000() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(10000);
        assertEquals(salariNet, 8000);
    }

    @Test
    public void testCalculaSalariNet_SalarioBruto_0() {
        Empleat empleat = new Empleat();
        double salariNet = empleat.calculaSalariNet(0);
        assertEquals(salariNet, 0);
    }
}