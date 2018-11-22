function loadDefaultContent(){
    var url = '/department/list';
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
    var url = '/department/add';
    $("#main-content").load(url,
        function(data){
            $('.load-default-btn').click(function () {
                loadDefaultContent();
            });
        }
    );
}