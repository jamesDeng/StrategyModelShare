package vc.thinker.ppt2;

public  class BluetoothLock extends Lock{
	
	private String mac;
	
	private String pwd;

	private String secretKey;
	
	public BluetoothLock(String company, String sysCode,String mac, String pwd, String secretKey) {
		super(company,sysCode);
		this.mac = mac;
		this.pwd = pwd;
		this.secretKey = secretKey;
	}
	
	@Override
	public void unlock() {
		String out=String.format("%s%s蓝牙开锁，搜索MAC为%s,pwd:%ssecretKey:%s", getCompany(),getSysCode(),
				getMac(),getPwd(),getSecretKey());
		System.out.println(out);
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}
}
