import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BotaoSalvarListener implements ActionListener {

	
	private String strLocal;
	private String strAssistido;
	private JTextField textTitulo;
	private JTextArea areaSinopse;
	private JComboBox<String> cmbGenero;
	private JCheckBox chkBoxAssistido; 
	private JRadioButton radioBotaoPirate;
	private JRadioButton radioBotaoPrime;
	private JRadioButton radioBotaoNetflix;
	private StarRater starRaterAvaliacao;
	
	public BotaoSalvarListener(JTextField textTitulo, JTextArea areaSinopse, JComboBox<String> cmbGenero, JCheckBox chkBoxAssistido, 
			JRadioButton radioBotaoPirate, JRadioButton radioBotaoPrime, JRadioButton radioBotaoNetflix, StarRater starRaterAvaliacao
			) {
		this.textTitulo = textTitulo;
		this.areaSinopse = areaSinopse;
		this.cmbGenero = cmbGenero;
		this.chkBoxAssistido = chkBoxAssistido;
		this.radioBotaoPirate = radioBotaoPirate;
		this.radioBotaoPrime = radioBotaoPrime;
		this.radioBotaoNetflix = radioBotaoNetflix;
		this.starRaterAvaliacao = starRaterAvaliacao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(chkBoxAssistido.isSelected()) {
			strAssistido = "Sim";
		} else {
			strAssistido = "Não";
		}
		
		if(radioBotaoPirate.isSelected()) {
			strLocal = "Pirate Bay";
		} else if (radioBotaoPrime.isSelected()) {
			strLocal = "Prime video";
		} else if(radioBotaoNetflix.isSelected()) {
			strLocal = "Netflix";
		} else {
			strLocal = "Não definido";
		}
		
		Filme filme = new Filme();
		filme.setTitulo(textTitulo.getText());
		filme.setSinopse(areaSinopse.getText());
		filme.setGenero((String)cmbGenero.getSelectedItem());
		filme.setLocal(strLocal);
		filme.setAvaliacao(starRaterAvaliacao.getSelection());
		filme.setAssistido(chkBoxAssistido.isSelected());
		
		if(textTitulo.getText().equals("") || cmbGenero.getSelectedItem() == null) {
			JOptionPane.showMessageDialog(null, "Por favor, preencha os campos do filme!");
		} else {
			JOptionPane.showMessageDialog(null, "Título: " + filme.getTitulo() + "\nSinopse: " + filme.getSinopse() + 
					"\nGênero: " + filme.getGenero() + "\nLocal: "+ filme.getLocal() + "\nAssistido: " + filme.getAvaliacao() +
					"\nAvaliação: " + filme.getAvaliacao()
					);
		}
		
		
		
	}
}
