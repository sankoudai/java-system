<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <script src="/static/js/cookieUtil.js"></script>
    <script src="/static/js/jquery-1.12.0.min.js"></script>
</head>
<body>
<script type="text/javascript">
    $(function () {
        var cookieName = "testerCookie";
        alert(getCookie(cookieName));
        alert(getCookie(cookieName));
        delCookie(cookieName);
        alert(getCookie(cookieName));
    });
</script>

</body>
</html>