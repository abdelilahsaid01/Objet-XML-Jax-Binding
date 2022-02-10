import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
	@XmlAttribute
	private String type;
	@XmlAttribute
	private String date;
	@XmlAttribute
	private double montant;
	@XmlAttribute
	private String description;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Operation(String type, String date, double montant, String description) {
		super();
		this.type = type;
		this.date = date;
		this.montant = montant;
		this.description = description;
	}
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Operation [type=" + type + ", date=" + date + ", montant=" + montant + ", description=" + description
				+ "]";
	}
	
	
	
}
