package vc.thinker.ppt3;

import vc.thinker.ppt3.method.GPRSUnlock;

public  class GPRSLock extends Lock{

	public GPRSLock() {
		//初始化为GPRS开锁行为
		super(new GPRSUnlock());
	}
}
