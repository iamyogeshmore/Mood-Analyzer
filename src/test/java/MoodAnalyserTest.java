import org.bridgelabz.MoodAnalyser;
import org.bridgelabz.MoodAnalysisException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
//    @Test
//    public void givenMessage_WhenProper_ShouldReturnSad() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String result = moodAnalyser.analyseMood("I am in Sad mood");
//        Assertions.assertEquals(result, "SAD");
//    }
//
//    @Test
//    public void givenMessage_WhenProper_ShouldReturnHappy() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String result = moodAnalyser.analyseMood("I am in Happy mood");
//        Assertions.assertEquals(result, "HAPPY");
//    }
//}

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyzeMood();
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
        Assertions.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyzeMood();
            Assertions.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() {
        String mood = null;
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            mood = moodAnalyser.analyzeMood();
            Assertions.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmptyMood_ShouldReturnHappy() {
        String mood = null;
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            mood = moodAnalyser.analyzeMood();
            Assertions.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }
}