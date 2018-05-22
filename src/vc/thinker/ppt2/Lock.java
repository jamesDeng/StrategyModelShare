package vc.thinker.ppt2;

/**
 * 超类
 * @author james
 *
 */
public abstract class Lock {
	
	public Lock() {
	}
	
	public Lock(String company, String sysCode) {
		super();
		this.company = company;
		this.sysCode = sysCode;
	}

	/**
	 * 公司
	 */
	private String company;
	
	/**
	 * 系统编码
	 */
	private String sysCode;
	
	/**
	 * 开锁
	 */
	public abstract void unlock();
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}
}
