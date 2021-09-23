package com.example.use;

import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.example.handler.SimpleMovieHandler;

/**
 *
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class UseSimpleMovieHandler {
	public static void main(String[] args) throws SAXException {
		try {
			XMLReader parser = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
			SimpleMovieHandler handler = new SimpleMovieHandler();
			parser.setContentHandler(handler);
			parser.parse("resources/movies.xml");
			System.err.println("# of movies: " + handler.getCounter());
		} catch (Exception e) {
		}
	}
}
