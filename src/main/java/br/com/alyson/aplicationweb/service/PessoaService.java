package br.com.alyson.aplicationweb.service;

import br.com.alyson.clientexactaworks.model.PessoaDTO;
import br.com.alyson.clientexactaworks.util.RestClient;
import br.com.alyson.clientexactaworks.util.RestClientImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private RestClient restClient;

    public PessoaService(){
        this.restClient = new RestClientImpl();
    }

    public List<PessoaDTO> listar(){
        return this.restClient.listarPessoas();
    }

    public String cadastrar(PessoaDTO pessoaDTO){
        return this.restClient.cadastrarPessoa(pessoaDTO);
    }

    public PessoaDTO buscarPorId(Integer id){
        return this.restClient.buscarPessoaPorId(id);
    }
}
