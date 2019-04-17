package com.ussuon.secemeozgur.rest;

import lombok.Data;

/**
 * @Description
 * @auther yefan
 * @create 2019-04-14 18:21
 *  System.out.println("Fajr: " + formatter.format(prayerTimes.fajr));
 *         System.out.println("Sunrise: " + formatter.format(prayerTimes.sunrise));
 *         System.out.println("Dhuhr: " + formatter.format(prayerTimes.dhuhr));
 *         System.out.println("Asr: " + formatter.format(prayerTimes.asr));
 *         System.out.println("Maghrib: " + formatter.format(prayerTimes.maghrib));
 *         System.out.println("Isha: " + formatter.format(prayerTimes.isha));
 */

@Data
public class PrayerTimeRes {
    private String Fajr;
    private String Sunrise;
    private String Dhuhr;
    private String Asr;
    private String Maghrib;
    private String Isha;


    @Override
    public String toString() {
        return "PrayerTimeRes{" +
                "Fajr='" + Fajr + '\'' +
                ", Sunrise='" + Sunrise + '\'' +
                ", Dhuhr='" + Dhuhr + '\'' +
                ", Asr='" + Asr + '\'' +
                ", Maghrib='" + Maghrib + '\'' +
                ", Isha='" + Isha + '\'' +
                '}';
    }
}
