package Question;

import Language.Language;

import java.util.ArrayList;

public class Question {
    String code;
    String name;
    String level;
    Language languague;

    public Question(String code, String name, String level, Language languague) {
        this.code = code;
        this.name = name;
        this.level = level;
        this.languague = languague;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Language getLanguague() {
        return languague;
    }

    public void setLanguague(Language languague) {
        this.languague = languague;
    }

}
