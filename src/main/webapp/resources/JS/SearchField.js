var inputValue;

getInputValue();

function getInputValue(){
    $(document).ready(function(){

        $("#search").keyup(function(){
            inputValue = $("#search").val();
            //console.log(inputValue);
            if(inputValue == ""){
                $("#DropDownSearchContainer").empty();
                return;
            }
            POSTRequest(inputValue);
        })
    })
}


function POSTRequest(inputValue){
    /*var data = new FormData();
    data.append('keyword', inputValue);*/
    //console.log(data.keyword);
    $.ajax({
        url: '/search',
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            keyword: inputValue
        }),
        success: function(res){
            var anchorTag;

            $("#DropDownSearchContainer").empty();
            for(var i = 0; i < res.length; i++){
                anchorTag = "<a href=keyword/" + res[i] + ">" + res[i] + "</a>";
                $("#DropDownSearchContainer").append(anchorTag);
            }
            console.log(res);
        },
        error: function(err){
            console.err(err);
        }
    });
}

