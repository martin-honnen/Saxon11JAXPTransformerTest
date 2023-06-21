package org.example;

import net.sf.saxon.TransformerFactoryImpl;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {
    public static void main(String[] args) throws TransformerException {
        TransformerFactory transformerFactory = new TransformerFactoryImpl();

        Transformer transformer = transformerFactory.newTransformer(new StreamSource("sheet1.xsl"));

        transformer.transform(new StreamSource("sample1.xml"), new StreamResult("result1.xml"));
    }
}