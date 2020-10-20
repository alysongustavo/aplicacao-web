package br.com.alyson.aplicationweb.controller;

import br.com.alyson.aplicationweb.mock.GastoMock;
import br.com.alyson.aplicationweb.mock.PessoaMock;
import br.com.alyson.aplicationweb.service.GastoService;
import br.com.alyson.clientexactaworks.model.GastoDTO;
import br.com.alyson.clientexactaworks.model.PessoaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/gastos")
public class GastoController {

    @Autowired
    private GastoService gastoService;

    @GetMapping("/novo")
    public ModelAndView novo(GastoDTO gasto) {
        ModelAndView mv = new ModelAndView("gasto/cadastrar");
        mv.addObject("pessoas", PessoaMock.pessoas());
        return mv;
    }

    @PostMapping(value = "/novo")
    public ModelAndView cadastrar(@Valid GastoDTO gasto, BindingResult result, Model model, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            return novo(gasto);
        }

        gastoService.cadastrarGasto(gasto, 1);
        attributes.addFlashAttribute("mensagem", "gasto salvo com sucesso!");
        return new ModelAndView("redirect:/gastos/novo");
    }

    @GetMapping
    public ModelAndView listar() {

        List<GastoDTO> gastos = gastoService.listarGastos();

        ModelAndView mv = new ModelAndView("gasto/listar");
        mv.addObject("gastos", gastos);
        return mv;
    }

    @GetMapping("/{id}")
    public ModelAndView buscarPorId(@PathVariable Integer id) {

        GastoDTO gasto = gastoService.buscarPorId(id);

        ModelAndView mv = new ModelAndView("gasto/detalhar");
        mv.addObject("gasto", gasto);
        return mv;
    }
}
