import org.bridgelabz.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Sad mood");
        Assertions.assertEquals(result, "SAD");
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Happy mood");
        Assertions.assertEquals(result, "HAPPY");
    }
}