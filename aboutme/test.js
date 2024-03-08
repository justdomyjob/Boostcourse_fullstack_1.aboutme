var currentDate = new Date();
var calendar = "현재시간 : "+currentDate.getFullYear() + "/" + (currentDate.getMonth()+1) "/" + currentDate.getDate() + " " + currentDate.getHours() + ":" + currentDate.getMinutes();
document.write(calendar);