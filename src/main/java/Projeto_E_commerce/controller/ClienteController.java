package Projeto_E_commerce.controller;


import Projeto_E_commerce.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
   private ClienteService clienteService;



}
