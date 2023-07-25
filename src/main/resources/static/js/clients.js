$('document').ready(function() {

    $('.table #editButton').on('click', function(event){

    event.preventDefault();

    // /state/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(client, status){
    $('#txtIdEdit').val(client.id);
    $('#txtNameEdit').val(client.name);
    $('#txtDetailsEdit').val(client.details);
    $('#txtWebsiteEdit').val(client.website);
    $('#txtAddressEdit').val(client.address);
    $('#ddlStateEdit').val(client.stateid);
    $('#ddlCountryEdit').val(client.countryid);
    $('#txtCityEdit').val(client.city);
    $('#txtPhoneEdit').val(client.phone);
    $('#txtMobileEdit').val(client.mobile);
    $('#txtEmailEdit').val(client.email);
    });

    $('#editModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {
    		event.preventDefault();
    		var href= $(this).attr('href');
    		 $.get(href, function(client, status){
                $('#txtIdDetails').val(client.id);
                $('#txtNameDetails').val(client.name);
                $('#txtDetailsDetails').val(client.details);
                $('#txtWebsiteDetails').val(client.website);
                $('#txtAddressDetails').val(client.address);
                $('#ddlStateDetails').val(client.stateid);
                $('#ddlCountryDetails').val(client.countryid);
                $('#txtCityDetails').val(client.city);
                $('#txtPhoneDetails').val(client.phone);
                $('#txtMobileDetails').val(client.mobile);
                $('#txtEmailDetails').val(client.email);
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