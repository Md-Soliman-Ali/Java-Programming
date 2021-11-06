package file_read_write;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.xml.transform.Templates;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Json_Write {

    public static void main(String[] args) throws IOException, ParseException {

        //writeJSON();
        //readJSON();
        //writeJSONList();
        //readJSONList(2);
        //updateJSONList(0);
        //deleteJSONList(0);
    }

    // Create JSON
    public static void writeJSON() throws IOException {

        JSONObject empObj = new JSONObject();
        empObj.put("Name", "Md Soliman Ali");
        empObj.put("Department", "IT");
        empObj.put("Designation", "Software Engineer");

        JSONObject addressObj = new JSONObject();
        addressObj.put("Area", "ECB");
        addressObj.put("PO", "Mirpur");
        addressObj.put("City", "Dhaka");

        empObj.put("Address", addressObj);

        //System.out.println(empObj);

        FileWriter writer = new FileWriter("employer.json");
        writer.write(empObj.toJSONString());
        writer.flush();
        writer.close();
    }

    // Read JSON
    public static void readJSON() throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("employer.json"));

        JSONObject empObj = (JSONObject) obj;
        System.out.println();
        System.out.println(empObj);

        System.out.println();
        String name = (String) empObj.get("Name");
        System.out.println(name);

        String department = (String) empObj.get("Department");
        System.out.println(department);

        String designation = (String) empObj.get("Designation");
        System.out.println(designation);

        System.out.println();
        JSONObject addressObj = (JSONObject) empObj.get("Address");
        System.out.println(addressObj);

        System.out.println();
        String area = (String) addressObj.get("Area");
        System.out.println(area);

        String po = (String) addressObj.get("PO");
        System.out.println(po);

        String city = (String) addressObj.get("City");
        System.out.println(city);
    }

    // Write JSON
    public static void writeJSONList() throws IOException, ParseException {

        char ch;
        String fileName = "student.json";

        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject studentObj = new JSONObject();

            Scanner input = new Scanner(System.in);

            System.out.println("Input Student Name: ");
            studentObj.put("name", input.nextLine());

            System.out.println("Input Class: ");
            studentObj.put("class", input.nextLine());

            System.out.println("Input Section: ");
            studentObj.put("section", input.nextLine());

            System.out.println("Input Roll: ");
            studentObj.put("roll", input.nextLine());

            JSONArray jsonArray = (JSONArray) obj;
            //System.out.print(jsonArray);

            jsonArray.add(studentObj);

            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

            System.out.println("Saved!");
            System.out.print(jsonArray);
            System.out.println("\nDo you Want To Add More?[y/n]");

            ch = input.next().charAt(0);

        }
        while (ch != 'n');
    }

    // Read JSON
    public static void readJSONList(int pos) throws IOException, ParseException {

        String fileName = "student.json";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));

        JSONArray jsonArray = (JSONArray) obj;
        JSONObject jsonObject = (JSONObject) jsonArray.get(pos);

        //System.out.println(json);

        String name = (String) jsonObject.get("name");
        System.out.println("Name: " + name);

        String roll = (String) jsonObject.get("roll");
        System.out.println("Roll: " + roll);

        String section = (String) jsonObject.get("section");
        System.out.println("Section: " + section);

        String _class = (String) jsonObject.get("class");
        System.out.println("Class: " + _class);
    }

    // Update JSON
    public static void updateJSONList(int pos) throws IOException, ParseException {

        String fileName = "student.json";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));

        JSONArray jsonArray = (JSONArray) obj;
        JSONObject jsonObject = (JSONObject) jsonArray.get(pos);
        jsonObject.put("class", "9");

        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();

        System.out.println("Saved!");
        System.out.print(jsonArray);
    }

    // Delete JSON
    public static void deleteJSONList(int pos) throws IOException, ParseException {
        String fileName = "student.json";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));

        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.remove(pos);

        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();

        System.out.println("Saved!");
        System.out.print(jsonArray);
    }
}
