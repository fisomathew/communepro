function editLabel(obj){
    var text = $(obj).val();
    $('.selcted-element-class').text(text);
}
function editComponentLabel(obj){
    var text = $(obj).val();
    $('.selcted-element-class').find("label").text(text);
}
function editComponentPlaceHolder(obj){
    var text = $(obj).val();
    $('.selcted-element-class').find("input[type=text]").attr("placeholder", text);
}
function editComponentValue(obj){
    var text = $(obj).val();
    $('.selcted-element-class').find("input[type=text]").val(text);
}
function applyComponentGrid(){
    for(i=1; i<=12; i++){
        $('.selcted-element-class').removeClass("col-sm-"+i);
        $('.selcted-element-class').removeClass("col-md-"+i);
        $('.selcted-element-class').removeClass("col-lg-"+i);
        $('.selcted-element-class').removeClass("col-xl-"+i);
        $('.selcted-element-class').removeClass("col-"+i);
    }
    if($("#xs-col").prop('checked')){
        $('.selcted-element-class').addClass("col-"+$('#xs-grid').val());
    }
    if($("#xl-col").prop('checked')){
        $('.selcted-element-class').addClass("col-xl-"+$('#xl-grid').val());
    }
    if($("#lg-col").prop('checked')){
        $('.selcted-element-class').addClass("col-lg-"+$('#lg-grid').val());
    }
    if($("#md-col").prop('checked')){
        $('.selcted-element-class').addClass("col-md-"+$('#md-grid').val());
    }
    if($("#sm-col").prop('checked')){
        $('.selcted-element-class').addClass("col-sm-"+$('#sm-grid').val());
    }
}
function loadCurrentGridClasses(){
     var classList = $('.selcted-element-class').attr("class").split(' ');
     for (var i = 0; i < classList.length; i++) {
         if (classList[i].startsWith('col-') ) {
             var grid = classList[i].split("-");
             var size = "xs";
             var col = "6";
             if(grid.length==3){
                size = grid[1];
                col = grid[2];
             }
             else{
                col = grid[1];
             }
             $('#'+size+'-col').prop('checked', true);
             $('#'+size+'-grid').val(col);

         }
     }
}
function initTextFieldProperties(){
    $('#componentLabel').val($('.selcted-element-class').find("label").text());
    $('#componentPlaceHolder').val($('.selcted-element-class').find("input[type=text]").attr("placeholder"));
    $('#componentValue').val($('.selcted-element-class').find("input[type=text]").val());
    loadCurrentGridClasses();
}
function initLabelProperties(){
    $('#componentLabel').val($('.selcted-element-class').text());
    loadCurrentGridClasses();
}
function initRowAndCol(){
    loadCurrentGridClasses();
}

