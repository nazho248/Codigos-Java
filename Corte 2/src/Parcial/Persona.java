package Parcial;

public class Persona {
	
	/*Defina una clase Persona, con atributos: nombre, edad, cedula, sexo, peso y
	altura.
	Implemente los siguientes constructores:
	• Constructor por defecto (vacío).
	• Constructor con todos los parámetros.
	Implementar los siguientes métodos:
	• calcularIMC(): calcular si la persona está en su peso ideal. Devuelve -1 si está
	por debajo de su peso ideal, un 0 si está en su peso ideal y un 1 si tiene
	sobrepeso.
	• esMayorDeEdad(): indicar si es mayor de edad.
	• Crear los métodos get y set de cada parámetro.*/
	
	public String nombre;
	public int edad;
	public String cedula;
	public String sexo="m";
	public float peso;
	public float altura;
	public static String texto;
	public static final float pi = 3.1416f;  //esta es una variable inmodificable y es puesta en el codigo
	
	
	public static String getTexto() {
		return texto;
	}

	public static void setTexto(String texto) {
		Persona.texto = texto;
	}

	public Persona() {
		this.nombre="Pepito perez";
		this.edad=5;
		this.cedula="1234567891";
		this.peso=55;
		this.altura=160;

		
	}
	
	public Persona (String name, int age, String id, float w, float ht, String sex) {
		this.nombre=name;
		this.edad=age;
		this.cedula=id;
		this.peso=w;
		this.altura=ht;
		this.sexo= sex;
	}
	
	//Mayoria de edad
	public String esMayorDeEdad() {
		String mayor = "No";
		if (this.edad>=18) {
			mayor = "Si";
		}
			return mayor;
	}
	
    public int calcularIMC() {
    	
        double pesoActual = peso / (Math.pow((altura/100), 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return 0;
        } else if (pesoActual < 20) {
            return -1;
        } else {
            return 1;
        }
    }
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad>=0) {
			this.edad=edad;
		}
		else {
			 System.out.println("edad invalida");
			this.edad=-1;
		}

	}
//cedula
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
// sexo
	public String getSexo() {
		String sex="masculino";
		if (sexo.equals("f")) {
			sex="femenino";
		}
		return sex;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
//peso
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso>=0) {
			this.peso=peso;
		}
		else {
			 System.out.println("peso invalido");
			this.peso=-1;
		}
	}
//altura
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		if (altura>=0) {
			this.altura=altura;
		}
		else {
			 System.out.println("altura invalida");
			this.altura=-1;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso="
				+ peso + ", altura=" + altura + ", calcularIMC()=" + calcularIMC() + "]";
	}
	
	
}
