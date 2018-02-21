<?php
if( isset( $_POST['conid'] ) ) {

	$link = mysqli_connect( "stargate.ncc.edu", "mel1481", "mel1481", "mel1481" );
	// ****************************************//
	// put your connection to database code here
	// ****************************************//


	$gamequery = "select * from inventory where consoleID=". $_POST['conid'];
	$game_results = mysqli_query( $link, $gamequery )
		or die( "Could not connect". mysqli_error( $link ) );

	echo "Number of games found is ". mysqli_num_rows( $game_results) ."<p />\n";

	for( $i = 0; $i < mysqli_num_rows( $game_results); $i++ ) {

		$gamearray = mysqli_fetch_array( $game_results );
		echo "<div>Game name: ". $gamearray['title'] ."</div>\n";
		echo "<div>Price: $". $gamearray['price'] ."</div>\n";
		echo "<div style='margin-bottom:8px;'>Quantity: ". $gamearray['quantity'] ."</div>\n";

	}

}
?>
