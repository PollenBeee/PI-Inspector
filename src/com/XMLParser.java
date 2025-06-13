package com;

import com.utils.Perms;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.*;
import java.util.stream.Stream;

public class XMLParser {

    private static final String FILENAME = "D:\\VIT PhD\\xml.txt";

    public static void main(String[] args) {

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        Perms.build();

        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");

            // get <staff>
            NodeList list = doc.getElementsByTagName("manifest");

            Node root = doc.getDocumentElement();

            XPathFactory xFactory = XPathFactory.newInstance();
            XPath xPath = xFactory.newXPath();

            XPathExpression xExpress = xPath.compile("/manifest/uses-permission");
            NodeList nodes = (NodeList) xExpress.evaluate(root, XPathConstants.NODESET);

            System.out.println("Found " + nodes.getLength() + " note nodes");

            for (int index = 0; index < nodes.getLength(); index++) {
                Node node = nodes.item(index);
                String permission = node.getAttributes().getNamedItem("android:name").getNodeValue();
                boolean x = Perms.permsMap.containsKey(permission);
                if(x == true) {
                    Perms.permsMap.put(permission, 1);
                }
                else
                {
                    try{
                        FileWriter fileReader = new FileWriter("src/main/resources/permissionslist.txt", true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
                        Perms.permsMap.put(permission,1);
                        bufferedWriter.append(permission+"\n");
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(permission + ">> "+ Perms.permsMap.get(permission));
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }


    }

}
