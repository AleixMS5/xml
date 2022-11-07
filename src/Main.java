import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.xpath.XPathExpressionException;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class Main {
    public Main() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
    }
//
//    DOM:
//    Expliqueu els aspectes fonamentals de DOM:
//
//    Què és.
    /**
     * The DOM (Document Object Model ) is an API defined for represent and interact with any HTML or XML file .
     * The DOM is a document model witch is charget in the web browser and represents teh document like a node tree, where every node represents a part of the document
     * (it can be an element, a text string or a character).
     */
//    Com funciona.
    /**
     * 	It is called as Document Object Model.
     * 	It stays in a tree structure.
     * 	DOM Parser is faster than SAX Parser.
     * 	Best for the smaller size of files.
     * 	It is not good at making XML files in low memory.
     * 	The internal structure can be created by DOM Parser.
     *  It can insert or delete nodes.
     * 	In DOM parser backward and forward search is possible
     * 	Suitable for large XML document.
     * 	It loads whole XML documents in memory.
     */
//    Classes necessàries.
    /**
     * import java.io.File;
     * import org.w3c.dom.NodeList;
     * import org.w3c.dom.Document;
     * import org.w3c.dom.Element;
     * import org.w3c.dom.Node;
     * import org.w3c.dom.*;
     * import javax.xml.parsers.DocumentBuilder;
     * import javax.xml.parsers.DocumentBuilderFactory;
     * import javax.xml.transform.Transformer;
     * import javax.xml.transform.TransformerFactory;
     * import javax.xml.transform.dom.DOMSource;
     * import javax.xml.transform.stream.StreamResult;
     */
//    Excepcions que s'han de controlar.
    /**
     * ParserConfigurationException, IOException, SAXException
     */
//    Codi d'exemple de lectura des de fitxer.
    /***/

//
//    public static void main(String[] args) {
//        File file = new File("catalog.xml");
//        try {
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(file);
//            //normalize the xml file
//            doc.getDocumentElement().normalize();
//            NodeList nList = doc.getElementsByTagName("CD");
//            System.out.println("Número de cds: " + nList.getLength());
//            //read the file knowing the structure
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
//
//                    System.out.println("TITLE: "
//                            + eElement.getElementsByTagName("TITLE").item(0).getTextContent());
//                    System.out.println("Artist: "
//                            + eElement.getElementsByTagName("ARTIST").item(0).getTextContent());
//                    System.out.println("Country: "
//                            + eElement.getElementsByTagName("COUNTRY").item(0).getTextContent());
//                }
//            }
//
//
////reading the file without know the strcture
//            for (int i = 0; i < nList.getLength(); i++) {
//                Node node = nList.item(i);
//
//                if (node.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) node;
//
//                    if (eElement.hasChildNodes()) {
//                        NodeList nl = node.getChildNodes();
//                        for (int j = 0; j < nl.getLength(); j++) {
//                            Node nd = nl.item(j);
//                            System.out.println(nd.getTextContent());
//                        }
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//    Codi d'exemple d'escriptura a fitxer.
        /***/
//
//        try {
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(file);
//
//            // definimos el elemento raíz del documento
//
//
//
//            // definimos el nodo que contendrá los elementos
//            Element CD = doc.createElement("CD");
//
//
//            // atributo para el nodo coche
//
//
//            // definimos cada uno de los elementos y le asignamos un valor
//            Element Titulo = doc.createElement("TITLE");
//            Titulo.appendChild(doc.createTextNode("banderas negra"));
//
//
//            Element Artista = doc.createElement("ARTIST");
//            Artista.appendChild(doc.createTextNode("Mago de oz"));
//
//
//            Element pais = doc.createElement("COUNTRY");
//            pais.appendChild(doc.createTextNode("spain"));
//
//
//            Element compañia = doc.createElement("COMPANY");
//            compañia.appendChild(doc.createTextNode("spain"));
//
//
//            Element precio = doc.createElement("PRICE");
//            precio.appendChild(doc.createTextNode("10"));
//
//
//            Element año = doc.createElement("YEAR");
//            año.appendChild(doc.createTextNode("2021"));
//
//
//            //Añadimos la información a la casa ya existente
//            //Añadimos la información a la casa ya existente
//            Node eRaiz = doc.getElementsByTagName("CATALOG").item(0);
//
//            eRaiz.appendChild(CD);
//            CD.appendChild(Titulo);
//            CD.appendChild(año);
//            CD.appendChild(precio);
//            CD.appendChild(compañia);
//            CD.appendChild(pais);
//            CD.appendChild(Artista);
//            TransformerFactory transformerFactory = TransformerFactory.newInstance();
//            Transformer transformer = transformerFactory.newTransformer();
//            DOMSource source = new DOMSource(doc);
//            StreamResult result = new StreamResult(new File("ejercicio3.xml"));
//
//            transformer.transform(source, result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    SAX:
//    Expliqueu els aspectes fonamentals de SAX:
//
//    Què és.
    /***/
