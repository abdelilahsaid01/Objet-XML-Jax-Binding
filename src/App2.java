import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class App2 {

	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Releve.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Releve re = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
		System.out.println(re);
	}

}
