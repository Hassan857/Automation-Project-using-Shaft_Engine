package utilis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader  {

    String filepath = System.getProperty("user.dir")+"/src/test/resources/TestJsonFiles/User_Registration_and_Login_DataFile.json";

    public String  url , Email , FirstName , LastName , Password , Day ,  Month , Year , AddressFirstName , AddressLastName , Address , City , State , PostalCode , Country , MobileNumber , AliasEmail ;

    public void JsonReader () throws JSONException, FileNotFoundException, IOException, ParseException {

        JSONParser parser = new JSONParser();

        FileReader filereader = new FileReader(filepath);

        Object obj = parser.parse(filereader);
        JSONObject person = (JSONObject) obj ;

            url = (String) person.get("URL");
            Email = (String) person.get("Email");
            FirstName = (String) person.get("FirstName");
            LastName = (String) person.get("LastName");
            Password = (String) person.get("Password");
            Day =  (String) person.get("Day");
            Month = (String) person.get("Month");
            Year = (String) person.get("Year");
            AddressFirstName = (String) person.get("AddressFirstName");
            AddressLastName = (String) person.get("AddressLastName");
            Address = (String) person.get("Address");
            City = (String) person.get("City");
            State = (String) person.get("State");
            PostalCode = (String) person.get("PostalCode");
            Country = (String) person.get("Country");
            MobileNumber = (String) person.get("MobileNumber");
            AliasEmail = (String) person.get("AliasEmail");


        }
    }