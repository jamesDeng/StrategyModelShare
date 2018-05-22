package vc.thinker.ppt1;

public class Lock {
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
	public void unlock(){
		System.out.println(company+sysCode+"锁打开");
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
