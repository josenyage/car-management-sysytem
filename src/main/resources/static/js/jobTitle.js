$('document').ready(function() {

    $('.table #editButton').on('click', function(event){

    event.preventDefault();

    // /state/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(jobTitle, status){
    $('#editId').val(jobTitle.id);
    $('#descriptionEdit').val(jobTitle.description);
    $('#detailsEdit').val(jobTitle.details);
    });

    $('#editModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {
    		event.preventDefault();
    		var href= $(this).attr('href');
    		 $.get(href, function(jobTitles, status){
             $('#idDetails').val(jobTitles.id);
             $('#descriptionDetails').val(jobTitles.description);
             $('#detailsDetails').val(jobTitles.details);
             $('#lastModifiedByDetails').val(jobTitles.lastModifiedBy);
             //$('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0,19).replace("T", " "));
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