/*
 * PopupFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.cdw.java.recipe.Client;

/**
 *
 * @author  __USER__
 */
public class PopupFrame extends javax.swing.JFrame {

	/** Creates new form PopupFrame */
	public PopupFrame() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jbtReturn01 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jbtReturn01.setText("\u786e\u5b9a");
		jbtReturn01.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jbtReturn01MouseClicked(evt);
			}
		});
		jbtReturn01.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtReturn01ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 0, 0));
		jLabel1.setText("\u6ce8\u518c\u6210\u529f!");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(86, 86,
																		86)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		128,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(110,
																		110,
																		110)
																.addComponent(
																		jbtReturn01)))
								.addContainerGap(80, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(43, 43, 43)
						.addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 58,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(41, 41, 41).addComponent(jbtReturn01)
						.addContainerGap(46, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jbtReturn01MouseClicked(java.awt.event.MouseEvent evt) {
			LoginFrame loginFrame =new LoginFrame();
			loginFrame.setVisible(true);
			this.setVisible(false);
	}

	private void jbtReturn01ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PopupFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JButton jbtReturn01;
	// End of variables declaration//GEN-END:variables

}