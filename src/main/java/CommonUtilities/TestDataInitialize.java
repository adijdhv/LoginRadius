package CommonUtilities;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class TestDataInitialize {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	String TestCaseName;
    public TestDataInitialize(String FileName) {
    	this.TestCaseName= FileName;
    }
    public HashMap<String, String> Initialize() {
		
	 try
	 {
         File inputFile = new File("C:\\Users\\grawat\\Workspace\\DemoAPIProject\\src\\test\\java\\TestData\\"+this.TestCaseName+".xml");
         DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
         DocumentBuilder db = dbf.newDocumentBuilder();
         Document doc = db.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element " + doc.getDocumentElement().getNodeName());

         NodeList nodeList=doc.getElementsByTagName("*");
         for (int i=0; i<nodeList.getLength(); i++) 
         {
             // Get element
             Element element = (Element)nodeList.item(i);
             System.out.println(element.getNodeName());
             map.put(element.getNodeName(), element.getTextContent());
         }
         return map;

      }
	 catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }
}

	
