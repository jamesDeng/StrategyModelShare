package vc.thinker.ppt3;

import vc.thinker.ppt3.method.UnlockMethod;

public class Lock {

	/**
	 * 公司
	 */
	private String company;
	
	/**
	 * 系统编码
	 */
	private String sysCode;
	
	//开锁方式
	private UnlockMethod unlockMethod;
	
	public Lock(UnlockMethod unlockMethod) {
		super();
		this.unlockMethod = unlockMethod;
	}
	
	public Lock(String company, String sysCode,UnlockMethod unlockMethod) {
		super();
		this.company = company;
		this.sysCode = sysCode;
		this.unlockMethod=unlockMethod;
	}
	

	/**
	 * 开锁
	 */
	public void unlock(){
		unlockMethod.unlock(this);
	}

	/**
	 * 动态改变开锁行为
	 * @param unlockMethod
	 */
	public void setUnlockMethod(UnlockMethod unlockMethod) {
		this.unlockMethod = unlockMethod;
	}
	

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
