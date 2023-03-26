//Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м. Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.

import java.time.*;


public class Avia {

    public static void main(String[] args) {
        LocalTime departureTime = LocalTime.of(15, 5);
        LocalDate departureDate = LocalDate.of(2022, 7, 7);
        ZoneId zoneDeparture = ZoneId.of("America/Los_Angeles");

        System.out.println("Departure time: " + departureTime);
        Duration flightLengthTime = Duration.ofHours(10).plusMinutes(50) ;
        System.out.println("Flight length time: " + flightLengthTime);

        ZoneId zoneArrival = ZoneId.of("Europe/Berlin");

        ZonedDateTime arrivalTime = arrivalTimeCounter(departureDate,departureTime, zoneDeparture, zoneArrival, flightLengthTime);
        System.out.println("Arrival time: " + arrivalTime);
    }


   public static ZonedDateTime arrivalTimeCounter(LocalDate departureDate, LocalTime departureTime, ZoneId zoneDeparture, ZoneId zoneArrival,Duration flightLengthTime){

       ZonedDateTime departurePlaceTimeStart = ZonedDateTime.of(departureDate, departureTime, zoneDeparture);

       ZonedDateTime arrivalPlaceTimeStart = departurePlaceTimeStart.withZoneSameInstant(zoneArrival);

       return arrivalPlaceTimeStart.plus(flightLengthTime);
   }
}