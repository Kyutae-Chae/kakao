package example.kakao;

import java.util.Scanner;

public class Racing_program_V2 implements Racing {
    private static final int DEFAULT_SPEED = 10;
    private static int DISTANCE = 0;
    private static int CONTROL_COUNT = 0;
    private static String CAR_NAME;
    private static Scanner sc = new Scanner(System.in);

    Racing_program_V2(String name) {
        CAR_NAME = name;

    }
    @Override
    public void start() {
        System.out.printf("[안내] %s님. 차량 업그레이드를 진행하였습니다.\n", CAR_NAME);
    }

    @Override
    public void accelerate() {
        CONTROL_COUNT++;
        DISTANCE += DEFAULT_SPEED * 2;
        System.out.println("[Lv2 가속]------------------------------");
        System.out.printf("| * 컨트롤 횟수 : %d\n", CONTROL_COUNT);
        System.out.printf("| * 주행 거리 : %dkm/h\n", DISTANCE);
        System.out.println("------------------------------------");
    }

    @Override
    public void accelerate_booster(int speed_lv) {
        CONTROL_COUNT++;
        DISTANCE += (DEFAULT_SPEED * 2 * (speed_lv+1));
        System.out.printf("[Lv2 부스터 가속 %d 단계 ]-------------------\n", speed_lv);
        System.out.printf("| * 컨트롤 횟수 : %d\n", CONTROL_COUNT);
        System.out.printf("| * 부스트 주행 거리 : %dkm/h\n", DISTANCE);
        System.out.println("------------------------------------");
    }

    @Override
    public void drift() {
        CONTROL_COUNT++;
        DISTANCE += DEFAULT_SPEED / 2;
        System.out.println("[방향 회전]-------------------------");
        System.out.printf("| * 회전 방향 입력 [<] [>] : ");
        String direction = sc.next();
        if (direction.equals("<")) {
            System.out.println("| * [왼쪽] 으로 회전합니다.");
        } else if (direction.equals(">")) {
            System.out.println("| * [오른쪽] 으로 회전합니다.");
        } else {
            System.out.println("잘못된 입력.");
        }
        System.out.printf("| * 컨트롤 횟수 : %d\n", CONTROL_COUNT);
        System.out.printf("| * 드리프트 주행 거리 : %dkm/h\n", DISTANCE);
        System.out.println("------------------------------------");
    }

    @Override
    public void decelerateAs() {
        CONTROL_COUNT++;
        DISTANCE -= DEFAULT_SPEED / 2;
        System.out.println("[후진]-------------------------------");
        System.out.printf("| * 컨트롤 횟수 : %d\n", CONTROL_COUNT);
        System.out.printf("| * 후진 주행 거리 : %dkm/h\n", DISTANCE);
        System.out.println("------------------------------------");
    }
}
