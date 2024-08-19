package src;

import java.time.LocalDate;

import src.dominio.Bootcamp;
import src.dominio.Curso;
import src.dominio.Dev;
import src.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Introdução ao Ambiente Java e Projetos Colaborativos", "Descrição 1", 7);
        Curso curso2 = new Curso("Sintaxe Básica com Java", "Descrição 2", 13);
        Curso curso3 = new Curso("Programação Orientada a Objetos com Java", "Descrição 3", 18);
        Curso curso4 = new Curso("Testes e Gerenciamento de Depêndencias em Projetos Java", "Descrição 4", 8);
        Curso curso5 = new Curso("Banco de Dados SQL e NoSQL para Desenvolvedores Back-end", "Descrição 5", 6);
        Curso curso6 = new Curso("Ganhando Produtividade no Java com Spring Framework", "Descrição 6", 14);

        Mentoria mentoria1 = new Mentoria("Live de Lançamento: Coding the Future Claro - Java com Spring Boot", "Mentoria Bootcamp Claro", LocalDate.of(2024, 8, 8));

        Bootcamp bootcamp = new Bootcamp("Bootcamp Claro Java com Spring Boot", "Vá do básico de uma das principais linguagens back-end até práticas avançadas com Spring, aplicando metodologia de testagem TDD e criando uma visão completa de system design com arquitetura de microsserviços, e faça deploy em nuvem com o AWS e copilotos de IA.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(curso6);
        bootcamp.getConteudos().add(mentoria1);

        Dev andre = new Dev("Andre");
        andre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + andre.getConteudosInscritos());
        andre.progredir();
        andre.progredir();
        andre.progredir();
        andre.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos inscritos: " + andre.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + andre.getConteudosConcluidos());
        System.out.println("XP: " + andre.calcularTotalXp());

    }
}
