package com.example.DesignPatternIOC.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 提供簡易首頁回應的 Servlet，示範在 Spring Boot 中註冊傳統 HttpServlet。
 */
@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

    /**
     * 處理 GET 請求並回傳簡單訊息，展示 servlet 與 IoC 結合的基礎行為。
     *
     * @param request  HTTP 請求物件
     * @param response HTTP 回應物件
     * @throws ServletException 發生 Servlet 層級錯誤時拋出
     * @throws IOException      寫出回應失敗時拋出
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 設定回應內容類型為純文字，並指定編碼為 UTF-8
        response.setContentType("text/plain;charset=UTF-8");
        // 將簡單訊息寫回給呼叫端，確認 servlet 正常運作
        response.getWriter().println("Hello from HomeServlet");
        // 在請求屬性中設定使用者名稱，供 JSP 頁面使用
        request.setAttribute("userName", "Anthony");
        // 轉發請求至 JSP 頁面
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }
}
