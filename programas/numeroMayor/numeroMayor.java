
/** Diego Parra
 * El mayor de tres numeros
 */

import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class numeroMayor
{
    private JFrame ventana;
    private JTextField ti1;
    private JTextField ti2;
    private JTextField ti3;
    private JPanel caja0;
    private JPanel caja1;
    private JPanel caja2;
    private JPanel caja3;
    private JButton btn;
    private JLabel respuesta;

    //make a principal function
    public static void main(String[] args)
    {	
	numeroMayor nM = new numeroMayor();
    }

    public numeroMayor()
    {
	ventana = new JFrame("Calcula número mayor");
	ventana.getContentPane().setLayout(new BorderLayout());
	caja0 = new JPanel(new FlowLayout());
	caja1 = new JPanel(new FlowLayout());
	caja2 = new JPanel(new FlowLayout());
	caja3 = new JPanel(new FlowLayout());
	       
	ti1 = new JTextField(10);
	ti2= new JTextField(10);
	ti3 = new JTextField(10);
	respuesta = new JLabel("Diego-debian FreeSoftware");
	btn = new JButton("calcular");
	
	Caja0();
	Caja1();
	Caja2();
	Caja3();
	elementosVentana();
	accionesBoton();
	VerVentana();

    }

    public void Caja0()
    {
	ventana.getContentPane().add(caja0);
	caja0.setLayout(new BoxLayout(caja0, BoxLayout.Y_AXIS));
	caja0.add(new JLabel("Calcula el mayor de tres numeros"));
    }

    public void Caja1()
    {
	caja0.add(caja1);
	caja1.setLayout(new BoxLayout(caja1, BoxLayout.X_AXIS));
    }

    public void Caja2()
    {
	caja0.add(caja2);
	caja2.setLayout(new BoxLayout(caja2, BoxLayout.X_AXIS));
    }

    public void Caja3()
    {
	caja0.add(caja3);
	caja3.setLayout(new BoxLayout(caja3, BoxLayout.X_AXIS));
    }

    public void elementosVentana()
    {
	caja0.add(btn);
	caja0.add(respuesta);
	caja1.add(new JLabel("input"));
	caja1.add(ti1);

	caja2.add(new JLabel("input"));
	caja2.add(ti2);

	caja3.add(new JLabel("input"));
	caja3.add(ti3);
    }

    public void accionesBoton()
    {
	btn.addActionListener(new ActionListener()
	    {
		public void actionPerformed(ActionEvent e)
		{
		    int diligenciado = accion1();
		    if (diligenciado == 3)
			{
			    int a = Integer.valueOf(ti1.getText());
			    int b = Integer.valueOf(ti2.getText());
			    int c = Integer.valueOf(ti3.getText());
			    
			    ArrayList<Integer> numeros = new ArrayList<Integer>();
			    numeros.add(a);
			    numeros.add(b);
			    numeros.add(c);
			    

			    if (numeros.get(0)> numeros.get(1) &&
				numeros.get(0)> numeros.get(2))
				{
				    respuesta.setText("El número mayor es: " +
						      Integer.valueOf(numeros.get(0)));
				}
			    else if (numeros.get(1)> numeros.get(0) &&
				numeros.get(1)> numeros.get(2))
				{
				    respuesta.setText("El número mayor es: " +
						      Integer.valueOf(numeros.get(1)));
				}
			    else if (numeros.get(2)> numeros.get(1) &&
				numeros.get(2)> numeros.get(0))
				{
				    respuesta.setText("El número mayor es: " +
						      Integer.valueOf(numeros.get(2)));
				}
			}
		}
	    });
    }

    public int accion1()
    {
	int vPaso = 0;

	if (ti1.getText().equals("") ||
	    ti2.getText().equals("") ||
	    ti3.getText().equals(""))
	    {
		respuesta.setText("Debe diligenciar todos los campos");
		return vPaso;
	    }
	else
	    {
		try
		    {
			Integer.valueOf(ti1.getText());
			vPaso ++;
		    }
		catch(Exception e)
		    {
			respuesta.setText("debe ingresar numeros");
			return vPaso;
		    }

		
		try
		    {
			Integer.valueOf(ti2.getText());
			vPaso ++;
		    }
		catch(Exception e)
		    {
			respuesta.setText("debe ingresar numeros");
			return vPaso;
		    }

		try
		    {
			Integer.valueOf(ti3.getText());
			vPaso ++;
		    }
		catch(Exception e)
		    {
			respuesta.setText("debe ingresar numeros");
			return vPaso;
		    }

		
		return vPaso;
	    }
    }

    
    public void VerVentana()
    {
	// Se le dice a la ventana que termine el programa cuando se la cierre
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	// Se le da un tamaño automático a la ventana para que quepa todo su
        // contenido.
        ventana.pack();
	// Se hace visible la ventana
        ventana.setVisible(true);
    }
    
}
