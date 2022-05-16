package ch8;

public class Audio implements RemoteControl {
	// 필드
	private int volume;
	private boolean mute;
	
	// turnOn() 추상 메서드의 실체 메서드
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	
	// turnOff() 추상 메서드의 실체메서드
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	// setVolume() 추상 메서드의 실체 메서드
	public void setVolume(int volume) { 
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : "+this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리 합니다.");
		} else {
			System.out.println("Audio 무음 해제 합니다.");
		}
	}
}
