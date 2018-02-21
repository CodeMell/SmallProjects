function calcAvg(num1, num2){
	var avg = (num1 + num2) / 2;
	return avg;
}

function findMax(num1,num2){
	if(num1 > num2){
		return num1
	}else if(num2 > num1){
		return num2
	}
}

function setImage(picname, img){
	document.getElementById(picname).src = img;
}
