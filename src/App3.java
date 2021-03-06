import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class App3 {

	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Releve.class);
		context.generateSchema(new SchemaOutputResolver() {

			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				File f = new File("releve.xsd");
				StreamResult result = new StreamResult(f);
				result.setSystemId(f.getName());
				return result;
			}
		});
	}

}
