import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.ArrayList;

class CalculatorSwing {

	public static void main(String[] args) {
		JFrame jfobj1 = new JFrame("Calculator");
		jfobj1.setSize(1000, 700);
        	jfobj1.getContentPane().setBackground(Color.BLACK);
        	jfobj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfobj1.setLayout(new FlowLayout());
        	NumberAnimationPanel animationPanel = new NumberAnimationPanel();
        	jfobj1.add(animationPanel, BorderLayout.CENTER);
        	animationPanel.startAnimation();

        	JLabel jl = new JLabel("                        Navigate Numbers Easily: Convert Between Systems with Just a Click!");
        	jl.setForeground(Color.WHITE);
        	jl.setFont(new Font("Arial", Font.BOLD, 18));
        	jfobj1.add(jl, BorderLayout.SOUTH);

        	jfobj1.setVisible(true);
    	}
}

class NumberAnimationPanel extends JPanel {

	int width = 1000;
	int height = 700;
	int delay = 40;

	java.util.List<AnimatedNumber> numbers;
	Timer animationTimer;
	ImageIcon i;
	JButton jb;

	public NumberAnimationPanel() {
        	this.setPreferredSize(new Dimension(width, height));
        	this.setBackground(Color.BLACK);

        	numbers = new ArrayList<>();
        	for (int i = 0; i < 20; i++) {
            		numbers.add(new AnimatedNumber((i + 1) * 50, (i + 1) * 50, i + 1));
        	}
        	i = new ImageIcon("C:/classwork/AWTPROJECT 2/number system conversion calculator.jpg");

        	jb = new JButton("Click here to Start");
        	jb.setFont(new Font("Arial", Font.BOLD, 16));
        	jb.setPreferredSize(new Dimension(200, 50));
        	jb.addActionListener(new ActionListener() {

            	public void actionPerformed(ActionEvent e) {
                	JFrame jfobj2 = new JFrame();
                	jfobj2.setSize(1000, 700);
                	jfobj2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			jfobj2.setLayout(new FlowLayout());

                try {
                    	JPanelWithBackground backgroundPanel = new JPanelWithBackground("C:/classwork/AWTPROJECT 2/8389460.jpg");
                    	backgroundPanel.setLayout(null);
                    	jfobj2.setContentPane(backgroundPanel);

                    	JLabel title = new JLabel("Please Select Type Of Your Number System.", JLabel.CENTER);
                    	title.setFont(new Font("Helvetica Neue", Font.BOLD, 28));
                    	title.setBounds(0, 20, 1000, 50);
                    	title.setForeground(Color.WHITE);
                    	backgroundPanel.add(title);
		    
                    	JButton button1 = TransparentButton("BINARY");
                    	JButton button2 = TransparentButton("OCTAL");
                    	JButton button3 = TransparentButton("DECIMAL");
                    	JButton button4 = TransparentButton("HEXADECIMAL");

                    	button1.setBounds(200, 200, 200, 50);
                    	button2.setBounds(600, 300, 200, 50);
                    	button3.setBounds(600, 200, 200, 50);
                    	button4.setBounds(200, 300, 200, 50);

                    	backgroundPanel.add(button1);
                    	backgroundPanel.add(button2);
                    	backgroundPanel.add(button3);
                    	backgroundPanel.add(button4);

                    	button1.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                            		showFrameForBinary();
                        	}
                    	});

                    	jfobj2.setVisible(true);

                } catch (IOException ie) {
                    	ie.printStackTrace();
                }
            	}
        });
    }
	private void showFrameForBinary() {
        	JFrame jfobj3 = new JFrame();
        	jfobj3.setSize(400,200);
		jfobj3.getContentPane().setBackground(Color.BLACK);
		jfobj3.setLocationRelativeTo(null);
        	jfobj3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	jfobj3.setLayout(new FlowLayout());
	
        	JLabel jl3 = new JLabel("Enter Binary Number:");
		jl3.setForeground(Color.WHITE);
        	JTextField jtf = new JTextField(30);
        	JButton enterButton = new JButton("Enter");

        	jfobj3.add(jl3);
        	jfobj3.add(jtf);
        	jfobj3.add(enterButton);

        	enterButton.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) {
                	String binaryString = jtf.getText();
                	showOtherOptions(binaryString);
            	}
        	});

        	jfobj3.setVisible(true);
    	}

	private void showOtherOptions(String binaryString) {
        	JFrame jfobj4 = new JFrame();
        	jfobj4.setSize(1000,700);
        	jfobj4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	jfobj4.setLayout(new FlowLayout());
		
		try{
		JPanelWithBackground backgroundPanel2 = new JPanelWithBackground("C:/classwork/AWTPROJECT 2/4th frame image.jpg");
                backgroundPanel2.setLayout(null);
                jfobj4.setContentPane(backgroundPanel2);

        	JLabel jl4 = new JLabel("Select the system to convert to:");
		jl4.setFont(new Font("Helvetica Neue", Font.BOLD, 28));
                jl4.setBounds(0, 20, 1000, 50);
                jl4.setForeground(Color.WHITE);

        	JButton decimalButton = TransparentButton("Decimal");
        	JButton octalButton = TransparentButton("Octal");
        	JButton hexadecimalButton = TransparentButton("Hexadecimal");

		decimalButton.setBounds(600, 200, 200, 50);
                octalButton.setBounds(600, 300, 200, 50);
                hexadecimalButton.setBounds(600, 400, 200, 50);

		

        	backgroundPanel2.add(jl4);
        	backgroundPanel2.add(decimalButton);
        	backgroundPanel2.add(octalButton);
        	backgroundPanel2.add(hexadecimalButton);

		decimalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                	long decimal = binaryToDecimal(binaryString);
                	
            	}
        	});

        	octalButton.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) {
                	long decimal = binaryToDecimal(binaryString);
                	String octal = Long.toOctalString(decimal);
                	
            	}
        	});

        	hexadecimalButton.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) {
                	long decimal = binaryToDecimal(binaryString);
                	String hex = Long.toHexString(decimal).toUpperCase();
                	

            	}
        	});
		}catch(IOException ie){
			ie.printStackTrace();
		}
        

        	jfobj4.setVisible(true);
    	}

	private long binaryToDecimal(String binaryString) {
        	long decimalValue = 0;
        	long base = 1;

        	for (int i = binaryString.length() - 1; i >= 0; i--) {
            		int digit = binaryString.charAt(i) - '0';
            		decimalValue += digit * base;
            		base *= 2;
        	}

        	return decimalValue;
    	}

	public void startAnimation() {
        	animationTimer = new Timer(delay, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
                	updateNumbers();
                	repaint();
            	}
        	});
        	animationTimer.start();
	}

	private void updateNumbers() {
        	for (AnimatedNumber number : numbers) {
            		number.update();
        	}
    	}

	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);

        	Graphics2D g2d = (Graphics2D) g;
        	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        	if (i != null) {
            		int imageWidth = i.getIconWidth();
            		int imageHeight = i.getIconHeight();
            		int x = (width - imageWidth) / 2;
            		int y = 0;

            		g2d.drawImage(i.getImage(), x, y, this);

            		int buttonWidth = jb.getPreferredSize().width;
            		int buttonHeight = jb.getPreferredSize().height;
            		int buttonX = (width - buttonWidth) / 2;
            		int buttonY = y + imageHeight + 20;

            		jb.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
            		add(jb);
        	}

        	for (AnimatedNumber number : numbers) {
            		number.draw(g2d);
        	}
    	}

	private JButton TransparentButton(String text) {
        	JButton button = new JButton(text);
        	button.setFont(new Font("Arial", Font.BOLD, 16));
        	button.setPreferredSize(new Dimension(200, 50));
        	button.setOpaque(false);
        	button.setBackground(new Color(0, 0, 0, 0));
        	button.setForeground(Color.WHITE);
        	return button;
    	}
}

