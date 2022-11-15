package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import android.widget.ArrayAdapter;
import android.widget.ListView;


public class multi extends AppCompatActivity {
    private int N;
    private int round=1;
    private String[][] list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi);

        N = 5;//用户人数=点击次数
        list = new String[N][2];
        //创建包含数组的list,即可看成是二维数组，储存第几局与每次结果
        //固定两行，第一列储存第几次，第二列储存每次结果,第三列储存排名等级
        //设定插金花>红六勃>遍地锦>五红>五子>四红>榜眼>探花>进士>举人>秀才

//        round = 1;//判断第几次
        //每点击一次+1

//       从布局文件中获取名叫roll_button的按钮对象的引用
        Button rollButton = findViewById(R.id.roll_button);
//
//        给按钮rollButton设置点击监听器，一旦用户点击按钮，就触发监听器的onClick方法
        rollButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if (round == 1){
                    list[0][0] = "玩家1";
                }
                if (round == 2){
                    list[1][0] = "玩家2";
                }
                if (round == 3){
                    list[2][0] = "玩家3";
                }
                if (round == 4){
                    list[3][0] = "玩家4";
                }
                if (round == 5){
                    list[4][0] = "玩家5";
                }
                if (round == 6){
                    list[4][0] = "玩家6";
                }
                if (round == 7){
                    list[4][0] = "玩家7";
                }
                if (round == 8){
                    list[4][0] = "玩家8";
                }
                //                产生随机数
                Random rand = new Random();
                int randNumber1 = rand.nextInt(6)+1;
//                String randNumber2 = rand.nextInt(6)+1;

                int randNumber2 = rand.nextInt(6)+1;
                int randNumber3 = rand.nextInt(6)+1;
                int randNumber4 = rand.nextInt(6)+1;
                int randNumber5 = rand.nextInt(6)+1;
                int randNumber6 = rand.nextInt(6)+1;

//                获取对ImageView对象的引用
                ImageView diceImage1 = findViewById(R.id.dice_image1);
                ImageView diceImage2 = findViewById(R.id.dice_image2);
                ImageView diceImage3 = findViewById(R.id.dice_image3);
                ImageView diceImage4 = findViewById(R.id.dice_image4);
                ImageView diceImage5 = findViewById(R.id.dice_image5);
                ImageView diceImage6 = findViewById(R.id.dice_image6);

                int drawableResource1,drawableResource2,drawableResource3,
                        drawableResource4,drawableResource5,drawableResource6;
//                将随机数与对应的图片资源联系起来
                switch (randNumber1){
                    case 1: drawableResource1 = R.drawable.dice_1; break;
                    case 2: drawableResource1 = R.drawable.dice_2; break;
                    case 3: drawableResource1 = R.drawable.dice_3; break;
                    case 4: drawableResource1 = R.drawable.dice_4; break;
                    case 5: drawableResource1 = R.drawable.dice_image5; break;
                    case 6: drawableResource1 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber1);
                }

//               随机图片根据rangNumber的值对应drawableResource的int值，实例Drawable类
                Drawable drawable1 = getBaseContext().getResources().getDrawable(drawableResource1);
//                设置ImageView控件最终显示的图片
                diceImage1.setImageDrawable(drawable1);

//              第二个骰子
                switch (randNumber2){
                    case 1: drawableResource2 = R.drawable.dice_1; break;
                    case 2: drawableResource2 = R.drawable.dice_2; break;
                    case 3: drawableResource2 = R.drawable.dice_3; break;
                    case 4: drawableResource2 = R.drawable.dice_4; break;
                    case 5: drawableResource2 = R.drawable.dice_image5; break;
                    case 6: drawableResource2 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber2);
                }

//                随机图片根据rangNumber的值对应drawableResource的int值，实例Drawable类
                Drawable drawable2 = getBaseContext().getResources().getDrawable(drawableResource2);

