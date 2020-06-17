package it.dstech.formazione.gestione;

public class Gestione {
private String testo;


public Gestione(String testo) {
	super();
	this.testo = testo;
}

public int contaParole() {
	String[] parole=testo.split(" ");
		
	return parole.length;
}

public int contaVocali() {
	String[] parole=testo.split(" ");
	int count=0;
	for (int i =0; i<parole.length;i++) {
		char[] caratteri=	parole[i].toCharArray();
		for (int j=0;j<caratteri.length;j++) {
			if (caratteri[j]=='a'||caratteri[j]=='e'||caratteri[j]=='i'||caratteri[j]=='o'||caratteri[j]=='u') {
				count++;
			}
		}
	}
	return count;
}

public int contaConsonanti() {
	String[] parole=testo.split(" ");
	int count=0;
	for (int i =0; i<parole.length;i++) {
		char[] caratteri=	parole[i].toCharArray();
		for (int j=0;j<caratteri.length;j++) {
			if (caratteri[j]!='a'&&caratteri[j]!='e'&&caratteri[j]!='i'&& caratteri[j]!='o'&& caratteri[j]!='u') {
				count++;
			}
		}
	}
	return count;
}

}
