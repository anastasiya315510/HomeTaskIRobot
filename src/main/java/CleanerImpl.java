public class CleanerImpl implements Cleaner {
    @Override
    public String clean(String message) {
        System.out.println(message);
        return message;
    }
}
