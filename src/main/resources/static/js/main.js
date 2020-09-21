/**
 * 
 */
$(function() {
    $('.dialog-link').hover(function() {
        $(this).css("cursor","pointer");
    });

    $('.dialog-link-img').hover(function() {
        $(this).css('box-shadow', '10px 10px 10px rgba(0,0,0,0.5)');
        $(this).css('transform', 'translateY(-10px)');
    }, function() {
        $(this).css('box-shadow', '');
        $(this).css('transform', '');
    });
});