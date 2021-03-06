/*
 * TestJAXBPGNParser.java
 * 
 * Copyright 2008-2014 supareno
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.supareno.test.pgnparser.jaxb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.supareno.pgnparser.jaxb.Games;
import com.supareno.pgnparser.jaxb.parser.JAXBPGNParser;
import com.supareno.test.pgnparser.JUnitTestConstants;

/**
 * The {@code TestJAXBPGNParser} class is used to test the {@code JAXBPGNParser} class.
 * 
 * @author supareno
 * @version 1.1
 */
public class TestJAXBPGNParser extends AbstractParserValidator {

	private JAXBPGNParser jaxbParser = null;

	/**
	 * Tests that the xml file parsed is equal to the reference game.
	 */
	@Test
	public void testParseAndEquality () {
		jaxbParser = new JAXBPGNParser ();
		assertEquals ( "xml" , jaxbParser.getExtension () );
		Games games = jaxbParser.parseFile ( JUnitTestConstants.XML_PGN_FILE );
		validateGames ( games );
	}

}
