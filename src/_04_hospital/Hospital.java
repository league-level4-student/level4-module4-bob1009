package _04_hospital;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hospital {
ArrayList<Doctor> Docs=new ArrayList<Doctor>();
ArrayList<Patient> Pat=new ArrayList<Patient>();


public void addDoctor(Doctor doc) {
	Docs.add(doc);
}
public ArrayList getDoctors() {
	return Docs;	
}


public void addPatient(Patient patients) {
	Pat.add(patients);
}
public ArrayList getPatients() {
	return Pat;
}
}
