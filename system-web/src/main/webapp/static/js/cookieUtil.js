function getCookie(name) {
    if (document.cookie.length > 0) {
        startChar = document.cookie.indexOf(name + "=");
        if (startChar != -1) {
            startChar = startChar + name.length + 1;
            endChar = document.cookie.indexOf(";", startChar);
            if (endChar == -1) endChar = document.cookie.length;
            return unescape(document.cookie.substring(startChar, endChar));
        }
    }
    return "";
}

function delCookie(name)
{
    var exp = new Date();
    exp.setTime(exp.getTime() - 1);
    var cval=getCookie(name);
    if(cval!=null)
        document.cookie= name + "="+cval+";expires="+exp.toGMTString();
}