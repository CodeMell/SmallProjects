
<html>
<head>
<title></title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<script type="text/javascript">

$("document").ready(function(){
	$(".conlinks").click(function(){
		var conid = $(this).attr("id");

		$.ajax({
			url: "consoles_ajax.php",
			type: "POST",
			data: "conid=" + conid,
			success: function(msg){
				$("#output").hide();
				$("#output").html(msg);
				$("#output").show("slide");
			}
		});
	});
});

</script>

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
	font-size: 1.75em;
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

 #hotpick {
 	color: red;
}

 #lowpick {
 	color: green;
 }
</style>

</head>
<body>

<div id="contentwrap">

	<div id="heading">A little HTML, CSS, PHP, jQuery, Ajax and
			MySQL all working together in harmony!</div>

	<?php
	require_once(".htpasswd");
	$conquery = "SELECT * FROM consoles;";
	$conresults = mysqli_query($link, $conquery) or die("Error getting consoles " . mysqli_error($link));


	for($i = 0; $i < mysqli_num_rows($conresults); $i++){
		$conarray = mysqli_fetch_array($conresults);
		echo "<div><a href='javascript:void(0)' class='conlinks' id = '" . $conarray["consoleID"] . "'>" .
			$conarray['company'] . " " . $conarray['consoleName'] . "</a></div>\n";
	}




	?>





	<div id="output" style="margin-top:20px;"></div>



</div> <!-- ends div#contentwrap -->

</body>
</html>
