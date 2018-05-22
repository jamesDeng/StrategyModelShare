package vc.thinker.ppt3.method;

import vc.thinker.ppt3.Lock;

/**
 * gprs 开锁行为
 * @author james
 *
 */
public class GPRSUnlock implements UnlockMethod{

	@Override
	public void unlock(Lock lock) {
		// TODO Auto-generated method stub
		System.out.println(lock.getCompany()+lock.getSysCode()+"GPRS开锁");
	}

}
