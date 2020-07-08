package _04_hospital;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hospital {
int newdoc=0;
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
public void assignPatientsToDoctors() throws DoctorFullException {
	for (int i = 0; i < Pat.size(); i++) {

	try {
		Docs.get(newdoc).assignPatient(Pat.get(i));
	
	} catch (DoctorFullException e) {
		newdoc+=1;
		Docs.get(newdoc).assignPatient(Pat.get(i));
	}
	}
}
}
