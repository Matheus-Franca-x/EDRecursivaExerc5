package controller;

public class QuantidadeControll 
{
	public QuantidadeControll()
	{
		super();
	}
	
	public int contaDigito(int valor) //Inicio
	{
		return valor / 10 == 0 ? 1 : 1 + contaDigito(valor / 10); 
		//a recursiva sera executada no operador ternario, onde quando o valor for verdadeiro, ele retornara 1,
		//voltando todos os valores recebidos na recursiva e somando com 1, mostrando o total de digitos.
	}
}
