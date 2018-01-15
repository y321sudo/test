$(function(){
    
$("img").hover(
    function(){
        $(this).animate({width:"220px",
                        height:"220px"});
    },
    function(){
        $(this).animate({width:"200px",
                        height:"200px"});
    });
    
    
});