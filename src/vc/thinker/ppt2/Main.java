package vc.thinker.ppt2;

public class Main {

	public static void main(String[] args) {
		/**
		 * 面向超类编程
		 */
		System.out.println("=================GPRS开锁测试====================");
		Lock gprsLock=new GPRSLock();
		gprsLock.setCompany("欧米");
		gprsLock.setSysCode("000111");
		gprsLock.unlock();
		
		System.out.println("\r\n=================蓝牙开锁测试====================");
		Lock bluetoothLock=new 
				BluetoothLock("小E","000112","01:01","123456","01:01");
		bluetoothLock.unlock();
		
		System.out.println("\r\n==============GPRS+蓝牙开锁测试================");
		Lock gprsBluetoothLock=new 
				GPRSBluetoothLock("小E","000113","01:01","123456","01:01");
		gprsBluetoothLock.unlock();
	}
}
