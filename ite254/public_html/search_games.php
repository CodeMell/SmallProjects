

<html>
<head>
<title></title>

<link rel="stylesheet" type="text/css" href="gameStyles.css">

</head>
<body>

<div id="contentwrap">

	<div id="heading">Search All Video Games in Inventory</div>
	
	<div>
	
	<form method="post" action="search_games.php">
	
		<div id="formtext">Enter video game name</div>
		<input type="text" name="gamename" size="40" />
		
		<div style="margin-top:15px;">
			<input type="submit" value="Search Inventory" />
		</div>
	
	</form>
	
	<?php
	//establish connection with mysql account
	if(isset($_POST['gamename'])){
		$link =	mysqli_connect("stargate.ncc.edu", "mel1481", "mel1481", "mel1481");
	
		//set sql command
		$query = "select * from inventory where title = '" . $_POST['gamename'] . "';";
	
		$results = mysqli_query($link, $query)
			or die("An error happened " . mysqli_error($link));
	
		$rows = mysqli_num_rows($results);
	
		echo "<div>Games found: " . $rows . "</div>";
	
	}
	?>
	
	
	
	</div>	
	
</div> <!-- ends div#contentwrap -->

</body>
</html>




