package org.example;

import java.util.logging.Logger;

public class bancoDeDados {
    private static final Logger logger = Logger.getLogger(bancoDeDados.class.getName());

    public static void inicializaConexao(){
        //inicializa conexão
        logger.info("iniciando conexão");
    }

    public static void finalizaConexao(){
        //finaliza a conexão
        logger.info("fechando conexão");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no banco de dados
        logger.info("Insere dados da pessoa no banco de dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove pessoa no banco de dados
        logger.info("remove dados da pessoa no banco de dados");
    }
}
