
class CIRCULO extends FIGURAS_GEO
{

    double Radio;
    double Diametro;
    double Circunferencia;
    CIRCULO(String s, double R){
	super(s, Math.PI*R*R);
	this.Radio = R;
	this.Diametro = this.Cal_diametro();
	this.Circunferencia = this.Cal_circunferencia();
    }

    double Cal_diametro(){
	double d;
	d = 2*this.Radio;
	return d;
    }
    double Cal_circunferencia(){
	double c;
	c = Math.PI*this.Diametro;
	return c;
    }
}
