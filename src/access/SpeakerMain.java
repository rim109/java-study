package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근 가능 ? public 모두 접근이 가능하므로!
        System.out.println("필드 직접 접근");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
