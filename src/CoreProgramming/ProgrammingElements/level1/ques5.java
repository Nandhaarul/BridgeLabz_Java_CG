package CoreProgramming.ProgrammingElements.level1;

class ques5{
    public static void main(String[] args){
        int noPen = 14;
        int noStud = 3;
        int pen = 14/3;
        int stud = noPen%noStud;
        System.out.println("The pen per student is "+pen+" and the remaining pen not distributed is"+stud);
    }
}