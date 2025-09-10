package br.com.senaisp.bauru.classes;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	private Image dukeImage;
	private Image luvaImage;
	private AudioClip som;
	//Image views
	
	private ImageView dukeImgVw;
	private ImageView luvaImgVw;
	
	public Duke() {
		//Carregando as imagens
		dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
		luvaImage = new Image(getClass().getResource("Images/Glove.png").toString());
		
		//Criando os imagesviews
		dukeImgVw = new ImageView(dukeImage);
		luvaImgVw = new ImageView(luvaImage);
		
		//carregando o som
		som = new AudioClip(getClass().getResource("Audios/Note5.wav").toString());
		//dimensionando e posicionando os itens
		dukeImgVw.setFitWidth(50);
		dukeImgVw.setPreserveRatio(true); //Manter proporção da imagem
		dukeImgVw.setY(10);
		//Luva
		luvaImgVw.setFitHeight(20);
		luvaImgVw.setPreserveRatio(true);
		luvaImgVw.setX(17);
		
		//Adicionando os itens no group
		getChildren().addAll(dukeImgVw,luvaImgVw);
		
		//Criando os eventos para o Duke
		criacaoEventos();
		
		
		
	}

	private void criacaoEventos() {
		setOnMouseClicked((me)-> {som.play();});
		//Metodo para arrastar e soltar
		setOnMouseDragged((me)->{
			double largura = this.getBoundsInLocal().getWidth()/2;
			double altura = this.getBoundsInLocal().getWidth()/2;
			//posicionamento na scena
			setLayoutX(me.getSceneX()-largura);
			setLayoutY(me.getSceneY()-altura);
	});
		
	

	}
}
