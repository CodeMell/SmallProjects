

<html>
<head>
<title></title>

<link rel="stylesheet" type="text/css" href="gameStyles.css">

</head>
<body>

<div id="contentwrap">

	<div id="heading">Search All Video Games in Inventory</div>
	
	<div>
	<?php
	//establish connection with mysql account
    $link =	mysqli_connect("stargate.ncc.edu", "mel1481", "mel1481", "mel1481");
	
	$query = "select * from inventory where quantity > 10;";
	
	$results = mysqli_query($link, $query)
		or die("An error happened " . mysqli_error($link));
	
	$rows = mysqli_num_rows($results);
	
	
	echo "<div style='margin-bottom:15px;'>Number of games found with a quantity > 10 is " . $rows . "</div>\n";
	
	for($i = 0; $i < $rows; $i++){
		$gamearray = mysqli_fetch_array($results);
		echo "<div>Title of game is " . $gamearray['title'] . "</div>\n";
		echo "<div>Quantity in stock is " . $gamearray['quantity'] . "</div>\n";
		$rating = $gamearray['rating'];
		if($rating > 7){
			echo "<div style='color: red; margin-bottom: 15px;'>With a critic score of " . $rating . " this game is a hot pick</div>\n";
		}else{
			echo "<div style='color: lightgreen; margin-bottom: 15px;'>With a critic score of " . $rating . " this game is NOT HOT</div>\n";
		}
	}
	

	
	?>
	</div>	
	
</div> <!-- ends div#contentwrap -->

</body>
</html>




