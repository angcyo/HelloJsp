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
@WebServlet(name = "Apptox4Servlet")
public class Apptox4Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsonString = "{\n" +
                "    \"error_code\": 0,\n" +
                "    \"list\": [\n" +
                "        {\n" +
                "            \"cate_id\": \"0\",\n" +
                "            \"content\": \"群组测试（内容）2\",\n" +
                "            \"cover\": \"\",\n" +
                "            \"create_time\": \"02月20日 13:28\",\n" +
                "            \"group_id\": \"7\",\n" +
                "            \"id\": \"15\",\n" +
                "            \"is_support\": \"0\",\n" +
                "            \"is_top\": \"0\",\n" +
                "            \"last_reply_time\": \"02月20日 13:28\",\n" +
                "            \"parse\": \"0\",\n" +
                "            \"reply_count\": \"0\",\n" +
                "            \"status\": \"1\",\n" +
                "            \"summary\": \"群组测试（内容）2\",\n" +
                "            \"supportCount\": \"0\",\n" +
                "            \"title\": \"群组测试（标题）2\",\n" +
                "            \"uid\": \"1\",\n" +
                "            \"update_time\": \"02月20日 13:28\",\n" +
                "            \"user\": {\n" +
                "                \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                \"nickname\": \"admin\",\n" +
                "                \"real_nickname\": \"admin\",\n" +
                "                \"uid\": \"1\",\n" +
                "                \"username\": \"admin\"\n" +
                "            },\n" +
                "            \"view_count\": \"5\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"cate_id\": \"0\",\n" +
                "            \"content\": \"群组话题测试（内容）\",\n" +
                "            \"cover\": \"\",\n" +
                "            \"create_time\": \"02月20日 13:22\",\n" +
                "            \"group_id\": \"7\",\n" +
                "            \"id\": \"14\",\n" +
                "            \"is_support\": \"0\",\n" +
                "            \"is_top\": \"0\",\n" +
                "            \"last_reply_time\": \"02月20日 13:22\",\n" +
                "            \"parse\": \"0\",\n" +
                "            \"reply_count\": \"0\",\n" +
                "            \"status\": \"1\",\n" +
                "            \"summary\": \"群组话题测试（内容）\",\n" +
                "            \"supportCount\": \"0\",\n" +
                "            \"title\": \"群组话题测试（标题）\",\n" +
                "            \"uid\": \"1\",\n" +
                "            \"update_time\": \"02月20日 13:22\",\n" +
                "            \"user\": {\n" +
                "                \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                \"nickname\": \"admin\",\n" +
                "                \"real_nickname\": \"admin\",\n" +
                "                \"uid\": \"1\",\n" +
                "                \"username\": \"admin\"\n" +
                "            },\n" +
                "            \"view_count\": \"3\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"message\": \"返回成功\",\n" +
                "    \"success\": true\n" +
                "}";

        ResponseUtil.write(response, jsonString);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