class AnimatedNumber {
	int x, y;
    	int dx, dy;
    	int number;
    	int size = 30;

	public AnimatedNumber(int x, int y, int number) {
        	this.x = x;
        	this.y = y;
        	this.number = number;

        	this.dx = (int) (Math.random() * 5 + 1);
        	this.dy = (int) (Math.random() * 5 + 1);
    	}

	public void update() {
        	x += dx;
       	 	y += dy;

        	if (x < 0 || x > 1000 - size) {
            		dx *= -1;
        	}
        	if (y < 0 || y > 700 - size) {
            		dy *= -1;
        	}
    	}

	public void draw(Graphics2D g2d) {
        	g2d.setColor(Color.RED);
        	g2d.setFont(new Font("Arial", Font.BOLD, 24));
        	g2d.drawString(String.valueOf(number), x, y);
    	}
}

class JPanelWithBackground extends JPanel {
	private Image backgroundImage;

	public JPanelWithBackground(String fileName) throws IOException {
        	backgroundImage = ImageIO.read(new File(fileName));
    	}

	public void paintComponent(Graphics g) {
        	super.paintComponent(g);

		if (backgroundImage != null) {
            		g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        	}
    	}

	public Dimension getPreferredSize() {
        	if (backgroundImage == null) {
            		return new Dimension(400, 300);
        	} else {
            		return new Dimension(backgroundImage.getWidth(this), backgroundImage.getHeight(this));
        	}
    	}
}
