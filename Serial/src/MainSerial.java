import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainSerial {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Kiss", "Elek", 2001);
		Employee emp2=new Employee("Varga","Éva",1989);
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		
		//How can we serialize the employees object?
		
		String fileName="empdata.ser";
		
		try {
			FileOutputStream fo=new FileOutputStream(fileName);
			ObjectOutputStream oos=new ObjectOutputStream(fo);
			oos.writeObject(employees);
			oos.close();
			fo.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Deserialize the object
		List<Employee> employees2=null;
		
		try {
			FileInputStream fi=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fi);
			employees2=(List<Employee>)ois.readObject();
			ois.close();
			fi.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Employee e : employees2) {
			System.out.println(e.getFirstName()+","+e.getLastName()+","+e.getBirthYear());
		}
		
		//Szerializáció XML fájl
		String XMLFajl="employee.xml";
		XMLEncoder enc=null;
		
		try {
			FileOutputStream fo=new FileOutputStream(XMLFajl);
			enc=new XMLEncoder(fo);
			enc.writeObject(employees);
			enc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		XMLDecoder dec=null;
		List<Employee> employees3=null;
		
		try {
			FileInputStream fi=new FileInputStream(XMLFajl);
			dec=new XMLDecoder(fi);
			employees3=(List<Employee>)dec.readObject();
			dec.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Employee e : employees3) {
			System.out.println(e.getFirstName()+","+e.getLastName()+","+e.getBirthYear());
		}
		
	}

}
