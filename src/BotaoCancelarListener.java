import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BotaoCancelarListener implements ActionListener {
	
	private JTextField textTitulo;
	private JTextArea areaSinopse;
	private JComboBox<String> cmbGenero;
	private JCheckBox chkBoxAssistido;
	private JRadioButton radioBotaoPirate;
	private JRadioButton radioBotaoPrime;
	private JRadioButton radioBotaoNetflix;
	private StarRater starRaterAvaliacao;
	
	public BotaoCancelarListener(JTextField textTitulo, JTextArea areaSinopse, JComboBox<String> cmbGenero, JCheckBox chkBoxAssistido,
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
		JOptionPane.showMessageDialog (null, "Campos limpos");
		textTitulo.setText("");
		areaSinopse.setText("");
		cmbGenero.setSelectedItem(null);
		starRaterAvaliacao.setSelection(0);
		chkBoxAssistido.setSelected(false);
	}

}
