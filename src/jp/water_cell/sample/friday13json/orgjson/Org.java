package jp.water_cell.sample.friday13json.orgjson;

public class Org {
	String name;
	String activity;
	
	public Org(String name, String activity) {
		this.name = name;
		this.activity = activity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "Org [name=" + name + ", activity=" + activity + "]";
	}
	
}
