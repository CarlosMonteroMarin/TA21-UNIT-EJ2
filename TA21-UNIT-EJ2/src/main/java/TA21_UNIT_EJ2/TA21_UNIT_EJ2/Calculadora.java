package TA21_UNIT_EJ2.TA21_UNIT_EJ2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	double resultado=0.0;
	private JPanel contentPane;
	private JTextField tfOperador1;
	private JTextField tfOperador2;
	private JTextField tfResultado;
	Calculos calculos = new Calculos();


	
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//OBJETOS
		tfOperador1 = new JTextField();
		tfOperador1.setBounds(120, 50, 86, 20);
		contentPane.add(tfOperador1);
		tfOperador1.setColumns(10);
				
		tfOperador2 = new JTextField();
		tfOperador2.setBounds(120, 92, 86, 20);
		contentPane.add(tfOperador2);
		tfOperador2.setColumns(10);

		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setBounds(120, 138, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(288, 137, 89, 23);
		contentPane.add(btnDiv);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(288, 103, 89, 23);
		contentPane.add(btnMulti);
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(288, 69, 89, 23);
		contentPane.add(btnResta);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setBounds(288, 35, 89, 23);
		contentPane.add(btnSuma);
		
		JLabel lblNewLabel_1 = new JLabel("Operador 1:");
		lblNewLabel_1.setBounds(35, 53, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operador 2:");
		lblNewLabel_2.setBounds(35, 95, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Resultado:");
		lblNewLabel.setBounds(35, 141, 63, 14);
		contentPane.add(lblNewLabel);
		
		//EVENTOS
		//botón de suma
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//parseamos los datos obtenidos por textfield
					double op1= Double.parseDouble(tfOperador1.getText());
					double op2= Double.parseDouble(tfOperador2.getText());
					
					DecimalFormat  df = new DecimalFormat("#.000");
					resultado=calculos.suma(op1, op2);
					tfResultado.setText(df.format(resultado));
					
				} catch (Exception e2) {
					//si introduce carácteres que no són números generará un panel y reseteara los campos rellenados
					JOptionPane.showMessageDialog(null, "Valores no válidos");
					tfOperador1.setText("");
					tfOperador2.setText("");
				}
			}
		});
		
		//botón de resta
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//parseamos los datos obtenidos por textfield
					double op1= Double.parseDouble(tfOperador1.getText());
					double op2= Double.parseDouble(tfOperador2.getText());
					
					DecimalFormat  df = new DecimalFormat("#.00");
					
					//llamamos al metodo y le pasamos los dos números parsados
					resultado=calculos.resta(op1,op2);
					tfResultado.setText(df.format(resultado));
				} catch (Exception e2) {
					//si introduce carácteres que no són números generará un panel y reseteara los campos rellenados
					JOptionPane.showMessageDialog(null, "Valores no válidos");
					tfOperador1.setText("");
					tfOperador2.setText("");
				}
			}
		});
		
		
		//botón de multiplicación
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//parseamos los datos obtenidos por textfield
					double op1= Double.parseDouble(tfOperador1.getText());
					double op2= Double.parseDouble(tfOperador2.getText());
					
					DecimalFormat  df = new DecimalFormat("#.00");
					
					//llamamos al metodo y le pasamos los dos números parsados
					resultado=calculos.multi(op1, op2);
					tfResultado.setText(df.format(resultado));
				} catch (Exception e2) {
					//si introduce carácteres que no són números generará un panel y reseteara los campos rellenados
					JOptionPane.showMessageDialog(null, "Valores no válidos");
					tfOperador1.setText("");
					tfOperador2.setText("");				
				}
			}
		});
		
		//botón de división
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//parseamos los datos obtenidos por textfield
					double op1= Double.parseDouble(tfOperador1.getText());
					double op2= Double.parseDouble(tfOperador2.getText());
					
					DecimalFormat  df = new DecimalFormat("#.00");
					
					//llamamos al metodo y le pasamos los dos números parsados
					resultado=calculos.div(op1, op2);
					tfResultado.setText(df.format(resultado));
				} catch (Exception e2) {
					//si introduce carácteres que no són números generará un panel y reseteara los campos rellenados
					JOptionPane.showMessageDialog(null, "Valores no válidos");
					tfOperador1.setText("");
					tfOperador2.setText("");		
				}
			}
		});
	}
}
