package pixel.academy.setter_injection_app.common;

public class MexicanChef implements Chef{

    public MexicanChef() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe() {
        return "Prepare tacos al pastor con pina";
    }
}
