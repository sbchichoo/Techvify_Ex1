package Interview;

import Data.Data;
import Language.Language;
import Question.Question;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Interview {
    public static Data d = new Data();
    public static ArrayList<Question> DataQuestion = d.getQuestion();
    public static ArrayList<Question> JavaQuestion = d.getJavaQuestion();
    public static ArrayList<Question> ReactJSQuestion = d.getReactJSQuestion();
    public static ArrayList<Question> juniorJavaQuestionList = new ArrayList<Question>();
    public static ArrayList<Question> seniorJavaQuestionList = new ArrayList<Question>();
    public static ArrayList<Question> juniorReactJSQuestionList = new ArrayList<Question>();
    public static ArrayList<Question> seniorReactJSQuestionList = new ArrayList<Question>();

   public static ArrayList<Question> getJuniorJavaQuestion(){
       for(Question q: JavaQuestion){
           if(q.getLevel().equalsIgnoreCase("Junior")){
               juniorJavaQuestionList.add(q);
           }
       }
       return juniorJavaQuestionList;
   }

    public static ArrayList<Question> getSeniorJavaQuestion(){
        for(Question q: JavaQuestion){
            if(q.getLevel().equalsIgnoreCase("Senior")){
                seniorJavaQuestionList.add(q);
            }
        }
        return seniorJavaQuestionList;
    }

    public static ArrayList<Question> getJuniorReactJSQuestion(){
        for(Question q: ReactJSQuestion){
            if(q.getLevel().equalsIgnoreCase("Junior")){
                juniorReactJSQuestionList.add(q);
            }

        }
        return juniorReactJSQuestionList;
    }

    public static ArrayList<Question> getSeniorReactJSQuestion(){
        for(Question q: ReactJSQuestion){
            if(q.getLevel().equalsIgnoreCase("Senior")){
                seniorReactJSQuestionList.add(q);
            }
        }
        return seniorReactJSQuestionList;
    }
}


