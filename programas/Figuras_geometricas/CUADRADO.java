/*
 *
 * Diego Alberto Para Garzón
 * Bogotá, Colombia 
 * 12/08/2021
 * www.diegoparra.org
 *
 * Clase hija, hereda de figuras geometricas
 *
 */


class CUADRADO extends FIGURAS_GEO
{

    double Lado;
    double Diagonal;
    double Perimetro;
    CUADRADO(String s, double L){
	super(s, L*L);
	this.Lado = L;
	this.Diagonal = this.Cal_diagonal();
	this.Perimetro = this.Cal_Perimetro();
    }

    double Cal_Perimetro(){
	double p;
	p = 4*Lado;
	return p;
    }
    double Cal_diagonal(){
	double h;
	h = Math.sqrt(2*this.Lado*this.Lado);
	return h;
    }
}

