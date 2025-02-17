package view;

import model.*;

import java.util.Scanner;

public class MenuPrincipalController {
    private Trivia trivia;
    private MenuPrincipalView view;

    public void initMenuPrincipalController(Trivia trivia, MenuPrincipalView menuPrincipalView) {
        this.trivia = trivia;
        this.view = menuPrincipalView;
    }

    public void handleEvent(int event, Scanner entrada) {
        switch (event) {
            case 1:
                TemasView jogarView = new TemasView();
                jogarView.initTemasView(trivia, entrada);
                break;

            case 2:
                ConfiguracoesView configView = new ConfiguracoesView();
                configView.initConfiguracoesView(trivia, entrada);
                break;
            case 3:
                RankingView rankingView = new RankingView();
                rankingView.initRankingView(trivia, entrada, trivia.getRanking());
                break;
            case 4:
                view.finalizar();
                break;
        }
    }

}
