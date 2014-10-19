import java.util.*;
public class Spis {

	
	public static void main(String[] args) {
		Inwentor[] urzadzenie = new Inwentor [1];
		
		ala ma kota w glowie i tyle 

	}

}


	class Inwentor
	{
		private String nazwa, model, numer_fabryczny, dystrybutor, serwis;
		private Date rok_produkcji, data_uruchomienia; 
		
		public Inwentor (String n,  String m, 
				String r, String sn, String p, 
				int r_prod, int d_uruch, 
				String dyst, String serw) 
		{
				
			nazwa = n;
			model = m;
			numer_fabryczny = sn;
			dystrybutor = dyst;
			serwis = serw;
			//GregorianCalendar 
			//rok_produkcji = r_prod;
			//data_uruchomienia = d_uruch;
			
		}
		
		public String dajNazwe() {
			return nazwa;
		}
		
		public String dajModel() {
			return model;
			
		}
		
		public String dajNumer() {
			return numer_fabryczny ;
		}
		
		public String dajDystrybutora() {
			return dystrybutor;
		}
		
		public String dajSerwis() {
			return serwis;
		}
		
		public Date dajRokProdukcji() {
			return rok_produkcji;
		}
		
		public Date dajDateUruchomienia() {
			return data_uruchomienia;
		}
	}