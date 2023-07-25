$('document').ready(function() {

    $('table #editButton').on('click', function(event){

    event.preventDefault();

    // /countries/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(location, status){
    $('#idEdit').val(location.id);
    $('#descriptionEdit').val(location.description);
    $('#detailsEdit').val(location.details);
    $('#addressEdit').val(location.address);
    $('#ddlCountryEdit').val(location.countryid);
    $('#ddlStateEdit').val(location.stateid);
    $('#cityEdit').val(location.city);
    });

    $('#editModal').modal();

    });

    $('table #detailsButton').on('click', function(event){

        event.preventDefault();

        // /countries/findById/?id=..

        var href = $(this).attr('href');

        $.get(href, function(location, status){
        $('#idDetails').val(location.id);
        $('#descriptionDetails').val(location.description);
        $('#ddlCountryDetails').val(location.countryid);
        $('#ddlStateDetails').val(location.stateid);
        $('#cityDetails').val(location.city);
        $('#addressDetails').val(location.address);
        $('#detailsDetails').val(location.details);
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