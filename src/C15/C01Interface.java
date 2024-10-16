package C15;

interface Remocon {
	int MAXVOL = 100;
	int MINVOL = 0;
	void on();
	void off();
	void setVol(int vol);
}

class Tv implements Remocon {
	int vol;
	@Override
	public void on() {
		System.out.println("TV를 켭니다");
	}
	@Override
	public void off() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVol(int vol) {	//볼륨설정
		if(MAXVOL<=vol) {
			this.vol=MAXVOL;	//볼륨이 100이상이면 100으로 고정
		}
		else if(MINVOL>=vol)	// 볼륨이 0이하면 0으로 고정
			this.vol=MINVOL;
		else
			this.vol=vol;
		System.out.println("TV 볼륨 :" +this.vol);
	}
}

interface Browser{
	void SearchURL(String url);
}

class SmartTv extends Tv implements Browser{
	@Override
	public void SearchURL(String url) {
		System.out.println(url + " 로 이동합니다.");
	}

}

class Radio implements Remocon {
	int vol;

	@Override
	public void on() {
		System.out.println("RADIO를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("RADIO를 끕니다");
	}
	@Override
	public void setVol(int vol) {	//볼륨설정
		if(MAXVOL<=vol) {
			this.vol=MAXVOL;	//볼륨이 100이상이면 100으로 고정
		}
		else if(MINVOL>=vol)	// 볼륨이 0이하면 0으로 고정
			this.vol=MINVOL;
		else
			this.vol=vol;
		System.out.println("RADIO 볼륨 :" +this.vol);
	}
}

public class C01Interface {

	public static void TurnOn(Remocon controller) {
		controller.on();
	}

	public static void TurnOff(Remocon controller) {
		controller.off();
	}
	public static void setVolume(Remocon controller,int vol) {
		controller.setVol(vol);
	}
	public static void SearchWeb(Browser browser,String url) {
		browser.SearchURL(url);
	}

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();//tv를 상속받고 browser를 구현한 smarttv 객체
		Tv tv= new Tv();
		Radio radio = new Radio();
		TurnOn(tv);
		TurnOn(radio);
		TurnOn(smartTv);

		setVolume(tv, 50);
		setVolume(radio, 150);

		TurnOff(tv);
		TurnOff(radio);

		SearchWeb(smartTv,"www.naver.com");
	}
}
