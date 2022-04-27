package com.git;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("Hello Git2!");
        System.out.println("Hello Git3!");
        System.out.println("Hello Git4!");
        System.out.println("master Test");
        System.out.println("hot-fix Test");
        System.out.println("push Test");
        System.out.println("pull Test");
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<div id="timer" style="color: red"></div>
	</body>
	<script type="text/javascript">
	var oBox=document.getElementById("timer");
	var maxtime=6*60;

	function CountDown()
	{
	 
	 
	 if(maxtime>-1)
	 {
	  minutes=Math.floor(maxtime/60);
	  second=Math.floor(maxtime%60);
	  msg="距离结束还有"+minutes+"分"+second+"秒";
	  oBox.innerHTML=msg;
	  if(maxtime==5*60) arert="还剩5分钟";
	  --maxtime;
	 }
	 else
	 {
	   clearInterval(timer);
	 }
	}
	timer = setInterval("CountDown()",1000);
	</script>
</html>

    }
}
