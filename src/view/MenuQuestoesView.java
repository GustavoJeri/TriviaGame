package view;

import model.*;

import java.util.Scanner;

public class MenuQuestoesView implements Observer {
    private Trivia trivia;
    private MenuQuestoesViewController controller;
    private int numQuestoes;
    private boolean finalizada = false;
    private Scanner entrada;

    public void initMenuQuestoesView(Trivia trivia, Scanner entrada) {
        this.trivia = trivia;
        this.entrada = entrada;
        controller = new MenuQuestoesViewController();
        controller.initMenuQuestoesController(trivia, this);
        trivia.attachObserver(this);
        menuQuestoes();
    }

    public void menuQuestoes() {
        System.out.println("=======Menu Questoes=======");
        System.out.println("1 - Adicionar Questão");
        System.out.println("2 - Remover Questão");
        System.out.println("3 - Atualizar Questão");
        System.out.println("4 - Listar Questões");
        System.out.println("===========================");
        int opcao = entrada.nextInt();
        controller.handleEvent(opcao, entrada);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    @Override
    public void update() {

    }
}
