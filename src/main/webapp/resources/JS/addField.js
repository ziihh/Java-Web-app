var nrOfInputs = 0;

$(document).ready(function(){

    $("#add").on("click", function(){

        var input = 'Example <input type="text" name="example" id="' + nrOfInputs++ + '"/>';

        $("#addWords").append(input);

    });

});