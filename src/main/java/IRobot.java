import java.rmi.dgc.DGC;

public class IRobot {
    private Cleaner cleaner = new CleanerImpl();
    private Speaker speaker = new SpeakerImpl();

    void cleanRoom(){
        
        speaker.speak("I am starting");
        cleaner.clean("I am cleaning");
        speaker.speak("Cleaning done");
        
    }
}

