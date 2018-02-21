<!-- http://stargate.ncc.edu/~mel1481/ite254proj2.php -->
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

.button{
	margin: 15px;
	color: red;
}

.title{
	border-bottom: 6px red double;
	font-size: 1.5em;
	margin-bottom: 15px;
}

.bottomdiv {
 	margin-bottom: 15px;
 }

 .spacer {
	margin-bottom: 10px;
 }

</style>

</head>
<body>

<div id="contentwrap">

	<div id="heading">Vote For Your Favorite Band!!</div>

	<div>
		<form method="post" action="ite254proj2.php">
			<div class="title">Vote Here</div>
			<?php
			$query = "SELECT * FROM bands";
			$bandresults = mysqli_query($link, $query) or die("Error getting bands " . mysqli_error($link));
			$numBands = mysqli_num_rows($bandresults);

			for($i=0; $i < $numBands; $i++){
				$bandArray = mysqli_fetch_array($bandresults);

				echo "<div><input type = radio name = 'bandSelection' value = '" . $bandArray['bandID'] . "'>" . $bandArray['bandName'] . "</div>\n";
			}
			?>
			<input class="button" type="submit" name="submit">
		</form>

		<?php
		if(isset($_POST['submit'])){
			echo "<div class='title'>Results so far</div>";
			$bandSel = $_POST['bandSelection'];
			$query = "INSERT INTO votes VALUES (null," . $_POST['bandSelection'] . ")";
			mysqli_query($link, $query) or die("Error inserting vote " . mysqli_error($link));

			$query = "SELECT * FROM votes";
			$voteresults = mysqli_query($link, $query) or die("Error getting votes " . mysqli_error($link));
			$totalVotes = mysqli_num_rows($voteresults);


			echo "<div class='spacer'>" . $totalVotes . " Votes So Far</div>";
			$query = "SELECT * FROM bands";
			$bandresults = mysqli_query($link, $query) or die("Error getting bands again " . mysqli_error($link));

			for($i=0; $i < $numBands; $i++){

				$bandArray = mysqli_fetch_array($bandresults);

				$query = "SELECT * FROM votes WHERE bandID = " . $bandArray['bandID'] . ";";
				$results = mysqli_query($link, $query) or die("Error counting votes " . mysqli_error($link));
				$votecount = mysqli_num_rows($results);
				$percent = round(($votecount / $totalVotes) * 100, 1);

				echo "<div>" . $bandArray['bandName'] . " Has " . $votecount . " votes ( " . $percent . "% of total)";
			}
		}

		?>
	</div>

</div> <!-- ends div#contentwrap -->

</body>
</html>
