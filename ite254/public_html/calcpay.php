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
	font-size: 2.25em;
	padding: 25px 0px 25px 0px;
	font-weight: bold;
}

#infowrap {
	background-color: lightyellow;
	border: 8px red double;
	padding: 20px;
	margin: 20px 60px 0px 60px;
	height: 450px;
}

.formtext {
	font-size: 1.29em;
	margin-top: 20px;
}

.formfield {
	background-color: lightgray;
	border: 2px darkred solid;
}

#spacer {
	margin-bottom: 5px;
}

</style>

</head>
<body>

<div id="contentwrap">

	<div id="maintitle">
		Calculate Total Cost
	</div>
	
	<div id="infowrap">

		<!-- form goes here -->
		<form method="get" action="calcpay.php">
			
			<div class="formtext">Enter Quantity</div>
			<input type="text" class="formfield" name="quantity"/>
			
			<div class="formtext">Enter Price of Item</div>
			<input type="text" class="formfield" name="price"/>
			
			<div style="margin-top: 15px;">
				<input type="submit" value="Calculate Pay"/>
			</div>
		</form>
		
		<?php
			if(isset($_GET['quantity']) && isset($_GET['price'])){
				
				$quantity = $_GET['quantity'];
				$price = $_GET['price'];
				
				if($quantity != null && $price != null){
				
					$total = $quantity * $price;
					echo "<div>Total Price is $" . $total . "</div>";
				}else{
					echo "<div>Enter valid values in both fields</div>";
				}
			}
		?>
		
	</div> <!-- ends div#infowrap -->

</div> <!-- ends div#contentwrap -->

</body>
</html>




