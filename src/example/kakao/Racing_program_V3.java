package example.kakao;

public class Racing_program_V3 {
    public static void main(String[] args) {
        Racing[] cars = {
                new Racing_MyCar("춘식이"),
                new Racing_program_V2("(캐쉬충전)춘식이")
        };
        /**
         * * 시작 -> 기본 가속 -> 부스터 -> 회전 -> 후진
         */
        for (Racing c : cars) {
            c.start();
            c.accelerate();
            c.accelerate_booster(2);
            c.drift();
            c.decelerateAs();
        }
    }
}
