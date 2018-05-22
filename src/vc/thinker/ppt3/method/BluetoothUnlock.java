package vc.thinker.ppt3.method;

import vc.thinker.ppt3.BluetoothLock;
import vc.thinker.ppt3.Lock;

public class BluetoothUnlock implements UnlockMethod{

	@Override
	public void unlock(Lock lock) {
		// TODO Auto-generated method stub
		BluetoothLock bluetoothLock=(BluetoothLock)lock;
		
		String out=String.format("%s%s蓝牙开锁，搜索MAC为%s,pwd:%ssecretKey:%s", 
				bluetoothLock.getCompany(),bluetoothLock.getSysCode(),
				bluetoothLock.getMac(),bluetoothLock.getPwd(),bluetoothLock.getSecretKey());
		
		System.out.println(out);
	}

}
