import org.example.Pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PessoaTeste {
    @Test
    void validarLancamentos(){
        int[] primeiroArray = {1, 2, 3, 4, 5};
        int[] segundoArray = {1, 2, 3, 4, 5};

        assertArrayEquals(primeiroArray, segundoArray);
    }

    @Test
    void validarPessoa(){
        Pessoa pessoa = new Pessoa("erick", 21);

        assertNotNull(pessoa);
    }
}
