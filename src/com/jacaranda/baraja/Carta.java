package com.jacaranda.baraja;

import java.util.Objects;

public class Carta{
	private int number;
	private String palo;


	public Carta(int number, String palo) {
		super();
		this.number = number;
		this.palo = palo;
	}

	public double getValor() {
		double valor = 0;
		if (this.number > 7)
			valor = 0.5;
		else
			valor = this.number;

		return valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}

	public int getNumber() {
		return number;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Carta resultado = new Carta(this.getNumber(), this.getPalo());
		return resultado;
	}

//	@Override
//	public int compareTo(Carta o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public String toString() {
//		String resultado;
//		if (number == 8)
//			resultado = "Carta [numero= sota " + ", palo=" + palo + "]";
//		else if (number == 9)
//			resultado = "Carta [numero= caballo " + ", palo=" + palo + "]";
//		else if (number == 10)
//			resultado = "Carta [numero= rey " + ", palo=" + palo + "]";
//		else
//			resultado = "Carta [numero=" + number + ", palo=" + palo + "]";
//		return resultado;
//	}
//
}

	


	
	
	