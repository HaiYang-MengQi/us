package com.experience.tool;

import java.awt.*;
import java.util.Random;

public class Create_Captcha {
        private String Captcha;
        char sign = 'a';
        StringBuffer stringBuffer = new StringBuffer();
        public String your_Captcha(){
        for(int i=0 ;i<4 ;i++){//TODO 等待优化
            Random random = new Random();
            sign = (char) (sign+random.nextInt(25));
            stringBuffer.append(sign);
        }
        Captcha=stringBuffer.toString();
            return Captcha;
        }
    }

//}
