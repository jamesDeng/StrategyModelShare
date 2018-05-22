package vc.thinker.ppt2;

public  class GPRSLock extends Lock{

	@Override
	public void unlock() {
		System.out.println(getCompany()+getSysCode()+"GPRS开锁");
	}
	
}
