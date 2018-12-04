function loadDefaultContent(){
    var url = '/type/types';
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
    var url = '/type/add';
    $("#main-content").load(url,
        function(data){
            $('.load-default-btn').click(function () {
                loadDefaultContent();
            });
            var $form = $('#primaryForm');
            $form.on('submit', function(e) {
                e.preventDefault();
                $.ajax({
                    url: $form.attr('action'),
                    type: 'post',
                    data: $form.serialize(),
                    success: function(response) {
                    // if the response contains any errors, replace the form
                        loadDefaultContent();
                    }
                });
            });
        }
    );
}

function editForm(id){
	
    var url = '/type/type/'+id;
    $("#main-content").load(url,
        function(data){
            $('.load-default-btn').click(function () {
                loadDefaultContent();
            });
            var $form = $('#primaryForm');
            $form.on('submit', function(e) {
                e.preventDefault();
                $.ajax({
                    url: $form.attr('action'),
                    type: 'put',
                    data: $form.serialize(),
                    success: function(response) {
                    // if the response contains any errors, replace the form
                        loadDefaultContent();
                    }
                });
            });
        }
    );
}