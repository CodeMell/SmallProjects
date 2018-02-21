<!--link to stargate-->
<!--http://stargate.ncc.edu/~mel1481/ite254hw3.php-->
<html>
<head>
<title></title>
<style type="text/CSS">

body{
	text-align: center;
	background-color: grey;
}

#header{
	font-size: 2.4em;
}
</style>
</head>

<body>

<div id="header">Homework #3</div>

<?php
	$num1 = rand(0,100);
	$num2 = rand(0,100);
	$num3 = rand(0,100);
	
	echo "<div>" . $num1 . "</div>\n";
	echo "<div>" . $num2 . "</div>\n";
	echo "<div>" . $num3 . "</div>\n";
	echo "<br>\n";
	
	if($num1 > $num2 && $num1 > $num3){
		$max = $num1;
	}else if($num2 > $num1 && $num2 > $num3){
		$max = $num2;
	}else{
		$max = $num3;
	}
	
	if($num1 < $num2 && $num1 < $num3){
		$min = $num1;
	}else if($num2 < $num1 && $num2 < $num3){
		$min = $num2;
	}else{
		$min = $num3;
	}
	
	for($i = $min;$i <= $max;$i++){
		echo "<div>" . $i . "</div>\n";
	}
	
?>
</body>
</html>