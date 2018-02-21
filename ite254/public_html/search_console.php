<?php
require_once(".htpasswd");
?>
<html>
<head>
<title></title>

<link rel="stylesheet" type="text/css" href="gameStyles.css">

</head>
<body>

<div id="contentwrap">

	<div id="heading">Search Games by Console</div>
	
	<div>
	
	<form method="post" action="search_console.php">
		<div>Select a console</div>
		
		<select name="console">
			<?php
			
			$query = "SELECT * FROM consoles;";
			
			$results = mysqli_query($link, $query)
				or die("Error getting consoles " . mysqli_error($link));
				
			for($i=0; $i < mysqli_num_rows($results); $i++){
				$consoleArray = mysqli_fetch_array($results);
				
				echo "<option ";
				if(isset($_POST['console'])){
					if($consoleArray['consoleID'] == $_POST['console']){
						echo "selected ";
					}
				}
				echo "value='" . $consoleArray['consoleID'] . "'>" . $consoleArray['company'] . " " . $consoleArray['consoleName'] . "</option>\n";
			}
			?>
		</select>
		
		<div>
			<input class="buttonMargin" type="submit" value="Search">
		</div>
		
	</form>
		
		<?php
		
		if(isset($_POST['console'])){
			
			$query = "SELECT * FROM inventory WHERE consoleID = " . $_POST['console'] . ";";
			
			$results = mysqli_query($link, $query)
				or die("Error getting games " . mysqli_error($link));
				
			echo "<div class='spacer'>Found " . mysqli_num_rows($results) . " games</div>\n";
			
			for($i=0; $i < mysqli_num_rows($results); $i++){
				$gamearray = mysqli_fetch_array($results);
				
				echo "<div>Title: " . $gamearray['title'] . "</div>\n";
				echo "<div>Genre: " . $gamearray['genre'] . "</div>\n";
				echo "<div>Stock: " . $gamearray['quantity'] . "</div>\n";
				echo "<div style='margin-bottom: 20px;></div>\n";
			}
		}
		
		
		?>
		

	
	
	
	
	</div>	
	
</div> <!-- ends div#contentwrap -->

</body>
</html>




