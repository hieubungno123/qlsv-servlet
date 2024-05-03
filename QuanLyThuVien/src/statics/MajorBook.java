package statics;

public enum MajorBook {
	NaturalScience("Khoa Hoc Tu Nhien"),
	InformationTechnology("Cong Nghe Thong Tin"),
	LiteratureArt("Van Hoc Nghe Thuat"),
	ElectronicTelecom("Dien Tu Vien Thong");
	
	public String value;
	
	MajorBook(String value){
		this.value=value;
	}
}
