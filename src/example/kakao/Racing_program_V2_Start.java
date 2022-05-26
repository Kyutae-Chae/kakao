package example.kakao;

import java.util.Scanner;

public class Racing_program_V2_Start {
    public static void main(String[] args) {
        Racing racing = new Racing_MyCar("춘식이");
        /**
         * * 시작 -> 기본 가속 -> 부스터 -> 회전 -> 후진
         */
        racing.start();
        racing.accelerate();
        racing.accelerate_booster(2);
        racing.drift();
        racing.decelerateAs();



        Racing_program_V2 racing_program_v2 = new Racing_program_V2("(캐쉬충전)춘식이");
        racing_program_v2.start();
        racing_program_v2.accelerate();
        racing_program_v2.accelerate_booster(2);
        racing_program_v2.drift();
        racing_program_v2.decelerateAs();

    }
}
