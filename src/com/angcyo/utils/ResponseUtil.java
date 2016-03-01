package com.angcyo.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by angcyo on 2016-03-01 15:57.
 */
public class ResponseUtil {
    public static void write(HttpServletResponse response, String data) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(data);
        writer.close();
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
