package Data;

import Language.Language;
import Question.Question;

import java.util.ArrayList;


public class Data {

    public static Language java = new Language("Java", "jav");
    public static Language reactJS = new Language("ReactJS", "rjs");
    public static ArrayList<Question> questionList = new ArrayList<Question>();
    public static ArrayList<Question> javaQuestionList = new ArrayList<Question>();
    public static ArrayList<Question> reactJSQuestionList = new ArrayList<Question>();

    public static ArrayList<Question> getQuestion() {
        questionList.add(new Question("01", "CAU HOI JUNIOR JAVA 1", "Junior", java));
        questionList.add(new Question("02", "CAU HOI JUNIOR JAVA 2", "Junior", java));
        questionList.add(new Question("03", "CAU HOI JUNIOR JAVA 3", "Junior", java));
        questionList.add(new Question("04", "CAU HOI JUNIOR JAVA 4", "Junior", java));
        questionList.add(new Question("05", "CAU HOI JUNIOR JAVA 5", "Junior", java));
        questionList.add(new Question("06", "CAU HOI JUNIOR JAVA 6", "Junior", java));
        questionList.add(new Question("07", "CAU HOI JUNIOR JAVA 7", "Junior", java));
        questionList.add(new Question("08", "CAU HOI JUNIOR JAVA 8", "Junior", java));
        questionList.add(new Question("09", "CAU HOI JUNIOR JAVA 9", "Junior", java));
        questionList.add(new Question("10", "CAU HOI JUNIOR JAVA 10", "Junior", java));
        questionList.add(new Question("11", "CAU HOI SENIOR JAVA 1", "Senior", java));
        questionList.add(new Question("12", "CAU HOI SENIOR JAVA 2", "Senior", java));
        questionList.add(new Question("13", "CAU HOI SENIOR JAVA 3", "Senior", java));
        questionList.add(new Question("14", "CAU HOI SENIOR JAVA 4", "Senior", java));
        questionList.add(new Question("15", "CAU HOI SENIOR JAVA 5", "Senior", java));
        questionList.add(new Question("16", "CAU HOI SENIOR JAVA 6", "Senior", java));
        questionList.add(new Question("17", "CAU HOI SENIOR JAVA 7", "Senior", java));
        questionList.add(new Question("18", "CAU HOI SENIOR JAVA 8", "Senior", java));

        questionList.add(new Question("19", "CAU HOI JUNIOR REACTJS 1", "Junior", reactJS));
        questionList.add(new Question("20", "CAU HOI JUNIOR REACTJS 2", "Junior", reactJS));
        questionList.add(new Question("21", "CAU HOI JUNIOR REACTJS 3", "Junior", reactJS));
        questionList.add(new Question("22", "CAU HOI JUNIOR REACTJS 4", "Junior", reactJS));
        questionList.add(new Question("23", "CAU HOI JUNIOR REACTJS 5", "Junior", reactJS));
        questionList.add(new Question("24", "CAU HOI JUNIOR REACTJS 6", "Junior", reactJS));
        questionList.add(new Question("25", "CAU HOI JUNIOR REACTJS 7", "Junior", reactJS));
        questionList.add(new Question("26", "CAU HOI JUNIOR REACTJS 8", "Junior", reactJS));
        questionList.add(new Question("27", "CAU HOI JUNIOR REACTJS 9", "Junior", reactJS));
        questionList.add(new Question("28", "CAU HOI SENIOR REACTJS 1", "Senior", reactJS));
        questionList.add(new Question("29", "CAU HOI SENIOR REACTJS 2", "Senior", reactJS));
        questionList.add(new Question("30", "CAU HOI SENIOR REACTJS 3", "Senior", reactJS));
        questionList.add(new Question("31", "CAU HOI SENIOR REACTJS 4", "Senior", reactJS));
        questionList.add(new Question("32", "CAU HOI SENIOR REACTJS 5", "Senior", reactJS));
        questionList.add(new Question("33", "CAU HOI SENIOR REACTJS 6", "Senior", reactJS));
        questionList.add(new Question("34", "CAU HOI SENIOR REACTJS 7", "Senior", reactJS));
        return questionList;
    }
    public static ArrayList<Question> getJavaQuestion(){
        for(Question q : questionList){
            if(q.getLanguague().equals(java)){
                javaQuestionList.add(q);
            }
        }
        return javaQuestionList;
    }

    public static ArrayList<Question> getReactJSQuestion(){
        for(Question q : questionList){
            if(q.getLanguague().equals(reactJS)){
                reactJSQuestionList.add(q);
            }
        }
        return reactJSQuestionList;
    }
}