//                设置ImageView控件最终显示的图片
                diceImage2.setImageDrawable(drawable2);

                //                第三个骰子


                switch (randNumber3){
                    case 1: drawableResource3 = R.drawable.dice_1; break;
                    case 2: drawableResource3 = R.drawable.dice_2; break;
                    case 3: drawableResource3 = R.drawable.dice_3; break;
                    case 4: drawableResource3 = R.drawable.dice_4; break;
                    case 5: drawableResource3 = R.drawable.dice_image5; break;
                    case 6: drawableResource3 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber3);
                }
//                随机图片根据rangNumber的值对应drawableResource的int值，实例Drawable类
                Drawable drawable3 = getBaseContext().getResources().getDrawable(drawableResource3);
//                设置ImageView控件最终显示的图片
                diceImage3.setImageDrawable(drawable3);

                //                第四个骰子


                switch (randNumber4){
                    case 1: drawableResource4 = R.drawable.dice_1; break;
                    case 2: drawableResource4 = R.drawable.dice_2; break;
                    case 3: drawableResource4 = R.drawable.dice_3; break;
                    case 4: drawableResource4 = R.drawable.dice_4; break;
                    case 5: drawableResource4 = R.drawable.dice_image5; break;
                    case 6: drawableResource4 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber4);
                }
//                随机图片根据rangNumber的值对应drawableResource的int值，实例Drawable类
                Drawable drawable4 = getBaseContext().getResources().getDrawable(drawableResource4);
//                设置ImageView控件最终显示的图片
                diceImage4.setImageDrawable(drawable4);

                //                第五个骰子


                switch (randNumber5){
                    case 1: drawableResource5 = R.drawable.dice_1; break;
                    case 2: drawableResource5 = R.drawable.dice_2; break;
                    case 3: drawableResource5 = R.drawable.dice_3; break;
                    case 4: drawableResource5 = R.drawable.dice_4; break;
                    case 5: drawableResource5 = R.drawable.dice_image5; break;
                    case 6: drawableResource5 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber5);
                }
//                随机图片根据rangNumber的值对应drawableResource的int值，实例Drawable类
                Drawable drawable5 = getBaseContext().getResources().getDrawable(drawableResource5);
//                设置ImageView控件最终显示的图片
                diceImage5.setImageDrawable(drawable5);

                //                第六个骰子


                switch (randNumber6){
                    case 1: drawableResource6 = R.drawable.dice_1; break;
                    case 2: drawableResource6 = R.drawable.dice_2; break;
                    case 3: drawableResource6 = R.drawable.dice_3; break;
                    case 4: drawableResource6 = R.drawable.dice_4; break;
                    case 5: drawableResource6 = R.drawable.dice_image5; break;
                    case 6: drawableResource6 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randNumber6);
                }
//                随机图片根据rangNumber的值对应drawableResource的int值，实例Drawable类
                Drawable drawable6 = getBaseContext().getResources().getDrawable(drawableResource6);
//                设置ImageView控件最终显示的图片
                diceImage6.setImageDrawable(drawable6);

                //判断奖项
                //  存储当前随机数组
                int[]  arr;
                arr = new int[6];
                arr[0] = randNumber1;
                arr[1] = randNumber2;
                arr[2] = randNumber3;
                arr[3] = randNumber4;
                arr[4] = randNumber5;
                arr[5] = randNumber6;

                Arrays.sort(arr);

                int counter = 0;

                for(int j=0;j<6;j++){
                    if (arr[j] == 4){
                        counter++;
                    }
                }//4出现的个数

                //红六勃
                if (counter == 6){
                    list[round-1][1] = "红六勃";
//                    list[round-1][2] = 12 + "";
                    Intent intent = new Intent(multi.this,hongliuboduo.class);
                    startActivity(intent);

                }

                //插金花
                if (counter == 4){
                    if (arr[1] == 1 && arr[0] == 1){
                        list[round-1][1] = "插金花";
//                        list[round-1][2] = 13 + "";
                        Intent intent = new Intent(multi.this,chajinhuaduo.class);
                        startActivity(intent);

                    }
                }

                int counter1 = 0;//1出现的个数

                for(int m=0;m<6;m++){
                    if (arr[m] == 2){
                        counter1++;
                    }
                }
                //遍地锦（6个1）,榜眼（123456）
                if (counter1 == 6){
                    list[round-1][1] = "遍地锦";
//                    list[round-1][2] = 11 + "";
                    Intent intent = new Intent(multi.this,biandijinduo.class);
                    startActivity(intent);

                }

                if ((arr[0] == 1)&&(arr[1] == 2)&&(arr[2] == 3) && (arr[3] == 4) && (arr[4] == 5)&&(arr[5]==6)){
                    list[round-1][1] = "榜眼";
//                    list[round-1][2] = 6 + "";
                    Intent intent = new Intent(multi.this,bangyanduo.class);
                    startActivity(intent);

                }


                //五红(5个4）
                if (counter == 5){
                    list[round-1][1] = "五红";
//                    list[round-1][2] = 9 + "";
                    Intent intent = new Intent(multi.this,wuhongduo.class);
                    startActivity(intent);

                }
                //四红（4个4）
                if (counter == 4){
                    if (arr[0] != 4 && arr[1] != 4){//排除插金花
                        list[round-1][1] = "四红";
//                        list[round-1][2] = 7 + "";
                        Intent intent = new Intent(multi.this,sihongduo.class);
                        startActivity(intent);
                    }

                }
