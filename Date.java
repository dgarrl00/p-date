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
				throw new DateException("\nEl día " + day + "no es válido. Para que sea válido tiene que ser un valor comprendido entre 1 y 30.");
			}else{
				this.day=day;
			}

		else if(month == 2){
			if(day < 1 || day > 28){
				throw new DateException("\nDía " + day + " no es válido. Para que sea válido tiene que ser un valor comprendido entre 1 y 30.");
			}
			else{
				this.day=day;
			}
		}
		else{
			if(day < 1 || day > 31){
				throw new DateException("\nDía " + day + " no es válido. Para que sea válido tiene que ser un valor comprendido entre 1 y 30.");
			}
			else{
				this.day=day;
			}
		}
	}


	//Imprimir fecha
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	//Devolver día
	public int getDay(){
		return this.day;
	}
	
	//Devolver mes
	public int getMonth(){
		return this.month;
	}
	
	//Devolver año
	public int getYear(){
		retunr this.year;
	}
	
	//Comparar año dadas dos fechas
	public boolean isSameYear(Date aDate){
		if(this.year == aDate.getYear()){
			return true;
		}
		return false;
	}

	//Comparar mes dadas dos fechas
	public boolean isSameMonth(Date aDate){
		if(this.month == aDate.getMonth()){
			return true;
		}
		return false;

	
	//Comparar día dadas dos fechas
	public boolean isSameDay(Date aDate){
		if(this.day == aDate.getDay()){
			return true;
		}
		return false;
		}
	}

	//Comprobar si las fechas son iguales
	public boolean isSame(Date aDate){
	if(this.day == aDate.getDay() && this.month == aDate.getMonth() && this.year == aDate.getYear()){
		return true;
	}
	return false;
	}

	//Comparar año dadas dos fechas sin utilizar el método if
	public boolean isSameYearNoIf(Date aDate){

