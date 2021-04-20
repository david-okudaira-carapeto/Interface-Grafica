import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class PropriedadeLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	private Color forCor = new Color(0,0,0);
	private Color backCor = new Color(0,0,0);
	private int tamanho = 20;
	
	
	public PropriedadeLabel(String texto, int tamanho) {
		super(texto);
		this.tamanho = tamanho;
		init();
	}
	
	public PropriedadeLabel(String texto, Color forCor, Color backCor, int tamanho) {
		super(texto);
		this.forCor = forCor;
		this.backCor = backCor;
		this.tamanho = tamanho;
		init();
	}
	
	
	private void init() {
		this.setHorizontalAlignment(JLabel.LEFT);
		this.setForeground(forCor);
		this.setBackground(backCor);
		this.setFont(new Font("Arial", Font.BOLD, tamanho));
	}
	
}
