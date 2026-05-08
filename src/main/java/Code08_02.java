class Rabbit1{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

        System.out.println("난 수정된 코드! 상속받은 자식 클레스는 모두 변경");
    }
}

class HouseRabbit extends Rabbit1{
    String owner;
    void eatFeed(){
        System.out.println("집 토끼가 사료를 먹습니다.");
    }
}

class MountainRabbit extends Rabbit1{
    String mountain;
    void eatWildglass(){
        System.out.println("산 토끼가 풀을 먹습니다.");
    }
}

public class Code08_02 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.shape = "삼각형";
        hRabbit.owner = "난쟁이";
        hRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "네모";
        mRabbit.mountain = "설악산";
        mRabbit.move(200, 200);
        mRabbit.eatWildglass();
    }
}
