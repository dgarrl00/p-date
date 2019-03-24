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
		return this.year;
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
		
	//Imprime los meses restantes hasta final de año
	public String printMonthsRemaining() throws DateException{
		StringBuffer salida = new StringBuffer();
		Date a = new Date(this.day,this.month,this.year);
		if(a.getMonth()<12){
		salida.append("Los meses restantes hasta final de año son: ");
		}
		else{
			salida.append("No queda ningún mes hasta final de año");
		}
	
		for(int i=a.getMonth();i<12;i++){
			a.month+=1;
			salida.append(a.getMonthName()+" ");
		}
		return salida.toString();
	}
	//Intentos necesarios para generar aleatoriamente una fecha empleando un do-while
	public int attempsNeededDoWhile(){
		int dia, mes,contador=0;
		do{
			mes =(int)(Math.random()*12)+1;
			if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
				dia=(int)(Math.random()*31)+1;
			}
			else if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
				dia=(int)(Math.random()*30)+1;
			}
			else{
				dia=(int)(Math.random()*28)+1;
			}
			contador++;

		}while((dia!=this.day)||(mes!=this.month));
		return contador;
	}	

	//Intentos necesarios para generar aleatoriamente una fecha empleando un while
	public int attempsNeededWhile(){
		int dia, mes,contador=0;
		boolean acierto = false;
		while(acierto==false){
			mes =(int)(Math.random()*12)+1;
			if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
				dia=(int)(Math.random()*31)+1;
			}
			else if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
				dia=(int)(Math.random()*30)+1;
			}
			else{
				dia=(int)(Math.random()*28)+1;
			}
			contador++;
			if((dia==this.day)&&(mes==this.month)){
				acierto=true;
			}
		}
		return contador;
	}

	//Cuenta los días que han pasado desde principios de año
	public int daysPassed(){
	int contador=0;	
	for(int i=1;i<this.month;i++){
		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
			contador+=31;
		}
		else if(i==2){
			contador+=28;
		}
		else{
			contador+=30;
		}
	}
	contador+=this.day;
	return contador-1;                  //No cuento el día de la fecha, es decir si se introduce la fecha 2 de enero, el programa me dira que ha pasado 1 dia.
	}
	//Devuelve el día de la semana al que corresponde una fecha determinada
	public String dayOfTheWeek(){
		String dia="";
		switch(this.daysPassed()%7){   //Tengo en cuenta que el primer dia del año es Lunes, en otro caso, el metodo daría un resultado incorrecto.
			case 0:
				dia="Lunes";
			break;
			case 1:
				dia="Martes";
			break;
			case 2:
				dia="Miercoles";
			break;
			case 3:
				dia="Jueves";
			break;
			case 4:
				dia="Viernes";
			break;
			case 5:
				dia="Sabado";
			break;
			case 6:
				dia="Domingo";
			break;
		}
		return dia;
	}
	//Devuelve los meses que tienen el mismo número de meses que el mes de una fecha determinada
	public String monthsSameDays() throws DateException{
		int [] meses;
		Date a;
		a = new Date(1,1,2018);
		StringBuffer salida = new StringBuffer();
		salida.append("Los meses con el mismo número de días son: ");
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				meses=new int[7];
				meses[0]=1;
				meses[1]=3;
				meses[2]=5;
				meses[3]=7;
				meses[4]=8;
				meses[5]=10;
				meses[6]=12;
				for(int i=0;i<7;i++){
					a.month=meses[i];
					if(meses[i]!=this.month){
						salida.append(a.getMonthName()+" ");
					}
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				meses= new int[4];
				meses[0]=4;
				meses[1]=6;
				meses[2]=9;
				meses[3]=11;
				for(int i=0;i<4;i++){
					a.month=meses[i];
					if(meses[i]!=this.month){
						salida.append(a.getMonthName()+" ");
					}
				}
			break;
			default:
				salida.append(" Ninguno");
			break;
				}
			return salida.toString();
	}



	

	
		

