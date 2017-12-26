import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Sets up the Window and adds the BoardPanel JPanel
public class ChessBoard extends JFrame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("ChessBoard");
		
		BoardPanel boardPanel = new BoardPanel();
		frame.add(boardPanel);
		
		frame.setSize(815, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

//Board Panel contains the panel that draws the chessboard
class BoardPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for (int j = 0; j < 8; j++)										//The J loop controls which row we are on
		{
			for(int i = 0; i < 4; i++)									//The I loop controls what rectangle were drawing in each row
			{
				if(j == 0 || j == 2 || j == 4 || j == 6)				//If we are on an even row, draw the rectangles starting with the white rectangle
				{
					g.setColor(Color.WHITE);
					g.fillRect(i * 200, j * 100, 100, 100);
					g.setColor(Color.BLACK);
					g.fillRect((i * 200) + 100, j * 100, 100, 100);
				}
				if(j == 1 || j == 3 || j == 5 || j == 7)				//If we are on an odd row, draw the rectangles starting with the black rectangle
				{
					g.setColor(Color.BLACK);
					g.fillRect(i * 200, j * 100, 100, 100);
					g.setColor(Color.WHITE);
					g.fillRect((i * 200) + 100, j * 100, 100, 100);
				}
			}
		}
	}
}
