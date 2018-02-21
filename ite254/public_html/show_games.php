<!--http://stargate.ncc.edu/~mel1481/ite254hw6.php-->

<html>
<head>
<title></title>

<link rel="stylesheet" type="text/css" href="gameStyles.css">

</head>
<body>

<div id="contentwrap">

	<div id="heading">Display All Video Games in Inventory</div>
	
	<div>
	
	<!-- php goes here -->

	<?php
	//establish connection with mysql account
	$link =	mysqli_connect("stargate.ncc.edu", "mel1481", "mel1481", "mel1481");
	
	//set sql command
	$query = "select * from inventory order by title";
	
	$results = mysqli_query($link, $query)
		or die("An error happened " . mysqli_error($link));
	
	for($i=0; $i < mysqli_num_rows($results); $i++){
		$gamearray = mysqli_fetch_array($results);
		
		echo "<div>Title: " . $gamearray['title'] . "</div>\n";
		echo "<div>Genre: " . $gamearray['genre'] . "</div>\n";
		echo "<div>Stock: " . $gamearray['quantity'] . "</div>\n";
		if($gamearray["quantity"] > 10){
			echo "<div>Plenty of this game in stock</div>\n";
		}else{
			echo "<div>Order more!!\n</div>";
		}
		
		echo "<div style='margin-bottom: 20px;></div>\n";
	}
	
	
	?>
	</div>	
	
	
</div> <!-- ends div#contentwrap -->

</body>
</html>




