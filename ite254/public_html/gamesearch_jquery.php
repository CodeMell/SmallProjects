
<html>
<head>
<title></title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

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

 #hotpick {
 	color: red;
}

 #lowpick {
 	color: green;
 }
</style>
<script type="text/javascript">
$("document").ready(function(){
	$("#gameform").submit(function(){
		var gamename = $("#gamename").val();

		$.ajax({
			url: "gamesearch_ajax.php",
			type: "POST",
			data: "thegame=" + gamename,
			success: function(msg){
				$("#output").hide();
				$("#output").html(msg);
				$("#output").show("slide");

			}//ends success
		});//ends ajax
	});//ends submit
});//end document.ready


</script>


</head>
<body>

<div id="contentwrap">

	<div>

	<div id="heading">Search Video Games Using Ajax</div>

	<form action="javascript: void(0);" id="gameform">
		<div class="formtext">Enter game to search for</div>
		<input type="text" id="gamename">

		<div style="margin: 10px;">
			<input type="submit" value="Search Games">
		</div>

	</form>

	<div id="output" style="display:none;"></div>

	</div>

</div> <!-- ends div#contentwrap -->

</body>
</html>
