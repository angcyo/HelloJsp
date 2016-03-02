package com.angcyo.servlet;

import com.angcyo.utils.ResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by angcyo on 2016-03-02 10:49.
 */
@WebServlet(name = "Apptox3Servlet")
public class Apptox3Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsonString = "{\n" +
                "    \"error_code\": 0,\n" +
                "    \"list\": {\n" +
                "        \"GroupCreator\": {\n" +
                "            \"uid\": \"1\"\n" +
                "        },\n" +
                "        \"GroupMenmber\": [\n" +
                "            {\n" +
                "                \"activity\": \"2\",\n" +
                "                \"create_time\": \"1455945707\",\n" +
                "                \"group_id\": \"7\",\n" +
                "                \"id\": \"12\",\n" +
                "                \"isCreator\": \"1\",\n" +
                "                \"last_view\": \"1456469287\",\n" +
                "                \"position\": \"3\",\n" +
                "                \"status\": \"1\",\n" +
                "                \"uid\": \"1\",\n" +
                "                \"update_time\": \"1455945707\",\n" +
                "                \"user\": {\n" +
                "                    \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                    \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                    \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                    \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                    \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                    \"fans\": \"0\",\n" +
                "                    \"following\": \"1\",\n" +
                "                    \"nickname\": \"admin\",\n" +
                "                    \"real_nickname\": \"admin\",\n" +
                "                    \"score1\": \"196\",\n" +
                "                    \"space_link\": \"admin\",\n" +
                "                    \"space_mob_url\": \"/opensns/api.php?s=/Mob/User/index/uid/1.html\",\n" +
                "                    \"space_url\": \"/opensns/api.php?s=/Ucenter/Index/index/uid/1.html\",\n" +
                "                    \"title\": \"Lv3 转正\",\n" +
                "                    \"uid\": \"1\",\n" +
                "                    \"weibocount\": \"24\"\n" +
                "                }\n" +
                "            }\n" +
                "        ],\n" +
                "        \"activity\": \"2\",\n" +
                "        \"allow_user_group\": \"\",\n" +
                "        \"background\": false,\n" +
                "        \"create_time\": \"02月20日 13:21\",\n" +
                "        \"detail\": \"test群组简介\",\n" +
                "        \"id\": \"7\",\n" +
                "        \"is_join\": \"0\",\n" +
                "        \"logo\": \"/opensns/Uploads/Picture/2016-02-19/56c6c4cba93b4.jpg\",\n" +
                "        \"member_alias\": \"成员\",\n" +
                "        \"member_count\": \"0\",\n" +
                "        \"menmberCount\": \"1\",\n" +
                "        \"post_count\": \"2\",\n" +
                "        \"sort\": \"0\",\n" +
                "        \"status\": \"1\",\n" +
                "        \"title\": \"test群组\",\n" +
                "        \"type\": \"0\",\n" +
                "        \"type_id\": \"1\",\n" +
                "        \"uid\": \"1\",\n" +
                "        \"user\": {\n" +
                "            \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "            \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "            \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "            \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "            \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "            \"nickname\": \"admin\",\n" +
                "            \"real_nickname\": \"admin\",\n" +
                "            \"uid\": \"1\",\n" +
                "            \"username\": \"admin\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"message\": \"返回成功\",\n" +
                "    \"success\": true\n" +
                "}";

        ResponseUtil.write(response, jsonString);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
