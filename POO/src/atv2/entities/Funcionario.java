package atv2.entities;

public class Funcionario {
	private String name;
	private Double GrossSalary;
	private Double tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGrossSalary() {
		return GrossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		GrossSalary = grossSalary;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double netSalary() {
		return GrossSalary - tax;
	}
	public String toString() {
		return name+
				", $ "+
				String.format("%.2f", netSalary());
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100.0;
		}

}
