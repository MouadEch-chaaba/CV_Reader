package com.developech.behaviorsClasses;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.developech.businessClasses.Certificate;
import com.developech.businessClasses.Cv;
import com.developech.businessClasses.Education;
import com.developech.businessClasses.Experience;
import com.developech.businessClasses.Language;
import com.developech.businessClasses.OtherInfosItem;
import com.developech.businessClasses.Person;
import com.developech.businessClasses.SkillsDomain;
import com.developech.businessClasses.SkillsDomainItem;

public class CvParser extends DefaultHandler {
	private Cv cv;
	private Person owner;
	private ArrayList<Experience> experiences;
	private ArrayList<Language> languages;
	private ArrayList<SkillsDomain> skills;
	private ArrayList<SkillsDomainItem> currentSkillsDomainItems;
	private ArrayList<Education> educations;
	private ArrayList<Certificate> certifications;
	private ArrayList<OtherInfosItem> otherInformations;
	
	@Override
	public void startDocument() throws SAXException{
		
	}
	
	@Override
	public void startElement(String uri,String localName,String qName,Attributes attributes) throws SAXException{
		
	}
	
	@Override
	public void characters(char[] charachters,int start,int length) throws SAXException{
		
	}
	
	@Override
	public void endElement(String uri,String localName,String qName) throws SAXException{
		
	}
	
	@Override
	public void endDocument() throws SAXException{
		
	}
	
}
