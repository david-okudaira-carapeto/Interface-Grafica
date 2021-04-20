import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class PropriedadeBotao extends JButton{


	private static final long serialVersionUID = 1L;
	
	private Color forCor;
	private Color backCor;
	private String texto;
	private int tamanho;
	
	public PropriedadeBotao(String texto, Color forCor, Color backCor, int tamanho) {
		this.texto = texto;
		this.forCor = forCor;
		this.backCor = backCor;
		this.tamanho = tamanho;
		init();
	}
	
	
	public void init() {
		this.setText(texto);
		this.setFont(new Font("Arial", Font.BOLD, tamanho));
		this.setForeground(forCor);
		this.setBackground(backCor);
	}
}
