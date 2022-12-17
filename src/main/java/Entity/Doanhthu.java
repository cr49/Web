package Entity;

public class Doanhthu {
	int storeid;
	int afu;
	int afs;
	int ats;
	
	public Doanhthu() {}
	
	public Doanhthu(int storeid, int afu, int afs, int ats) {
		this.storeid = storeid;
		this.afu = afu;
		this.afs = afs;
		this.ats = ats;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public int getAfu() {
		return afu;
	}

	public void setAfu(int afu) {
		this.afu = afu;
	}

	public int getAfs() {
		return afs;
	}

	public void setAfs(int afs) {
		this.afs = afs;
	}

	public int getAts() {
		return ats;
	}

	public void setAts(int ats) {
		this.ats = ats;
	}

	@Override
	public String toString() {
		return "Doanhthu [storeid=" + storeid + ", afu=" + afu + ", afs=" + afs + ", ats=" + ats + "]";
	}
	
	
}


