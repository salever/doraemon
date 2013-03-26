//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.01 at 02:45:44 PM CST 
//

package org.xmlsoap.schemas.schema;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.xmlsoap.schemas.wsdl package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.xmlsoap.schemas.wsdl
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link TSchema }
	 * 
	 */
	public TSchema createTSchema() {
		return new TSchema();
	}

	/**
	 * Create an instance of {@link TElement }
	 * 
	 */
	public TElement createTElement() {
		return new TElement();
	}

	/**
	 * Create an instance of {@link TComplexType }
	 * 
	 */
	public TComplexType createTComplexType() {
		return new TComplexType();
	}

	/**
	 * Create an instance of {@link TSequence }
	 * 
	 */
	public TSequence createTSequence() {
		return new TSequence();
	}

}