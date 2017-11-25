package cn.unicom.cz.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jxisme on 17/11/18.
 */
@Component
public class CurrentDate {
    public String getCurrentDate(Integer interval){
        int intervalMillis = interval * 24 * 60 * 60 * 1000;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        final String date = df.format(new Date().getTime() + intervalMillis);
        System.out.println(date);// new Date()为获取当前系统时间
        return date;
    }
}
