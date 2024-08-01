package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        plusVolume(data);

        plusVolume(data);

        minusVolume(data);

        statusVolume(data);

        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void plusVolume(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 :" + data.volume);
    }

    static void minusVolume(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 :" + data.volume);
    }

    static void statusVolume(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨 :" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
