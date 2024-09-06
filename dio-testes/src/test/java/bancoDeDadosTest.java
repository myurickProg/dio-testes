import org.example.Pessoa;
import org.example.bancoDeDados;
import org.junit.jupiter.api.*;

public class bancoDeDadosTest {
    @BeforeAll
    static void configuraDB(){
        bancoDeDados.inicializaConexao();
    }

    @AfterAll
    static void finalizaDB(){
        bancoDeDados.finalizaConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        Pessoa pessoa = new Pessoa("erick", 21);
        bancoDeDados.insereDados(pessoa);
    }

    @AfterEach
    void removoveDadosDoTeste(){
        bancoDeDados.removeDados(new Pessoa("erick", 21));
    }

    @Test
    void validaTeste(){
        Assertions.assertTrue(true);
    }
}
