import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class App1 {

	public static void main(String[] args) throws Exception {
		
		Releve Re = new Releve();
		Re.setRIB("011112222333344445555666");
		Re.setSolde(14500);
		Re.setDateReleve("01-01-2021");
		
		Operations Op = new Operations();
		Op.setDateDebut("01-01-2021");
		Op.setDateFin("2021-01-30");

		ArrayList<Operation> Lp = new ArrayList<Operation>();
		Lp.add(new Operation("CREDIT", "2021-01-01", 9000, "Vers Espèce"));
		Lp.add(new Operation("DEBIT", "2021-01-01", 7000, "CHEQUE"));

		Op.setOperation(Lp);
		Re.setOperations(Op);
		


		JAXBContext context =JAXBContext.newInstance(Releve.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(Re, new File("releve.xml"));
	}

}
