$('document').ready(function() {

    $('table #editButton').on('click', function(event){

    event.preventDefault();

    // /countries/findById/?id=..

    var href = $(this).attr('href');

    $.get(href, function(country, status){
    $('#editId').val(country.id);
    $('#editCode').val(country.code);
    $('#editCapital').val(country.capital);
    $('#editDescription').val(country.description);
    $('#editNationality').val(country.nationality);
    $('#editContinent').val(country.continent);
    });

    $('#editModal').modal();

    });

    $('table #deleteButton').on('click', function(event){

        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteConfirm').attr('href', href);

    $('#deleteModal').modal();

        });

});