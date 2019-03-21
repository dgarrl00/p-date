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

	//Comparar año dadas dos fechas sin utilizar el statement if
	public boolean isSameYearNoIf(Date aDate){
		return this.year == aDate.getYear()?true:false;
	}
	
	//Comparar mes dadas dos fechas sin utilizar el statement if
	public boolean isSameMonthNoIf(Date aDate){
		return this.month == aDate.getMonth()?true:false;
	}
	
	//Comparar día dadas dos fechas sin utilizar el statement if
	public boolean isSameDayNoIf(Date aDate){
		return this.day == aDate.getDay()?true:false;
	}
	//Comparar si la fecha es la misma sin utilizar el statement if
	public boolean isSameNoIf(Date aDate){
		return (this.day == aDate.getDay() && this.month == aDate.getMonth() && this.year == aDate.getYear())?true:false;
	}

	//Método para devolver el nombre del mes
	String getMonthName() throws DateException{
		String name;
		switch(this.month){
			case 1:
				name="Enero";
				break;
			case 2:
				name="Febrero";
				break;
			case 3:
				name="Marzo";
				break;
			ame = "Mayo";
				break;
			case 6:
				name =  "Junio";
				break;
			case 7:
				name =  "Julio";
				break;
			case 8:
				name  = "Agosto";
				break;
			case 9:
				name =  "Septiembre";
				break;
			case 10:
				name = "Octubre";
				break;
			case 11:
				name = "Noviembre";
				break;
			case 12:
				name="Diciembre";
				break;
			default:
				throw new DateException("\nSolo hay doce meses en el calendario.");
			}
		return name;
	}
	
	//Confirma si el día del mes es correcto o no
	public boolean isDayOfMonthOk(){
		boolean ok= false;
		
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(this.day<=31){
					ok=true;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(this.day<=30){
					ok=true;
				}
				break;
			case 2:
				if(this.day<=28){
					ok=true;
				}
				break;
			}
			return ok;
	}
	
	//Imprime las fechas restantes hasta el final de mes
	public String printDateRemaining() throws DateException{
		Date a = new Date(this.day,this.month,this.year);
		StringBuffer salida = new StringBuffer();
		System.out.print("\nLas fechas restantes son: ");
		if((a.getMonth()==1) || (a.getMonth()==3) || (a.getMonth()==5) || (a.getMonth==7) || (a.getMonth()==8) || (a.getMonth()==10)||(a.getMonth()==12)){
			for(int i=a.getDay(); i<31;i++){
				a.day+=1;
				salida.append(a.toString() + " ");
				
			}
		}
		else if(a.getMonth()==2{
			for(int i=a.getDay();i<28;i++){
				a.day+=1;
				salida.append(a.toString() + " ");
					
			}
		}
		else{
			for(int i=a.getDay();i<30;i++){
				a.day+=1;
				salida.append(a.toString() + " ");
				
			}
		}
		return salida.toString();

	//Método para devolver la estación a la que pertenece una determinada fecha
	public String printSeason(){
		String season;
		if(((this.month==3)&&(this.day>=21)) || ((this.month == 4) || (this.month == 5) || (this.month == 6) && (this.day<21))){
			season="Primavera";
		else if(((this.month==6)&&(this.day>=21))||(this.month==7)||(this.month==8)||((this.month==9)&&(this.day<21))){
			season="Verano";
		}
		else if(((this.month==9)&&(this.day>=21))||(this.month==10)||(this.month==11)||((this.month==12)&&(this.day<21))){
			season="Otoño";
		}
		else{
			season="Invierno";
		}
		return season;
	}
			

	
		

