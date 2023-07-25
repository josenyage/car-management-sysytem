/**
 *
 */

$('document').ready(function() {
	$('.table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(VehicleMaintenance, status){
			$('#txtIdEdit').val(VehicleMaintenance.id);

			var startDate = VehicleMaintenance.startDate.substr(0,10);
            $('#startDateEdit').val(startDate);

            var endDate = VehicleMaintenance.endDate.substr(0,10);
            $('#endDateEdit').val(VehicleMaintenanceDate);
            $('#ddlVehicleEdit').val(VehicleMaintenanceDate.vehicleid);
            $('#remarksEdit').val(VehicleMaintenance.remarks);
            $('#ddlSupplierEdit').val(VehicleMaintenance.supplierid);
            $('#priceEdit').val(VehicleMaintenance.price);
		});
		$('#editModal').modal();
	});

	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(VehicleMaintenance, status){
			$('#txtIdDetails').val(VehicleMaintenance.id);

            var startDate = VehicleMaintenance.startDate.substr(0,10);
            $('#startDateDetails').val(startDate);

            var endDate = VehicleMaintenance.endDate.substr(0,10);
            $('#endDateDetails').val(VehicleMaintenanceDate);
            $('#ddlVehicleDetails').val(VehicleMaintenanceDate.vehicleid);
            $('#remarksDetails').val(VehicleMaintenance.remarks);
            $('#ddlSupplierDetails').val(VehicleMaintenance.supplierid);
            $('#priceDetails').val(VehicleMaintenance.price);
$('#lastModifiedByDetails').val(VehicleMaintenance.lastModifiedBy);
			$('#lastModifiedDateDetails').val(VehicleMaintenance.lastModifiedDate.substr(0,19).replace("T", " "));
		});
		$('#detailsModal').modal();
	});

	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();
	});
});