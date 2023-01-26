package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTatiane = new Dev();
        devTatiane.setNome("Tatiane");
        devTatiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Tatiane" + devTatiane.getConteudosInscritos());
        devTatiane.progredir();
        devTatiane.progredir();
        System.out.println("-.-");
        System.out.println("Conteudos Inscritos Tatiane" + devTatiane.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Tatiane" + devTatiane.getConteudosConcluidos());
        System.out.println("XP:" + devTatiane.calcularTotalXP());

        System.out.println("---------");

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Fernando" + devFernando.getConteudosInscritos());
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("-.-");
        System.out.println("Conteudos Inscritos Fernando" + devFernando.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Fernando" + devTatiane.getConteudosConcluidos());
        System.out.println("XP:" + devFernando.calcularTotalXP());



    }
}
