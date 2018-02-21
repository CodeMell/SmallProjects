<html>
<head>
<title></title>
<style type = "text/CSS">

body{
	text-align: center;
	font-family: arial;
}

#heading{
	font-size: 1.75em;
	color: purple;
}

#goodscore{
	color: green;
}

#badscore{
	color: red;
}

</style>
</head>

<body>

<div id="heading">Welcome to my first PHP webpage</div>

<?php
echo "<div>I am all set to learn this stuff</div>\n";

$score1 = 190;
$score2 = 280;
$score3 = 200;

$average = ($score1 + $score2 + $score3) / 3;

echo "<div>Your bowling average is " . round($average,0) . "</div>";

if($average >= 200){
	echo "<div id='goodscore'>Hey great job with that score!</div>\n";
}else{
	echo "<div id='badscore'>Better practice more!</div>\n";
}

?>

</body>
</html>
