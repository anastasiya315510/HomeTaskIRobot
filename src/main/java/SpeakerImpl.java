public class SpeakerImpl implements Speaker {
    @Override
    public String speak(String message) {
        System.out.println(message);
        return message;
    }
}
