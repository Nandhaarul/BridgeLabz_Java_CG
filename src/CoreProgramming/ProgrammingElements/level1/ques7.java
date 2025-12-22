package CoreProgramming.ProgrammingElements.level1;

class ques7{
    public static void main(String[] args){
        float km = 6378f;
        float miles = km / 1.6f;
        float volumekm = (4f/3f)*3.14f*km*km*km;
        float volumeMiles = (4f/3f)*3.14f*miles*miles*miles;
        System.out.println("The total miles is "+volumeMiles+" for the given "+km+"km");
    }
}