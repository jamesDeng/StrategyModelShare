package vc.thinker.ppt3;

import vc.thinker.ppt3.method.BluetoothUnlock;

/**
 * 蓝牙锁
 * @author james
 *
 */
public  class BluetoothLock extends Lock{
	
	private String mac;
	
	private String pwd;

	private String secretKey;
	
	public BluetoothLock(String company, String sysCode,String mac, String pwd, String secretKey) {
		
		//初始化蓝牙开锁行为
		super(company,sysCode,new BluetoothUnlock());
		
		this.mac = mac;
		this.pwd = pwd;
		this.secretKey = secretKey;
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
