<?php
require_once(".htpasswd");
?>
<html>
<head>
<title></title>
<style type="text/css">
body {
	background-image: url("http://newton.ncc.edu/gansonj/ite254/img/vgbkg.png");
	font-family: arial;
	color: #454F8C;
}

#contentwrap {
	background: #FFFFFF;
	background-image: url("http://newton.ncc.edu/gansonj/ite254/img/spyro.jpg");
	background-repeat: no-repeat;
	background-position: right 150;
	border: 8px #FF9E01 solid;
	padding: 20px;
	width: 650px;
	margin: 20px auto 0px auto;
	border-radius: 25px;
	min-height: 400px;
}

#heading {
	font-size: 2.2em;
	border-bottom: 6px #484452 double;
	padding: 10px 0px 10px 0px;
	text-align: center;
	margin-bottom: 20px;
}

.bottomdiv {
 	margin-bottom: 15px;
 }

 .spacer {
	margin-bottom: 10px;
 }
</style>

<script type="text/javascript">

function confirmDelete(){
	return window.confirm("Are you sure you want to delete this game?");
}

</script>

</head>

<body>

<div id="contentwrap">

	<div id="heading">Video Game Inventory Management Page</div>

	<div>
		<?php
		if(isset($_POST['gameid'])){
			$query = "DELETE FROM inventory WHERE gameid=" . $_POST['gameid'];
			$result = mysqli_query($link, $query) or die("Error deleting game " . mysqli_error($link));
			if($result){
				echo "<div>Game deleted successfully</div>";
			}else{
				echo "<div>Failed to delete game</div>";
			}
		}
		?>

		<!-- table goes here -->
		<table border="3" width="90%">
			<tr>
				<td>Game Title</td>
				<td>Platform</td>
				<td>Quantity</td>
				<td>Action</td>
			</tr>
		<?php

		$query = "SELECT * FROM inventory as i INNER JOIN consoles as c ON i.consoleID = c.consoleID;";
		$results = mysqli_query($link, $query) or die("Error getting games " . mysqli_error($link));

		for($i = 0; $i < mysqli_num_rows($results); $i++){
			$gamearray = mysqli_fetch_array($results);

			echo "<tr><td>" . $gamearray['title'] . "</td>\n<td>" . $gamearray['company'] . " " . $gamearray['consoleName'] . "</td>\n<td>" . $gamearray['quantity'] . "</td>\n";
			echo "<td>";

			echo "<form onSubmit='return confirmDelete()' method='post' action='gametable.php'>\n";
			echo "<input type='submit' value='Delete'>\n";
			echo "<input type='hidden' name='gameid' value='" . $gamearray['gameid'] . "'>\n";

			echo "</form>";
			echo "</td></tr>\n\n";
		}
		?>


		</table>


	</div>

</div> <!-- ends div#contentwrap -->

</body>
</html>
