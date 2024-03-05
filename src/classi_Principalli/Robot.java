package src;

public class Robot{
    int difficoltaRobot;
    
    public Robot(int difficoltaRobot){
        this.difficoltaRobot = difficoltaRobot;
    }

    @Override
    public String toString(){
        return " Difficolta': " + difficoltaRobot;
    }
}
