package com.example.wangji.changemax.util.other_util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.example.wangji.changemax.activity.map.MapActivity;
import com.example.wangji.changemax.activity.mea.MedicalEncyclopediaActivity;
import com.example.wangji.changemax.activity.mea.detailed.MedicalDiseaseDetailedDataActivity;
import com.example.wangji.changemax.activity.mea.detailed.MedicalSymptomDetailedDataActivity;
import com.example.wangji.changemax.activity.web.WebActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangJi.
 */
public final class KeywordEvent {


    public Map<String, Intent> getFunctionKwMap(Context myContext) {
        Map<String, Intent> functionKwMap = new HashMap<String, Intent>();

        //        Intent intentYiYuan = new Intent(myContext, MapActivity.class);
        //        intentYiYuan.putExtra("keyWord", "开灯");
        //开灯模式一||开一下灯
        Intent intentYiYuan = new Intent(myContext, WebActivity.class);
        intentYiYuan.putExtra("url", "http://192.168.43.123:8999/light_on1");

        //关灯
        Intent intentTurnOff = new Intent(myContext,WebActivity.class);
        intentTurnOff.putExtra("url","http://192.168.43.123:8999/light_off");

        //开灯模式二
        Intent intentTurnOn_2 = new Intent(myContext,WebActivity.class);
        intentTurnOn_2.putExtra("url","http://192.168.43.123:8999/light_on2");

        //开灯模式三
        Intent intentTurnOn_3 = new Intent(myContext,WebActivity.class);
        intentTurnOn_3.putExtra("url","http://192.168.43.123:8999/light_on3");

        Intent intentCeSuo = new Intent(myContext, MapActivity.class);
        String keyword2 = "厕所";
        intentCeSuo.putExtra("url", "https://map.baidu.com/?newma p=1&shareurl=1&l=14.1506777111642&tn=B_NORMAL_MAP&hb=B_SATELLITE_STREET&s=s%26da_src%3DsearchBox.button%26wd%3D" + keyword2 + "%26c%3D349%26src%3D0%26wd2%3D%26pn%3D0%26sug%3D0%26l%3D15%26b%3D(12909249%2C3438765%3B12921537%2C3444621)%26from%3Dwebmap%26biz_forward%3D%7B%22scaler%22%3A2%2C%22styles%22%3A%22pl%22%7D%26sug_forward%3D%26auth%3D0EeBNgJwd6TFF9P%40CeeCX7OVVTT12YEuxHBNEBTEBLtwi04vy77u1GgvPUDZYOYIZuVt1cv3uVtGccZcuVtcvY1SGpuHt69AN3zCyVwi04960vy777777777uWvPYuxt8zv7u%40ZPuVteuVtegvcguxHBNEBTEBHtswVVHf2rZZWuV%26device_ratio%3D2");


        String url = "mqqwpa://im/chat?chat_type=wpa&uin=475652900&version=1";
        Intent intentKeFu = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        Intent intentBaiKe = new Intent(myContext, MedicalEncyclopediaActivity.class);

        Intent intentDisease = new Intent(myContext, MedicalDiseaseDetailedDataActivity.class);
        Intent intentSymptom = new Intent(myContext, MedicalSymptomDetailedDataActivity.class);

        Intent intentWeb = new Intent(myContext, WebActivity.class);


        Intent intentShare = new Intent(Intent.ACTION_SEND);
        //        intentShare.setType("image/jpeg");
        intentShare.setType("text/plain");
        //        intentShare.putExtra(Intent.EXTRA_STREAM, Uri.parse(path));
        intentShare.putExtra(Intent.EXTRA_TEXT, "一个属于你的智能专家：https://user.qzone.qq.com/2780199647/infocenter");
        Intent.createChooser(intentShare, "分享");


        functionKwMap.put("///", intentWeb);
        functionKwMap.put("开灯模式一YY", intentYiYuan);
        functionKwMap.put("开灯模式二YY", intentTurnOn_2);
        functionKwMap.put("开灯模式三YY", intentTurnOn_3);
        functionKwMap.put("关灯YY",intentTurnOff);
        functionKwMap.put("医疗百科YLBK", intentBaiKe);
        functionKwMap.put("厕所WC", intentCeSuo);
        functionKwMap.put("客服KF", intentKeFu);
        functionKwMap.put("***", intentDisease);
        functionKwMap.put("###", intentSymptom);
        functionKwMap.put("分享FX", Intent.createChooser(intentShare, "分享"));

        return functionKwMap;
    }


    public Map<String, String> identifierRemove() {
        Map<String, String> identifierMap = new HashMap<String, String>();

        identifierMap.put("///", "\"");
        identifierMap.put("开灯模式一YY", "开灯模式一");
        identifierMap.put("开灯模式二YY", "开灯模式二");
        identifierMap.put("开灯模式三YY", "开灯模式三");
        identifierMap.put("关灯YY","关灯");
        identifierMap.put("医疗百科YLBK", "医疗百科");
        identifierMap.put("厕所WC", "厕所");
        identifierMap.put("客服KF", "客服");
        identifierMap.put("***", "\"");
        identifierMap.put("###", "\"");
        identifierMap.put("分享FX", "分享");
        return identifierMap;

    }

}
