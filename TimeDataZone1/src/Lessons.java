//Составить список времен начала всех занятий по Java на февраль, если предположить, что они проходят каждый понедельник/среду c 9:30 CET.

import java.time.*;

public class Lessons {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 2, 1);

        LocalTime lessonStartTime = LocalTime.of(9, 30);
        LocalTime lessonEndTime = LocalTime.of(12, 45);
        ZoneId zone = ZoneId.of("Europe/Berlin");

        // цикл выдаёт не те дни, пока не придумала ничего лучше
        for (LocalDate d = date; d.getMonth() == date.getMonth(); d = d.plusDays( 1)) {
            if ((DayOfWeek.MONDAY == d.getDayOfWeek()) || (DayOfWeek.WEDNESDAY == d.getDayOfWeek())) {
                System.out.print(d +" ");
                System.out.print("Lesson starts in: " + lessonStartTime + " ");
                System.out.print("Lesson ends in: " + lessonEndTime + " ");
                System.out.println();
            }
        }
    }
}



//    OffsetDateTime date1 = Year.now()
//            .atMonth(Month.FEBRUARY).atDay(15)
//            .atTime(0, 0).atOffset(ZoneOffset.of("+03:00"));



