
public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo() {		// Construtor que � invocado com new Retangulo() na Classe Aplicacao		
		this(3,4); 				// this chama o construtor Retangulo que utiliza os parametros
	}
	public Retangulo(double largura, double altura) { //Construtor que pode ser invocado se utilizado os parametros na hora de invocar
		this.largura = largura;  /* aqui eu copio os valores passados pelo parametro na classe aplica��o
								     no momento da invoca��o do construtor por exemplo this.largura � atributo da classe e
								     e largura � variavel que recebe o valor do parametro */ 
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
}
