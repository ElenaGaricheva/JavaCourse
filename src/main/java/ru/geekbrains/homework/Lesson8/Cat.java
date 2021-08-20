package ru.geekbrains.homework.Lesson8;

public class Cat implements Movable {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean jump(int wallHeight) {
        return maxJumpHeight >= wallHeight;
    }

    @Override
    public boolean run(int trackLength) {
        return maxRunDistance >= trackLength;
    }
}