package vc.thinker.ppt3;

import vc.thinker.ppt3.method.GPRSBluetoothUnlock;

public class Main {

	public static void main(String[] args) {

		System.out.println("=================GPRS开锁测试====================");
		Lock gprsLock=new GPRSLock();
		gprsLock.setCompany("欧米");
		gprsLock.setSysCode("000111");
		gprsLock.unlock();
		
		System.out.println("\r\n=================蓝牙开锁测试====================");
		Lock bluetoothLock=new BluetoothLock("小E","000112","01:01","123456","01:01");
		bluetoothLock.unlock();
		
		/**
		 * 动态变更蓝牙锁的开锁方式为 GPRS+蓝牙
		 */
		System.out.println("\r\n=================更加蓝牙锁为GPRS+蓝牙开锁测试====================");
		bluetoothLock.setUnlockMethod(new GPRSBluetoothUnlock());
		bluetoothLock.unlock();
		
		
		Lock lock=new Lock(new GPRSBluetoothUnlock());
		
	}
}
