<!--http://stargate.ncc.edu/~mel1481/exam1form.php-->
<html>
<head>
<title></title>

<style type="text/css">

#bodystyles {
	font-family: arial;
	background-color: #218559;
}

#contentwrap {
	border: 8px #3C4884 solid;
	background-color: #F6FA9C;
	padding: 20px;
	width: 600px;
	margin: 25px auto 0px auto;
}

#maintitle {
	border: 8px #DD1E2F double;
	background-color: #D0C6B1;
	color: #000000;
	text-align: center;
	font-size: 1.85em;
	font-weight: bold;
	padding: 20px 0px 20px 0px; /*top right bottom left*/
}

#subtitle {
	color: #218559;
	text-align: center;
	font-size: 1.25em;
	font-weight: bold;
	margin-top: 20px;
}

#formwrap {
	border: 8px #DD1E2F double;
	background-color: #FFFFFF;
	padding: 20px;
	margin-top: 20px;
	font-size: 1em;
}

.formtext {
	color: maroon;
	margin-top: 12px;
}


</style>

</head>
<body id="bodystyles">

<div id="contentwrap">

	<div id="maintitle">Ye Old Paint Store</div>
	
	<div id="subtitle">Order your paint here, delivery takes 2 - 4 weeks</div>

	<div id="formwrap">
	
		<form method="post" action="<?php $_SERVER['php_self']; ?>">
	
			<div class="formtext">Please enter your name:</div>
			<input type="text" name="custname" size="30" />

			<div class="formtext">Please enter number of gallons to buy:</div>
			<input type="text" name="gallons" size="10" />

			<div class="formtext">Select a color for your paint:</div>
			<select name="color">
				<option value="green">Green</option>
				<option value="blue">Blue</option>
				<option value="purple">Purple</option>
				<option value="red">Red</option>
			</select>

			<div style="margin-top: 15px;">
				<input type="submit" value="Place Order" />
			</div>
			
		</form>
		
		<!-- your PHP goes here -->
		<?php
		if(isset($_POST['custname'])){
			$custname = $_POST['custname'];
			$gallons = $_POST['gallons'];
			$color = $_POST['color'];
			
			$total = ($gallons * 10) + 15;
			
			echo "<div>Custom paint order for " . $custname . "</div>\n";
			echo "<div style='color: " . $color . ";'>You have chosen the color " . $color . "</div>\n";
			echo "<div>Total cost is $" . $total . "</div>\n"; 
		}
		?>
		

	</div> <!-- ends div#formwrap -->

</div> <!-- ends div#contentwrap -->

</body>
</html>