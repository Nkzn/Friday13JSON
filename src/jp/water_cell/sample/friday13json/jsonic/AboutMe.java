package jp.water_cell.sample.friday13json.jsonic;

import java.util.List;

public class AboutMe {
	String name;
	String nickName;
	String screenName;
	List<Org> orgs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public List<Org> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<Org> orgs) {
		this.orgs = orgs;
	}

	@Override
	public String toString() {
		return "AboutMe [name=" + name + ", nickName=" + nickName
				+ ", screenName=" + screenName + ", orgs=" + orgs + "]";
	}
	
	
}
