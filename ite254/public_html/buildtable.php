<html>
<head>
<title></title>

<style type="text/css">

body {
	background-color: lightyellow;
	font-family: arial;
	text-align: center;
}

#contentwrap {
	background-color: lightblue;
	border: 10px darkblue solid;
	padding: 20px;
	width: 700px;
	margin: 30px auto 0px auto;
}

#maintitle {
	background-color: darkblue;
	border: 8px darkred double;
	color: white;
	font-size: 1.75em;
	padding: 25px 0px 25px 0px;
	font-weight: bold;
}

#infowrap {
	background-color: lightyellow;
	border: 8px red double;
	padding: 20px;
	margin-top: 20px;
}

.formtext {
	font-size: 1.29em;
	margin-top: 20px;
}

#headrow {
	background-color: black;
	color: white;
}

</style>
</head>

<body>

<div id="contentwrap">

	<div id="maintitle">
		Create a table using PHP with<br />
		hard coded start and end numbers<p />
		
		<?php
			echo date("l, F j, Y");
		?>
	</div>
	
	<div id="infowrap">
		<table width="100%" border="3">
			<tr id="headrow">
				<td>Number</td>
				<td>Square Root</td>
				<td>Square</td>
			</tr>
		<?php
			$startnum = 17;
			$endnum = 102;
			for($i=$startnum; $i<=$endnum; $i++){
				echo "<tr>\n<td>" . $i . "</td>\n<td>" . round(sqrt($i),3) . "</td>\n<td>" . pow($i,2) . "</td>\n</tr>\n";
			}
	
		?>
		
		</table>
	
	</div> <!-- ends div#tablewrap -->

</div> <!-- ends div#contentwrap -->

</body>
</html>
