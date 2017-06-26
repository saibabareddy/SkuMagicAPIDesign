/*$(document).ready(function(){
    setInterval(function(){
        $("#console").load('/js/spring.log');
    }, 3000); // <-- Here
});*/
function showConsole(){
	$("#console").show();
	$("#console").load('/js/ApparelMagicLog.txt');
}
function showhide(show,hide){
    document.getElementById(hide).style.display = "none";
    document.getElementById(show).style.display = "block";
}

