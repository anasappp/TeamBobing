package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Random;


public class singlegame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singlegame);
        Button rollButton = findViewById(R.id.button);
        Button fanhui=(Button) findViewById(R.id.fanhui);
        fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(singlegame.this, choooooose.class);
                startActivity(intent);
            }
        });
//        给按钮rollButton设置点击监听器，一旦用户点击按钮，就触发监听器的onClick方法
        rollButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

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
                ImageView diceImage1 = findViewById(R.id.dice_1);
                ImageView diceImage2 = findViewById(R.id.dice_2);
                ImageView diceImage3 = findViewById(R.id.dice_3);
                ImageView diceImage4 = findViewById(R.id.dice_4);
                ImageView diceImage5 = findViewById(R.id.dice_image5);
                ImageView diceImage6 = findViewById(R.id.dice_6);

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
                //插金花，红六勃
                if (arr[5] == 4){
                    if ((arr[4] == 4) && (arr[2] == 4) && (arr[3] == 4)){
                        if (arr[1] == 4 && arr[0] == 4){
                            Intent intent = new Intent(singlegame.this,hongliubo.class);
                            startActivity(intent);
                        }
                        if (arr[1] == 1 && arr[0] == 1){
                            Intent intent = new Intent(singlegame.this,chajinhua.class);
                            startActivity(intent);
                        }

                    }
                }

                //遍地锦（6个1），黑六勃（6个2），榜眼（123456）
                if ((arr[0] == 1)&&(arr[1] == 1)&&(arr[2] == 1) && (arr[3] == 1) && (arr[4] == 1)&&(arr[5]==1)){
                    Intent intent = new Intent(singlegame.this,heiliubo.class);
                    startActivity(intent);
                }
                if ((arr[0] == 2)&&(arr[1] == 2)&&(arr[2] == 2) && (arr[3] == 2) && (arr[4] == 2)&&(arr[5]==2)){
                    Intent intent = new Intent(singlegame.this,biandijin.class);
                    startActivity(intent);
                }
                if ((arr[0] == 1)&&(arr[1] == 2)&&(arr[2] == 3) && (arr[3] == 4) && (arr[4] == 5)&&(arr[5]==6)){
                    Intent intent = new Intent(singlegame.this,bangyan.class);
                    startActivity(intent);
                }

                //五子
                if ((arr[1] ==2)&&(arr[2]==2)&&(arr[3]==2)&&(arr[4]==2)){
                    if ( arr[0]==2 && arr[5]!=2){
                        Intent intent = new Intent(singlegame.this,wuzi.class);
                        startActivity(intent);
                    }
                    if ( arr[5]==2 && arr[0]!=2){
                        Intent intent = new Intent(singlegame.this,wuhong.class);
                        startActivity(intent);
                    }
                }

                int counter = 0;

                for(int i=0;i<6;i++){
                    if (arr[i] == 4){
                        counter++;
                    }
                }

                //五红
                if (counter == 5){
                    Intent intent = new Intent(singlegame.this,wuhong.class);
                    startActivity(intent);
                }
                //四红（4个4）
                if (counter == 4){
                    if (arr[0] != 4 && arr[1] != 4){//排除插金花
                        Intent intent = new Intent(singlegame.this,sihong.class);
                        startActivity(intent);
                    }
                }

                //探花
                if (counter == 3){
                    Intent intent = new Intent(singlegame.this,tanhua.class);
                    startActivity(intent);
                }
                //举人
                if (counter == 2){
                    Intent intent = new Intent(singlegame.this,juren.class);
                    startActivity(intent);
                }
                //秀才
                if (counter == 1){
                    if ((arr[0] == 1)&&(arr[1] == 2)&&(arr[2] == 3) && (arr[3] == 4) && (arr[4] == 5)&&(arr[5]==6)){
                        Intent intent = new Intent(singlegame.this,bangyan.class);
                        startActivity(intent);
                    }//榜眼
                    else {
                        Intent intent = new Intent(singlegame.this,xiucai.class);
                        startActivity(intent);
                    }
                }
                //没中奖
                if (counter == 0){
                    Intent intent = new Intent(singlegame.this,wu.class);
                    startActivity(intent);
                }
                int counter1 = 0;

                for(int i=0;i<6;i++){
                    if (arr[i] == 2){
                        counter1++;
                    }
                }
                //进士
                if (counter1 == 4){
                    Intent intent = new Intent(singlegame.this,jinshi.class);
                    startActivity(intent);
                }

            }
        });
    }
}

