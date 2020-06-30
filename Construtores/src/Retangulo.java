
public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo() {		// Construtor que é invocado com new Retangulo() na Classe Aplicacao		
		this(3,4); 				// this chama o construtor Retangulo que utiliza os parametros
	}
	public Retangulo(double largura, double altura) { //Construtor que pode ser invocado se utilizado os parametros na hora de invocar
		this.largura = largura;  /* aqui eu copio os valores passados pelo parametro na classe aplicação
								     no momento da invocação do construtor por exemplo this.largura é atributo da classe e
								     e largura é variavel que recebe o valor do parametro */ 
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
}
