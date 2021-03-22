package com;

import com.common.ResponseCode;
import com.dao.UserDao;
import com.pojo.User;
import com.service.Impl.UserImpl;
import com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

    @Test
    public void test(){
        try{
            double[] arr = new double[]{1, 3, 3, 4, 5, 7, 6, 1, 8};

//            String[] args = new String[] { "python", "E:\\PycharmProjects\\untitled\\Test.py", String.valueOf(arr), String.valueOf(arr.length),String.valueOf(arr.length+1) };
//            Process pr = Runtime.getRuntime().exec(args);// 执行py文件
            String[] args = new String[] { "python", "E://PycharmProjects/untitled/Test.py"};
            System.out.println("start");
            Process pr = Runtime.getRuntime().exec(args);
            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream(),"GBK"));
            String line = new String();
            System.out.println(line);
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();

            int re = pr.waitFor();
            System.out.println(re);
            System.out.println("end");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
