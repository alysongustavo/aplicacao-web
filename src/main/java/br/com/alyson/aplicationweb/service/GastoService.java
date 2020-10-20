package br.com.alyson.aplicationweb.service;

import br.com.alyson.clientexactaworks.model.GastoDTO;
import br.com.alyson.clientexactaworks.model.PessoaDTO;
import br.com.alyson.clientexactaworks.util.RestClient;
import br.com.alyson.clientexactaworks.util.RestClientImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoService {

    private RestClient restClient;

    public GastoService(){
        this.restClient = new RestClientImpl();
    }

    public List<GastoDTO> listarGastos(){
        return this.restClient.listarGastos();
    }

    public List<GastoDTO> listarGastosPessoa(Integer id){
        return this.restClient.listarGastosPorPessoa(id);
    }

    public GastoDTO cadastrarGasto(GastoDTO gasto, Integer pessoaId){
        return this.restClient.adicionarGastos(gasto, pessoaId);
    }

    public GastoDTO buscarPorId(Integer id){
        return this.restClient.buscarGastosPorId(id);
    }
}