//              探花
                if (counter == 3){
                    list[round-1][1] = "探花";
//                    list[round-1][2] = 5 + "";
                    Intent intent = new Intent(multi.this,tanhuaduo.class);
                    startActivity(intent);
                }
                //举人
                if (counter == 2){
                    list[round-1][1] = "举人";
//                    list[round-1][2] = 3 + "";
                    Intent intent = new Intent(multi.this,jurenduo.class);
                    startActivity(intent);
                }
                //秀才
                if (counter == 1){
                    if ((arr[0] == 1)&&(arr[1] == 2)&&(arr[2] == 3) && (arr[3] == 4) && (arr[4] == 5)&&(arr[5]==6)){
                        list[round-1][1] = "榜眼";
//                        list[round-1][2] = 6 + "";
                        Intent intent = new Intent(multi.this,bangyanduo.class);
                        startActivity(intent);
                    }//排除榜眼
                    else {
                        list[round-1][1] = "秀才";
//                        list[round-1][2] = 2 + "";
                        Intent intent = new Intent(multi.this,xiucaiduo.class);
                        startActivity(intent);
                    }
                }


                int counter2 = 0;//2出现的个数

                for(int j=0;j<6;j++){
                    if (arr[j] == 2){
                        counter2++;
                    }
                }

                //黑六勃（6个2）
                if (counter2 == 6){
                    list[round-1][1] = "黑六勃";
//                    list[round-1][2] = 10 + "";
                    Intent intent = new Intent(multi.this,heiliuboduo.class);
                    startActivity(intent);
                }


                //五子（5个2）
                if (counter2 == 5){
                    list[round-1][1] = "五子";
//                    list[round-1][2] = 8 + "";
                    Intent intent = new Intent(multi.this,wuziduo.class);
                    startActivity(intent);
                }

                //进士（4个2）
                if (counter2 == 4){
                    list[round-1][1] = "进士";
//                    list[round-1][2] = 4 + "";
                    Intent intent = new Intent(multi.this,jinshiduo.class);
                    startActivity(intent);
                }

                //未出现4并且2出现的次数小于4并且没有出现6个1则没有中奖
                if (counter == 0 && counter2 < 4 && counter1 != 6 ){
                    list[round-1][1] = "无";
//                    list[round-1][2] = 1 + "";
                    Intent intent = new Intent(multi.this,wuduo.class);
                    startActivity(intent);
                }




                TextView tv = (TextView)findViewById(R.id.array);//获取一个TextView
                String ct = "";//定义一个字符串
                String s = "历史记录\n";

                if (round == N){

                    for (int m=0;m<N;m++){
                        for(int j=0;j<2;j++){
                            ct = ct + list[m][j];//数组拼接成字符串
                            if (j == 0){
                                ct = ct +"\u0020\u0020";
                            }
                        }
                        ct = ct + "\n";
                    }
                    round = 0;
                    ct = s +ct;
                }

                tv.setText(ct);//在TextView中显示数组内容

                round = round + 1;

            }
        });
    }
}

