package p290;
//상속을 받은 것
public class DmbCellPhone extends CellPhone {

	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;

	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다." );
	}
	void changeChannelDmb(int channel) {
		this.channel = channel; //this.channel은 전역변수 channel은 지역변수 
		System.out.println("채널 " + this.channel + "번으로 바뀝니다."); //그래서 여기에도 this.channel을 써줘야 함 
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
