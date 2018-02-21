<!--http://stargate.ncc.edu/~mel1481/ite254hw7.php-->
<?php
require_once(".htpasswd");
?>
<html>
<head>
<title></title>

<style type="text/css">

body {
	background-color: #454F8C;
	font-family: arial;
	color: #454F8C;
}

#pagewrap {
	background: #F4F5E7;
	border: 8px #FF9E01 solid;
	padding: 20px;
	width: 500px;
	height: 400px;
	margin: 20px auto 0px auto;
	border-radius: 25px;
	text-align: center;
}

#heading {
	font-size: 2em;
	border-bottom: 6px #484452 double;
	padding: 10px 0px 10px 0px;
}

#contentwrap {
	margin-top: 50px;
}

</style>

</head>
<body>

<div id="pagewrap">

	<div id="heading">When this page loads,<br>the value of the count field is increased by 1</div>
	
	<div id="contentwrap">
	
		<?php
		
		$query = "UPDATE pageLoadCounter SET counter = counter + 1;";
		
		mysqli_query($link, $query) or die("Error updating counter " . mysqli_error($link));
		
		$query = "SELECT * FROM pageLoadCounter;";
		
		$results=mysqli_query($link, $query) or die("Error getting counter " . mysqli_error($link));
		
		$counterArray = mysqli_fetch_array($results);
		
		echo "<div>The page has been loaded and the counter has increased to " . $counterArray['counter'] . "</div>";
		
		?>
		
	</div>  <!-- ends div#contentwrap -->
	
</div> <!-- ends div#pagewrap -->

</body>
</html>




