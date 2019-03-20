package es.unileon.prg.junit;

public class Complejo {

	private float parteReal;
	private float parteImaginaria;

	public Complejo(float parteReal, float parteImaginaria){
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public float getParteReal(){
		return this.parteReal;
	}

	public float getParteImaginaria(){
		return this.parteImaginaria;
	}

	public Complejo sumar(Complejo c){
		return new Complejo( getParteReal() + c.getParteReal(),
				getParteImaginaria() + c.getParteImaginaria()  );
	}
	
	public Complejo dividir(Complejo c){
		float ddor, nuevaReal, nuevaImagen;
		
		// (a + bi) / (c + di)  = ((ac+bd) + (bc-ad)i ) /(c^2 + d^2)
		ddor = c.getParteReal()*c.getParteReal() + c.getParteImaginaria()*c.getParteImaginaria();
		// Java no lanza excepcion por divisi—n por cero en floats:
		if ( ddor == 0 ){
			throw new ArithmeticException("Division por cero");
		}
		nuevaReal = getParteReal()*c.getParteReal() +  getParteImaginaria()*c.getParteImaginaria();
		nuevaImagen = getParteImaginaria()*c.getParteReal() - getParteReal()*c.getParteImaginaria();
		return new Complejo(nuevaReal / ddor, nuevaImagen / ddor);
	}     


}
