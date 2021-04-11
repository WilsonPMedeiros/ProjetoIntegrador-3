package com.ifrn.sisconpro.controller;


import com.ifrn.sisconpro.model.Contrato;
import com.ifrn.sisconpro.service.serviceImple.ContratoServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.lang.*;

import java.util.List;

@Controller
public class ContratoController {

    @Autowired
    ContratoServiceImple service;


    @RequestMapping(value = "/contratos",  method = RequestMethod.GET)
    public ModelAndView getContratos(){
        ModelAndView mv = new ModelAndView("contratos");
        List<Contrato> contratos = service.findAll();
        mv.addObject("contratosLista", contratos);
        return mv;
    }


    @GetMapping("/cad-contratos")
   public String exibirForm(Contrato contrato){
        return "cad-contratos";
    }

    @PostMapping("/cad-contratos")
    public String salvarContrato(Contrato contrato){
        contrato.builder()
        .fonteRecurso("BNDES")
                .build();
        service.save(contrato); // Cadastra e atualiza
        return "redirect:/contratos";
    }

    /*

    @GetMapping("/{id}")
    public ModelAndView editarContrato(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("/EditarCliente.html");
        Contrato contrato = service.findById(id);
        //Endereco end = enderecoService.findById(cliente.getEnd().getId());
        //System.out.println("Esse é o cliente "+cliente+"Esse é o ID"+ cliente.getEnd().getId());
        mv.addObject("cliente", cliente);
        return  mv;
    }

    @PostMapping("/editarEndereco/{id}")
    public String atualizarCliente(@PathVariable("id") long id,
                                   @ModelAttribute("endereco") Endereco endereco) {
        Endereco enderecoEditado = enderecoService.findById(id);
        if (!enderecoEditado.equals(endereco)) {
            enderecoEditado.setBairro(enderecoEditado.getBairro());
            enderecoEditado.setCidade(endereco.getCidade());
            enderecoEditado.setLogradouro(endereco.getLogradouro());
            enderecoEditado.setUf(endereco.getUf());
            enderecoService.save(enderecoEditado); // Cadastra e atualiza
        }

        return "redirect:/opcoes";
    }
*/


    @GetMapping("/contratos/{id}")
    public String excluirContrato(@PathVariable("id") long id){
        service.deleteById(id);
        return "redirect:/contratos";
    }



}
