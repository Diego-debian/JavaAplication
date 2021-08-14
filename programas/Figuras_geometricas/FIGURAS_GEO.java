/*
 *
 * Diego Alberto Para Garzón
 * Bogotá, Colombia 
 * 12/08/2021
 * www.diegoparra.org
 *
 * #################################
 * Clase padre para las figuras geometricas
 * es invocada desde las clases circulo y cuadrado
 *
 */
class FIGURAS_GEO
{
    private String Color;
    double area;
    public FIGURAS_GEO(String color, double area)
    {
	this.Color = color;
	this.area = area;
    }

    public double Cal_Area(){
	return this.area;
    }

    public void setColor(String Color){
	this.Color = Color;
    }

    public String getColor(){
	return this.Color;
    }
}
