package Task2;

public class Client {
    private Chair chair;
    public void sit(){
        System.out.println("Сели на " + chair.getClass());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
