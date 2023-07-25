$('document').ready(function() {

    $('.table #editButton').on('click', function(event){

    event.preventDefault();

    // /state/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(vehicleState, status){
    $('#editId').val(vehicleState.id);
    $('#descriptionEdit').val(vehicleState.description);
    $('#detailsEdit').val(vehicleState.details);
    });

    $('#editModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {
    		event.preventDefault();
    		var href= $(this).attr('href');
    		 $.get(href, function(vehicleState, status){
             $('#idDetails').val(vehicleState.id);
             $('#descriptionDetails').val(vehicleState.description);
             $('#detailsDetails').val(vehicleState.details);
             $('#lastModifiedByDetails').val(vehicleState.lastModifiedBy);
             //$('#lastModifiedDateDetails').val(vehicleState.lastModifiedDate.substr(0,19).replace("T", " "));
        });
        $('#detailsModal').modal();
    	});

    $('table #deleteButton').on('click', function(event){

        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteConfirm').attr('href', href);

    $('#deleteModal').modal();

        });

});