package me.dio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String mainMenu() {
        return "<html>" +
                "<body style='text-align: center;'>" +
                "<h1 style='font-size: 30px; color: blue;'>Bem-vindo(a) à aplicação! Está tudo funcionando Perfeitamente.</h1>" +
                "<h2>Se desejar escolha uma opção para navegar:</h2>" +
                "<ul style='list-style-type: none; padding: 0;'>" +
                "   <li><a href='/option1' style='font-size: 20px;'>Adicionar Usuário</a></li>" +
                "   <li><a href='/option2' style='font-size: 20px;'>Editar Usuário</a></li>" +
                "   <li><a href='/option3' style='font-size: 20px;'>Consultar Usuário</a></li>" +
                "</ul>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/option1")
    public String option1() {
        return "<html>" +
                "<body style='text-align: center;'>" +
                "<h1 style='font-size: 24px; color: black;'><b>Obrigado pela oportunidade de participar desse processo seletivo nessa renomada empresa.</b></h1>" +
                "<a href='/' style='display: inline-block; margin-top: 20px; font-size: 18px; text-decoration: none; color: blue;'>Voltar para o menu principal</a>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/option2")
    public String option2() {
        return "<html>" +
                "<body style='text-align: center;'>" +
                "<h1 style='font-size: 24px; color: black;'><b>Sou apaixonado por aprendizado contínuo e pela criação de soluções que transformam o cotidiano e estou pronto para crescer e contribuir com a equipe inspiradora da Avanade.</b></h1>" +
                "<a href='/' style='display: inline-block; margin-top: 20px; font-size: 18px; text-decoration: none; color: blue;'>Voltar para o menu principal</a>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/option3")
    public String option3() {
        return "<html>" +
                "<body style='text-align: center;'>" +
                "<h1 style='font-size: 24px; color: orange; border: 2px solid black; display: inline-block; padding: 10px;'><b>#CONTRATAEUAVANADE #CONTRATAEUJANA</b></h1>" +
                "<a href='/' style='display: inline-block; margin-top: 20px; font-size: 18px; text-decoration: none; color: blue;'>Voltar para o menu principal</a>" +
                "</body>" +
                "</html>";
    }
}
