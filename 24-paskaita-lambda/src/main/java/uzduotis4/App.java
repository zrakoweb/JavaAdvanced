package uzduotis4;

public class App {

    public static void main(String[] args) {
        InjectableTranslator injectableTranslator = new InjectableTranslator();
        SpeechEngine speechEngine = new SpeechEngine(injectableTranslator);
        System.out.println(speechEngine.speak("hello"));
    }

}
