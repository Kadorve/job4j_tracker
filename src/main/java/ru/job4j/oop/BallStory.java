package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        WolfBall wolfBall = new WolfBall();
        Fox lisa = new Fox();
        hare.tryEat(ball);
        ball.run(hare);
        wolfBall.tryEat(ball);
        ball.run(wolfBall);
        lisa.tryEat(ball);
        ball.eaten(lisa);
    }
}
