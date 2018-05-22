package vc.thinker.ppt3.method;

import vc.thinker.ppt3.Lock;

/**
 * gprs + 蓝牙开锁行为
 * @author james
 *
 */
public class GPRSBluetoothUnlock implements UnlockMethod{
	
	private GPRSUnlock gprsUnlock=new GPRSUnlock();
	
	private BluetoothUnlock bluetoothUnlock=new BluetoothUnlock();


	@Override
	public void unlock(Lock lock) {
		// TODO Auto-generated method stub
		gprsUnlock.unlock(lock);
		
		bluetoothUnlock.unlock(lock);
	}

}
