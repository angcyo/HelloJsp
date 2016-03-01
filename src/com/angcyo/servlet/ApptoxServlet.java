package com.angcyo.servlet;

import com.angcyo.utils.ResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 徒弟项目,测试数据
 * Created by angcyo on 2016-03-01 15:55.
 */
@WebServlet(name = "ApptoxServlet")
public class ApptoxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsonString = "{\n" +
                "    \"error_code\": 0,\n" +
                "    \"list\": [\n" +
                "        {\n" +
                "            \"GroupCreator\": {\n" +
                "                \"uid\": \"106\"\n" +
                "            },\n" +
                "            \"GroupMenmber\": [\n" +
                "                {\n" +
                "                    \"activity\": \"7\",\n" +
                "                    \"create_time\": \"1455938014\",\n" +
                "                    \"group_id\": \"6\",\n" +
                "                    \"id\": \"11\",\n" +
                "                    \"isCreator\": \"1\",\n" +
                "                    \"last_view\": \"1456465127\",\n" +
                "                    \"position\": \"3\",\n" +
                "                    \"status\": \"1\",\n" +
                "                    \"uid\": \"106\",\n" +
                "                    \"update_time\": \"1455938014\",\n" +
                "                    \"user\": {\n" +
                "                        \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                        \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                        \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                        \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                        \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                        \"fans\": \"0\",\n" +
                "                        \"following\": \"0\",\n" +
                "                        \"nickname\": \"18253553110\",\n" +
                "                        \"real_nickname\": \"18253553110\",\n" +
                "                        \"score1\": \"81\",\n" +
                "                        \"space_link\": \"18253553110\",\n" +
                "                        \"space_mob_url\": \"/opensns/index.php?s=/mob/user/index/uid/106.html\",\n" +
                "                        \"space_url\": \"/opensns/index.php?s=/ucenter/index/index/uid/106.html\",\n" +
                "                        \"title\": \"Lv2 试用\",\n" +
                "                        \"uid\": \"106\",\n" +
                "                        \"weibocount\": \"3\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"activity\": \"1\",\n" +
                "                    \"create_time\": \"1456293887\",\n" +
                "                    \"group_id\": \"6\",\n" +
                "                    \"id\": \"13\",\n" +
                "                    \"isCreator\": \"0\",\n" +
                "                    \"last_view\": \"1456295427\",\n" +
                "                    \"position\": \"1\",\n" +
                "                    \"status\": \"1\",\n" +
                "                    \"uid\": \"1\",\n" +
                "                    \"update_time\": \"1456293887\",\n" +
                "                    \"user\": {\n" +
                "                        \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                        \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                        \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                        \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                        \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                        \"fans\": \"0\",\n" +
                "                        \"following\": \"1\",\n" +
                "                        \"nickname\": \"admin\",\n" +
                "                        \"real_nickname\": \"admin\",\n" +
                "                        \"score1\": \"196\",\n" +
                "                        \"space_link\": \"admin\",\n" +
                "                        \"space_mob_url\": \"/opensns/api.php?s=/Mob/User/index/uid/1.html\",\n" +
                "                        \"space_url\": \"/opensns/api.php?s=/Ucenter/Index/index/uid/1.html\",\n" +
                "                        \"title\": \"Lv3 转正\",\n" +
                "                        \"uid\": \"1\",\n" +
                "                        \"weibocount\": \"24\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"activity\": \"8\",\n" +
                "            \"allow_user_group\": \"\",\n" +
                "            \"background\": false,\n" +
                "            \"create_time\": \"02月20日 11:13\",\n" +
                "            \"detail\": \"Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组Apollo的群组\",\n" +
                "            \"id\": \"6\",\n" +
                "            \"is_join\": \"0\",\n" +
                "            \"logo\": \"/opensns/Uploads/Picture/2016-02-20/56c7d9c4abe55.png\",\n" +
                "            \"member_alias\": \"呆萌小新\",\n" +
                "            \"member_count\": \"1\",\n" +
                "            \"menmberCount\": \"2\",\n" +
                "            \"post_count\": \"5\",\n" +
                "            \"sort\": \"0\",\n" +
                "            \"status\": \"1\",\n" +
                "            \"title\": \"Apollo\",\n" +
                "            \"type\": \"0\",\n" +
                "            \"type_id\": \"1\",\n" +
                "            \"uid\": \"106\",\n" +
                "            \"user\": {\n" +
                "                \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                \"nickname\": \"18253553110\",\n" +
                "                \"real_nickname\": \"18253553110\",\n" +
                "                \"uid\": \"106\",\n" +
                "                \"username\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"GroupCreator\": {\n" +
                "                \"uid\": \"1\"\n" +
                "            },\n" +
                "            \"GroupMenmber\": [\n" +
                "                {\n" +
                "                    \"activity\": \"2\",\n" +
                "                    \"create_time\": \"1455945707\",\n" +
                "                    \"group_id\": \"7\",\n" +
                "                    \"id\": \"12\",\n" +
                "                    \"isCreator\": \"1\",\n" +
                "                    \"last_view\": \"1456469287\",\n" +
                "                    \"position\": \"3\",\n" +
                "                    \"status\": \"1\",\n" +
                "                    \"uid\": \"1\",\n" +
                "                    \"update_time\": \"1455945707\",\n" +
                "                    \"user\": {\n" +
                "                        \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                        \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                        \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                        \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                        \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                        \"fans\": \"0\",\n" +
                "                        \"following\": \"1\",\n" +
                "                        \"nickname\": \"admin\",\n" +
                "                        \"real_nickname\": \"admin\",\n" +
                "                        \"score1\": \"196\",\n" +
                "                        \"space_link\": \"admin\",\n" +
                "                        \"space_mob_url\": \"/opensns/api.php?s=/Mob/User/index/uid/1.html\",\n" +
                "                        \"space_url\": \"/opensns/api.php?s=/Ucenter/Index/index/uid/1.html\",\n" +
                "                        \"title\": \"Lv3 转正\",\n" +
                "                        \"uid\": \"1\",\n" +
                "                        \"weibocount\": \"24\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"activity\": \"2\",\n" +
                "            \"allow_user_group\": \"\",\n" +
                "            \"background\": false,\n" +
                "            \"create_time\": \"02月20日 13:21\",\n" +
                "            \"detail\": \"test群组简介\",\n" +
                "            \"id\": \"7\",\n" +
                "            \"is_join\": \"0\",\n" +
                "            \"logo\": \"/opensns/Uploads/Picture/2016-02-19/56c6c4cba93b4.jpg\",\n" +
                "            \"member_alias\": \"成员\",\n" +
                "            \"member_count\": \"0\",\n" +
                "            \"menmberCount\": \"1\",\n" +
                "            \"post_count\": \"2\",\n" +
                "            \"sort\": \"0\",\n" +
                "            \"status\": \"1\",\n" +
                "            \"title\": \"test群组\",\n" +
                "            \"type\": \"0\",\n" +
                "            \"type_id\": \"1\",\n" +
                "            \"uid\": \"1\",\n" +
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
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"GroupCreator\": {\n" +
                "                \"uid\": \"1\"\n" +
                "            },\n" +
                "            \"GroupMenmber\": [\n" +
                "                {\n" +
                "                    \"activity\": \"0\",\n" +
                "                    \"create_time\": \"1456369343\",\n" +
                "                    \"group_id\": \"8\",\n" +
                "                    \"id\": \"14\",\n" +
                "                    \"isCreator\": \"1\",\n" +
                "                    \"last_view\": \"1456369345\",\n" +
                "                    \"position\": \"3\",\n" +
                "                    \"status\": \"1\",\n" +
                "                    \"uid\": \"1\",\n" +
                "                    \"update_time\": \"1456369343\",\n" +
                "                    \"user\": {\n" +
                "                        \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                        \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                        \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                        \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                        \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                        \"fans\": \"0\",\n" +
                "                        \"following\": \"1\",\n" +
                "                        \"nickname\": \"admin\",\n" +
                "                        \"real_nickname\": \"admin\",\n" +
                "                        \"score1\": \"196\",\n" +
                "                        \"space_link\": \"admin\",\n" +
                "                        \"space_mob_url\": \"/opensns/api.php?s=/Mob/User/index/uid/1.html\",\n" +
                "                        \"space_url\": \"/opensns/api.php?s=/Ucenter/Index/index/uid/1.html\",\n" +
                "                        \"title\": \"Lv3 转正\",\n" +
                "                        \"uid\": \"1\",\n" +
                "                        \"weibocount\": \"24\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"activity\": \"0\",\n" +
                "            \"allow_user_group\": \"\",\n" +
                "            \"background\": false,\n" +
                "            \"create_time\": \"02月25日 11:02\",\n" +
                "            \"detail\": \"斯蒂芬森分\",\n" +
                "            \"id\": \"8\",\n" +
                "            \"is_join\": \"0\",\n" +
                "            \"logo\": \"/opensns/Uploads/Picture/2016-02-25/56ce6b38394e6.jpg\",\n" +
                "            \"member_alias\": \"公举\",\n" +
                "            \"member_count\": \"0\",\n" +
                "            \"menmberCount\": \"1\",\n" +
                "            \"post_count\": \"0\",\n" +
                "            \"sort\": \"0\",\n" +
                "            \"status\": \"1\",\n" +
                "            \"title\": \"大爷我可是小公举\",\n" +
                "            \"type\": \"0\",\n" +
                "            \"type_id\": \"1\",\n" +
                "            \"uid\": \"1\",\n" +
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
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"GroupCreator\": {\n" +
                "                \"uid\": \"102\"\n" +
                "            },\n" +
                "            \"GroupMenmber\": [\n" +
                "                {\n" +
                "                    \"activity\": \"0\",\n" +
                "                    \"create_time\": \"1456466209\",\n" +
                "                    \"group_id\": \"9\",\n" +
                "                    \"id\": \"15\",\n" +
                "                    \"isCreator\": \"1\",\n" +
                "                    \"last_view\": \"1456797151\",\n" +
                "                    \"position\": \"3\",\n" +
                "                    \"status\": \"1\",\n" +
                "                    \"uid\": \"102\",\n" +
                "                    \"update_time\": \"1456466209\",\n" +
                "                    \"user\": {\n" +
                "                        \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                        \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                        \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                        \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                        \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                        \"fans\": \"0\",\n" +
                "                        \"following\": \"0\",\n" +
                "                        \"nickname\": \"tangdejun\",\n" +
                "                        \"real_nickname\": \"tangdejun\",\n" +
                "                        \"score1\": \"100\",\n" +
                "                        \"space_link\": \"tangdejun\",\n" +
                "                        \"space_mob_url\": \"/opensns/index.php?s=/mob/user/index/uid/102.html\",\n" +
                "                        \"space_url\": \"/opensns/index.php?s=/ucenter/index/index/uid/102.html\",\n" +
                "                        \"title\": \"Lv3 转正\",\n" +
                "                        \"uid\": \"102\",\n" +
                "                        \"weibocount\": \"4\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"activity\": \"0\",\n" +
                "            \"allow_user_group\": \"\",\n" +
                "            \"background\": false,\n" +
                "            \"create_time\": \"02月26日 13:56\",\n" +
                "            \"detail\": \"龙鱼饲养群组内容龙鱼饲养群组内容龙鱼饲养群组内容龙鱼饲养群组内容龙鱼饲养群组内容龙鱼饲养群组内容\",\n" +
                "            \"id\": \"9\",\n" +
                "            \"is_join\": \"0\",\n" +
                "            \"logo\": \"/opensns/Uploads/Picture/2016-02-26/56cfe91adaec7.jpg\",\n" +
                "            \"member_alias\": \"\",\n" +
                "            \"member_count\": \"0\",\n" +
                "            \"menmberCount\": \"1\",\n" +
                "            \"post_count\": \"0\",\n" +
                "            \"sort\": \"0\",\n" +
                "            \"status\": \"1\",\n" +
                "            \"title\": \"龙鱼饲养群组标题\",\n" +
                "            \"type\": \"0\",\n" +
                "            \"type_id\": \"1\",\n" +
                "            \"uid\": \"102\",\n" +
                "            \"user\": {\n" +
                "                \"avatar128\": \"/opensns/Public/images/default_avatar_128_128.jpg\",\n" +
                "                \"avatar256\": \"/opensns/Public/images/default_avatar_256_256.jpg\",\n" +
                "                \"avatar32\": \"/opensns/Public/images/default_avatar_32_32.jpg\",\n" +
                "                \"avatar512\": \"/opensns/Public/images/default_avatar_512_512.jpg\",\n" +
                "                \"avatar64\": \"/opensns/Public/images/default_avatar_64_64.jpg\",\n" +
                "                \"nickname\": \"tangdejun\",\n" +
                "                \"real_nickname\": \"tangdejun\",\n" +
                "                \"uid\": \"102\",\n" +
                "                \"username\": \"tangdejun\"\n" +
                "            }\n" +
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
