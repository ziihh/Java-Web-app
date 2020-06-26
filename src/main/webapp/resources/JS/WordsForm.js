var nrOfInputs = 0;
const MAX_NR_OF_INPUT = 2;
var errorMessage = "You can only have two examples";

addOnClickEventOnExampleButton();

function addOnClickEventOnExampleButton(){
    $(document).ready(function(){
        $("#add").on("click", onClickAddButton);
    });
}

function onClickAddButton(){
    if(isBeyondMaxNrOfInputs()) {
        var paragrah = '<p id="error">' + errorMessage + '</p>';
        $("#addWords").append(paragrah);
        //$(this).prop('disabled',true);
        $("#add").off("click", onClickAddButton);
    }

    var input = 'SecondExample <input type="text" name="secondexample" id="' + nrOfInputs++ + '"/>';
    $("#addWords").append(input);
}

function isBeyondMaxNrOfInputs(){
    if(nrOfInputs > MAX_NR_OF_INPUT){
        return true;
    }
    return true;
}
/*
redirectUser();

function redirectUser(){
    $(document).ready(function(){
        $("#addWords").on("click", function(){
            document.location.href = "addWordsForm";
        })
    })
}
*/
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