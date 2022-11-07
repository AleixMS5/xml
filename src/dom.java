import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class dom {
    public static void main(String[] args) {
        File file = new File("catalog.xml");
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            //normalize the xml file
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("CD");
            System.out.println("Número de cds: " + nList.getLength());
            //read the file knowing the structure
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("TITLE: "
                            + eElement.getElementsByTagName("TITLE").item(0).getTextContent());
                    System.out.println("Artist: "
                            + eElement.getElementsByTagName("ARTIST").item(0).getTextContent());
                    System.out.println("Country: "
                            + eElement.getElementsByTagName("COUNTRY").item(0).getTextContent());
                }
            }


//reading the file without know the strcture
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;

                    if (eElement.hasChildNodes()) {
                        NodeList nl = node.getChildNodes();
                        for (int j = 0; j < nl.getLength(); j++) {
                            Node nd = nl.item(j);
                            System.out.println(nd.getTextContent());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


//    Codi d'exemple d'escriptura a fitxer.
        /***/

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
//
//            // definimos el elemento raíz del documento
//
//
//
//            // definimos el nodo que contendrá los elementos
            Element CD = doc.createElement("CD");
//
//
//            // atributo para el nodo coche
//
//
//            // definimos cada uno de los elementos y le asignamos un valor
            Element Titulo = doc.createElement("TITLE");
            Titulo.appendChild(doc.createTextNode("banderas negra"));
//
//
            Element Artista = doc.createElement("ARTIST");
            Artista.appendChild(doc.createTextNode("Mago de oz"));
//
            Element pais = doc.createElement("COUNTRY");
            pais.appendChild(doc.createTextNode("spain"));
//
//
            Element compañia = doc.createElement("COMPANY");
            compañia.appendChild(doc.createTextNode("spain"));
//
//
            Element precio = doc.createElement("PRICE");
            precio.appendChild(doc.createTextNode("10"));


            Element año = doc.createElement("YEAR");
            año.appendChild(doc.createTextNode("2021"));


            //Añadimos la información a la casa ya existente
            //Añadimos la información a la casa ya existente
            Node eRaiz = doc.getElementsByTagName("CATALOG").item(0);

            eRaiz.appendChild(CD);
            CD.appendChild(Titulo);
            CD.appendChild(año);
            CD.appendChild(precio);
            CD.appendChild(compañia);
            CD.appendChild(pais);
            CD.appendChild(Artista);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ejercicio3.xml"));

            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
