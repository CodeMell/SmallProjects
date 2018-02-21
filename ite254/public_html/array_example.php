<?php

$colors = array("green", "purple", "#0000FF", "silver");

?>

<html>
<head>
<title>Arrays in PHP</title>

<style type="text/css">

body {
	<?php
	if(isset($_POST['colorindex']) && isset($_POST['fontChoice'])){
		echo "background-color: " . $colors[$_POST['colorindex']] . ";\n";
		echo "font-family: " . $_POST['fontChoice'] . ";\n";
	}else{
		echo "background-color: lightblue;\n";
		echo "font-family: arial;\n";
	}
	?>
	font-size: 1em;
	text-align:center;
}

#pagewrap {
	border: 5px darkred double;
	padding: 40px;
	width: 700px;
	margin: 40px auto 0px auto;
	background-image: url( "http://newton.ncc.edu/gansonj/ite254/img/flowers.jpg" );
}

#contentwrap {
	border: 7px darkblue solid;
	padding: 20px;
	background: white;
}

#headingwrap {
	border: 8px double darkgreen;
}

#heading {
	font-family: arial;
	padding-top: 15px;
	padding-bottom: 15px;
	background: darkred;
	font-size: 1.5em;
	color: white;
}

#slogan {
	padding-top: 15px;
	padding-bottom: 15px;
	background: silver;
	color: black;
	font-size: 1.25em;
}

#formwrap {
	margin-top: 35px;
}

.formfield {
	padding: 4px;
	font-size: 1em;
	width: 300px;
	background: #CCCC99;
	color: black;
	border: 2px black solid;
}

#thebutton {
	background: #003366;
	color: white;
	cursor: pointer;
	padding: 5px 0px 5px 0px;
	border: 3px solid #CCCC99;
	border-radius: 25px;
	width: 150px;
}

#thebutton:hover {
	background: #CCCCCC;
	color: #003366;
	border: 3px solid #003366;
}

</style>

</head>
<body>

<div id="pagewrap">

	<div id="contentwrap">
	
		<div id="headingwrap">
		
			<div id="heading">Fun with Arrays in PHP</div>
		
			<div id="slogan">Keeping your data organized since 1994</div>
		
		</div> <!-- closes div#headingwrap -->
		
		<div id="formwrap">
		
			<form method="post" action="<?php $_SERVER['php_self'];?>">
				<div>Please choose a background color</div>
				<select class="formfield"name="colorindex">
					<?php
						for($i=0; $i < count($colors); $i++){
							echo "<option value='" . $i . "'>" . $colors[$i] . "</option>";
						}
					?>
				</select>
				
				<div>
					Select a font
				</div>
				<div><input type="radio" name="fontChoice" value="arial">Arial</div>
				<div><input type="radio" name="fontChoice" value="comic sans ms">Comic Sans MS</div>
				<div><input type="radio" name="fontChoice" value="verdana">Verdana</div>
				
				<input type="submit" value="Do The Fun!" id="thebutton">
			</form>
			
		</div>
	
	</div> <!-- closes div#contentwrap -->
	
</div> <!-- closes div#pagewrap -->

</body>
</html>