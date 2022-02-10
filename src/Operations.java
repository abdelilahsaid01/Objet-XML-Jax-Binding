import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
	@XmlAttribute
	private String dateDebut;
	@XmlAttribute
	private String dateFin;
	@XmlElement
	private List<Operation> operation;
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public List<Operation> getOperation() {
		return operation;
	}
	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}
	public Operations(String dateDebut, String dateFin, List<Operation> operation) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.operation = operation;
	}
	public Operations() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Operations [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", operation=" + operation + "]";
	}
	
	
}
