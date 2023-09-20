//включение противотуманных фар
public class LightsCar {
    private boolean fogLightsIsOn = false; //включены ли фары

    public void fogLights(boolean fogLightsIsOn){
        if (this.fogLightsIsOn == fogLightsIsOn){
            System.out.println("фары"+(fogLightsIsOn ? "включены" : "выключены"));
            return;
        }
    }
}
