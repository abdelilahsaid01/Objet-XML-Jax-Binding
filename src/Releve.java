
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Releve")
@XmlAccessorType(XmlAccessType.FIELD)

public class Releve {
	@XmlAttribute
	private String RIB;
	@XmlElement
	private String dateReleve;
	@XmlElement
	private double solde;
	@XmlElement
	private Operations operations;
	public String getRIB() {
		return RIB;
	}
	public void setRIB(String rIB) {
		RIB = rIB;
	}
	public String getDateReleve() {
		return dateReleve;
	}
	public void setDateReleve(String dateReleve) {
		this.dateReleve = dateReleve;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Operations getOperations() {
		return operations;
	}
	public void setOperations(Operations operations) {
		this.operations = operations;
	}
	public Releve(String rIB, String dateReleve, double solde, Operations operations) {
		super();
		RIB = rIB;
		this.dateReleve = dateReleve;
		this.solde = solde;
		this.operations = operations;
	}
	public Releve() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Releve [RIB=" + RIB + ", dateReleve=" + dateReleve + ", solde=" + solde + ", operations=" + operations
				+ "]";
	}

	


}
