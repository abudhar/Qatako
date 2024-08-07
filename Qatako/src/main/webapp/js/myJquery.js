
$(document).ready(function() {
	$(document).ajaxStart(function() {
     	block();
    });
    $(document).ajaxComplete(function() {
    	unblock();
    }); 
    if(fnValidateString(page)){
		const params = getQueryParams();
		    if(fnValidateString(params.year)){
		    	$("#yearId").val(params.year).trigger('change');
		    }
		    if(fnValidateString(params.make) && !isNumeric1(params.make)){
                $("#makeId").val($("#makeId").find("option").filter(function() {
                        return $(this).text().toLowerCase() === params.make.toLowerCase();
                    }).val()).trigger('change');
		    }
		    if(fnValidateString(params.model) && !isNumeric1(params.model)){
                $("#modelId").val($("#modelId").find("option").filter(function() {
                        return $(this).text().toLowerCase() === params.model.toLowerCase();
                    }).val()).trigger('change');
		    }
	}
    
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

function fnValidateString(data){
	if(null === data || "null" === data || "" === data || "undefined" === data || undefined === data){
		return false;
	}else{
		return true;
	}
}

function fetchVin(){
        var vin =  $('#vinInput').val().trim();
		let year = fnValidateString($("#yearId").val())?$("#yearId").val():"";
		let make = fnValidateString($("#makeId").val())?$("#makeId").val():"";
		let model= fnValidateString($("#modelId").val())?$("#modelId").val():"";
		let subModel= fnValidateString($("#subModelId").val())?$("#subModelId").val():"";
        if (vin !== '') {
            var url = `https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVin/${vin}?format=json`;

            $.ajax({
                url: url,
                type: 'GET',
                async: false,
                success: function(response) {
                    console.log(response);
                    var data = response;
                    if (data.Results && data.Results.length > 0) {
			            make = data.Results.find(function(item) {return item.VariableId === 26;}).Value; // Example: Make
			            model = data.Results.find(function(item) {return item.VariableId === 28;}).Value; // Example: Model
			            year = data.Results.find(function(item) {return item.VariableId === 29;}).Value; // Example: Year
			
			            console.log('Make:', make);
			            console.log('Model:', model);
			            console.log('Year:', year);
			        } else {
			            console.error('No results found for the VIN:', vin);
			        }
                },
                error: function(xhr, status, error) {
                    console.log('Error:', status, error);
                    console.log('Error fetching VIN details. Please try again.');
                }
            });
        } else {
            console.log('Please enter a VIN.');
        }
	javascript:window.location.href='/shopping?make='+make+'&model='+model+'&year='+year+'&subModel='+subModel;
}

function fetchMake(yearId){
	$.ajax({
	    url: aptPath + '/semaAPI/makeList',
	    method: 'POST',
	    contentType: 'application/json',
	    dataType: 'json',
	    data: JSON.stringify({ year: yearId }),
	    success: function(data) {
	        var select = $('#makeId');
	        select.empty();
		    select.append($('<option>', {value: "",text : "Make"}));
	        $.each(data.Makes, function (i, item) {
			    select.append($('<option>', { 
			        value: item.MakeID,
			        text : item.MakeName 
			    }));
			});
	    },
	    error: function(error) {
	        console.log('Error:', error);
	    }
	});
}
function fetchModel(makeId){
	$.ajax({
	    url: aptPath + '/semaAPI/modelList',
	    method: 'POST',
	    contentType: 'application/json',
	    dataType: 'json',
	    data: JSON.stringify({ year: $("#yearId").val(), make: makeId}),
	    success: function(data) {
	        var select = $('#modelId');
	        select.empty();
	        select.append($('<option>', {value: "",text : "Model"}));
	        $.each(data.Models, function (i, item) {
			    select.append($('<option>', { 
			        value: item.ModelID,
			        text : item.ModelName 
			    }));
			});
	    },
	    error: function(error) {
	        console.log('Error:', error);
	    }
	});
}
function fetchSubModel(modelId){
	$.ajax({
	    url: aptPath + '/semaAPI/subModelList',
	    method: 'POST',
	    contentType: 'application/json',
	    dataType: 'json',
	    data: JSON.stringify({ year: $("#yearId").val(), make: $("#makeId").val(), model: modelId }),
	    success: function(data) {
	        var select = $('#subModelId');
	        select.empty();
	        select.append($('<option>', {value: "",text : "Sub-Model"}));
	        $.each(data.Submodels, function (i, item) {
			    select.append($('<option>', { 
			        value: item.SubmodelID,
			        text : item.SubmodelName 
			    }));
			});
	    },
	    error: function(error) {
	        console.log('Error:', error);
	    }
	});
}

$(".after").click(function() {
    $(".after i").toggleClass("fa-chevron-up");
})

$(".after-garage").click(function() {
    $(".after-garage i").toggleClass("fa-chevron-up");
})

function block(){
	$("#overlay").fadeIn(300);　
}
function unblock(){
	$("#overlay").fadeOut(300);
}

function getQueryParams() {
    const params = {};
    const queryString = window.location.search.substring(1);
    const queryArray = queryString.split("&");

    for (let i = 0; i < queryArray.length; i++) {
        const pair = queryArray[i].split("=");
        const key = decodeURIComponent(pair[0]);
        const value = decodeURIComponent(pair[1] || '');
        params[key] = value;
    }

    return params;
}

function isNumeric1(value) {
    return !isNaN(value - parseFloat(value));
}