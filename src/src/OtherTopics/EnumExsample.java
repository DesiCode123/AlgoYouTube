package OtherTopics;
//"Using Enum and Switch to Handle Days of the Week in Java"
public class EnumExsample {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        switch (today){
            case MONDAY -> {
                System.out.println(Day.FRIDAY);
                break;
            }
            case TUESDAY -> {
                System.out.println(Day.TUESDAY);
                break;
            }
            case WEDNESDAY -> {
                System.out.println(Day.WEDNESDAY);
                break;
            }
            case THURSDAY -> {
                System.out.println(Day.THURSDAY);
                break;
            }
            case FRIDAY -> {
                System.out.println(Day.FRIDAY);
                break;
            }
            case SATURDAY -> {
                System.out.println(Day.SATURDAY);
                break;
            }
            case SUNDAY -> {
                System.out.println(Day.SUNDAY);
                break;
            }
        }

        }
        public enum Day{
            SUNDAY,
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY
        }

}
