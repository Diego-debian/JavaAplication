/*
 *
 * Diego Alberto Para Garzón
 * Bogotá, Colombia 
 * 12/08/2021
 * www.diegoparra.org
 * compile con 
 * "javac principal.java"
 * "java interfazGraficaFiguras"
 *
 */


import java.util.ArrayList;

//Librerias awt
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;


//Librerias swing
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;


//Clase principal de la interfaz gráfica
class interfazGraficaFiguras
{
    private JFrame ventana;

    private JTextField ti1; //TextInput
    private JPanel caja0;   //Contenedor vertical
    private JPanel caja1;   //Contenedor Horizontal
    private JPanel caja2;   //Contenedor Horizontal
    private JPanel caja3;   //Contenedor Horizontal
    private JPanel caja4;   //Contenedor Horizontal
    private JPanel caja5;   //Contenedor Horizontal
    private JPanel caja6;   //Contenedor Horizontal
    private JPanel caja7;   //Contenedor Horizontal

    private JLabel Lfigura;
    private JLabel Lcolor;
    private JLabel textoCaja3;
    private JLabel textoCaja4;
    private MyCanvas objetoC;

    private JButton btn; // boton para calcular
    private JButton btn0; // boton para calcular
    private JButton btn1; // boton para calcular
    private JButton btn2; // boton para calcular

    private String stNombres[] = {"Seleccionar Figura",
				  "CUADRADO","CIRCULO"};
    private JComboBox<String> ts1 = new JComboBox<>(stNombres);


    private String stColor[] = {"Seleccionar Color",
				  "AMARILLO","ROJO", "AZUL"};
    
    private JComboBox<String> ts2 = new JComboBox<>(stColor);

    
    //función principal de la clase
    public static void main(String[] args){
	interfazGraficaFiguras interfazG = new interfazGraficaFiguras();
	
    }

    public interfazGraficaFiguras()
    {
	ventana = new JFrame("figuras geométricas");
	ventana.getContentPane().setLayout(new BorderLayout());

	//	ventana1.getContentPane().setLayout(new BorderLayout());

	caja0 = new JPanel(new FlowLayout());
	caja1 = new JPanel(new FlowLayout());
	caja2 = new JPanel(new FlowLayout());
	caja3 = new JPanel(new FlowLayout());
	caja4 = new JPanel(new FlowLayout());
	caja5 = new JPanel(new FlowLayout());
	caja6 = new JPanel(new FlowLayout());
	caja7 = new JPanel(new FlowLayout());

	btn = new JButton("oprimir");
	btn0 = new JButton("reiniciar");
	btn1 = new JButton("calcular");
	btn2 = new JButton("Dibujar");
	objetoC = new MyCanvas();
	textoCaja3 = new JLabel(" ");
	textoCaja4 = new JLabel(" ");
	Lfigura = new JLabel(" ");
	Lcolor = new JLabel(" ");
	
	ti1 = new JTextField();
	iniciarEventos();
    }

    public void iniciarEventos(){
	Caja0();
	Combo();
	Caja1();
	Caja2();
	Caja3();
	Caja4();
	Caja5();
	Caja7();
	accionesBoton();
	VerVentana();
    }


    
    public void Caja0()
    {
	ventana.getContentPane().add(caja0);
	caja0.setLayout(new BoxLayout(caja0, BoxLayout.Y_AXIS));
	caja0.add(new JLabel("Figuras geometricas"));
	caja0.add(new JLabel(" "));
	    
    }

    public void Caja1()
    {
	caja0.add(caja1);
	caja1.setLayout(new BoxLayout(caja1, BoxLayout.X_AXIS));
	caja1.add(Lfigura);
	caja1.add(ts1);
	caja1.add(new JLabel(" "));
	Lfigura.setText("Figura: ");		
    }



    public void Caja2()
    {
	caja0.add(new JLabel(" "));
	caja0.add(caja2);
	caja2.setLayout(new BoxLayout(caja2, BoxLayout.X_AXIS));
	caja2.add(new JLabel(" "));
	caja2.add(Lcolor);
	caja2.add(ts2);
	Lcolor.setText("Color: ");
    }

