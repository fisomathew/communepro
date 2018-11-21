function loadDefaultContent(){
    var url = '/pboard/departmentlist';
    $("#main-content").load(url,
        function(data){
        $('#list-table').DataTable({
                lengthChange: false,
                bFilter: false
            });
        }
    );
}
function addForm(){
    var url = '/pboard/departmentadd';
    $("#main-content").load(url,
        function(data){
            $('.load-default-btn').click(function () {
                loadDefaultContent();
            });
        }
    );
}