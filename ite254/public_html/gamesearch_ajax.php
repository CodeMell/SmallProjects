<?php

// establish communication with MySQL
$link = mysqli_connect( "stargate.ncc.edu", "i254ra", "i254ra", "i254ra" );

$query = "select * from inventory where title"
	." like '%". $_POST['thegame'] ."%'";
	
$results = mysqli_query( $link, $query )
	or die( "Error getting games ". mysqli_error($link) );
	
if( mysqli_num_rows( $results ) == 0 ) 
	echo "<div>No Matches Found!!!</div>";
else {
	
	for( $i = 0; $i < mysqli_num_rows( $results ); $i++ ) {
		
		$gamearray = mysqli_fetch_array( $results );
		echo "<div>Title : ". $gamearray['title'] ."</div>";	
	}
}
?>