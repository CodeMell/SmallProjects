<!--http://stargate.ncc.edu/~mel1481/ite254proj1.php-->
<?php
$size = array("11 inches","13 inches","15 inches");
$sizePrice = array(600, 700, 900);

$processor = array("i3", "i5", "i7");
$processorPrice = array(0, 100, 200);

$ram = array("4 GB", "8 GB", "16 GB");
$ramPrice = array(0, 50, 100);
?>
<html>
<head>
<title></title>

<style type="text/css">

body {
	background-image: url("https://i.imgur.com/6anlAgx.png");
	background-color: lightyellow;
	font-family: arial;
	text-align: center;
}

#contentwrap {
	background-color: lightblue;
	background-image: url("https://i.imgur.com/Roe2STG.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	border: 10px black solid;
	border-radius: 20px;
	padding: 20px;
	width: 700px;
	margin: 30px auto 0px auto;
}

#maintitle {
	background-color: darkblue;
	border: 8px black double;
	border-radius: 20px;
	color: white;
	font-size: 2.25em;
	padding: 25px 0px 25px 0px;
	font-weight: bold;
}

#infowrap {
	background-color: lightgrey;
	border: 8px green solid;
	border-radius: 10px;
	padding: 20px;
	margin: 20px 60px 0px 60px;
}

.formtext {
	font-size: 1.29em;
	margin-top: 20px;
}

.formfield {
	background-color: white;
	border: 2px darkblue solid;
	margin-top: 8px;
}

#spacer {
	margin-bottom: 5px;
}

#submitButton{
	width:150px;
	height:50px;
}

</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

function colorMenu(){
	if($("#selectColor").is(":checked")){
		document.getElementById("colormenu").innerHTML="<select name='color' class='formfield'><option value='red'>Red</option><option value='black'>Black</option><option value='stainless'>Stainless</option><option value='blue'>Blue</option><option value='yellow'>Yellow</option></select>";
	}else if($("#customColor").is(":checked")){
		document.getElementById("colormenu").innerHTML="<div class='formtext'>Input a custom color in hex:</div><input name='color' type='text' class='formfield'>";
	}
}	

</script>

</head>
<body>

<div id="contentwrap">

	<div id="maintitle">
		Laptop Shop Spot
	</div>
	
	<div id="infowrap">

		<!-- form goes here -->
		<form method="post" action="<?php $_SERVER['php_self'];?>">
			<div class="formtext">Select Size</div>
			<select class="formfield" name="size">
				<?php
					for($i=0; $i<count($size); $i++){
						echo "<option value='" . $i . "'>" . $size[$i] . " $" . $sizePrice[$i] . "</option>\n";
					}
				?>
			</select>
			
			<div class="formtext">Select Processor</div>
			<select class="formfield" name="processor">
				<?php
					for($i=0; $i<count($processor); $i++){
						echo "<option value='" . $i . "'>" . $processor[$i] . " +$" . $processorPrice[$i] . "</option>\n";
					}
				?>
			</select>
			
			<div class="formtext">Select RAM</div>
			<select class="formfield" name="ram">
				<?php
					for($i=0; $i<count($ram); $i++){
						echo "<option value='" . $i . "'>" . $ram[$i] . " +$" . $ramPrice[$i] . "</option>\n";
					}
				?>
			</select>
			
			<div class="formtext">Select your display type</div>
			<input class="formfield" type="radio" name="display" value="IPS" checked="checked">IPS +$20
			<input class="formfield" type="radio" name="display" value="TN">TN +$0
			<input class="formfield" type="radio" name="display" value="LED">LED +$50
			
			<div class="formtext">Color:</div>
			<input class="formfield" type="radio" name="colorRadio" id="selectColor" checked="checked" onChange="colorMenu()">Select Color
			<input class="formfield" type="radio" name="colorRadio" id="customColor" onChange="colorMenu()">Custom Color
			
			<div id="colormenu">
				<select name="color" class="formfield">
					<option value="red">Red</option>
					<option value="black">Black</option>
					<option value="stainless">Stainless</option>
					<option value="blue">Blue</option>
					<option value="yellow">Yellow</option>
				</select>
			</div>
			
			<div style="margin-top: 20px;"><input type="submit" value="Place Order" class="formfield" id="submitButton"></div>
		
		</form>
		
		<?php
			if(isset($_POST['size']) && isset($_POST['processor']) && isset($_POST['ram']) && isset($_POST['color']) && isset($_POST['display'])){
				
				$sz = $_POST['size'];
				$cpu = $_POST['processor'];
				$rm = $_POST['ram'];
				$display = $_POST['display'];
				$color = $_POST['color'];
				
				
				if($sz != null && $cpu != null && $rm != null && $color != null && $display != null){
					
					switch($display){
						case "IPS":
							$displayCost = 20;
							break;
						case "TN":
							$displayCost = 0;
							break;
						case "LED":
							$displayCost = 50;
							break;
					}
					$total = $sizePrice[$sz] + $processorPrice[$cpu] + $ramPrice[$rm] + $displayCost;
					echo "<div id='output'>Your total is $" . $total . "<br>\n";
					echo "Order Details:<br>\n";
					echo "Size: " . $size[$sz] . "<br>\n";
					echo "Processor: " . $processor[$cpu] . "<br>\n";
					echo "RAM: " . $ram[$rm] . "<br>\n";
					echo "Display: " . $display . "<br>\n";
					echo "Color: " . $color . "</div>\n";
					
				}else{
					echo "<div>Enter valid values in all fields</div>\n";
				}
			}
		?>
		
	</div> <!-- ends div#infowrap -->

</div> <!-- ends div#contentwrap -->

</body>
</html>