    public void Caja3()
    {
	caja0.add(caja3);
	caja3.setLayout(new BoxLayout(caja3, BoxLayout.X_AXIS));
	caja3.add(textoCaja3);
	caja3.add(ti1);
	ti1.setVisible(false);
	caja3.add(new JLabel(" "));
	Caja6();
    }

    public void Caja4()
    {
	caja0.add(caja4);
	caja4.setLayout(new BoxLayout(caja4, BoxLayout.X_AXIS));
	caja4.add(new JLabel("        "));
	caja4.add(textoCaja4);	
    }
    

    public void Caja5()
    {
	caja0.add(caja5);
	caja0.add(new JLabel(" "));
	caja5.setLayout(new BoxLayout(caja5, BoxLayout.X_AXIS));
	caja5.add(btn);
	caja5.add(new JLabel(" "));
	caja5.add(btn0);
	btn0.setVisible(false);
	
    }

    public void Caja6()
    {
	caja3.add(caja6);
	caja3.add(new JLabel(" "));
	caja6.setLayout(new BoxLayout(caja6, BoxLayout.Y_AXIS));
	caja6.add(btn1);
	caja6.add(btn2);
	btn1.setVisible(false);
	btn2.setVisible(false);
    }

    public void Caja7()
    {
	caja0.add(caja7);
	caja0.add(new JLabel(" "));
	caja7.setLayout(new BoxLayout(caja7, BoxLayout.Y_AXIS));
	caja7.add(objetoC);
    }
    
    public void Combo()
    {
	ts1.setBounds(20,20,50,22);
	ts2.setBounds(20,20,5,22);
    }

    /*
     * Cuando el botón oprimir es presionado
     *
     */
    void setBotonesState0()
    {
	String _figura =  ts1.getSelectedItem().toString();
	String _color =  ts2.getSelectedItem().toString();
	ti1.setVisible(true);
	btn2.setVisible(false);		
	btn1.setVisible(true);		
	btn0.setVisible(true);
	btn.setVisible(false);
	String msg0 = String.format("Figura: %s", _figura);
	String msg1 = String.format("Color: %s", _color);
	Lfigura.setText(msg0);
	Lcolor.setText(msg1);
    }

    void setBotonesState1()
    {
	ti1.setText(" ");
	ti1.setVisible(false);
	btn2.setVisible(false);		
	btn1.setVisible(false);		
	btn0.setVisible(false);
	btn.setVisible(true);
	ts1.setVisible(true);
	ts2.setVisible(true);
	textoCaja3.setText(" ");				
	textoCaja4.setText(" ");
	Lfigura.setText("Figura: ");
	Lcolor.setText("Color: ");

    }
    
    public boolean validar(String _color, String _figura)
    {
	boolean valor = false;
	
	if ((_color.equals("Seleccionar Color")!=true) ){
			
	    if ((_figura.equals("Seleccionar Figura")!=true) ){	       
		ts1.setVisible(false);
		ts2.setVisible(false);
		valor = true;
		if(_figura.equals("CUADRADO")){
			textoCaja3.setText("Ingrese un lado: ");
			textoCaja4.setText(" ");
			setBotonesState0();		
		}

		if(_figura.equals("CIRCULO")){
			textoCaja3.setText("Ingrese el radio: ");
			textoCaja4.setText(" ");
			setBotonesState0();		
		}
		   	    			
	    }
	}
	else{
	    textoCaja3.setText("Seleccione una Figura");			
	    textoCaja4.setText("Seleccione un Color");
	    valor =  false; 
	}
	return valor;
    }
    



