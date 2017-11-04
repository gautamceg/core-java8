package stream;

public class YourJavaItem {
	private String vin;
	private String webId;
	private String status;
	private long price1;
	private long price2;
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getWebId() {
		return webId;
	}
	public void setWebId(String webId) {
		this.webId = webId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getPrice1() {
		return price1;
	}
	public void setPrice1(long price1) {
		this.price1 = price1;
	}
	public long getPrice2() {
		return price2;
	}
	public void setPrice2(long price2) {
		this.price2 = price2;
	}
	@Override
	public String toString() {
		return "YourJavaItem [vin=" + vin + ", webId=" + webId + ", status=" + status + ", price1=" + price1
				+ ", price2=" + price2 + "]";
	}
	
	
	
	
}
