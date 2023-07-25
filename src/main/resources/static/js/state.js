$('document').ready(function() {

    $('.table #editButton').on('click', function(event){

    event.preventDefault();

    // /state/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(state, status){
    $('#editId').val(state.id);
    $('#ddlCountryEdit').val(state.countryid);
    $('#editName').val(state.name);
    $('#editCode').val(state.code);
    $('#editCapital').val(state.capital);
    $('#editDetails').val(state.details);
    });

    $('#editModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {
    		event.preventDefault();
    		var href= $(this).attr('href');
    		$.get(href, function(state, status){
                $('#idDetails').val(state.id);
                $('#ddlCountryDetails').val(state.countryid);
                $('#nameDetails').val(state.name);
                $('#codeDetails').val(state.code);
                $('#capitalDetails').val(state.capital);
                $('#detailsDetails').val(state.details);
                $('#lastModifiedByDetails').val(state.lastModifiedBy);
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