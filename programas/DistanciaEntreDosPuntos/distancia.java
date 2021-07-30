/**
 * Diego Parra
 * 
 * Calcula distancia entre dos puntos
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.BoxLayout;
import javax.swing.JLabel;


public class distancia
{
    private JFrame v;
    private JButton b;
    private JTextField ti1;
    private JTextField ti2;
    private JTextField ti3;
    private JTextField ti4;
    private JPanel caja0;
    private JPanel caja1;
    private JPanel caja2;
    private JPanel caja3;
    private JLabel respuesta;
    
    //    private BoxLayout 
    public static void main(String [] args)
    {
        new distancia();
    }
    
    //Crea la ventana, inicializa todo y la visualiza
    
    public distancia()
    {

        v = new JFrame("Calcular distancia entre puntos");
	v.getContentPane().setLayout(new BorderLayout());

	//caja 0     	  
        JPanel caja0 = new JPanel(new FlowLayout());
        v.getContentPane().add(caja0);
	caja0.setLayout(new BoxLayout(caja0, BoxLayout.Y_AXIS));

	//Label de punto 1
	caja0.add(new JLabel("\t\tPunto 1 "));


	//caja 1
        JPanel caja1 = new JPanel(new FlowLayout());
        caja0.add(caja1);
	caja1.setLayout(new BoxLayout(caja1, BoxLayout.X_AXIS));

	//Label de punto 1
	caja0.add(new JLabel("\t\tPunto 2 "));
	
	//caja 2
        JPanel caja2 = new JPanel(new FlowLayout());
        caja0.add(caja2);
	caja2.setLayout(new BoxLayout(caja2, BoxLayout.X_AXIS));

	//caja3
        JPanel caja3 = new JPanel(new FlowLayout());
        caja0.add(caja3);
	caja3.setLayout(new BoxLayout(caja3, BoxLayout.X_AXIS));


	//COSAS DE LA CAJA 1
	//Se crea el label de coordenada x0
	caja1.add(new JLabel("Coordenada x: "));

	
        // Se crea el campo de texto y se mete en la ventana
        ti1 = new JTextField(10);
	caja1.add(ti1);


	//Label de coordenada y
	caja1.add(new JLabel("Coordenada y: "));

	// Se crea el campo de texto y se mete en la ventana
        ti2 = new JTextField(10);
	caja1.add(ti2);


	//COSAS DE LA CAJA 2
	//Se crea el label de coordenada x0
	caja2.add(new JLabel("Coordenada x: "));

	
        // Se crea el campo de texto y se mete en la ventana
        ti3 = new JTextField(10);
	caja2.add(ti3);


	//Label de coordenada y
	caja2.add(new JLabel("Coordenada y: "));

	// Se crea el campo de texto y se mete en la ventana
        ti4 = new JTextField(10);
	caja2.add(ti4);


	// Se le dice al botón qué tiene que hacer cuando lo pulsemos.

	//Se crea el boton
	b = new JButton("Calcular");
	caja3.add(b);

	respuesta = new JLabel("");
	caja3.add(respuesta);
	
        b.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
		    
		    int x0 = Integer.parseInt(ti1.getText());
		    int y0 = Integer.parseInt(ti2.getText());
		    int x1 = Integer.parseInt(ti3.getText());
		    int y1 = Integer.parseInt(ti4.getText());
		    
		    double distancia = Math.sqrt( (x1 -x0)*(x1 -x0) + (y1 -y0)*(y1 -y0));


		    respuesta.setText(String.format("Distancia: %.2f unidades lineales" , distancia));
        	}
        });
        
        // Se le dice a la ventana que termine el programa cuando se la cierre
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Se le da un tamaño automático a la ventana para que quepa todo su
        // contenido.
        v.pack();
        
        // Se hace visible la ventana
        v.setVisible(true);
    }

}
