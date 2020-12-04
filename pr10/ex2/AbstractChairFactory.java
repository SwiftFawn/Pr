package ex2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicianChair();
    FunctionalChair createFunctionalChair();
}