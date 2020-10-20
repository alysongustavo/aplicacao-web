package br.com.alyson.aplicationweb.mock;

import br.com.alyson.clientexactaworks.model.PessoaDTO;

import java.util.ArrayList;
import java.util.List;

public class PessoaMock {

    public static final List<PessoaDTO> pessoas(){

        List<PessoaDTO> pessoas = new ArrayList<>();

        PessoaDTO pessoaDTO1 = new PessoaDTO();
        pessoaDTO1.setId(1);
        pessoaDTO1.setName("Rodrigo");
        pessoaDTO1.setCpf("08670313448");
        pessoaDTO1.setEmail("aci.alyson@gmail.com");

        PessoaDTO pessoaDTO2 = new PessoaDTO();
        pessoaDTO2.setId(1);
        pessoaDTO2.setName("Gustavo");
        pessoaDTO2.setCpf("92930077468");
        pessoaDTO2.setEmail("lucia@gmail.com");

        pessoas.add(pessoaDTO1);
        pessoas.add(pessoaDTO2);


        return pessoas;

    }
}
