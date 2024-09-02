package BusRes;

public class Bus {
private int busNo;
private boolean ac;
private int capacity;

Bus(int no,boolean ac,int cap){
	this.busNo=no;
	this.ac=ac;
	this.capacity=cap;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int cap) {
	capacity=cap;
}
public boolean getAc() {
	return ac;
}
public void setAc(boolean ac) {
	ac=ac;
}
public int getbusNo() {
	return busNo;
}
public void setbusNo(int no) {
	busNo=no;
}
public void display() {
	System.out.println("Bus no : " +busNo+" AC : "+ac+" Capacity : "+capacity);
	}
}