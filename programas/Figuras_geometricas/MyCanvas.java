import java.awt.*;

class MyCanvas extends Canvas  
{  
        public MyCanvas() {  
        setBackground (Color.GRAY);  
	setSize(50, 100);  
     }  
  public void paint(Graphics g)  
  {  
      //   g.setColor(Color.red);  
      //   
      System.out.println("-Estoy en el canvas");
  }
    public void Cuadrado(Graphics g)
    {
	g.fillRect(150, 30, 60, 60);
    }
    public void Circulo(Graphics g)
    {
	g.fillOval(150,30, 60, 60);

    }
}

