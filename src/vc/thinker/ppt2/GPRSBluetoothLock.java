package vc.thinker.ppt2;

public  class GPRSBluetoothLock extends BluetoothLock{

	
	public GPRSBluetoothLock(String company, String sysCode, String mac, String pwd, String secretKey) {
		super(company, sysCode, mac, pwd, secretKey);
	}

	@Override
	public void unlock() {
		/**
		 * 先gprs开锁
		 */
		System.out.println(getCompany()+getSysCode()+"GPRS开锁");
		
		/**
		 * 再蓝牙开锁
		 */
		String out=String.format("%s%s蓝牙开锁，搜索MAC为%s,pwd:%ssecretKey:%s", getCompany(),getSysCode(),
				getMac(),getPwd(),getSecretKey());
		System.out.println(out);
	}
	
}
