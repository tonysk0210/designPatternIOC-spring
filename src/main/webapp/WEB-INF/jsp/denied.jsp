<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-TW">
<head>
  <meta charset="UTF-8" />
  <title>存取被拒絕</title>
  <style>
    body{font-family:Arial,Helvetica,sans-serif;background:#f9f9f9;color:#333;padding:40px}
    .card{max-width:600px;margin:0 auto;background:#fff;padding:20px;border-radius:6px;border:1px solid #eee}
    a.button{display:inline-block;padding:8px 12px;background:#2d8cff;color:#fff;text-decoration:none;border-radius:4px}
  </style>
</head>
<body>
  <div class="card">
    <h1>存取被拒絕</h1>
    <p>本次請求已被系統拒絕。如有疑問請聯絡管理員。</p>

    <p><strong>User-Agent:</strong> ${userAgent}</p>

    <p><a class="button" href="${pageContext.request.contextPath}/">回到首頁</a></p>
  </div>
</body>
</html>