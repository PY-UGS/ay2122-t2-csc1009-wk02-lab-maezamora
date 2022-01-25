public class Qn3 {
    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours%24;
        long utcConvert = currentHour + 8; //convert utc to gmt local time

        System.out.println("Current time is "+utcConvert+":"+currentMinutes+":"+currentSeconds+" GMT");
    }
}
