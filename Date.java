package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	//Constructor de la clase Date
	
	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if(month < 1 || month > 12){
			throw new DateException("El mes "+ month +" no es válido. Para que sea válido tiene que ser un valor comprendido entre 1 y 12.");
		
		}else {
			this.month = month;
		}
		
		if (month==4 || month==6 || month==9 || month=11){
			if(day < 1 || day > 30){
				throw new DateException("El día " + day + "no es válido. Para que sea válido tiene que ser un valor comprendido entre 1 y 30.");
			}else{
				this.day=day;
			}

		else if(month == 2){
			if(day < 1 || day > 28){
				throw new DateException("Día " + day + " no valido" +
					" Valores posibles entre 1 y 28.");
			}
			else{
				this.day=day;
			}
		}
		else{
			if(day < 1 || day > 31){
				throw new DateException("Día " + day + " no valido" +
					" Valores posibles entre 1 y 31.");
			}
			else{
				this.day=day;
			}
		}
	}