    /*
     *    Metodo para escuchar las acciones de los botones
     *
     */	
    public void accionesBoton()
    {
	caja0.add(new JLabel(" "));
	btn.addActionListener(new ActionListener()
	    {
		public void actionPerformed(ActionEvent e)
		{
		    String _figura =  ts1.getSelectedItem().toString();
		    String _color =  ts2.getSelectedItem().toString();	    
		    validar(_color, _figura);
		    
		}
		
	    });

	btn0.addActionListener(new ActionListener()
	    {
		public void actionPerformed(ActionEvent e)
		{
	
		    setBotonesState1();
		}
		
	    });

	btn1.addActionListener(new ActionListener()
	    {
		public void actionPerformed(ActionEvent e)
		{
		    AcionesCalcular();
		}
		
	    });

	btn2.addActionListener(new ActionListener()
	    {
		public void actionPerformed(ActionEvent e)
		{
		    String _figura =  ts1.getSelectedItem().toString();
		    String _color =  ts2.getSelectedItem().toString();
		    if (_figura.equals("CUADRADO")){
			Graphics g = objetoC.getGraphics();
			if (_color.equals("ROJO")){
			    g.setColor(Color.red);  
			    objetoC.Cuadrado(g);
			}

			if (_color.equals("AMARILLO")){
			    g.setColor(Color.yellow);  
			    objetoC.Cuadrado(g);
			}

			if (_color.equals("AZUL")){
			    g.setColor(Color.blue);  
			    objetoC.Cuadrado(g);
			}
		    }

		    
		    if (_figura.equals("CIRCULO")){
			Graphics g = objetoC.getGraphics();
			if (_color.equals("ROJO")){
			    g.setColor(Color.red);
			    objetoC.Circulo(g);		       
			}
			if (_color.equals("AMARILLO")){
			    g.setColor(Color.yellow);  
			    objetoC.Circulo(g);
			}
			if (_color.equals("AZUL")){
			    g.setColor(Color.blue);  
			    objetoC.Circulo(g);
			}
		
		    }
		}
		
	    });
	
    }


    
    //metodo para llamar a la clase padre y sus hijas
    public void Calculos(String forma, String color, double distancia)
    {
	btn2.setVisible(true);
	btn1.setVisible(false);
	
	if ("CUADRADO".equals(forma))
	    {
		CUADRADO obj1 = new CUADRADO(color, distancia);
		String msg0 =  String.format("Área: %.2f u² ", obj1.Cal_Area());

		String msg1 =  String.format("Diagonal: %.2f", obj1.Diagonal);
		String msg2 =  String.format("Perimetro: %.2f", obj1.Perimetro);
		
		textoCaja4.setText("<html><center><p  style=\"width:300px\"> "+ msg0 +"<br/>"+msg1 +"<br/>"+msg2 +"</p></center></html>");
		//		textoCaja4.setText(msg);

	    }

	else if  ("CIRCULO".equals(forma))
	    {
		CIRCULO obj2 = new CIRCULO(color, distancia);
		String msg0 = String.format("Área %.2f u²",  obj2.Cal_Area() );
		String msg1 =  String.format("Díametro: %.2f", obj2.Diametro);
		String msg2 =  String.format("Circunferencia: %.2f",obj2.Circunferencia);
		textoCaja4.setText("<html><center><p  style=\"width:300px\"> "+ msg0 +"<br/>"+msg1 +"<br/>"+msg2 +"</p></center></html>");		
	    }
	    
    }

    
    /* metodo para verificar que el textinput sea un número, si es verdad
	*
	*
	*/
    public void AcionesCalcular(){
	
	try {
	    String figura =  ts1.getSelectedItem().toString();

	    String color =  ts2.getSelectedItem().toString();

	    String distancia = String.format("%s", ti1.getText());
	    distancia.replaceAll("[^\\a-zA-Z]", " ");

	    double d1 = Double.parseDouble(distancia);
	    textoCaja4.setText(" ");
	    if (d1> 0)
		{
		    System.out.println(String.format("%s %.2f", figura, d1));
		    Calculos(figura, color, d1);
		}
	    else{
		String msg = "Solo recibo números positivos.";
		textoCaja4.setText(msg);

	    }
	}
	
	catch(Exception i)
	    {
		String msg = "Solo recibo números.";
		System.out.println(msg);
		textoCaja4.setText(msg);
	    }
    }

    
    public void VerVentana(){
	ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	ventana.setTitle("interfaz grafica para figuras geométricas");
	ventana.setLocation(450, 40);
       	ventana.setSize(420,350);
	//ventana.pack();
	ventana.setVisible(true);
    }
}

