var inputValue;
getInputValue();

function getInputValue(){
    $(document).ready(function(){

        $("#search").keydown(function(){
            inputValue = $("#search").val();
            console.log(inputValue);
            POSTRequest(inputValue);
        })
    })
}

function POSTRequest(inputValue){
    var data = new FormData();
    data.append('keyword', inputValue);

    $.ajax({
        url: '/search',
        type: 'POST',
        contentType: false,
        data: data,
        dataType: 'json',
        processData: false,
        success: function(){
        },
        error: function(){
        }
    });
}

