/*
 * ExitsFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.cdw.java.recipe.Client;

/**
 *
 * @author  __USER__
 */
public class ExitsFrame extends javax.swing.JFrame {

	/** Creates new form ExitsFrame */
	public ExitsFrame() {
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

		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 0, 0));
		jLabel1.setText("\u771f\u7684\u8981\u72e0\u5fc3\u9000\u51fa\uff1f");

		jButton1.setText("\u662f");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jButton2.setText("\u5426");
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(120, 120, 120)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		80,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(45, 45,
																		45)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		76,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(85, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(82, 82, 82)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										28,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(83, 83, 83)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap(78, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
	/*	String title=this.getTitle();
		if(title.equals("--�ο�--")){
						TouristFrame touristFrame=new TouristFrame();
			touristFrame.setVisible(true);
			this.setVisible(false);
		}else{
			MainMenuFrame mainMenuFrame=new MainMenuFrame();
			mainMenuFrame.setVisible(true);
			this.setVisible(false);
		}*/
		this.setVisible(false);
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {

/*		String title = this.getTitle();
		if (title.equals("--�ο�--")) {
			TouristFrame touristFrame = new TouristFrame();
			touristFrame.setVisible(false);
			this.setVisible(false);
		} else {
			MainMenuFrame mainMenuFrame = new MainMenuFrame();
			mainMenuFrame.setVisible(false);
			this.setVisible(false);
		}*/
		System.exit(0);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ExitsFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables

}