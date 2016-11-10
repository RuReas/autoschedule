package net.usachev.autoschedule.util;

import net.usachev.autoschedule.domain.Departure;
import net.usachev.autoschedule.domain.Transport;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class MockData {

    public static final Transport TRANSPORT01 = new Transport(100004, "Transport01", "model01");
    public static final Transport TRANSPORT02 = new Transport(100005, "Transport02", "model02");


/*  TODO
    public static final List<Departure> DEPARTURES = Arrays.asList(
            new Departure(100006, USER01, TRANSPORT01,
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 9, 10),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 10, 30)),
            new Departure(100007, USER01, TRANSPORT01,
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 12, 30),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 14, 30)),
            new Departure(100008, USER01, TRANSPORT02,
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 15, 20),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 17, 30)),
            new Departure(100009, USER01, TRANSPORT02,
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 9, 40),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 10, 50)),
            new Departure(100010, USER01, TRANSPORT02,
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 15, 15),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 16, 0)),
            new Departure(100011, USER02, TRANSPORT01,
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 10, 40),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 11, 50)),
            new Departure(100012, USER02, TRANSPORT01,
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 15, 25),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 17, 25)),
            new Departure(100013, USER02, TRANSPORT01,
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 9, 5),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 10, 10)),
            new Departure(100014, USER02, TRANSPORT02,
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 8, 45),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 11, 45)),
            new Departure(100015, USER02, TRANSPORT02,
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 11, 35),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 12, 45))
    );*/

    public static final List<Departure> DEPARTURES = Arrays.asList(
            new Departure("departure01",
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 9, 10),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 10, 30)),
            new Departure("departure02",
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 12, 30),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 14, 30)),
            new Departure("departure03",
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 15, 20),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 17, 30)),
            new Departure("departure04",
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 9, 40),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 10, 50)),
            new Departure("departure05",
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 15, 15),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 16, 0)),
            new Departure("departure06",
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 10, 40),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 11, 50)),
            new Departure("departure07",
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 15, 25),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 17, 25)),
            new Departure("departure08",
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 9, 5),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 10, 10)),
            new Departure("departure09",
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 8, 45),
                    LocalDateTime.of(2016, Month.NOVEMBER, 1, 11, 45)),
            new Departure("departure10",
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 11, 35),
                    LocalDateTime.of(2016, Month.NOVEMBER, 2, 12, 45))
    );
}
