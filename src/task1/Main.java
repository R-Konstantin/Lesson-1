package task1;

public class Main {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h / 12;
        int week = d / 7;
        System.out.println( "In " + s + " seconds: \n" +
                min + " minutes " + sec + " seconds \n" +
                h + " hour " + min + " minutes " + sec + " seconds \n" +
                d + " days \n" + week + " weeks");
    }
}
