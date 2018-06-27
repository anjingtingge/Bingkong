package com.example.wangyajie.bingkong;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView num_tv1,num_tv2,num_tv3,lengcangt,ganshi,bianwen,lengdongt,bianwent;
    private SeekBar seekBar1,seekBar2,seekBar3;
    private double width, fDensity;
    private ImageView zhinengbeijing,zhineng,suleng,sulengbeijing,sudongbeijing,sudong,dishi,zhongshi,gaoshi,bingxian,lingdu,zhenxian,lengcangjian,lengcangjia,bianwenjian,bianwenjia,lengdongjian,lengdongjia,fanhui;
    private int numbers1=0,numbers2 =0,numbers3 =0,ai=0,bi=0,ci=0,lengcang,lengdong,dishib=1,zhongshib,gaoshib,bingxianb=1,lingdub,zhenxianb;
    private MyBtnClicker myBtnClicker = new MyBtnClicker();
    private DisplayMetrics displaysMetrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initSeekBarProgress();


    }


    private class MyBtnClicker implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.zhineng:
                    if(ai==0){
                        Drawable drawable=getResources().getDrawable(R.drawable.background4);
                        Drawable drawable1=getResources().getDrawable(R.drawable.background3);
                        zhinengbeijing.setImageDrawable(drawable);
                        sulengbeijing.setImageDrawable(drawable1);
                        sudongbeijing.setImageDrawable(drawable1);


                        num_tv2.setText(5 + "℃");
                        num_tv3.setText(-18 + "℃");
                        seekBar2.setProgress(5);
                       seekBar3.setProgress(2);
                        bi=0;
                        ci=0;
                        ai=1;
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.background3);
                        zhinengbeijing.setImageDrawable(drawable);
                        ai=0;
                    }

                    break;
                case R.id.suleng:
                    if(bi==0){
                        Drawable drawable=getResources().getDrawable(R.drawable.background4);
                        Drawable drawable1=getResources().getDrawable(R.drawable.background3);
                        sulengbeijing.setImageDrawable(drawable);
                        zhinengbeijing.setImageDrawable(drawable1);


                        num_tv2.setText(0 + "℃");
                        num_tv3.setText(lengdong + "℃");
                        seekBar2.setProgress(0);
                        seekBar3.setProgress(numbers3);
                        bi=1;
                        ai=0;
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.background3);
                        sulengbeijing.setImageDrawable(drawable);
                        bi=0;
                    }

                    break;
                case R.id.sudong:
                    if(ci==0){
                        Drawable drawable=getResources().getDrawable(R.drawable.background4);
                        Drawable drawable1=getResources().getDrawable(R.drawable.background3);

                        zhinengbeijing.setImageDrawable(drawable1);
                        sudongbeijing.setImageDrawable(drawable);

                        num_tv2.setText(numbers2 + "℃");
                        num_tv3.setText(-25 + "℃");
                        seekBar2.setProgress(numbers2);
                        seekBar3.setProgress(0);
                        ci=1;
                        ai=0;
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.background3);
                        sudongbeijing.setImageDrawable(drawable);
                        ci=0;
                    }
                    break;
                case R.id.dishi:
                    if(dishib==0){

                        Drawable drawable=getResources().getDrawable(R.drawable.lowhumidity_p);

                        dishi.setImageDrawable(drawable);
                        Drawable drawable1=getResources().getDrawable(R.drawable.mediumhumidity);
                        zhongshi.setImageDrawable(drawable1);
                        Drawable drawable2=getResources().getDrawable(R.drawable.highhumidity);
                        gaoshi.setImageDrawable(drawable2);
                        zhongshib=0;
                        gaoshib=0;
                        dishib=1;
                        ganshi.setText("低湿");
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.lowhumidity);
                        dishi.setImageDrawable(drawable);
                        dishib=0;
                    }
                    break;
                case R.id.zhongshi:
                    if(zhongshib==0){

                        Drawable drawable=getResources().getDrawable(R.drawable.mediumhumidity_p);

                        zhongshi.setImageDrawable(drawable);
                        zhongshib=1;
                        Drawable drawable1=getResources().getDrawable(R.drawable.lowhumidity);
                        dishi.setImageDrawable(drawable1);
                        dishib=0;
                        Drawable drawable2=getResources().getDrawable(R.drawable.highhumidity);
                        gaoshi.setImageDrawable(drawable2);
                        gaoshib=0;
                        ganshi.setText("中湿");
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.mediumhumidity);
                        zhongshi.setImageDrawable(drawable);
                        zhongshib=0;
                    }
                    break;
                case R.id.gaoshi:
                    if(gaoshib==0){

                        Drawable drawable=getResources().getDrawable(R.drawable.highhumidity_p);

                        gaoshi.setImageDrawable(drawable);
                        gaoshib=1;
                        Drawable drawable1=getResources().getDrawable(R.drawable.mediumhumidity);
                        zhongshi.setImageDrawable(drawable1);
                        zhongshib=0;
                        Drawable drawable2=getResources().getDrawable(R.drawable.lowhumidity);
                        dishi.setImageDrawable(drawable2);
                        dishib=0;
                        ganshi.setText("高湿");
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.highhumidity);
                        gaoshi.setImageDrawable(drawable);
                        gaoshib=0;
                    }
                    break;
                case R.id.bingxian:
                    if(bingxianb==0){

                        Drawable drawable=getResources().getDrawable(R.drawable.icefresh_p);

                        bingxian.setImageDrawable(drawable);
                        bingxianb=1;
                        Drawable drawable1=getResources().getDrawable(R.drawable.degrees);
                        lingdu.setImageDrawable(drawable1);
                        lingdub=0;
                        Drawable drawable2=getResources().getDrawable(R.drawable.zhenxian);
                        zhenxian.setImageDrawable(drawable2);
                        zhenxianb=0;
bianwen.setText("冰鲜");
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.icefresh);
                        bingxian.setImageDrawable(drawable);
                        bingxianb=0;
                    }
                    break;
                case R.id.lingdu:
                    if(lingdub==0){

                        Drawable drawable=getResources().getDrawable(R.drawable.degrees_p);

                        lingdu.setImageDrawable(drawable);
                        lingdub=1;
                        Drawable drawable2=getResources().getDrawable(R.drawable.icefresh);
                        bingxian.setImageDrawable(drawable2);
                        bingxianb=0;
                        Drawable drawable3=getResources().getDrawable(R.drawable.zhenxian);
                        zhenxian.setImageDrawable(drawable3);
                        zhenxianb=0;
                        bianwen.setText("0度");
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.degrees);
                        lingdu.setImageDrawable(drawable);
                        lingdub=0;
                    }
                    break;
                case R.id.zhenxian:
                    if(zhenxianb==0){

                        Drawable drawable=getResources().getDrawable(R.drawable.zhenxian_p);

                        zhenxian.setImageDrawable(drawable);
                        zhenxianb=1;
                        Drawable drawable1=getResources().getDrawable(R.drawable.degrees);
                        lingdu.setImageDrawable(drawable1);
                        lingdub=0;
                        Drawable drawable2=getResources().getDrawable(R.drawable.icefresh);
                        bingxian.setImageDrawable(drawable2);
                        bingxianb=0;
                        bianwen.setText("臻鲜");
                    }
                    else {
                        Drawable drawable=getResources().getDrawable(R.drawable.zhenxian);
                        zhenxian.setImageDrawable(drawable);
                        zhenxianb=0;
                    }
                    break;
                case R.id.lengcangjian:
                    if(numbers2<0){
                        return;}
                    num_tv2.setText(numbers2-1 + "℃");

                    seekBar2.setProgress(numbers2-1);
                    break;
                case R.id.lengcangjia:
                    if(numbers2>10){
                        return;}
                    num_tv2.setText(numbers2+1 + "℃");

                    seekBar2.setProgress(numbers2+1);
                    break;

                case R.id.bianwenjian:
                    if(numbers1<0){
                        return;}
                    num_tv1.setText(numbers1-1 + "℃");

                    seekBar1.setProgress(numbers1-1);
                    break;
                case R.id.bianwenjia:
                    if(numbers1>10){
                        return;}
                    num_tv1.setText(numbers1+1 + "℃");

                    seekBar1.setProgress(numbers1+1);
                    break;
                case R.id.lengdongjian:
                    if(numbers3<0){
                        return;}
                    num_tv3.setText(numbers3-1 + "℃");

                    seekBar3.setProgress(numbers3-1);
                    break;
                case R.id.lengdongjia:
                    if(numbers3>10){
                        return;}
                    num_tv3.setText(numbers3+1 + "℃");

                    seekBar3.setProgress(numbers3+1);
                    break;
                case R.id.fanhui:
                    Drawable drawable=getResources().getDrawable(R.drawable.back_p);

                    fanhui.setImageDrawable(drawable);
                    finish();
                    break;
            }
        }
    }

    //获取屏幕信息，以及初始化操作
    private void initView() {
//        displaysMetrics = getResources().getDisplayMetrics();
        width = 400;
        fDensity = (width - dip2px(this, 0)) / 11;
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        num_tv1 = (TextView) findViewById(R.id.num_tv1);
        num_tv2 = (TextView) findViewById(R.id.num_tv2);
        num_tv3 = (TextView) findViewById(R.id.num_tv3);
        lengcangt= (TextView) findViewById(R.id.lengcangt);
        ganshi= (TextView) findViewById(R.id.ganshi);
        bianwen= (TextView) findViewById(R.id.bianwen);
        lengdongt= (TextView) findViewById(R.id.lengdongt);
        bianwent= (TextView) findViewById(R.id.bianwent);

        zhinengbeijing=(ImageView) findViewById(R.id.zhinengbeijing);
        sulengbeijing=(ImageView) findViewById(R.id.sulengbeijing);
        sudongbeijing=(ImageView) findViewById(R.id.sudongbeijing);
        zhineng=(ImageView) findViewById(R.id.zhineng);
        suleng=(ImageView) findViewById(R.id.suleng);
        sudong=(ImageView) findViewById(R.id.sudong);
        dishi=(ImageView) findViewById(R.id.dishi);
        zhongshi=(ImageView) findViewById(R.id.zhongshi);
        gaoshi=(ImageView) findViewById(R.id.gaoshi);
        bingxian=(ImageView) findViewById(R.id.bingxian);
        lingdu=(ImageView) findViewById(R.id.lingdu);
        zhenxian=(ImageView) findViewById(R.id.zhenxian);
        lengcangjian=(ImageView) findViewById(R.id.lengcangjian);
        lengcangjia=(ImageView) findViewById(R.id.lengcangjia);
        bianwenjian=(ImageView) findViewById(R.id.bianwenjian);
        bianwenjia=(ImageView) findViewById(R.id.bianwenjia);
        lengdongjian=(ImageView) findViewById(R.id.lengdongjian);
        lengdongjia=(ImageView) findViewById(R.id.lengdongjia);
        fanhui=(ImageView) findViewById(R.id.fanhui);

        zhineng.setOnClickListener(myBtnClicker);
        suleng.setOnClickListener(myBtnClicker);
        sudong.setOnClickListener(myBtnClicker);
        dishi.setOnClickListener(myBtnClicker);
        zhongshi.setOnClickListener(myBtnClicker);
        gaoshi.setOnClickListener(myBtnClicker);
        bingxian.setOnClickListener(myBtnClicker);
        lingdu.setOnClickListener(myBtnClicker);
        zhenxian.setOnClickListener(myBtnClicker);
        lengcangjian.setOnClickListener(myBtnClicker);
        lengcangjia.setOnClickListener(myBtnClicker);
        bianwenjian.setOnClickListener(myBtnClicker);
        bianwenjia.setOnClickListener(myBtnClicker);
        lengdongjian.setOnClickListener(myBtnClicker);
        lengdongjia.setOnClickListener(myBtnClicker);
        fanhui.setOnClickListener(myBtnClicker);
    }

    //TextView跟随SeekBar移动
    private void initSeekBarProgress() {
        //冷藏
        seekBar1.setProgress(numbers1);
        seekBar1.setOnSeekBarChangeListener(mSeekChange1);
        LinearLayout.LayoutParams paramsStrength = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
//        paramsStrength.leftMargin = (int) (-10 * fDensity);
        paramsStrength.leftMargin = (int) (numbers2 * fDensity);
        num_tv1.setLayoutParams(paramsStrength);
        num_tv1.setText(-10 + "℃"); //不显示数值
//变温
        seekBar2.setProgress(numbers2);
        seekBar2.setOnSeekBarChangeListener(mSeekChange2);
        LinearLayout.LayoutParams paramsStrength2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        paramsStrength.leftMargin = (int) (numbers2 * fDensity);
        num_tv2.setLayoutParams(paramsStrength2);
        num_tv2.setText(0 + "℃");
//冷冻
        seekBar3.setProgress(numbers3);
        seekBar3.setOnSeekBarChangeListener(mSeekChange3);
        LinearLayout.LayoutParams paramsStrength3 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        paramsStrength.leftMargin = (int) (numbers3 * fDensity);
        num_tv3.setLayoutParams(paramsStrength3);
        num_tv3.setText(-20 + "℃");
    }

    private SeekBar.OnSeekBarChangeListener mSeekChange1 = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
            numbers1 = progress;
            LinearLayout.LayoutParams paramsStrength = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            paramsStrength.leftMargin = (int) (progress * fDensity);
            num_tv1.setLayoutParams(paramsStrength);
            lengcang=numbers1-10;
            num_tv1.setText(numbers1-10+ "℃");
