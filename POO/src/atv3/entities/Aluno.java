package atv3.entities;

public class Aluno {
	private String nome;
	private Double n1;
	private Double n2;
	private Double n3;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getN1() {
		return n1;
	}
	public void setN1(Double n1) {
		this.n1 = n1;
	}
	public Double getN2() {
		return n2;
	}
	public void setN2(Double n2) {
		this.n2 = n2;
	}
	public Double getN3() {
		return n3;
	}
	public void setN3(Double n3) {
		this.n3 = n3;
	}
	
	public Double NotaFinal() {
		return n1+n2+n3;
	}
	public String VerAprovacao() {
		
		if(NotaFinal() < 60.00) {
			Double diferenca = 60.00 - NotaFinal();
			
			return "Reprovado Faltou "+String.format("%.2f", diferenca)+" para passar";
		}else {
			return "Aprovado";
		}
	}

}
