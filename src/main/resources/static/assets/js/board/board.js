function changeBoard(obj){
    var txt = $(obj).text();
    $('#boardNameBtn').text(txt);
    $("#boardPanel").load('/1/15',
        function(data){
            initBoard();
        }
    );
}
function initBoard(){


    $( ".draggable-card" ).draggable({
        opacity: 0.7,
        helper: function( event ) {
            return $( "<div style='width:2px; height:25px; border:solid 1px #000; z-index:100'></div>" );
        },
        opacity: 0.7,
        cursor: 'move',
        cursorAt: {top: 15, left: 10},

    });
    $( ".card-droppable" ).droppable({
        greedy: false,
        drop: function( event, ui ) {
            var content = ui.draggable.wrap('<p/>').parent().html();
            ui.draggable.unwrap();
            $(this).append(content);
        },
    });

    var options = [];

    $( '#pborad-filter a' ).on( 'click', function( event ) {

        var $target = $( event.currentTarget ),
        val = $target.attr( 'data-value' ),
        $inp = $target.find( 'input' ),
        idx;

        if ( ( idx = options.indexOf( val ) ) > -1 ) {
            options.splice( idx, 1 );
            setTimeout( function() { $inp.prop( 'checked', false ) }, 0);
        } else {
            options.push( val );
            setTimeout( function() { $inp.prop( 'checked', true ) }, 0);
        }

        $( event.target ).blur();

        console.log( options );
        return false;
    });

}