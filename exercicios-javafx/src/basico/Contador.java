package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		removerClassesLabel(label);
		trocarCorLabel(label);
	}
	
	private void trocarCorLabel(Label label) {
		if(contador > 0) label.getStyleClass().add("verde");
		else if(contador < 0) label.getStyleClass().add("vermelho");		
	}

	private void removerClassesLabel(Label label) {
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");		
	}

	private void handleAction(Label label, String action) {
		if(action.equals("-")) decrement();
		else if(action.equals("+")) increment();
		atualizarLabelNumero(label);
	}
	
	public void increment() {
		this.contador++;
	}
	
	public void decrement() {
		this.contador--;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label(contador + "");
		
		Button botaoDecremento = new Button("-");
		Button botaoIncremento = new Button("+");
		
		botaoDecremento.setOnAction(d -> handleAction(labelNumero, "-"));
		botaoIncremento.setOnAction(i -> handleAction(labelNumero, "+"));
		
		botaoDecremento.getStyleClass().add("botoes");
		botaoIncremento.getStyleClass().add("botoes");
		
		
		HBox boxBotoes = new HBox();
		
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		String caminhoDoCSS = getClass()
				.getResource("/basico/Contador.css")
				.toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCSS);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
