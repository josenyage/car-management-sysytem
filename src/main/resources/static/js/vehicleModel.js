$('document').ready(function() {

    $('.table #editButton').on('click', function(event){

    event.preventDefault();

    // /state/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(vehicleModel, status){
    $('#editId').val(vehicleModel.id);
    $('#descriptionEdit').val(vehicleModel.description);
    $('#detailsEdit').val(vehicleModel.details);
    });

    $('#editModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {
    		event.preventDefault();
    		var href= $(this).attr('href');
    		 $.get(href, function(vehicleModel, status){
             $('#idDetails').val(vehicleModel.id);
             $('#descriptionDetails').val(vehicleModel.description);
             $('#detailsDetails').val(vehicleModel.details);
             $('#lastModifiedByDetails').val(vehicleModel.lastModifiedBy);
             $('#createdByDetails').val(vehicleModel.createdBy);
             $('#dateCreatedDetails').val(vehicleModel.dateCreated);
             $('#lastModifiedDateDetails').val(invoiceState.lastModifiedDate.substr(0,19).replace("T", " "));
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