package org.bridgelabz;

import java.io.Serial;

public class MoodAnalysisException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public MoodAnalysisException(String msg) {
        super(msg);
    }
}