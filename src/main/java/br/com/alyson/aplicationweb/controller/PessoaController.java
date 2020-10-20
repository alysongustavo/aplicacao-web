package br.com.alyson.aplicationweb.controller;

import br.com.alyson.aplicationweb.mock.PessoaMock;
import br.com.alyson.aplicationweb.service.PessoaService;
import br.com.alyson.clientexactaworks.model.PessoaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/novo")
    public ModelAndView novo(PessoaDTO pessoa) {
        ModelAndView mv = new ModelAndView("pessoa/cadastrar");
        return mv;
    }


    @PostMapping(value = "/novo")
    public ModelAndView cadastrar(@Valid PessoaDTO pessoa, BindingResult result, Model model, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            return novo(pessoa);
        }

        pessoaService.cadastrar(pessoa);
        attributes.addFlashAttribute("mensagem", "Pessoa salva com sucesso!");
        return new ModelAndView("redirect:/pessoas/novo");
    }

    @GetMapping
    public ModelAndView listar() {

        List<PessoaDTO> pessoas = pessoaService.listar();

        ModelAndView mv = new ModelAndView("pessoa/listar");
        mv.addObject("pessoas", pessoas);
        return mv;
    }
}
