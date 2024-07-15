$(".after").click(function() {
    $(".after i").toggleClass("fa-chevron-up");
})

$(".after-garage").click(function() {
    $(".after-garage i").toggleClass("fa-chevron-up");
})

$(document).ready(function() {
	const screenWidtht = window.screen.width;
    if(screenWidtht > 400){
        console.log("screenWidth > 400");
        $("#dummy-search-input-for-preact-render").show();
    } else {
        console.log("screenWidth < 400");
        $("#dummy-search-input-for-preact-render").hide();
    }
    $(window).scroll(function() {
        console.log(isDivVisible("search-header"));
        const screenWidth = window.screen.width;
       if (!isDivVisible("makeModelDivInner") && screenWidth > 946) {
            console.log('User has scrolled past the div');
            $("#makeModelDivInner").addClass("-fixed");
            $("#goBtn").addClass("goButton");        
        } else{
            console.log('User can see the div');
            $("#makeModelDivInner").removeClass("-fixed");
            $("#goBtn").removeClass("goButton");
        }   
        
        // Example usage
        console.log('Screen Width:', screenWidth);
    });
    
});

function isDivVisible(divId){
	try{		
	    var myDiv = $('#'+divId);
	    var rect = myDiv[0].getBoundingClientRect();
	    return rect.top < $(window).height() && rect.bottom >= 0;
	}  catch (ex) {}
	return false;
}
const divId = ['yearDiv', 'makeDiv', 'modelDiv'];
function showHideSearch(id){
    let cssClass = $("#"+id).attr('class');

    $.each(divId, function(index, value) {
        if (value === id) {
            return true; // Equivalent to 'continue' in jQuery each loop
        }
        $("#"+value).removeClass("-open");
        console.log(value);
    });
    if(cssClass.includes("-open")){
        $("#"+id).removeClass("-open");
    } else {
        $("#"+id).addClass("-open");
    }
}

function showVal(val, id){
    $("#"+id).html(val);
}