/**
 * 
 */
function openModal(name, year, url) {
    $('#name').text(name);
    if (year) {
        $('#year').text('制作年： ' + year + '年');
    }
    $('#image').attr('src', url);
    $('#modal').modal('show');
}