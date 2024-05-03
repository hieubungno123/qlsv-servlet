package statics;

public enum ReaderType {
	UNGRADUTE_STUDENT("SINH VIEN"),
	GRADUTE_STUDENT("HOC VIEN CAO HOC"),
	TEACHER("GIANG VIEN");
	
	public String value;
	
	ReaderType(String value){
		this.value=value;
	}
}
