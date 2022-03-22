import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

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
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJhonatan = new Dev();
        devJhonatan.setNome("Jhonatan");
        devJhonatan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrito Jhonatan" + devJhonatan.getConteudosInscritos());
        devJhonatan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscrito Jhonatan" + devJhonatan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jhonatan" + devJhonatan.getConteudosConcluidos());
        System.out.println("XP: " + devJhonatan.calcularTotalXp());

        System.out.println("--------------");

        Dev devFabio = new Dev();
        devFabio.setNome("Fabio");
        devFabio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrito Fabio" + devFabio.getConteudosInscritos());
        devFabio.progredir();
        devFabio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscrito Fabio" + devFabio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fabio" + devFabio.getConteudosConcluidos());
        System.out.println("XP: " + devFabio.calcularTotalXp());

        System.out.println("--------------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrito Paulo" + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscrito Paulo" + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo" + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());


    }

}
