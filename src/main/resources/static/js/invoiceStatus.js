$('document').ready(function() {

    $('.table #editButton').on('click', function(event){

    event.preventDefault();

    // /state/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(invoiceState, status){
    $('#editId').val(invoiceState.id);
    $('#descriptionEdit').val(invoiceState.description);
    $('#detailsEdit').val(invoiceState.details);
    });

    $('#editModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {
    		event.preventDefault();
    		var href= $(this).attr('href');
    		 $.get(href, function(invoiceState, status){
             $('#idDetails').val(invoiceState.id);
             $('#descriptionDetails').val(invoiceState.description);
             $('#detailsDetails').val(invoiceState.details);
             $('#lastModifiedByDetails').val(invoiceState.lastModifiedBy);
             //$('#lastModifiedDateDetails').val(invoiceState.lastModifiedDate.substr(0,19).replace("T", " "));
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