bianwent.setText(numbers1-10+ "℃");
//            Drawable drawable1=getResources().getDrawable(R.drawable.background3);
//            if(ai==1){
//                zhinengbeijing.setImageDrawable(drawable1);
//            ai=0;}
//            if(bi==1){
//                sulengbeijing.setImageDrawable(drawable1);
//            bi=0;}
//            if(ci==1){
//                sudongbeijing.setImageDrawable(drawable1);
//            ci=0;}
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
        }
    };
    private SeekBar.OnSeekBarChangeListener mSeekChange2 = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar2, int progress,
                                      boolean fromUser) {
            numbers2= progress;
            LinearLayout.LayoutParams paramsStrength2 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            paramsStrength2.leftMargin = (int) (progress * fDensity);
            num_tv2.setLayoutParams(paramsStrength2);

            num_tv2.setText(numbers2+ "℃");
lengcangt.setText(numbers2+ "℃");



//            if(lengcangt.getText().toString().equalsIgnoreCase("5℃")){
//
//            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
            Drawable drawable1=getResources().getDrawable(R.drawable.background3);
            if(ai==1&(numbers2!=5||numbers3!=2)){
                zhinengbeijing.setImageDrawable(drawable1);
                ai=0;}
            if(bi==1&numbers2!=0){
                sulengbeijing.setImageDrawable(drawable1);
                bi=0;}
            if(ci==1&numbers3!=0){
                sudongbeijing.setImageDrawable(drawable1);
                ci=0;}
        }
    };

    private SeekBar.OnSeekBarChangeListener mSeekChange3 = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar3, int progress,
                                      boolean fromUser) {

            numbers3 = progress;
            LinearLayout.LayoutParams paramsStrength3 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            paramsStrength3.leftMargin = (int) (progress * fDensity);
            num_tv3.setLayoutParams(paramsStrength3);

            num_tv3.setText(numbers3-20 +"℃");
            lengdong=progress-20;
            lengdongt.setText(numbers3-20 +"℃");


        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
            Drawable drawable1=getResources().getDrawable(R.drawable.background3);
            if(ai==1&(numbers2!=5||numbers3!=2)){
                zhinengbeijing.setImageDrawable(drawable1);
                ai=0;}
            if(bi==1&numbers2!=0){
                sulengbeijing.setImageDrawable(drawable1);
                bi=0;}
            if(ci==1&numbers3!=0){
                sudongbeijing.setImageDrawable(drawable1);
                ci=0;}
        }
    };


    /**
     * 根据手机分辨率从 px(像素) 单位 转成 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 根据手机分辨率从 dp 单位 转成 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}