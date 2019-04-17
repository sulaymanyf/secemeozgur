package com.ussuon.secemeozgur.api;

import com.ussuon.secemeozgur.adhan.CalculationMethod;
import com.ussuon.secemeozgur.adhan.CalculationParameters;
import com.ussuon.secemeozgur.adhan.Coordinates;
import com.ussuon.secemeozgur.adhan.PrayerTimes;
import com.ussuon.secemeozgur.data.DateComponents;
import com.ussuon.secemeozgur.entity.Result;
import com.ussuon.secemeozgur.entity.StatusCode;
import com.ussuon.secemeozgur.rest.PrayerTimeRes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Description
 * @auther yefan
 * @create 2019-04-14 18:15
 */
@RestController
@RequestMapping("/prayer")
public class PrayerTimesController {





    @RequestMapping(value = "/getPrayerTime" , method = RequestMethod.GET)
    public Result prayerTime() {
        final Coordinates coordinates = new Coordinates(24.48, 118.08);
        final DateComponents dateComponents = DateComponents.from(new Date());
        final CalculationParameters parameters =
                CalculationMethod.MUSLIM_WORLD_LEAGUE.getParameters();

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss a");
//        formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));

        PrayerTimes prayerTimes = new PrayerTimes(coordinates, dateComponents, parameters);
//        System.out.println("Fajr: " + formatter.format(prayerTimes.fajr));
//        System.out.println("Sunrise: " + formatter.format(prayerTimes.sunrise));
//        System.out.println("Dhuhr: " + formatter.format(prayerTimes.dhuhr));
//        System.out.println("Asr: " + formatter.format(prayerTimes.asr));
//        System.out.println("Maghrib: " + formatter.format(prayerTimes.maghrib));
//        System.out.println("Isha: " + formatter.format(prayerTimes.isha));
        PrayerTimeRes prayerTimeRes = new PrayerTimeRes();
        prayerTimeRes.setFajr(formatter.format(prayerTimes.fajr));
        prayerTimeRes.setSunrise(formatter.format(prayerTimes.sunrise));
        prayerTimeRes.setDhuhr(formatter.format(prayerTimes.dhuhr));
        prayerTimeRes.setAsr(formatter.format(prayerTimes.asr));
        prayerTimeRes.setMaghrib(formatter.format(prayerTimes.maghrib));
        prayerTimeRes.setIsha(formatter.format(prayerTimes.isha));
        System.out.println(prayerTimeRes.toString());
        return new Result(true,StatusCode.OK,prayerTimeRes);

    }
}