//    Com funciona.
    /**
     * It is called a Simple API for XML Parsing.
     * It’s an event-based parser.
     * SAX Parser is slower than DOM Parser.
     * Best for the larger sizes of files.
     * It is suitable for making XML files in Java.
     * The internal structure can not be created by SAX Parser.
     * It is read-only.
     * In the SAX parser backward navigation is not possible.
     * Suitable for efficient memory.
     * A small part of the XML file is only loaded in memory.
     */
//    Classes necessàries.
    /**    import java.io.File;
     import java.io.FileInputStream;
     import java.io.InputStream;
     import java.io.InputStreamReader;
     import java.io.Reader;
     import javax.xml.parsers.SAXParser;
     import javax.xml.parsers.SAXParserFactory;
     import org.xml.sax.Attributes;
     import org.xml.sax.InputSource;
     import org.xml.sax.SAXException;
     import org.xml.sax.helpers.DefaultHandler;*/

//    Excepcions que s'han de controlar.
    /***/
//    Codi d'exemple de lectura des de fitxer.
    /***/

        public static void main(String argv[]) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
            try {
                SAXParserFactory factory = SAXParserFactory.newInstance();
                SAXParser saxParser = factory.newSAXParser();
                DefaultHandler handler = new DefaultHandler() {
                    boolean btitle = false;
                    boolean bartist = false;
                    boolean bcountry = false;
                    boolean bprice = false;
                    boolean byear = false;


                    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                        System.out.println("inicia elemento:" + qName);
                        if (qName.equalsIgnoreCase("CD")) {

                        }
                        if (qName.equalsIgnoreCase("title")) {
                            btitle = true;
                        }
                        if (qName.equalsIgnoreCase("artist")) {
                            bartist = true;
                        }
                        if (qName.equalsIgnoreCase("country")) {
                            bcountry = true;
                        }
                        if (qName.equalsIgnoreCase("year")) {
                            byear = true;
                        }
                        if (qName.equalsIgnoreCase("price")) {
                            bprice = true;
                        }

                    }

                    public void endElement(String uri, String localName, String qName) throws SAXException {
                        System.out.println("finaliza elemento:" + qName);
                    }

                    public void characters(char ch[], int start, int length) throws SAXException {
                        if (btitle) {
                            System.out.println("tiltesax: " + new String(ch, start, length));
                            btitle = false;
                        }
                        if (bartist) {
                            System.out.println("artistsax: " + new String(ch, start, length));
                            bartist = false;
                        }
                        if (bcountry) {
                            System.out.println("countrysax: " + new String(ch, start, length));
                            bcountry = false;
                        }
                        if (byear) {
                            System.out.println("yearsax: " + new String(ch, start, length));
                            byear = false;
                        }
                        if (bprice) {
                            System.out.println("pricesax: " + new String(ch, start, length));
                            bprice = false;
                        }


                    }
                };
                File file = new File("ejercicio3.xml");
                InputStream inputStream = new FileInputStream(file);
                Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                InputSource is = new InputSource(reader);
                is.setEncoding("UTF-8");
                saxParser.parse(is, handler);
            } catch (Exception e) {
                e.printStackTrace();
            }


//    Codi d'exemple d'escriptura a fitxer.
            /**It is read-only.*/


//    XPath:
//    Què és XPath?
            /**XPath (XML Path Language) is an expression language designed to support the query or transformation of XML documents.*/
//    Què puc fer amb XPath?
            /**u can do querys on an xml*/
//    Posa un exemple de com consultar els CDs anteriors a 1990.

            //Build DOM

//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            factory.setNamespaceAware(true); // never forget this!
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document doc = builder.parse("ejercicio3.xml");
//
//            //Create XPath
//
//            XPathFactory xpathfactory = XPathFactory.newInstance();
//            XPath xpath = xpathfactory.newXPath();
//
//            System.out.println(" Get CDs titles written before 1990");
//
//            // 1) Get book titles written after 2001
//            XPathExpression expr = xpath.compile("//CD[YEAR<1990]/TITLE/text()");
//            Object result = expr.evaluate(doc, XPathConstants.NODESET);
//            NodeList nodes = (NodeList) result;
//            for (int i = 0; i < nodes.getLength(); i++) {
//                System.out.println(nodes.item(i).getNodeValue());
//            }


//    XQuery:

//    Què és XQuery?
            /**
             XQuery provides the means to extract and manipulate information from XML documents.*/
//    Què puc fer amb XQuery?
            /**extract and manipulate information from XML documents.*/
//    Posa un exemple de com consultar els CDs més barats de 10$.


        }
}


