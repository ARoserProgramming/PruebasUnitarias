package pMatricad;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class MatriCadNGTest {
    private Matricad instance; // Declaración de la instancia de Matricad

    public MatriCadNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        // Inicialización de la instancia de Matricad antes de cada método de prueba
        instance = new Matricad(new String[]{"cadena1", "cadena2", "cadena3"});
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getMaxCad method, of class MatriCad.
     */
    @Test
    public void testGetMaxCad() {
        System.out.println("getMaxCad");
        // No necesitas inicializar instance aquí, ya se inicializó en setUpMethod
        String expResult = "cadena1"; // Define el resultado esperado
        String result = instance.getMaxCad(); // Llama al método en la instancia
        assertEquals(result, expResult); // Comprueba si el resultado es igual al esperado
    }

    /**
     * Test of getSumaCaracters method, of class MatriCad.
     */
    @Test
    public void testGetSumaCaracters() {
        System.out.println("getSumaCaracters");
        // No necesitas inicializar instance aquí, ya se inicializó en setUpMethod
        int expResult = 21; // Define el resultado esperado
        int result = instance.getSumaCaracters(); // Llama al método en la instancia
        assertEquals(result, expResult); // Comprueba si el resultado es igual al esperado
    }

    /**
     * Test of getIndexDe method, of class MatriCad.
     */
    @Test
    public void testGetIndexDe() {
        System.out.println("getIndexDe");
        // No necesitas inicializar instance aquí, ya se inicializó en setUpMethod
        String unaCadena = "cadena2"; // Define la cadena a buscar
        int expResult = 1; // Define el resultado esperado
        int result = instance.getIndexDe(unaCadena); // Llama al método en la instancia
        assertEquals(result, expResult); // Comprueba si el resultado es igual al esperado
    }
}
