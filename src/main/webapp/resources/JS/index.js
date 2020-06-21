var nrOfInputs = 1;
var errorMessage = "You can only have two examples";

addOnClickEventOnExampleButton();

function addOnClickEventOnExampleButton(){
    $(document).ready(function(){
        $("#add").bind("click", onClickAddButton);
    });
}

function onClickAddButton(){
    addRestrictionOnButton();

    var input = 'Example <input type="text" name="example" id="' + nrOfInputs++ + '"/>';
    $("#addWords").append(input);
}

function addRestrictionOnButton(){
    if(nrOfInputs > 2){
        var paragrah = '<p id="error">' + errorMessage + '</p>';
        $("#addWords").append(paragrah);
        //$(this).prop('disabled',true);
        $("#add").unbind("click", onClickAddButton);
    }
}

// hvis nrofinputs er store enn nrofinput er krevd.
/*

///
/// Module pattern https://coryrylan.com/blog/javascript-module-pattern-basics
/// explanation under Revealing Module Pattern in the URL.
var index = (function(){
    addOnClickEventOnExampleButton: function(){
        $(document).ready(function(){

            $("#add").on("click", function(){

                var input = 'Example <input type="text" name="example" id="' + nrOfInputs++ + '"/>';
                $("#addWords").append(input);
            });
        });
    },

    example: function(var x, var y){
        console.log(x);
        console.log(y);
    },

    return {
        addOnClickEventOnExampleButton: addOnClickEventOnExampleButton,
        example: example
    }
})();

index.addOnClickEventOnExampleButton();
index.example(1, 2);

*/