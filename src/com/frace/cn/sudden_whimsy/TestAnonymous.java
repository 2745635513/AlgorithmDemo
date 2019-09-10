package com.frace.cn.sudden_whimsy;

public class TestAnonymous {
    public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String[] args) {
        TestAnonymous test = new TestAnonymous();
        test.test(new Bird() {
            public int fly() {
                return 10000;
            }

            public String getName() {
                return "大雁";
            }
        });
    }
}
