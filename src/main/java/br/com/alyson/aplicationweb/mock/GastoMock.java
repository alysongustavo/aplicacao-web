package br.com.alyson.aplicationweb.mock;

import br.com.alyson.clientexactaworks.model.GastoDTO;
import br.com.alyson.clientexactaworks.model.PessoaDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GastoMock {

    public static final List<GastoDTO> gastos(){

        List<GastoDTO> gastos = new ArrayList<>();

        GastoDTO gastoDTO1 = new GastoDTO();
        gastoDTO1.setId(1);
        gastoDTO1.setDescription("Gasto teste Mock");
        gastoDTO1.setDtHour("2020-09-09");
        gastoDTO1.setValue(new BigDecimal(300));
        gastoDTO1.setTags("Gastos Mock");

        GastoDTO gastoDTO2 = new GastoDTO();
        gastoDTO2.setId(2);
        gastoDTO2.setDescription("Gasto teste Mock 2");
        gastoDTO2.setDtHour("2020-09-09");
        gastoDTO2.setValue(new BigDecimal(300));
        gastoDTO2.setTags("Gastos Mock ");

        gastos.add(gastoDTO1);
        gastos.add(gastoDTO2);

        return gastos;

    }

    public static final GastoDTO buscarGastoPorId(Integer id){

        List<GastoDTO> gastos = new ArrayList<>();

        GastoDTO gastoDTO1 = new GastoDTO();
        gastoDTO1.setId(1);
        gastoDTO1.setDescription("Gasto teste Mock");
        gastoDTO1.setDtHour("2020-09-09");
        gastoDTO1.setValue(new BigDecimal(300));
        gastoDTO1.setTags("Gastos Mock");

        GastoDTO gastoDTO2 = new GastoDTO();
        gastoDTO2.setId(2);
        gastoDTO2.setDescription("Gasto teste Mock 2");
        gastoDTO2.setDtHour("2020-09-09");
        gastoDTO2.setValue(new BigDecimal(300));
        gastoDTO2.setTags("Gastos Mock ");

        gastos.add(gastoDTO1);
        gastos.add(gastoDTO2);

        return gastos.get(0);

    }
}
