package Main;

import Data.Data;

import Interview.Interview;
import Question.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the applicant's language");
        String language = sc.nextLine();

        int juniorQuestionJavaSize = Interview.getJuniorJavaQuestion().size();                 // juniorQuestionJavaSize    = 10
        int seniorQuestionJavaSize = Interview.getSeniorJavaQuestion().size();                 // seniorQuestionJavaSize    = 8
        int juniorQuestionReactJSSize = Interview.getJuniorReactJSQuestion().size();           // juniorQuestionReactJSSize = 9
        int seniorQuestionReactJSSize = Interview.getSeniorReactJSQuestion().size();           // seniorQuestionReactJSSize = 7

        ArrayList<Integer> juniorQuestionJavaList = new ArrayList<Integer>();
        ArrayList<Integer> seniorQuestionJavaList = new ArrayList<Integer>();
        ArrayList<Integer> juniorQuestionReactJSList = new ArrayList<Integer>();
        ArrayList<Integer> seniorQuestionReactJSList = new ArrayList<Integer>();

        if (language.equalsIgnoreCase("Java")) {
            System.out.println("What is the applicant's level\n1. Junior\n2. Mid Senior\n3. Senior");
            int option = sc.nextInt();
            switch (option) {
                case 1:

                    while (juniorQuestionJavaList.size() < 4) {
                        Integer index = (int) Math.floor(Math.random() * juniorQuestionJavaSize) + 1;
                        if (!juniorQuestionJavaList.contains(index)) {
                            juniorQuestionJavaList.add(index);
                        }
                    }
                    for (int a : juniorQuestionJavaList) {
                        System.out.println(Interview.getJuniorJavaQuestion().get(a).getName());
                    }

                    while (seniorQuestionJavaList.size() < 1) {
                        Integer index = (int) Math.floor(Math.random() * seniorQuestionJavaSize) + 1;
                        if (!seniorQuestionJavaList.contains(index)) {
                            seniorQuestionJavaList.add(index);
                        }
                    }
                    for (int a : seniorQuestionJavaList) {
                        System.out.println(Interview.getSeniorJavaQuestion().get(a).getName());
                    }
                    break;

                case 2:

                    while (juniorQuestionJavaList.size() < 2) {
                        Integer index = (int) Math.floor(Math.random() * juniorQuestionJavaSize) + 1;
                        if (!juniorQuestionJavaList.contains(index)) {
                            juniorQuestionJavaList.add(index);
                        }
                    }
                    for (int a : juniorQuestionJavaList) {
                        System.out.println(Interview.getJuniorJavaQuestion().get(a).getName());
                    }

                    while (seniorQuestionJavaList.size() < 3) {
                        Integer index = (int) Math.floor(Math.random() * seniorQuestionJavaSize) + 1;
                        if (!seniorQuestionJavaList.contains(index)) {
                            seniorQuestionJavaList.add(index);
                        }
                    }
                    for (int a : seniorQuestionJavaList) {
                        System.out.println(Interview.getSeniorJavaQuestion().get(a).getName());
                    }

                    break;

                case 3:


                    while (seniorQuestionJavaList.size() < 5) {
                        Integer index = (int) Math.floor(Math.random() * seniorQuestionJavaSize) + 1;
                        if (!seniorQuestionJavaList.contains(index)) {
                            seniorQuestionJavaList.add(index);
                        }
                    }
                    for (int a : seniorQuestionJavaList) {
                        System.out.println(Interview.getSeniorJavaQuestion().get(a).getName());
                    }

                    break;
            }
        }


        if (language.equalsIgnoreCase("ReactJS")) {
            System.out.println("What is the applicant's level\n1. Junior\n2. Mid Senior\n3. Senior");
            int option = sc.nextInt();
            switch (option) {
                case 1:

                    while (juniorQuestionReactJSList.size() < 4) {
                        Integer index = (int) Math.floor(Math.random() * juniorQuestionReactJSSize) + 1;
                        if (!juniorQuestionReactJSList.contains(index)) {
                            juniorQuestionReactJSList.add(index);
                        }
                    }
                    for (int a : juniorQuestionReactJSList) {
                        System.out.println(Interview.getJuniorReactJSQuestion().get(a).getName());
                    }

                    while (seniorQuestionReactJSList.size() < 1) {
                        Integer index = (int) Math.floor(Math.random() * seniorQuestionReactJSSize) + 1;
                        if (!seniorQuestionReactJSList.contains(index)) {
                            seniorQuestionReactJSList.add(index);
                        }
                    }
                    for (int a : seniorQuestionReactJSList) {
                        System.out.println(Interview.getSeniorJavaQuestion().get(a).getName());
                    }
                    break;


                case 2:

                    while (juniorQuestionReactJSList.size() < 2) {
                        Integer index = (int) Math.floor(Math.random() * juniorQuestionReactJSSize) + 1;
                        if (!juniorQuestionReactJSList.contains(index)) {
                            juniorQuestionReactJSList.add(index);
                        }
                    }
                    for (int a : juniorQuestionReactJSList) {
                        System.out.println(Interview.getSeniorJavaQuestion().get(a).getName());
                    }

                    while (seniorQuestionReactJSList.size() < 3) {
                        Integer index = (int) Math.floor(Math.random() * juniorQuestionReactJSSize) + 1;
                        if (!seniorQuestionReactJSList.contains(index)) {
                            seniorQuestionReactJSList.add(index);
                        }
                    }
                    for (int a : seniorQuestionReactJSList) {
                        System.out.println(Interview.getSeniorJavaQuestion().get(a).getName());
                    }

                    break;

                case 3:

                    while (seniorQuestionReactJSList.size() < 5) {
                        Integer index = (int) Math.floor(Math.random() * seniorQuestionReactJSSize) + 1;
                        if (!seniorQuestionReactJSList.contains(index)) {
                            seniorQuestionReactJSList.add(index);
                        }
                    }
                    for (int a : seniorQuestionReactJSList) {
                        System.out.println(Interview.getSeniorJavaQuestion().get(a).getName());
                    }

                    break;

            }
        }
    }
}
