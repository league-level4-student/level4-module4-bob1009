package _04_hospital;

import java.util.ArrayList;

public class Doctor {
 ArrayList<Patient> Docpat=new ArrayList<Patient>();
	public boolean performsSurgery() {
	return false;
 }
 public boolean makesHouseCalls() {
	 return false;
 }

 
 public void assignPatient(Patient pat) throws DoctorFullException{
	 if (Docpat.size()<3) {
		 Docpat.add(pat);
	}
	 else {
		throw new DoctorFullException();
	}
 }
 public ArrayList getPatients() {
	 return Docpat;
 }
 
 public void doMedicine() {
	 for (int i = 0; i < Docpat.size(); i++) {
		Docpat.get(i).checkPulse();
	}
 }

}
