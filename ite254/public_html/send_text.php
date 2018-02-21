<?php

$carriers = array("AT&T","Verizon");
$domains = array("mobile.att.net","vtext.com");

?>
<html>
<head>
<title></title>



<style type="text/css">

body {
	background-color: #454F8C;
	font-family: arial;
	color: #454F8C;
}

#contentwrap {
	background: #F4F5E7;
	border: 8px #FF9E01 solid;
	padding: 20px;
	width: 600px;
	margin: 20px auto 0px auto;
	border-radius: 25px;
	text-align: center;
}

#heading {
	font-size: 2.2em;
	border-bottom: 6px #484452 double;
	padding: 10px 0px 10px 0px;
}

.formtext {
	text-align: center;
	margin-top: 20px;
}

#username {
	margin-top: 5px;
	margin-bottom: 20px;
}

#result {
	font-size: 1.25em;
	color: #FF0000;
}

</style>

</head>
<body>

<div id="contentwrap">

	<div id="heading">Send a text message using PHP</div>
	
	<form method="post" action="<?php $_SERVER['php_self'];?>">
		
		<div class="formtext">
			Enter Phone Number
		</div>
		<input type="text" name="phonenum">
		
		<div class="formtext">
			Select Carrier
		</div>
		<select name="domainSelect">
			<?php
			for($i=0; $i < count($carriers); $i++){
				echo "<option value='" . $domains[$i] . "'>" . $carriers[$i] . "</option>"; 
			}
			?>
		</select>
		
		<div class="formtext">Enter Message:</div>
		<textarea name="message" rows="8" cols="60"></textarea>
		
		<div style="margin-top: 15px;">
			<input type="submit" value="Send Text">
		</div>
	
	</form>
	<?php
		if(isset($_POST['phonenum']) && isset($_POST['domainSelect']) && isset($_POST['message'])){
			$phonenum = $_POST['phonenum'];
			$domain = $_POST['domainSelect'];
			$message = $_POST['message'];
			
			if($message != null && $domain != null && $message != null){
				mail($phonenum . "@" . $domain,'' , $message,'');
				
				echo "<div>Message successfully sent to " . $phonenum . "@" . $domain . "</div>";
			
			}else{
				echo "<div>Enter valid values in all fields</div>\n";
			}
		}
		
	?>
	
	
	
</div> <!-- ends div#contentwrap -->

</body>
</html>




