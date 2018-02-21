<!--http://stargate.ncc.edu/~mel1481/ite254hw4.php-->

<html>
<head>
<title>Fun With PHP</title>

<style type="text/css">

body {
	background-color: lightyellow;
	font-family: arial;
	text-align: center;
}

#contentwrap {
	width: 800px;
	margin: 15px auto 0px auto;
	background-color: #FFFFFF;
	border: 5px maroon solid;
	border-radius: 15px;
	padding: 15px;
	color: green;
}

#title {
	color: maroon;
	font-size: 2em;
	border-bottom: 6px black double;
	padding-bottom: 7px;
}

.text {
	margin: 20px 0px 0px 0px;
}

.even {
	color: red;
}

.odd {
	color: blue;
}

</style>
</head>

<body>

<div id="contentwrap">
	<div id="title">
		Cody Mellon
	</div>
<?php
$name = array("C","o","d","y"," ","M","e","l","l","o","n");

echo "<br><br><div>First name is ";

for($i=0; $i<=(count($name)-1); $i++){
	if($name[$i] == " "){
		break;
	}
	echo $name[$i];
}

echo "</div><br>\n";

echo "<div>Last name is ";

for($i=0; $i<=(count($name)-1); $i++){
	if($name[$i] == " "){
		for($j=$i + 1; $i<=(count($name)-1); $i++){
			echo $name[$i];
		}
	}
}

echo "</div><br>\n";

echo "<div>And backwards is ";

for($i=(count($name)-1); $i>=0; $i--){
	echo $name[$i];
}

echo "</div><br>\n";

echo "<div>And how about this...</div><div>\n";

for($i=0; $i<=(count($name)-1); $i++){
	echo $name[$i] . $i;
}

echo "</div><br>\n";

echo "<div>And last for the extra challenge</div>\n<div>";

for($i=0; $i<=(count($name)-1); $i++){
	if($i % 2 == 0){
		echo "<span class='even'>$name[$i]</span>\n";
	}else{
		echo "<span class='odd'>$name[$i]</span>\n";
	}
}
echo "</div>";

?>
</div>
</body>
</html>