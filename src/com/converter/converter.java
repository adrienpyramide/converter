//ouh ouh ouh
package com.converter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Button;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.SpringLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;

import net.miginfocom.swing.MigLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.DefaultComboBoxModel;

import com.jgoodies.forms.factories.FormFactory;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class converter extends JFrame {
	private JTextField input;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter frame = new converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public converter() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		input = new JTextField();
		getContentPane().add(input);
		input.setColumns(10);

		JComboBox inputCombo = new JComboBox();
		inputCombo.setModel(new DefaultComboBoxModel(new String[] { "km", "m",
				"dm", "cm", "mm" }));
		getContentPane().add(inputCombo);

		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);

		final JLabel resultLabel = new JLabel("result");
		getContentPane().add(resultLabel);

		JComboBox resultCombo = new JComboBox();
		resultCombo.setModel(new DefaultComboBoxModel(new String[] { "km", "m",
				"dm", "cm", "mm" }));
		getContentPane().add(resultCombo);

		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton);

		final JPanel panel = new JPanel();
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);

		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		final JComboBox resultCombo_1 = new JComboBox();
		final JComboBox inputCombo_1 = new JComboBox();
		panel.add(resultCombo_1);
		inputCombo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultCombo_1.setModel(new DefaultComboBoxModel(new String[] {
						"km", "m", "dm", "cm", "mm" }));
				String input = (String) inputCombo_1.getSelectedItem();
				resultCombo_1.removeItem(input);
				panel.add(resultCombo_1);
			}
		});
		inputCombo_1.setModel(new DefaultComboBoxModel(new String[] { "km",
				"m", "dm", "cm", "mm" }));
		panel.add(inputCombo_1);

		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);

		JLabel resultLabel_1 = new JLabel("New label");
		panel.add(resultLabel_1);
	}
}
