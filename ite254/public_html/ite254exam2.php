<!--http://stargate.ncc.edu/~mel1481/ite254exam2.php-->
<?php
$link =	mysqli_connect("stargate.ncc.edu", "i254ra", "i254ra", "i254ra");
 ?>
<html>
<head>
<title>ITE254 Exam #2</title>

<style type="text/css">

body {
	background-image: url("http://newton.ncc.edu/gansonj/ite254/img/bk2.jpg");
	color: darkblue;
	font-family: arial;
	text-align: center;
}

#pagewrap {
	border: 6px red double;
	padding: 20px;
	background-image: url("http://newton.ncc.edu/gansonj/ite254/img/swirls.jpg");
	width: 600px;
	margin: 25px auto 0px auto;
}

#heading {
	border: 6px red double;
	background-color: darkblue;
	font-size: 1.75em;
	padding: 15px;
	color: white;
}

#contentdiv {
	margin-top: 15px;
	border: 6px darkblue double;
	padding: 20px;
}

</style>

</head>

<body>

<div id="pagewrap">

	<div id="heading">ITE254 Exam #2 Fall 2017</div>

	<div id="contentdiv">

		<!-- php code to display student grades from database goes here -->
		<?php

		$query = "SELECT * FROM students WHERE examnum = 2;";
		$results = mysqli_query($link, $query) or die("Error getting grades " . mysqli_error($link));

		echo "<div style='margin-bottom: 20px;'>Students found in search: " . mysqli_num_rows($results) . "</div>\n";
		$totalgrade = 0;
		for($i=0; $i < mysqli_num_rows($results); $i++){
			$studarray = mysqli_fetch_array($results);
			echo "<div>Student Name: " . $studarray['lastname'] . "</div>\n";
			echo "<div>Grade: " . $studarray['grade'] . "\n";
			if($studarray['grade'] >=65){
				echo "<div style='color: green; margin-bottom: 20px;'>Good Job!!!</div>\n";
			}else{
				echo "<div style='color: red; margin-bottom: 20px;'>Gotta study more :(</div>\n";
			}
		 	$totalgrade += $studarray['grade'];
		}
		$averageGrade = $totalgrade/mysqli_num_rows($results);
		echo "<div>Average Grade: " . round($averageGrade,2) . "</div>\n";
		?>

	</div> <!-- ends div#formdiv -->

</div> <!-- ends div#pagewrap -->

</body>
</html>
