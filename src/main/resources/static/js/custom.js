$(document).ready(function() {
    $('#submitForm .date').datepicker({
    	autoclose : true,
    	todayHighlight: true,
    	format: "yyyy-mm-dd "
    });
    
    $('#qualityDate').datepicker().on('changeDate', function(ev){
        alert(ev.date);
    });
        
    
})