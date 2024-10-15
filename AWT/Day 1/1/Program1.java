import java.awt.*;

class CompilePanda implements WindowListener{

	public void windowActivated(WindowEvent e){

	}

	public void windowClosed(WindowEvent e){
		
		System.exit(0);
	}

	public void windowClosing(WindowEvent e){
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e){

	}

	public void windowDeiconified(WindowEvent e){

	}

	public void windowIconified(WindowEvent e){

	}

	public void windowOpened(WindowEvent e){

	}	

}

class Graphics{

	public static void main(String[] args){

		Frame fobj = new Frame("CompilePanda");
		
		Button btn1 = new Button("SLS");
		Button btn2 = new Button("Java");

		//setBounds(x,y,w,h)
		
		btn1.setBounds(80,50,80,20);
		btn2.setBounds(80,90,80,20);

		Label lbl1 = new Label("Option 1");
		Label lbl2 = new Label("Option 2");
		Label lbl3 = new Label("Option 3");
		Label lbl4 = new Label("Option 4");

		lbl1.setBounds(30,50,80,20);
		lbl2.setBounds(30,90,80,20);
		lbl3.setBounds(30,130,80,20);
		lbl4.setBounds(30,170,80,20);


		TextField txt1 = new TextField("Enter Username");
		txt1.setBounds(80,150,80,20);

		TextField txt2 = new TextField("Enter Password");
		txt2.setBounds(80,190,150,20);

		
		

		fobj.add(btn1);
		fobj.add(btn2);
		
		fobj.add(lbl1);
		fobj.add(lbl2);
		fobj.add(lbl3);
		fobj.add(lbl4);
		fobj.add(txt1);
		fobj.add(txt2);
		
		
		fobj.setSize(400,400);
		fobj.setLayout(null);

		fobj.setVisible(true);

		fobj.addWindowListener(new CompilePanda);

	}


}